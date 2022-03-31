package pod_d.wk6task.models;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Category {
    private String name;
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
