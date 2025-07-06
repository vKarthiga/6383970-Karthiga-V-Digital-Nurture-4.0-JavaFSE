@Override
public double getAverageSalary() {
    return employeeRepository.getAverageSalary();
}

@Override
public double getAverageSalary(int departmentId) {
    return employeeRepository.getAverageSalary(departmentId);
}
