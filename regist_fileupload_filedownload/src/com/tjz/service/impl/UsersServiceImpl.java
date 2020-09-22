package com.tjz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjz.mapper.UsersMapper;
import com.tjz.pojo.Users;
import com.tjz.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public int insUsers(Users users) {
		return usersMapper.insUsers(users);
	}

}
