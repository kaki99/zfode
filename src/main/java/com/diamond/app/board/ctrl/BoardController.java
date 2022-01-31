package com.diamond.app.board.ctrl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diamond.app.board.svc.BoardService;
import com.diamond.app.board.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	
	@RequestMapping("/listPage.do")
	public String list(Model model) {
		System.out.println("-- Board Ctrl --");
		//모델에 데이터를 넣어서 보내기
		model.addAttribute("list", service.list());

		return "board/listPage";
	}
	
	@RequestMapping("/registerForm.do")
	public String register() {
		return "board/register";
	}
	
	@RequestMapping("/register.do")
	public String register_do(BoardVO vo) {
		System.out.println("register vo : " + vo);
		int flag = service.register(vo);
//		if(result!=0) {
//			model.addAttribute("list", service.list());
//		}
//		return "board/listPage";
		System.out.println("flag : " + flag);
		return "redirect:/listPage.do";
		
	}
	
	@RequestMapping(value="/readPage.do", method=RequestMethod.GET)
	public String read(BoardVO vo, Model model) {
		System.out.println("-- read --");
		Object result = service.read(vo);
		model.addAttribute("board", result);
		return "board/readPage";
	}
	
	@RequestMapping("/remove.do")
	public String remove(BoardVO vo) {
		System.out.println("-- remove --");
		
		int flag = service.remove(vo);
		System.out.println("remove flat : " + flag);
		return "redirect:/listPage.do";
	}
	
	@RequestMapping("/modify.do")
	public String modify(BoardVO vo) {
		System.out.println("-- modify --");
		int flag = service.modify(vo);
		System.out.println("modify flag : " + flag);
		return "redirect:/listPage.do";
	}
	
	@RequestMapping("/search.do")
	//리턴타입을 json화 해준다. 따라서 코드상에서 따로 작업할 필요 없다.
	@ResponseBody
	public List<Object> search(String type, String keyword, HashMap<String, String> map) {
		System.out.println("-- search --");
		map.put("type", type);
		map.put("keyword", keyword);
		List<Object> result = service.search(map);
		return result;
	}
}
