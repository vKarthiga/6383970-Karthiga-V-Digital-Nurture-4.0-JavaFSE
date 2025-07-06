public static void testGetAllEmployeesNative() {
    LOGGER.info("Start - Native Query");

    List<Employee> employees = employeeService.getAllEmployeesNative();
    employees.forEach(e -> LOGGER.debug("Employee: {}", e));

    LOGGER.info("End");
}
