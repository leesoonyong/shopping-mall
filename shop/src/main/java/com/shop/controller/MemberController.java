package com.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shop.domain.MemberVO;
import com.shop.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	
	//ȸ������GET
	@RequestMapping(value= "/signUp", method = RequestMethod.GET)
	public void getSignUp() {
		
	}
	
	//ȸ������POST
	@RequestMapping(value= "/signUp", method = RequestMethod.POST)
	public String postSignUp(MemberVO vo) {
		String inputPass = vo.getUserPass();
		String pass = passEncoder.encode(inputPass);
		vo.setUserPass(pass);
		service.signUp(vo);
		
		return "redirect:/";
	}
	
	// �α���GET
	@RequestMapping(value= "/signIn", method = RequestMethod.GET)
	public void getSignIn() {
		
	}
	
	//�α���POST
	@RequestMapping(value= "/signIn", method = RequestMethod.POST)
	public String postSignIn(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) {
		MemberVO login = service.signIn(vo);
		HttpSession session = req.getSession();
		
		boolean passMatch = passEncoder.matches(vo.getUserPass(), login.getUserPass());
		
		if(login != null && passMatch) {
			session.setAttribute("member", login);
		}else {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:/member/signIn";
		}
		return "redirect:/";
		
	}
	
	@RequestMapping(value= "/signOut", method = RequestMethod.GET)
	public String signOut(HttpSession session) {
		service.signOut(session);
		return"redirect:/";
	}
}