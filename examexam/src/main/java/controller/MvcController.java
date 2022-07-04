package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.Dao;
import dto.Dto;

@Controller
public class MvcController {
	
	@Autowired
	private Dao dao;

	@GetMapping("/input11")
	public String printData() {
		return "test/input11";
	}
	
	@PostMapping("/input11")
	public String printData(Dto dto) {
		dao.insertDto(dto);
		return "main";
	}
	
	@GetMapping("/allPrint")
	public String allPrinter(Model model) {
		List<Dto> list = dao.selectAll();
		model.addAttribute("list", list);
		return "test/allPrint";
	}
	
	@PostMapping("/search")
	public String search(String id, Model model) {
		Dto dto = dao.searchId(id);
		model.addAttribute("dto", dto);
		return "test/result";
	}
	
	@GetMapping("/allPoint")
	public String count(Model model) {
		int count = dao.allCount();
		model.addAttribute("count", count);
		return "test/count";
	}
}
