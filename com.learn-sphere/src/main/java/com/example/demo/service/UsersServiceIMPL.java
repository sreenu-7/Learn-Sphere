package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;
@Service
public class UsersServiceIMPL implements UsersService{

	@Autowired
	UsersRepository repo;
	
	@Override
	public String addUsers(Users users) {
		repo.save(users);
		return "Added User Successfully";
		
	}

	@Override
	public boolean emailExits(String email) {
		if(repo.findByEmail(email)==null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean validateUser(String email, String password) {
		Users users=repo.findByEmail(email);
		String db_pass=users.getPassword();
		if(password.equals(db_pass)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String getRole(String email) {
		Users user=repo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public Users getUser(String email) {
		return repo.findByEmail(email);
	}

}
