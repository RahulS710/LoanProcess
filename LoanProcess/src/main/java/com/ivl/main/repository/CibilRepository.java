package com.ivl.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivl.main.model.Cibil;
@Repository
public interface CibilRepository extends CrudRepository<Cibil, Integer>
{
	public Cibil findByCid(int cid);


}
