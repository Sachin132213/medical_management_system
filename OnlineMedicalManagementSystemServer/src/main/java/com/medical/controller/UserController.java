package com.medical.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.model.Role;
import com.medical.model.User;
import com.medical.model.UserRole;
import com.medical.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	//creating user
	@Autowired
	private UserService userService;
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		Set<UserRole> roles=new HashSet<>();
		Role role=new Role();
		role.setRoleId(46L);
		role.setRoleName("Normal");
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		roles.add(userRole);
		return this.userService.createUser(user,roles);
	}
}
