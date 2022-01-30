package com.diamond.app.user.model.sql.impl.mysql;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.diamond.app.user.model.sql.UserDao;

//DB와 연동시킨다.
//매개변수가 없어도 되지만, 넣어주는 게 좋다.
@Repository("userRepo")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession session;

	public static final String PREFIX = "com.diamond.app.user";

	@Override
	public Object loginRow(Object obj) {
		System.out.println("user dao loginRow: " + obj);
		System.out.println("user dao session: " + session);

		// UserMapper.xml의 login에 해당되는 부분을 실행하고 객체를 받는다.
		Object result = session.selectOne(PREFIX + ".login", obj);
		System.out.println("dao loginRow result : " + result);
		return result;
	}
}
