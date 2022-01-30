package com.diamond.app.user.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diamond.app.user.model.vo.UserDTO;
import com.diamond.app.user.svc.UserService;

@Controller
public class UserController {

	// 의존성 주입(DI), 해당 이름의 객체를 여기 변수에 넣어주세요.
	@Autowired
	private UserService service;

	@RequestMapping("/loginForm.do")
	public String loginForm() {
		System.out.println("user loginForm");
		return "user/login";
	}

//	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
//	public String login(UserDTO dto, HttpSession session) { // 단순 데이터라면 session이 아닌 Model model을 이용하면 된다.
//		System.out.println("user login dto : " + dto);
//		Object user = service.login(dto);
//		if (user != null) {
//			// model.addAttribute("loginSession", user);
//			// 데이터 유효시간이 request되는 페이지에만 유효하다.
//			session.setAttribute("loginUser", user);
//		}
//		return "redirect:/main.do";
//	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public void login(UserDTO dto, Model model) { // 단순 데이터라면 session이 아닌 Model model을 이용하면 된다.
		System.out.println("user login dto : " + dto);
		Object user = service.login(dto);
		if (user != null) {
			// model.addAttribute("loginSession", user);
			model.addAttribute("loginUserModel", user);
		}
//		return "redirect:/main.do";
	}

	@RequestMapping("/logout.do")
	public String logout() {
		System.out.println("user logout");
		return "redirect:/main.do";
	}

}
