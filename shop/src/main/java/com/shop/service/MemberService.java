package com.shop.service;

import javax.servlet.http.HttpSession;

import com.shop.domain.MemberVO;

public interface MemberService {
	//ȸ������
	public void signUp(MemberVO vo);
	//�α���
	public MemberVO signIn(MemberVO vo);
	//�α׾ƿ�
	public void signOut(HttpSession session);
}
