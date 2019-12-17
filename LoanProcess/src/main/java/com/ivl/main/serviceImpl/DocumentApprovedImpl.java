package com.ivl.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivl.main.model.UserDocument;
import com.ivl.main.repository.ApprovedDocumentRepository;
import com.ivl.main.service.DocumentApproved;

@Service
public class DocumentApprovedImpl implements DocumentApproved {

	@Autowired
	ApprovedDocumentRepository approveRepo;

	@Override
	public void approveDocument(int docId) {
		boolean flag = true;
		UserDocument userDocument = new UserDocument();
		int id=userDocument.getId();
		System.out.println("Document UserId"+id);
		userDocument.setDocumentApproved(flag);

		approveRepo.save(userDocument);
	}

}
