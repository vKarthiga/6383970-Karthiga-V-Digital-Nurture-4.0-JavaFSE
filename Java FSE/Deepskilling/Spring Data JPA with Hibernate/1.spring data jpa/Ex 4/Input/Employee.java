// Just the entity, defined by JPA standard
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;
}
