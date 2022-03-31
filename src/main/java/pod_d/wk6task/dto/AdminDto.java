package pod_d.wk6task.dto;

import lombok.Data;
import pod_d.wk6task.enums.Gender;
import pod_d.wk6task.enums.Role;

@Data
public class AdminDto {
    private int id;
    private String name;
    private Gender gender;
    private String email;
    private String password;
    private String staffId;
    private Role role;
    private String qualification;
    private int performance;
}
