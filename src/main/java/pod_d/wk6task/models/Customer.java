package pod_d.wk6task.models;

import lombok.*;
import pod_d.wk6task.enums.Gender;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer extends Human{
    private double wallet;
    private String password;

    public Customer(int id, String name, Gender gender, String email, String password) {
        super(id, name, gender, email, password);
        this.wallet = 0.00;
    }

}
