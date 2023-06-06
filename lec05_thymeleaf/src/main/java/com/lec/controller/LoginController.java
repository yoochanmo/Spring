package com.lec.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.lec.domain.Member;
import com.lec.service.MemberService;

@Controller
@SessionAttributes("member")
public class LoginController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login") 
	public void loginView() {
	}
	
	@PostMapping("/login") 
	public String login(Member member, Model model) {
		// System.out.println("로그인성공!!!!");
		Member findMember = memberService.getMember(member);
		
		if(findMember != null && findMember.getPassword().equals(member.getPassword())) {
			model.addAttribute("member", findMember);
			return "forward:getBoardList";
		} else {
			return "redirect:login";				
		}
	}
	
	@GetMapping("/logout") 
	public String logout(SessionStatus status) {
		status.setComplete(); // HttpSerssion.invalidate()
		return "redirect:index.html";
	}	
}
