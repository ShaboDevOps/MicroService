package com.kayaTech.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kayaTech.Models.User;
import com.kayaTech.Models.UserGrade;
import com.kayaTech.Service.ServiceClass;

@RestController
public class ConnectorController {

	@Autowired
	private ServiceClass service;
	@Autowired
	private RestTemplate restTemplet;
	
	
	@GetMapping("/user/{id}")
	public List<Object> getUser(@PathVariable String id) {
		
		
		UserGrade userGrade = restTemplet.getForObject("http://usergrade/grade/"+id, UserGrade.class);
		User user = restTemplet.getForObject("http://users/user/"+id, User.class);
		return service.display(user, userGrade);
	}
}
