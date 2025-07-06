@Entity
public class Option {
    @Id
    private int id;
    private String text;
    private boolean isCorrect;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
