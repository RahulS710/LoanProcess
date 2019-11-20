package com.ivl.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivl.main.model.User;
import com.ivl.main.service.Iuser;

@RestController
public class EnquiryController 
{
	@Autowired
	Iuser users;
	
	@RequestMapping(path = "/user")
	public String registredData(@RequestBody User user)
	{
		users.registerUserData(user);
		return "registered successfully";
	}
	

}
