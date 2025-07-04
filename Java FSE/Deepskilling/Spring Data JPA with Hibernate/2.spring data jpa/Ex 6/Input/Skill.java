@ManyToMany(mappedBy = "skillList")
private Set<Employee> employeeList = new HashSet<>();
public Set<Employee> getEmployeeList() {
    return employeeList;
}
public void setEmployeeList(Set<Employee> employeeList) {
    this.employeeList = employeeList;
}
