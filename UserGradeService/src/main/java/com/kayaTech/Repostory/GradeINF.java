package com.kayaTech.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayaTech.Model.UserGrade;


public interface GradeINF extends JpaRepository<UserGrade, String>{

}
