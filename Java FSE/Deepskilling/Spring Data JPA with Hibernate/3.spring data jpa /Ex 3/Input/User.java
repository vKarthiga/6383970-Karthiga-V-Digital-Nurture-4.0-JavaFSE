@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "us_id")
    private int id;

    @Column(name = "us_name")
    private String name;

    @Column(name = "us_email")
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Attempt> attempts;
}
