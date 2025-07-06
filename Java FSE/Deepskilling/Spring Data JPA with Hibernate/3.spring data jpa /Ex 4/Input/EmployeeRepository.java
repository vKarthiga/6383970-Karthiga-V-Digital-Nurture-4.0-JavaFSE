1.Average Salary of All Employees:
@Query("SELECT AVG(e.salary) FROM Employee e")
double getAverageSalary();

2.Average Salary by Department ID:
@Query("SELECT AVG(e.salary) FROM Employee e WHERE e.department.id = :id")
double getAverageSalary(@Param("id") int id);
