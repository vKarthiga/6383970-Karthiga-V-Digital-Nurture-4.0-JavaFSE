@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "qt_id")
    private int id;

    @Column(name = "qt_text")
    private String text;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private List<Option> options;
}
