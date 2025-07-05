@NamedQueries({
    @NamedQuery(
        name = "Employee.findByEmail",
        query = "SELECT e FROM Employee e WHERE e.email = :email"
    ),
    @NamedQuery(
        name = "Employee.findAllOrderedByName",
        query = "SELECT e FROM Employee e ORDER BY e.name ASC"
    )
})
@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    ...
}

Usage in Repository:
@Query(name = "Employee.findByEmail")
Employee findByEmail(@Param("email") String email);

@Query(name = "Employee.findAllOrderedByName")
List<Employee> findAllOrderedByName();
