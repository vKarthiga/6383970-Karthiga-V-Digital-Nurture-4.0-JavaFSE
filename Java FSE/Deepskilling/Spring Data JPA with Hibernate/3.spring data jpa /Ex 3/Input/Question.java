@Entity
public class Question {
    @Id
    private int id;
    private String text;
    private double score;

    @OneToMany(mappedBy = "question")
    private List<Option> options;
}
