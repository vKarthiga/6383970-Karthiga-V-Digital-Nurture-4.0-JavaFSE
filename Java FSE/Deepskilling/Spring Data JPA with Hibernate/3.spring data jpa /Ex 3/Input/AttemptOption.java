@Entity
@Table(name = "attempt_option")
public class AttemptOption {
    @Id
    @Column(name = "ao_id")
    private int id;

    @Column(name = "ao_selected")
    private boolean selected;

    @ManyToOne
    @JoinColumn(name = "ao_op_id")
    private Option option;

    @ManyToOne
    @JoinColumn(name = "ao_aq_id")
    private AttemptQuestion attemptQuestion;
}
