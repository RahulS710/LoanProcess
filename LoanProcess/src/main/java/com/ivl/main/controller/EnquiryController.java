package com.ivl.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivl.main.model.User;
import com.ivl.main.service.Iuser;

@RestController
public class EnquiryController {
	@Autowired
	Iuser users;

	@RequestMapping(path = "/user", produces = "application/json")
	public String registredData(@RequestBody User user) {
		users.registerUserData(user);
		return "registered successfully";
	}

	@GetMapping(path = "/checkUsersCibil/{id}", consumes = "application/json")
	public User getUserData(@PathVariable(name = "id") int id) {
		User getSingleUser = users.getSingleUser(id);
		return getSingleUser;
	}

	@GetMapping(path = "/getSingleData/{adharNo}", consumes = "application/json")
	public User getUserAllData(@PathVariable(name = "adharNo") long adharNo) {
		User getSingleUsersData = users.getSingleUserData(adharNo);
		return getSingleUsersData;
	}

}
