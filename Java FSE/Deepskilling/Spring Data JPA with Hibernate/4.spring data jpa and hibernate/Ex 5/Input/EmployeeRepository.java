List<Employee> findByName(String name);
List<Employee> findByEmailContaining(String keyword);
List<Employee> findByDepartmentName(String departmentName);
List<Employee> findBySalaryGreaterThan(Double salary);

JPQL
@Query("SELECT e FROM Employee e WHERE e.department.name = :deptName")
List<Employee> getEmployeesByDepartmentName(@Param("deptName") String deptName);

Native SQL
@Query(value = "SELECT * FROM employee WHERE salary > ?1", nativeQuery = true)
List<Employee> findEmployeesWithHighSalary(Double minSalary);
