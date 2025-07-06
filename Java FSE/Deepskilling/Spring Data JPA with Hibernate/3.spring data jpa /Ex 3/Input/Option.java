@Entity
@Table(name = "options")
public class Option {
    @Id
    @Column(name = "op_id")
    private int id;

    @Column(name = "op_text")
    private String text;

    @Column(name = "op_score")
    private double score;

    @ManyToOne
    @JoinColumn(name = "op_qt_id")
    private Question question;

    @OneToMany(mappedBy = "option", fetch = FetchType.LAZY)
    private List<AttemptOption> attemptOptions;
}
