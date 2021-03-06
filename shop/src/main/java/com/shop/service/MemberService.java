package com.shop.service;

import javax.servlet.http.HttpSession;

import com.shop.domain.MemberVO;

public interface MemberService {
	//회원가입
	public void signUp(MemberVO vo);
	//로그인
	public MemberVO signIn(MemberVO vo);
	//로그아웃
	public void signOut(HttpSession session);
}
