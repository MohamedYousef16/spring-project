package com.global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.global.entity.VacationRequest;
import com.global.service.VacationService;

@RestController
@RequestMapping("/vacation")
public class VacationController {
	
	@Autowired
	private VacationService vacationService;


	@PostMapping("/save")
	public ResponseEntity<?> saveRequest(@RequestBody VacationRequest vacationRequest){
		return ResponseEntity.ok(vacationService.save(vacationRequest));
	}
	
	@GetMapping("/history/{id}")
	   public ResponseEntity<?> vacationHistory(@PathVariable long id){
		   return ResponseEntity.ok(vacationService.vacationHistory(id));
	   }
	
	
}