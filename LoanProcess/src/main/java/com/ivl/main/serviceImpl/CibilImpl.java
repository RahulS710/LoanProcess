package com.ivl.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivl.main.model.Cibil;
import com.ivl.main.repository.CibilRepository;
import com.ivl.main.service.Icibil;

@Service
public class CibilImpl implements Icibil
{

	@Autowired
	private CibilRepository cibilRepo;

	@Override
	public Cibil getCibilById(int id) 
	{
		
		return cibilRepo.findById(id);
	}

	

	
	
	
	

}
