package com.ivl.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ivl.main.model.Cibil;

@RestController
public class CibilController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(path = "/checkCibil/{userId}")
	public Cibil getCibilScore(@PathVariable(name = "userId") int id)
	{
		System.out.println("rest call----------------------------------");
		String value="{\"userId\"}";
		String url="http://localhost:8081/checkUsersCibil/"+id;
		System.out.println(id+"-----------------------------------------------------------------"+url);
		Cibil cibil=(Cibil) restTemplate.getForObject(url, Cibil.class);
		return cibil ;
	}
	
	@GetMapping(path = "/")
	public String getData()
	{
		return "getData";
				
	}
	@GetMapping(path = "/getAllData")
	public String getAllData()
	{
		String url="http://localhost:8081/getData";
		System.out.println("------------------------------------------------------------"+url);
		String getData=restTemplate.getForObject(url, String.class);
		return getData;
	}

}
