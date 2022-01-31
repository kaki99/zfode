package com.diamond.app.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diamond.app.hello.svc.HelloService;

/**
 * DL: Dependency Lookup(의존성 검색) - Bean들을 looup
 * @author dalagu
 *
 */
public class HelloMain {
	public static void main(String[] args) {
		//빈 스프링 컨테이너 생성, 빈 또한 생성
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		// getBean(): DL 지원, 생성되어 있는 빈 중 해당 빈을 찾는다.
//		HelloDao dao = ctx.getBean("helloDao", HelloDao.class);
//		int result = dao.addTwoNumber(3, 5);
//		System.out.println("DL test" + result);
		
		// setter DI
//		HelloService service = ctx.getBean("helloService", HelloService.class);
//		int result = service.calcTwoNumbers(4, 5);
//		System.out.println(result);
		
		HelloService service = ctx.getBean("helloService", HelloService.class);
		int result = service.calcTwoNumbersAndSquare(4, 3);
		System.out.println(result);
	}
}
