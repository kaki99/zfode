package com.diamond.app.user.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.diamond.app.user.model.vo.UserDTO;
import com.diamond.app.user.model.vo.UserVO;

@Controller
public class UserController {
	
	/**
	 * @param dto
	 * @return String
	 */
	@RequestMapping("/login.do")
	public String login(UserDTO dto) {
		System.out.println("controller login");
		System.out.println("UserDTO: " + dto);
		return "home";
	}
	
	/**
	 * void 
	 * 반환이 없다면 RequestMapping에 적혀있는 url에 jsp를 맵핑해서 찾는다.
	 * logout.jsp
	 */
	@RequestMapping("/logout.do")
	public void logout() {
		System.out.println("controller logout");
	}
	
	/**
	 * ModelAndView
	 * View에 대한 정보와 Data에 대한 정보를 함께 넘긴다.
	 */
	@RequestMapping("/join.do")
	public ModelAndView join(ModelAndView mv) {
		System.out.println("controller join");
		mv.addObject("msg","Hi, spring");
		mv.setViewName("home");
		return null;
	}
	
	/**
	 * 추천하는 방식, 화면에 바로 나옴
	 * @return String
	 */
	@RequestMapping("/search.do")
	public String search(Model model) {
		System.out.println("controller search");
		model.addAttribute("msg", "using model search");
		return "home";	
	}
	
	/**
	 * TODO 확인 필요
	 * @return
	 */
	@RequestMapping("/ajax.do")
	@ResponseBody
	public UserVO ajax() {
		System.out.println("controller search");
		return new UserVO("diamond", "diamond", "kaki99d", 1000, "STARTBUCKS");
	}
	
}
