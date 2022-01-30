package com.diamond.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/main.do")
	public String home() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREAN);
		String formattedDate = dateFormat.format(date);
		logger.info("Controller main {}", formattedDate);
		return "home";
	}
	
	@RequestMapping("/interceptor.do")
	public String interceptorSample() {
		logger.info("ctrl interceptor");
		return "home";
	}

}
