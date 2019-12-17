package com.ivl.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivl.main.model.UserDocument;
@Repository
public interface ApprovedDocumentRepository  extends CrudRepository<UserDocument, Integer>{

}
