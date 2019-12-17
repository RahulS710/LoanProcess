package com.ivl.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivl.main.model.EmiDetails;
@Repository
public interface EmiDetailsRepository extends CrudRepository<EmiDetails, Integer> 
{

}
