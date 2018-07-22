package com.pan.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pan.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	
}
