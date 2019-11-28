package com.ivl.main.service;

import com.ivl.main.model.User;

public interface Iuser {
	
	public void registerUserData(User user);
	public User getSingleUser(int id);
	public User getSingleUserData(long adharNo);
	public User CheckcibilScore(User user);
}
