package com.ivl.main.controller;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ivl.main.constant.Constant;
import com.ivl.main.model.User;
import com.ivl.main.service.Iuser;

@Controller
@CrossOrigin("*")
public class EnquiryController {

	private static Logger logger = LoggerFactory.getLogger(EnquiryController.class);
	private static final Random RANDOM = new SecureRandom();

	@Autowired
	Iuser users;

	@RequestMapping("/")
	public String page() {
		return "Home";
	}

	@RequestMapping(path = "/user")
	public String registredData(@RequestParam("fname") String firstName) {
		logger.info(firstName);
		User user = new User();
		user.setFirstName(firstName);
		String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789+@";
		String pw = "";
		for (int i = 0; i < Constant.PASSWORD_LENGTH; i++) {
			int index = (int) (RANDOM.nextDouble() * letters.length());
			pw += letters.substring(index, index + 1);
		}
		user.setPassword(generateRandomPassword());
		users.registerUserData(user);
		logger.info("Registered User" + user.toString());
		return "login";
	}

	@GetMapping(path = "/checkUsersCibil/{userId}", consumes = "application/json")
	public User getUserData(@PathVariable(name = "userId") int id) {
		User getSingleUser = users.getSingleUser(id);
		return getSingleUser;
	}

//	@RequestMapping("/getpassword")
	private String generateRandomPassword() {
		List rules = Arrays.asList(new CharacterRule(EnglishCharacterData.UpperCase, 1),
				new CharacterRule(EnglishCharacterData.LowerCase, 1), new CharacterRule(EnglishCharacterData.Digit, 1),
				new CharacterRule(EnglishCharacterData.Special, 1));
		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generatePassword(8, rules);
		System.out.println("--------------------------------------------------" + password);
		return password;
	}

	/*
	 * @RequestMapping("/getpasswords") public static String
	 * generateRandomPasswords() { // Pick from some letters that won't be easily
	 * mistaken for each // other. So, for example, omit o O and 0, 1 l and L.
	 * String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789+@";
	 * 
	 * String pw = ""; for (int i = 0; i < PASSWORD_LENGTH; i++) { int index = (int)
	 * (RANDOM.nextDouble() * letters.length()); pw += letters.substring(index,
	 * index + 1); } System.out.println(
	 * "-----------------------------------------------------------" + pw); return
	 * pw; }
	 */

	@RequestMapping("/login")
	public String login(@RequestParam("un") String username, @RequestParam("pass") String password,
			HttpSession httpSession, ModelMap modelMap) {
		Long un = Long.parseLong(username);
		System.out.println(username + "  ----" + password);
		User user = users.getSingleUserData(un);
		if (user != null) {
			if (un == user.getAdharNo() && password.equals(user.getPassword())) {
				httpSession.setAttribute("id", user);
				modelMap.addAttribute("userId", user.getUserId());
				modelMap.addAttribute("msg", user);
				return "/jsp/LoanDetail";
			} else {

				modelMap.put("error", "Invalid Username and password");
				return "login";
			}
		} else {
			return "login";
		}
	}

}
