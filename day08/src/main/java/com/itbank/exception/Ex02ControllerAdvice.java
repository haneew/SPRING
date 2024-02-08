package com.itbank.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.controller.Ex02Controller;

//@ControllerAdvice		// 예외처리함수(ExceptionHandler)를 포함하는 클래스
						// 어노테이션만 작성하면 모든 컨트롤러의 예외를 처리하게 된다(전역)

// Ex02Controller에서 발생하는 예외만 처리한다(특정 지역)
@ControllerAdvice(assignableTypes = Ex02Controller.class)
public class Ex02ControllerAdvice {
	
	@ExceptionHandler(StringEmptyException.class)
	public ModelAndView stringEmpty(StringEmptyException e) {
		ModelAndView mav = new ModelAndView("alert");
		mav.addObject("msg", e.getMessage());
		return mav;
	}
	
	@ExceptionHandler(AgeOutOfBoundsException.class)
	public ModelAndView ageOutOfBounds(AgeOutOfBoundsException e) {
		ModelAndView mav = new ModelAndView("alert");
		mav.addObject("msg", e.getMessage());
		return mav;
	}
	
	// 체크한 Exception을 처리하고 나서 놓친게 있을 수 있으니 전체적인 예외 처리를 해주는것이 좋다.
	@ExceptionHandler(Exception.class)
	public ModelAndView otherException(Exception e) {
		ModelAndView mav = new ModelAndView("alert");
		mav.addObject("msg", e.getMessage());
		return mav;
	}
}
