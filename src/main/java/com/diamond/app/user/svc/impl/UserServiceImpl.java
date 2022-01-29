package com.diamond.app.user.svc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diamond.app.user.model.sql.UserDao;
import com.diamond.app.user.svc.UserService;

/**
 * 프레임워크에 위임시킨다.
 * @author dalagu
 *
 */
@Service("userSvc")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;
	
	@Override
	public Object login(Object obj) {
		System.out.println("user service login: " + obj);
		return dao.loginRow(obj);
	}

}
