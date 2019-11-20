package com.ivl.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivl.main.model.User;
@Repository
public interface UserRepository  extends CrudRepository<User, Integer>{

	public User findById(int id);

	public User findByadharNo(long adharNo);
	
	
}
