package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.ChoiceService;

@Controller
public class ChoiceController {

	@Autowired private ChoiceService choiceService;
	
	
	
	@GetMapping("/view/{idx}")
	public void choice() {}
	
	@PostMapping(/view/{idx})
	public ModelAndView choice(@PathVariable("idx")int idx) {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
}
