package com.dao;

import com.model.Users;

public interface UsersDao {
	
	public Users findByUsername(String username);

}
