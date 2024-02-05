package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.SurveysDTO;
import com.itbank.service.SurveysService;

@Controller
@RequestMapping("/surveys")
public class SurveysController {

	
	@Autowired private SurveysService surveysService; 
	
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<SurveysDTO> list = surveysService.getList();
		mav.addObject("list", list);
		return mav;
	}

	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/surveys/view");
		SurveysDTO dto = surveysService.getSurvey(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(SurveysDTO dto) {
		int row = surveysService.write(dto);
		System.out.println(row != 0 ? "추가 성공" : "추가 실패");
		return "redirect:/list";
	}
	
	
	
	
	
	
	
	
}
