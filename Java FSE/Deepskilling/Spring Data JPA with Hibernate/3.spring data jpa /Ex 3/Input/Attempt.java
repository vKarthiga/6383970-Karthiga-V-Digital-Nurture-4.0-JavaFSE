@Entity
@Table(name = "attempt")
public class Attempt {
    @Id
    @Column(name = "at_id")
    private int id;

    @Column(name = "at_date")
    private LocalDate date;

    @Column(name = "at_score")
    private double score;

    @ManyToOne
    @JoinColumn(name = "at_us_id")
    private User user;

    @OneToMany(mappedBy = "attempt", fetch = FetchType.LAZY)
    private List<AttemptQuestion> attemptQuestions;
}
