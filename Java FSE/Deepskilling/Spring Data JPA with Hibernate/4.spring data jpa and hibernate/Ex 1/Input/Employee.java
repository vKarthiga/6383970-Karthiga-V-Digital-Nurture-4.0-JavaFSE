package com.example.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private Double salary;

    // Many-to-One relationship with Department
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
