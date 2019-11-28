package com.ivl.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivl.main.exception.CustomExceptionHandler;
import com.ivl.main.model.User;
import com.ivl.main.service.Iuser;

@RestController
public class CibilController {

	private static Logger logger = LoggerFactory.getLogger(CibilController.class);

	@Autowired
	Iuser users;

	// @PutMapping
	@RequestMapping(path = "/getSingleData/{userid}", consumes = "application/json", method = RequestMethod.GET)
	public User getUserAllData(@PathVariable(name = "userid") int id) throws CustomExceptionHandler {
		User getSingleUsersData;
		try {
			getSingleUsersData = users.CheckcibilScore(users.getSingleUser(id));
			logger.info(getSingleUsersData.toString());
		} catch (NullPointerException e) {
			logger.error(e.getMessage());
			throw new CustomExceptionHandler();
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CustomExceptionHandler();
		}
		return getSingleUsersData;
	}
}
