package com.shop.persistence;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.domain.CategoryVO;
import com.shop.domain.GoodsVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.domain.ReplyListVO;

@Repository("AdminDAO")
public class AdminDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	private static String namespace = "com.shop.mappers.admin";
	
	//카테고리
	public List<CategoryVO>category(){
		return mybatis.selectList(namespace + ".category");
	}
	
	//상품등록
	public void register(GoodsVO vo) {
		mybatis.insert(namespace + ".register", vo);
	}
	
	//상품 리스트
	public List<GoodsViewVO> goodslist(){
		return mybatis.selectList(namespace + ".goodslist");
	}
	
	//상품조회 + 카테고리 조인
	public GoodsViewVO goodsView(int gdsNum) {
		return mybatis.selectOne(namespace + ".goodsView", gdsNum);
	}
	
	//상품수정
	public void goodsModify(GoodsVO vo) {
		mybatis.update(namespace + ".goodsModify", vo);
	}
	
	//상품삭제
	public void goodsDelete(int gdsNum) {
		mybatis.delete(namespace + ".goodsDelete", gdsNum);
	}
	
	//주문 목록
	public List<OrderVO> orderList(){
		return mybatis.selectList(namespace + ".orderList");
	}
	
	//특정 주문 목록
	public List<OrderListVO> orderView(OrderVO order){
		return mybatis.selectList(namespace + ".orderView", order);
	}
	
	//배송상태
	public void delivery(OrderVO order) {
		mybatis.update(namespace + ".delivery" , order);
	}
	
	//상품 수량 조절
	public void changeStock(GoodsVO goods) {
		mybatis.update(namespace + ".changeStock", goods);
	}
	
	//모든 댓글 
	public List<ReplyListVO> allReply(){
		return mybatis.selectList(namespace + ".allReply");
	}
	
	//댓글 삭제
	public void deleteReply(int repNum) {
		mybatis.delete(namespace + ".deleteReply", repNum);
	}
}
