package com.diamond.app.user.model.sql.impl.mysql;

import org.springframework.stereotype.Repository;

import com.diamond.app.user.model.sql.UserDao;

@Repository("userRepo")
public class UserDaoImpl implements UserDao{
	@Override
	public Object loginRow(Object obj) {
		System.out.println("user dao loginRow: " + obj);
		return null;
	}
}
