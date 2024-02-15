package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.ProductDTO;
import com.itbank.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	
	@Autowired ProductService productService;
	
	@GetMapping("/list")
	public ModelAndView getPlist() {
		ModelAndView mav = new ModelAndView();
		List<ProductDTO> list = productService.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("add")
	public String add(ProductDTO dto) {
		int row = productService.add(dto);
		System.out.println(row != 0 ? "등록 성공" : "등록 실패");
		return "redirect:/product/list";
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx")int idx) {
		ModelAndView mav = new ModelAndView("/product/view");
		ProductDTO dto = productService.getView(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@GetMapping("/modify/{idx}")
	public ModelAndView modify(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/product/modify");
		ProductDTO dto = productService.getView(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@PostMapping("/modify/{idx}")
	public ModelAndView modify(ProductDTO dto) {
		ModelAndView mav= new ModelAndView("alert");
		int row = productService.modify(dto);
		String msg = row != 0 ? "수정 성공" : "수정 실패";
		String url = "/product/view/" + dto.getIdx();
		mav.addObject("msg", msg);
		mav.addObject("url", url); 
		return mav;
	}
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable("idx")int idx) {
		int row = productService.delete(idx);
		System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
		return "redirect:/product/list";
	}
	
	
	
	
	
	
}
