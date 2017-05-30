package com.qamaster.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qamaster.web.dao.UserDao;
import com.qamaster.web.model.User;

@Service("usersService")
public class UsersService {

	private UserDao userDao;
	
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	public boolean createUser(User user) {
		return this.userDao.create(user);
	}
	
}
