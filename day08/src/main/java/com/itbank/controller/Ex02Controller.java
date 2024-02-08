package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.exception.AgeOutOfBoundsException;
import com.itbank.exception.StringEmptyException;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {

	@GetMapping
	public void ex02() {}
	
	@PostMapping
	public ModelAndView ex02(String name, int age) throws StringEmptyException, AgeOutOfBoundsException {
		ModelAndView mav = new ModelAndView("ex02-result");
		if("".equals(name)) {
			throw new StringEmptyException();
		}
		else if(age > 100 || age < 0){
			throw new AgeOutOfBoundsException(age);
		}
		// age의 값이 0보다 작거나, 100을 초과하는 경우 예외를 발생시켜서 ControllerAdvice에서 처리하세요
		// 예외클래스의 이름은 AgeOutOfBoundsException 입니다
		// "나이의 값이 범위를 초과합니다"
		
		System.out.printf("name : [%s]\n", name);
		mav.addObject("name", name);
		mav.addObject("age", age);
		mav.addObject("adult", age >= 20 ? "성인" : "미성년자");
		return mav;
	}
	
}
