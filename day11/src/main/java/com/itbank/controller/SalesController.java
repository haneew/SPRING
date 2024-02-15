package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.SalesDTO;
import com.itbank.service.SalesService;

@Controller
@RequestMapping("/sales")
public class SalesController {

	
	@Autowired private SalesService salesService;
	
	@GetMapping("list")
	public ModelAndView saleList() {
		ModelAndView mav = new ModelAndView();
		List<SalesDTO> list = salesService.getList();
		mav.addObject("list", list);
		return mav;
	}
}
