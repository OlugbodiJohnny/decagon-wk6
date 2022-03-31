package pod_d.wk6task.models;

import lombok.*;
import pod_d.wk6task.enums.Gender;
import pod_d.wk6task.enums.Role;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Staff extends Human{
    private String staffId;
    private Role role;
    private String qualification;
    private int performance;

    public Staff(int id, String name, Gender gender, String email, String password, String staffId, Role role, String qualification, int performance) {
        super(id, name, gender, email, password);
        this.staffId = staffId;
        this.role = role;
        this.qualification = qualification;
        this.performance = 0;
    }
}
