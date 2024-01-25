package com.example.demo.service;

import com.example.demo.entity.Users;

public interface UsersService {

	public String addUsers(Users users);
	public boolean emailExits(String email);
	public boolean validateUser(String email, String password);
	public String getRole(String email);
	public Users getUser(String email);


}
