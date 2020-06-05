package kr.needon.boot_oauth.Module.User.Payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
@Getter
@Setter
public class SignUpRequest {
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    private Set<String> role;

    public Set<String> getRole() {
        return role;
    }
}
