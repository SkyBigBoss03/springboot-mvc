package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;  //spring为其生成代理对象

	@Override
	public List<User> findUserList() {
		
		return userMapper.findUserList();
	}
	
}
