package com.ivl.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ivl.main.repository.DocumentUploadRepository;

@RequestMapping("/retrive")
public class RetrieveDocumentController {
	@Autowired
	DocumentUploadRepository  documentRepo;
	
	@RequestMapping("/document")
	public String retriveDocument(@RequestParam(name = "a") String a) {
		
//		documentRepo.findAll(1);
		
		return null;
		
	}

}
