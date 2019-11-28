package com.ivl.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivl.main.model.EmiDetails;
import com.ivl.main.model.LoanDetails;
import com.ivl.main.model.User;
import com.ivl.main.repository.UserRepository;
import com.ivl.main.service.Iuser;

@Service
public class UserImpl implements Iuser {

	@Autowired
	UserRepository userRepo;

	@Override
	public void registerUserData(User user) {
		
		userRepo.save(user);
	}

	@Override
	public User getSingleUser(int id) {

		User getData = userRepo.findById(id);
		return getData;
	}

	@Override
	public User getSingleUserData(long adharNo) {
		User getCibilScore = userRepo.findByadharNo(adharNo);
		return getCibilScore;
	}

	@Override
	public User CheckcibilScore(User user) {
		System.out.println("Cibil Score ---------------------------------------");
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
					System.out.println("Count----------------------"+count);
				}
			}
			

		}
		
		user.setMissingEmi(count);
		User u=userRepo.save(user);
		
		System.out.println(u);
		return u;
		}
		else {
			
			return userRepo.save(user);
			
		}
		//return userRepo.save(user);

	}

}
