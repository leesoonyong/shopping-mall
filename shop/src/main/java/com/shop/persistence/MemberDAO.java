package com.shop.persistence;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.domain.MemberVO;

@Repository("MemberDAO")
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	private static String namespace = "com.shop.mappers.member";
	
	//회원가입
	public void signUp(MemberVO vo) {
		mybatis.insert(namespace + ".signUp", vo);
	}
	
	//로그인
	public MemberVO signIn(MemberVO vo) {
		return mybatis.selectOne(namespace + ".signIn", vo);
	}
}
