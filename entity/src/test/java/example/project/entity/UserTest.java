package example.project.entity;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    public void createNewInstance(){
        String userName = "username";
        String password = "password";
        String address = "address";
        boolean admin = true;

        User user = User.of(userName, password, address, admin);
        assertThat(user.getUserName()).isEqualTo(userName);
        assertThat(user.getPassword()).isEqualTo(password);
        assertThat(user.getAddress()).isEqualTo(address);
        assertThat(user.isAdmin()).isEqualTo(admin);
    }
}
