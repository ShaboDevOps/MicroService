package com.kayaTech.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kayaTech.Model.UserGrade;
import com.kayaTech.Repostory.GradeINF;

@Component
public class GradeService {
	
	@Autowired
	private GradeINF gradeINF;

	public Optional<UserGrade> fetchUser(String id) {
		
		return gradeINF.findById(id);
	}

	public List<UserGrade> addGrades(List<UserGrade> userGrade) {
		
		return gradeINF.saveAll(userGrade);
	}
	
	

}
