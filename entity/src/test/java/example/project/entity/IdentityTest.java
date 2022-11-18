package example.project.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IdentityTest {
    @Test
    public void createNewInstance(){
        long id = 100L;
        Identity identity = Identity.of(id);
        assertThat(identity.getId()).isEqualTo(id);
    }
}
