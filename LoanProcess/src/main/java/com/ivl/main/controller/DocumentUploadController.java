package com.ivl.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ivl.main.model.UserDocument;
import com.ivl.main.repository.DocumentUploadRepository;
import com.thoughtworks.xstream.io.path.Path;

@Controller
@RequestMapping("/document")
public class DocumentUploadController {

	@Autowired
	DocumentUploadRepository dr;

	@RequestMapping(path = "/")
	public String home() {
		return "Home";
	}

	// @RequestMapping(path = "/upload")
	@PostMapping(value = "/upload")
	public String documentUpload(@RequestParam("fileToUpload") MultipartFile file) {

		try {
			if (file != null) {
				UserDocument documents = new UserDocument();
				byte[] files = file.getBytes();
				documents.setDocument(files);
				documents.setDocumentName(file.getOriginalFilename());
				System.out
						.println("----------------------Documentt Name----------------" + documents.getDocumentName());
				dr.save(documents);
//			dr.saveAllData(userDocument);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return "document-upload";
		/// LoanProcess/src/main/webapp/documents
	}
}
