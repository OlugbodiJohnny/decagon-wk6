package pod_d.wk6task.dto;

import lombok.Data;
import pod_d.wk6task.enums.Gender;

@Data
public class CustomerDto {
    private int id;
    private String name;
    private Gender gender;
    private String email;
    private double wallet;
    private String password;
}
