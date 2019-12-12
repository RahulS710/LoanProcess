package com.ivl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivl.main.model.UserDocument;

@Repository
public interface DocumentUploadRepository  extends JpaRepository<UserDocument, Integer>
{
	
	
}
