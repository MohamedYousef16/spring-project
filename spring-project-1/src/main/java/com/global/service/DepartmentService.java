package com.global.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.global.entity.Department;
import com.global.repository.DepartmentRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;
	
	
	public Department findById(long id) {
		return departmentRepo.findById(id).get();
	}
	
	public List<Department> findAll(){
		return departmentRepo.findAll();
	}
	
	public Department saveDepartment(Department department) {	
		return departmentRepo.save(department);
	}
	
	public void deleteByIdDepartment(long id) {
		departmentRepo.deleteById(id);
	}
}