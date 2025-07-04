@OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
private Set<Employee> employeeList;
public Set<Employee> getEmployeeList() {
    return employeeList;
}

public void setEmployeeList(Set<Employee> employeeList) {
    this.employeeList = employeeList;
}
