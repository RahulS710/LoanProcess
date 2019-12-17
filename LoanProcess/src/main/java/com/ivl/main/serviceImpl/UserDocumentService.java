package com.ivl.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivl.main.model.User;
import com.ivl.main.repository.UserDocumentRepository;
import com.ivl.main.service.IuserDocumentService;

@Service
public class UserDocumentService  implements IuserDocumentService{
	@Autowired
	UserDocumentRepository userDocument;

	@Override
	public List<User> getAllDocument(User user) {
		List<User>userAllData=(List<User>) userDocument.findAll();
		return userAllData;
		
	}
	

}
