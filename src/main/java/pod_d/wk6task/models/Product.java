package pod_d.wk6task.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private int id;
    private  String name;
    private String brand;
    private String modelName;
    private double price;
    private double previousPrice;
    private int quantity;
    private Category category;
    private RatingPoint ratingPoint;
    private String productImageUrl;

}
