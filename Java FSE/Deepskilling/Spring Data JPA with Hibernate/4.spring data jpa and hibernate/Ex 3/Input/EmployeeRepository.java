package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query methods
    List<Employee> findByName(String name);

    List<Employee> findByDepartmentName(String departmentName);

    List<Employee> findByEmailContaining(String keyword);

    List<Employee> findByDepartmentId(Long departmentId);
}
