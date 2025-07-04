@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dp_id")
    private int id;

    @Column(name = "dp_name")
    private String name;

    // Optional reverse mapping
    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;

    // Getters, Setters, toString()
}
