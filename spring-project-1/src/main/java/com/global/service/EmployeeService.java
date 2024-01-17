package com.global.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.global.entity.Employee;
import com.global.repository.EmployeeRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee findById(long id) {
		return  employeeRepo.findById(id).get();
	}
	
	public List<Employee> findAll(){
		return  employeeRepo.findAll();
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public void deleteByIdEmployee(long id) {
		 employeeRepo.deleteById(id);
	}
	
	public List<Employee> findByDeptId(Long id){
		return employeeRepo.findByDepartmentId(id);
	}
}
