package com.kayaTech.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kayaTech.Models.User;
import com.kayaTech.Models.UserGrade;

@Component
public class ServiceClass {

	public List<Object> display(User user, UserGrade userGrade) {
		
		List<Object> list = new ArrayList<Object>();;
		list.add(userGrade);
		list.add(user);
		return list;
	}

}
