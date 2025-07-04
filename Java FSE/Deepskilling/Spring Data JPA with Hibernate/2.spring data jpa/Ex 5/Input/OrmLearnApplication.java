private static void testGetDepartment() {
    LOGGER.info("Start");
    Department department = departmentService.get(1); // Use a department with >1 employee
    LOGGER.debug("Department: {}", department);
    LOGGER.debug("Employee List: {}", department.getEmployeeList());
    LOGGER.info("End");
}

In main() method
  testGetDepartment();
