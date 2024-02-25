package com.itbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.AccountDTO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	
	@Autowired private AccountService accountService;
	
	//로그인
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountDTO dto, String url, HttpSession session) {
		AccountDTO login = accountService.getLogin(dto);
		session.setAttribute("login", login);
		if(url == null) {
			url = "/";
		}
		return "redirect:" + url;
	}
	
	// 회원가입
	@GetMapping("/join")
	public void join() {}
	
	@PostMapping("/join")
	public String join(AccountDTO dto) {
		int row = accountService.add(dto);
		System.out.println(row != 0 ? "가입 성공" : "가입 실패");
		return "redirect:/account/login";
	}
	
	// 로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/resetPass")
	public void resetPass() {}
	
	@PostMapping("/resetPass")
	public ModelAndView resetPass(AccountDTO dto) {
		ModelAndView mav = new ModelAndView("alert");
		String pass = accountService.resetPass(dto);
		mav.addObject("msg","변경된 비밀번호 : " + pass);
		mav.addObject("url", pass != null ? "/account/login" : "");
		return mav;
	}
	
	
	
	
}
