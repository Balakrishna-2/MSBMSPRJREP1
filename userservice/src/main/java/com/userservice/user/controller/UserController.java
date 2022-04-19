package com.userservice.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userservice.user.entity.User;
import com.userservice.user.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	private UserService userservice;

	@Autowired
	private RestTemplate restTemplate;
	 
	@GetMapping("/{userId}")
	public  User getUser(@PathVariable("userId") Long userId)
	{ 
		User user= this.userservice.getUser(userId);
		
		List contacts=this.restTemplate.getForObject("http://localhost:9002/contact/user/"+user.getUserId(), List.class);
		//List contacts=this.restTemplate.getForObject("http://contact_service/contact/user/"+user.getUserId(), List.class);
		
		user.setContacts(contacts);
		
		return user;
		
	}
}
