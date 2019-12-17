package com.ivl.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.ivl.main.model.User;

public interface UserDocumentRepository extends CrudRepository<User, Integer> {

}
