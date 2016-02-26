package tiscon1.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author kawasima
 */

@Data
public class AccountRegisterForm implements Serializable {
    @Size(min = 1, max = 100)
    private String name;

    @NotEmpty
    @Email
    private String email;

    @Size(min = 6)
    private String password;

}
