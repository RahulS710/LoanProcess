package com.ivl.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivl.main.model.LoanDetails;
@Repository
public interface LoanDetailsRepository extends CrudRepository<LoanDetails, Integer>
{

}
