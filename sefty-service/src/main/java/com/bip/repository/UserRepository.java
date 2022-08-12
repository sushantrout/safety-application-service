package com.bip.repository;

import org.springframework.data.repository.CrudRepository;

import com.bip.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User getUserByUsername(String username);
}
