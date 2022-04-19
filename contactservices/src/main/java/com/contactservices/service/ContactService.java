package com.contactservices.service;

import java.util.List;

import com.contactservices.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactsofUser(Long userId);

}
