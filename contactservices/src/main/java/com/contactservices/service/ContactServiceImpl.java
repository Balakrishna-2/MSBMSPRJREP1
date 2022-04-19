package com.contactservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contactservices.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	@Override
	public List<Contact> getContactsofUser(Long userId) {
		
		List<Contact> contactlist=new ArrayList<Contact>();
		
		contactlist.add(new Contact(1L,"ankittiwari@gmail.com","Ankit",0001L));
		contactlist.add(new Contact(2L,"akshaytiwari@gmail.com","Akshay",0002L));
		contactlist.add(new Contact(3L,"arunkumar001@gmail.com","Arun",0003L));
		contactlist.add(new Contact(4L,"telusko4u@gmail.com","tellusko",0001L));
		contactlist.add(new Contact(5L,"ddt4u@gmail.com","ddt",004L));
		contactlist.add(new Contact(6L,"mp4u@gmail.com","mp",0003L));
		
		// TODO Auto-generated method stub
		return contactlist.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
