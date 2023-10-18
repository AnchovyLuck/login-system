package net.guides.springboot.registrationlogindemo.service;

import java.util.List;

import net.guides.springboot.registrationlogindemo.dto.UserDto;
import net.guides.springboot.registrationlogindemo.entity.User;

public interface UserService {
	void saveUser(UserDto userDto);
	
	User findUserByEmail(String email);
	
	List<UserDto> findAllUsers();
}
