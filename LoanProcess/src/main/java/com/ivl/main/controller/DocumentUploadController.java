package com.ivl.main.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ivl.main.exception.CustomExceptionHandler;
import com.ivl.main.model.UserDocument;
import com.ivl.main.repository.DocumentUploadRepository;
import com.ivl.main.service.Iuser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/document")
public class DocumentUploadController {

	Logger logger = LoggerFactory.getLogger(DocumentUploadController.class);

	@Autowired
	DocumentUploadRepository dr;
	@Autowired
	Iuser userService;

	@RequestMapping(path = "/")
	public String home() {
		return "document-home";
	}

	// @RequestMapping(path = "/upload")
	@PostMapping(value = "/upload")
	public String documentUpload(@RequestParam("fileToUpload") MultipartFile file, HttpSession httpSession)
			throws CustomExceptionHandler {

		try {

			if (file != null) {
				UserDocument documents = new UserDocument();
				byte[] files = file.getBytes();
				documents.setDocument(files);
				documents.setDocumentName(file.getOriginalFilename());
//				documents.setUserId((long) httpSession.getAttribute("userId"));
				logger.info("----------------------Documentt Name----------------" + documents.getDocumentName());
				dr.save(documents);
//			dr.saveAllData(userDocument);
			}

		} catch (IOException e) {
			logger.error(e.getMessage());
			throw new CustomExceptionHandler();
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CustomExceptionHandler();
		}
		return "document-upload";
		/// LoanProcess/src/main/webapp/documents
	}
}
