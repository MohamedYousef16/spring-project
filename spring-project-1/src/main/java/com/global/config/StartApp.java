package com.global.config;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.global.entity.Department;
import com.global.entity.Employee;
import com.global.entity.VacationRequest;
import com.global.service.DepartmentService;
import com.global.service.EmployeeService;
import com.global.service.VacationService;

@Component
public class StartApp implements CommandLineRunner {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private VacationService vacationService;

	@Override
	public void run(String... args) throws Exception {
		
		if (employeeService.findAll().isEmpty()) {
			
			Employee emp1 = new Employee();
			emp1.setFullName("mohamed yousef");
			emp1.setEmail("mo@gmail.com");
			
			Employee emp2 = new Employee();
			emp2.setFullName("emad yousef");
			emp2.setEmail("emad@gmail.com");
			
			Employee emp3 = new Employee();
			emp3.setFullName("amr yousef");
			emp3.setEmail("amr@gmail.com");
			
			Employee emp4 = new Employee();
			emp4.setFullName("amer ahmed");
			emp4.setEmail("amer@gmail.com");
			
			Employee emp5 = new Employee();
			emp5.setFullName("emad ahmed");
			emp5.setEmail("ahmed@gmail.com");
		
			Department dept1 = new  Department();
			dept1.setName("it");
			
			departmentService.saveDepartment(dept1);
			
			
			
			Department dept2 = new  Department();
			dept2.setName("sc");
			
			departmentService.saveDepartment(dept2);

			emp1.setDepartment(dept1);
			emp2.setDepartment(dept1);
			emp3.setDepartment(dept1);
			emp4.setDepartment(dept2);
			emp5.setDepartment(dept2);
			
			employeeService.saveEmployee(emp1);
			employeeService.saveEmployee(emp2);
			employeeService.saveEmployee(emp3);
			employeeService.saveEmployee(emp4);
			employeeService.saveEmployee(emp5);

			LocalDate startDate = LocalDate.of(2024, 1, 8);
			LocalDate endDate = LocalDate.of(2024, 2, 8);

			VacationRequest request = new VacationRequest(null, startDate, endDate, emp5);

			
			vacationService.save(request);
			
			VacationRequest request2 = new VacationRequest(null, startDate, endDate, emp5);
			
			vacationService.save(request2);
			

			
		}
		
	}

}
