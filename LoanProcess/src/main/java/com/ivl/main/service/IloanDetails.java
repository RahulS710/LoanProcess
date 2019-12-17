package com.ivl.main.service;

import java.util.List;

import com.ivl.main.model.LoanDetails;

public interface IloanDetails 
{
	
	public List<LoanDetails> findAllLoanByUserId(int userid);


}
