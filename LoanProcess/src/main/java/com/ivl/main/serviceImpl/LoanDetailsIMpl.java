package com.ivl.main.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivl.main.model.LoanDetails;
import com.ivl.main.repository.LoanDetailsRepository;
import com.ivl.main.service.IloanDetails;

@Service
public class LoanDetailsIMpl implements IloanDetails {

	@Autowired
	private LoanDetailsRepository LoanDetailsRepository;

	private LoanDetails loan;

	@Override
	public List<LoanDetails> findAllLoanByUserId(int userid) {
		List<LoanDetails> loadlist = (List<LoanDetails>) LoanDetailsRepository.findAll();
		List<LoanDetails> userloanList = new ArrayList<LoanDetails>();
		Iterator<LoanDetails> i = loadlist.iterator();
		while (i.hasNext()) {
			loan = (LoanDetails) i.next();
			
			if(userid==loan.getUserId().getUserId())
			{
				userloanList.add(loan);
			}
			}
		return userloanList;
	}

}
