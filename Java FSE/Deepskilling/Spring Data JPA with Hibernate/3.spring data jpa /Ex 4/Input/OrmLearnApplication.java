public static void testGetAverageSalary() {
    LOGGER.info("Start - Average Salary");

    double avgAll = employeeService.getAverageSalary();
    LOGGER.debug("Average Salary of all employees: {}", avgAll);

    int deptId = 2;
    double avgDept = employeeService.getAverageSalary(deptId);
    LOGGER.debug("Average Salary of Department {}: {}", deptId, avgDept);

    LOGGER.info("End");
}
