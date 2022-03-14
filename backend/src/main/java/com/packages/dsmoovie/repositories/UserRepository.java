package com.packages.dsmoovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packages.dsmoovie.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	
	User findByEmail(String email);
	

}
