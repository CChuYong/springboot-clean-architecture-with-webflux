package example.project.infrastructure.jpa.user;

import example.project.entity.Identity;
import example.project.entity.User;
import example.project.infrastructure.IdentityMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("user")
@AllArgsConstructor
public class JPAUserEntity {
    @Id
    private Long id;

    private String userName;

    private String password;

    private String address;

    private Boolean admin;

    public static JPAUserEntity fromDomain(User user){
        return new JPAUserEntity(
                IdentityMapper.map(user.getIdentity()),
                user.getUserName(),
                user.getPassword(),
                user.getAddress(),
                user.isAdmin()
        );
    }

    public User toDomain(){
        return new User(Identity.of(this.id), this.userName, this.password, this.address, this.admin);
    }
}