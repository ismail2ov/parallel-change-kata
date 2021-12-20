package method;

import com.parallelchange.method.AuthenticationService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthenticationServiceTest {

    @Test
    public void administratorIsAlwaysAuthenticated() {
        AuthenticationService service = new AuthenticationService();
        int adminId = 12345;

        boolean authenticated = service.isAuthenticated(adminId);

        assertThat(authenticated).isTrue();
    }

    @Test
    public void normalUserIsNotAuthenticatedInitially() {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;

        boolean authenticated = service.isAuthenticated(normalUserId);

        assertThat(authenticated).isFalse();
    }

}
