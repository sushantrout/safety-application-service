package com.bip.dto;

import java.util.LinkedHashSet;
import java.util.Set;

import com.bip.entity.Role;

import lombok.Data;

@Data
public class UserDTO {
	private String username;
	private String password;

	Set<Role> roles = new LinkedHashSet<>();
}
