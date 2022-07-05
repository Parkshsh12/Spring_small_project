package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.Dao;
import dto.Dto;

@Controller
public class MvcController {

	@Autowired
	private Dao dao;
	
	@RequestMapping("/join")
	public String memberJoin() {
		return "join";
	}
	
	@PostMapping("/join1")
	public String memberJoin(@RequestParam(value="agree", defaultValue = "false")boolean agree
			, String email, Model model) {
		if(agree) {
		model.addAttribute("email", email);
		return "join2";
		}
		else {
			return "join";
		}
	}
	
	@PostMapping("/join2")
	public String memberJoin2(Dto dto) {
		dao.insert(dto);
		return "main";
	}
	
	@RequestMapping("/list")
	public String printList(Model model) {
		List<Dto> list = dao.allPrint();
		model.addAttribute("list", list);
		return "list";
	}
}
