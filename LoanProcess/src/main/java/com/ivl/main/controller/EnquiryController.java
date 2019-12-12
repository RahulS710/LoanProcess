package com.ivl.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ivl.main.model.User;
import com.ivl.main.service.Iuser;

@Controller
@CrossOrigin("*")
public class EnquiryController {
	@Autowired
	Iuser users;

	@RequestMapping("/")
	public String page() {
		return "Home";
	}

	@RequestMapping(path = "/user")
	public String registredData(@RequestParam("fname") String firstName )
	{
		System.out.println(firstName);
		User user = new User();
		user.setFirstName(firstName);
		users.registerUserData(user);
		return "login";
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
