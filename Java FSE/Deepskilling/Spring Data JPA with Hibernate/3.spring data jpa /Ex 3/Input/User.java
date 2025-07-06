@Entity
public class User {
    @Id
    private int id;
    private String username;

    @OneToMany(mappedBy = "user")
    private List<Attempt> attempts;
}
