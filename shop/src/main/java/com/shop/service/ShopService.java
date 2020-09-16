package com.shop.service;

import java.util.List;

import com.shop.domain.CartListVO;
import com.shop.domain.CartVO;
import com.shop.domain.CategoryVO;
import com.shop.domain.GoodsVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.OrderDetailVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.domain.ReplyListVO;
import com.shop.domain.ReplyVO;

public interface ShopService {
	
	//카테고리별 상품 리스트
	public List<GoodsViewVO> list(int cateCode, int level);
	
	//상품조회
	public GoodsViewVO goodsView(int gdsNum);
	
	//상품 댓글
	public void registReply(ReplyVO reply);
	
	//상품리스트
	public List<ReplyListVO>replyList(int gdsNum);
	
	//상품 소감(댓글) 삭제
	public void deleteReply(ReplyVO reply);
	
	//아이디 체크
	public String idCheck(int repNum);
	
	//상품리뷰
	public void modifyReply(ReplyVO reply);
	
	//카트추가
	public void addCart(CartVO cart);
	
	//카트리스트
	public List<CartListVO> cartList(String userId);
	
	//카트삭제
	public void deleteCart(CartVO cart);
	
	//주문 정보
	public void orderInfo(OrderVO order);
	
	//주문 상세 정보
	public void orderInfo_Details(OrderDetailVO orderDetail);
	
	//주문내역 카트 비우기
	public void cartAllDelete(String userId);
	
	//주문목록
	public List<OrderVO> orderList(OrderVO order);
	
	//특정 주문목록
	public List<OrderListVO>orderView(OrderVO order);
	
}
