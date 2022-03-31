package pod_d.wk6task.models;

import lombok.*;
import pod_d.wk6task.enums.Gender;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Human {
    private int id;
    private String name;
    private Gender gender;
    private String email;
    private String password;
}
