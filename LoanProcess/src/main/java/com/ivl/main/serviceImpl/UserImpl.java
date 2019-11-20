package com.ivl.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivl.main.model.User;
import com.ivl.main.repository.UserRepository;
import com.ivl.main.service.Iuser;
@Service
public class UserImpl  implements Iuser{

	@Autowired
	UserRepository ur;
	@Override
	public void registerUserData(User user) {
		ur.save(user);
	}
	

}
