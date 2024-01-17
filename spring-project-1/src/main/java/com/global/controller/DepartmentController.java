package com.global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.global.entity.Department;
import com.global.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/{id}")
	public  ResponseEntity<?> findEmpById(@PathVariable Long id){
		return ResponseEntity.ok( departmentService.findById(id));
	}
	
	@GetMapping("")
	public  ResponseEntity<?> findAllEmp(){
		return ResponseEntity.ok( departmentService.findAll());
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmp(@RequestBody Department department){
		return ResponseEntity.ok( departmentService.saveDepartment(department));
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmp(@PathVariable long id){
		 departmentService.deleteByIdDepartment(id);
	}
	
}

