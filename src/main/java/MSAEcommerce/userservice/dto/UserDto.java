package MSAEcommerce.userservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createAtl;

    private String encryptedPwd;
}
