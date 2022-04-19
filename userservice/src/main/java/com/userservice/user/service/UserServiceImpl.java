package com.userservice.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.userservice.user.entity.User;

@Service 
public class UserServiceImpl implements UserService {

	List<User> userslist = new ArrayList<User>();
	

				
	
	@Override
	public User getUser(Long id) {
		
		userslist.add(new User(0001L,"Ankit tiwari","9512634877"));
		userslist.add(new User(0002L,"Akshay tiwari","9512634887"));
		userslist.add(new User(0003L,"Karan Nair","9512634678"));
		userslist.add(new User(0004L,"Kavya Nair","9512634850"));
		
		
		// TODO Auto-generated method stub
		return userslist.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
