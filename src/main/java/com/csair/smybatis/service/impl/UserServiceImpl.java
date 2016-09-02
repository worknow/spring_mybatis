package com.csair.smybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csair.smybatis.dao.UserMapper;
import com.csair.smybatis.entity.User;
import com.csair.smybatis.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}
	
	
}
