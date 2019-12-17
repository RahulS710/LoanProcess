package com.ivl.main.service;

import com.ivl.main.model.Cibil;
import com.ivl.main.model.User;

public interface Iuser {
	
	public void registerUserData(User user);
	public User getSingleUser(int id);
	public User getSingleUserData(long adharNo);
	public Cibil CheckcibilScore(User user);
}
