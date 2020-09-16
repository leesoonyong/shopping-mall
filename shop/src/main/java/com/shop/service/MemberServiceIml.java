package com.shop.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.MemberVO;
import com.shop.persistence.MemberDAO;

@Service
public class MemberServiceIml implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO; 
	
	
	//ȸ������
	@Override
	public void signUp(MemberVO vo) {
		memberDAO.signUp(vo);
	}
	//�α���
	@Override
	public MemberVO signIn(MemberVO vo) {
		return memberDAO.signIn(vo);
	}
	//�α׾ƿ�
	@Override
	public void signOut(HttpSession session) {
		session.invalidate();
	}

}