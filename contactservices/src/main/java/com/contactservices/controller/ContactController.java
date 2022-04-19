package com.contactservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactservices.entity.Contact;
import com.contactservices.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId)
	{
		return this.contactservice.getContactsofUser(userId);
	}
}
 