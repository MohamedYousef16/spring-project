package com.global.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.global.entity.VacationRequest;
import com.global.repository.VacationRepo;

@Service
public class VacationService {

	@Autowired
	private VacationRepo vacationRepo;
	
	
	public VacationRequest  save(VacationRequest request) {
		return vacationRepo.save(request);
	}
	
   public List<VacationRequest> vacationHistory(long id){
	   return vacationRepo.findByEmployeeId(id);
   }
	
}