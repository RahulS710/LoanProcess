package com.ivl.main.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivl.main.model.EmiDetails;
import com.ivl.main.model.LoanDetails;
import com.ivl.main.repository.EmiDetailsRepository;
import com.ivl.main.service.IemiDetails;
@Service
public class EmiServiceImpl implements IemiDetails 
{
	LoanDetails l;
	EmiDetails e;
	@Autowired 
	private EmiDetailsRepository emirepo;
	

	@Override
	public void emisave(String amount)
	{
		int lid=1;
		l=new LoanDetails();
		l.setLoanId(lid);
		e=new EmiDetails();
		e.setAmount(Long.parseLong(amount));
		e.setLoanDetailsId(l);
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 Date date = new Date();  
		    System.out.println(formatter.format(date));  
		    e.setEmiDate(date.toString());
		    e.setEmiPaidNot(1);
		    emirepo.save(e);
	}

}
