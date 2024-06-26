package com.santosh.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.santosh.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findById(long id);

	
	

}
