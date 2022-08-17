package com.bip.service;

import java.util.Set;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bip.dto.UserDTO;
import com.bip.entity.Role;
import com.bip.entity.User;
import com.bip.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public UserDTO login(UserDTO userDTO) {
		User userByUsername = userRepository.getUserByUsername(userDTO.getUsername());
		if (userByUsername != null) {
			Set<Role> roles = userByUsername.getRoles();
			userDTO.setRoles(roles);
			return userDTO;
		}
		throw new ServiceException("User not found");
	}

}
