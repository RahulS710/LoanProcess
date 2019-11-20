package com.ivl.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		User getCibilScore=userRepo.findByadharNo(adharNo);
		return getCibilScore;
	}



}
