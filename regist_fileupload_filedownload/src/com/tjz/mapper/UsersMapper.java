package com.tjz.mapper;

import org.apache.ibatis.annotations.Insert;

import com.tjz.pojo.Users;

public interface UsersMapper {
	
	@Insert("INSERT INTO users VALUES(DEFAULT,#{username},#{password},#{photo})")
	public abstract int insUsers(Users users);
}
