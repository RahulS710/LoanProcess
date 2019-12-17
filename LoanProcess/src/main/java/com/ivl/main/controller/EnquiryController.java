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
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ivl.main.model.Cibil;
import com.ivl.main.model.EmiDetails;
import com.ivl.main.model.LoanDetails;
import com.ivl.main.model.User;
import com.ivl.main.repository.CibilRepository;
import com.ivl.main.repository.EmiDetailsRepository;
import com.ivl.main.repository.LoanDetailsRepository;
import com.ivl.main.service.Iuser;
import com.ivl.main.serviceImpl.EmiServiceImpl;
import com.ivl.main.serviceImpl.LoanDetailsIMpl;
import com.ivl.main.util.EmailNotificationService;

@Controller
@CrossOrigin("*")
public class EnquiryController {

	private static Logger logger = LoggerFactory.getLogger(EnquiryController.class);
	private static final Random RANDOM = new SecureRandom();

	
	@Autowired
	Iuser users;
	@Autowired
	EmiDetailsRepository emirepo;
	@Autowired
	EmailNotificationService notificationService;
	@Autowired
	private LoanDetailsIMpl loanDetailsIMpl;
	@Autowired
	private LoanDetailsRepository loanDetailsRepository;
	@Autowired
	CibilRepository cibilRepository;
	@Autowired
	private EmiServiceImpl emiservice;

	@RequestMapping("/")
	public String page() {
		return "HomeLoan";
	}

	@RequestMapping(path = "/user")
	public String registredData(@RequestParam("fname") String firstName, @RequestParam("email") String email,
			@RequestParam("aadharno") long aadharno, @RequestParam("lname") String lname,
			@RequestParam("username") String username, @RequestParam("address") String address,
			@RequestParam("contactno") String contactno, @RequestParam("panno") String panno) {
		logger.info(firstName);
		User user = new User();
		user.setFirstName(firstName);
		user.setPassword(generateRandomPassword());
		user.setEmail(email);
		user.setAdharNo(aadharno);
		user.setAddress(address);
		user.setContactNo(contactno);
		user.setPanNo(panno);
		user.setLastName(lname);
		user.setUserName(username);
		users.registerUserData(user);
		
		try {
			System.out.println("In try---------");
			notificationService.sendNotification(user);

		} catch (MailException e) {
			logger.info("Error message......." + e.getMessage());
		}
		// logger.info("Registered User" + user.toString());
		return "login";
	}

	/*
	 * @GetMapping(path = "/checkUsersCibil/{userId}") public Cibil
	 * getUserData(@PathVariable(name = "userId") int id) {
	 * System.out.println("cibil call"); User getSingleUser =
	 * users.getSingleUser(id);
	 * 
	 * // String url="http://localhost:8082/checkCibil/1"; // System.out.println(id+
	 * "-----------------------------------------------------------------"+url); //
	 * Cibil cibil=(Cibil) restTemplate.getForObject(url, Cibil.class);
	 * 
	 * return users.CheckcibilScore(getSingleUser); }
	 */

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
				httpSession.setAttribute("userId", user.getUserId());
				modelMap.addAttribute("msg", user);
				return "LoanDetail";
			} else {

				modelMap.put("error", "Invalid Username and password");
				return "login";
			}
		} else {
			return "login";
		}
	}		
	
	
@PostMapping("/loan")
	public String loanCreate(@RequestParam("uid") String userid,
			@RequestParam("LoanType") String loantype,
			@RequestParam("interest") String interest ,
			@RequestParam("amount") String amount)
	{
	System.out.println("rahul sir yetat kay"+userid);
	System.out.println(userid+"---"+loantype+"---"+interest+"---"+amount );
		LoanDetails l=new LoanDetails();
		User s=new User();
		s.setUserId(Integer.parseInt(userid));
		l.setUserId(s);
		l.setLoanType(loantype);
		l.setRoi(Double.parseDouble(interest));
		l.setLoanAmount(Double.parseDouble(amount));
		
		
		loanDetailsRepository.save(l);
		return "/view/LoanDetail";
	}
	
	@GetMapping("/getloanlist/{id}")
	public List<LoanDetails> getLoanList(@PathVariable int id)
	{
		
		return loanDetailsIMpl.findAllLoanByUserId(id); 
	}
	
	@PostMapping("/emi")
	public String emipay(@RequestParam("loanid") String loanid,@RequestParam("amount") String amount) 
	{
		
		
		emiservice.emisave(amount);
		
		
		return "/jsp/LoanDetail";
		
		
	}
	
	

}
