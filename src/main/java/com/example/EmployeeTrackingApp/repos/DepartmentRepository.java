package com.example.EmployeeTrackingApp.repos;

import com.example.EmployeeTrackingApp.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
