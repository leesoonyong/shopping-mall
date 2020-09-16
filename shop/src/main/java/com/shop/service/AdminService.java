package com.shop.service;

import java.util.List;

import com.shop.domain.CategoryVO;
import com.shop.domain.GoodsVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.domain.ReplyListVO;

public interface AdminService {
	//카테고리
	public List<CategoryVO> category();
	
	//상품등록
	public void register(GoodsVO vo);
	
	//상품리스트
	public List<GoodsViewVO> goodslist();
	
	//상품조회 + 카테고리 조인
	public GoodsViewVO goodsView(int gdsNum);
	
	//상품수정
	public void goodsModify(GoodsVO vo);
	
	//상품삭제
	public void goodsDelete(int gdsNum);
	
	//주문목록
	public List<OrderVO> orderList();
	
	//특정 주문 목록
	public List<OrderListVO> orderView(OrderVO order);
	
	//배송상태
	public void delivery(OrderVO order);
	
	//상품 수량 조절
	public void changeStock(GoodsVO goods);
	
	//모든 댓글 조회
	public List<ReplyListVO>allReply();
	
	//댓글삭제
	public void deleteReply(int repNum);
}
