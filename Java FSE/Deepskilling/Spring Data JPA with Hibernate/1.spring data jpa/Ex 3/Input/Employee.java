import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private float salary;

    // Getters and setters

    public Employee() {}
    
    public Employee(String fname, String lname, float salary) {
        this.firstName = fname;
        this.lastName = lname;
        this.salary = salary;
    }

    // toString(), getters, setters
}
