package com.global.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.global.entity.Employee;
import com.global.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{id}")
	public  ResponseEntity<?> findEmpById(@PathVariable Long id){
		return ResponseEntity.ok(employeeService.findById(id));
	}
	
	@GetMapping("")
	public  ResponseEntity<?> findAllEmp(){
		return ResponseEntity.ok(employeeService.findAll());
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmp(@RequestBody Employee employee){
		return ResponseEntity.ok(employeeService.saveEmployee(employee));
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmp(@PathVariable long id){
		  employeeService.deleteByIdEmployee(id);
	}
	
	@GetMapping("/dept/{id}")
	public List<Employee> findByDeptId(@PathVariable Long id){
		return employeeService.findByDeptId(id);
	}
	
}
