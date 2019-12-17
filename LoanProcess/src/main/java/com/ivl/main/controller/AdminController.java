package com.ivl.main.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ivl.main.model.User;
import com.ivl.main.service.IuserDocumentService;

@Controller
@CrossOrigin("*")
public class AdminController {

	Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	IuserDocumentService userdoc;

	@RequestMapping("/admin")
	public String getDocumentList(@RequestParam("username") String username, @RequestParam("password") String password,
			ModelMap modelMap) {
		User user = new User();
		logger.info("getDocumentList calling");
		try {
			if (username.equals("admin") && password.equals("admin")) {
				logger.info("admin call");
				List<User> getAllData = userdoc.getAllDocument(user);

				modelMap.addAttribute("msg", getAllData);
			}
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
		return "document";
	}
}
