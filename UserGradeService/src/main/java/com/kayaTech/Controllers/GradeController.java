package com.kayaTech.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kayaTech.Model.UserGrade;
import com.kayaTech.Services.GradeService;

@RestController
public class GradeController {

	@Autowired
	private GradeService service;
	
	@GetMapping("/grade/{id}")
	public Optional<UserGrade> getGrade(@PathVariable String id) {
		
		return service.fetchUser(id);
	}
	
	@PostMapping("/grades")
	public List<UserGrade> addGrade(@RequestBody List<UserGrade> userGrade) {
	     
		return service.addGrades(userGrade);
	}
	
}
