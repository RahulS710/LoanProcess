package com.ivl.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivl.main.model.Cibil;
import com.ivl.main.model.EmiDetails;
import com.ivl.main.model.LoanDetails;
import com.ivl.main.model.User;
import com.ivl.main.repository.CibilRepository;
import com.ivl.main.repository.UserRepository;
import com.ivl.main.service.Iuser;

@Service
public class UserImpl implements Iuser {

	@Autowired
	UserRepository userRepo;
	@Autowired
	CibilRepository cibilRepository;
	Cibil c;

	@Override
	public void registerUserData(User user) {
		
		userRepo.save(user);
	}

	@Override
	public User getSingleUser(int id) {

		User getData = userRepo.findByUserId(id);
		return getData;
	}

	@Override
	public User getSingleUserData(long adharNo) {
		User getCibilScore = userRepo.findByadharNo(adharNo);
		return getCibilScore;
	}

	@Override
	public Cibil CheckcibilScore(User user) {
				int count = 0;
		// int missData = user.getMissingEmi();
		List<LoanDetails> list = user.getLoanId();
		//System.out.println(list);
		if(list!=null) {
		for (LoanDetails data : list) {
			List<EmiDetails> emi = data.getEmiId();
			for (EmiDetails emiData : emi) {
				if (emiData.getEmiPaidNot() == 0) {
					count++;
					
				}
			}
			

		}
		User u1=new User();
		user.setMissingEmi(count);
		User u=userRepo.save(user);
		 c=new Cibil();
		c.setCibilScore(900-(u.getMissingEmi()*50));
		c.setUserId(u);
		return cibilRepository.save(c);
		
		}
		else {
			userRepo.save(user);
			return cibilRepository.save(c);
			
		}
		//return userRepo.save(user);

	}

}
