package com.example.EmployeeTrackingApp;

import com.example.EmployeeTrackingApp.models.Department;
import com.example.EmployeeTrackingApp.models.Employee;
import com.example.EmployeeTrackingApp.repos.DepartmentRepository;
import com.example.EmployeeTrackingApp.repos.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackingAppApplicationTests {

	@Autowired
	EmployeeRepository employeeRepo;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateDepartment() {
		Department department = new Department("Sales");
		departmentRepository.save(department);

		Employee employee = new Employee("Milton", "Waddams", 34, 5, "milton.fired@doesntworkhere.com", department );
		employeeRepo.save(employee);
	}

}
