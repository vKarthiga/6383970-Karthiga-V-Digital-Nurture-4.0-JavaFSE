@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(
    name = "employee_skill",
    joinColumns = @JoinColumn(name = "es_em_id"),
    inverseJoinColumns = @JoinColumn(name = "es_sk_id")
)
private Set<Skill> skillList = new HashSet<>();
public Set<Skill> getSkillList() {
    return skillList;
}

public void setSkillList(Set<Skill> skillList) {
    this.skillList = skillList;
}
