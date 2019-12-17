package com.ivl.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ivl.main.service.DocumentApproved;

@Controller
@CrossOrigin("/")
public class ApproveDocumentController {
	@Autowired
	DocumentApproved documentApproved;

	Logger logger = LoggerFactory.getLogger(ApproveDocumentController.class);

	@RequestMapping("/approve")
	public String approvedDocument(@RequestParam(name = "approveId") int docId) {
		logger.info("Approve Id : " + docId);
		try {
			documentApproved.approveDocument(docId);
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}
		return "login";

	}

}
