package com.diamond.app.hello.svc;

import com.diamond.app.hello.dao.AnotherDao;
import com.diamond.app.hello.dao.HelloDao;

public class HelloService {
	private HelloDao helloDao;
	private AnotherDao anotherDao;

	/**
	 * setter DI
	 */
//	public void setHelloDao(HelloDao helloDao) {
//		this.helloDao = helloDao;
//	}

	/**
	 * Constructor DI
	 */
//	public HelloService(HelloDao helloDao) {
//		this.helloDao = helloDao;
//	}

//	public int calcTwoNumbers(int a, int b) {
//		return helloDao.addTwoNumber(a, b);
//	}

	/**
	 * 2개의 Injection 사용
	 */
	public void setHelloDao(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	public void setAnotherDAO(AnotherDao anotherDao) {
		this.anotherDao = anotherDao;
	}

	public int calcTwoNumbersAndSquare(int a, int b) {
		int result = helloDao.addTwoNumber(a, b);
		return anotherDao.square(result);
	}

}
