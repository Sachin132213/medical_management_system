package com.medical.service;

import java.util.Set;

import com.medical.model.User;
import com.medical.model.UserRole;

public interface UserService {
	//creating user
	public UserService createUser(User user,Set<UserRole> userRoles);
}
