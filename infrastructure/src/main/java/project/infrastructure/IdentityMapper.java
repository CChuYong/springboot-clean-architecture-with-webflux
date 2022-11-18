package project.infrastructure;

import project.entity.Identity;

public class IdentityMapper {
    public static Long map(Identity identity){
        return identity == Identity.NONE ? null : identity.getId();
    }
}
