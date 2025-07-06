@Entity
public class Product {
    @Id
    private int id;

    private String name;
    private double price;
    private double cpuSpeed;
    private double ramSize;
    private double weight;
    private double hardDiskSize;
    private String os;
    private int customerReview;
}
