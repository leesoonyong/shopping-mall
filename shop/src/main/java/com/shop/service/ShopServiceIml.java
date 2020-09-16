package com.shop.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.CartListVO;
import com.shop.domain.CartVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.MemberVO;
import com.shop.domain.OrderDetailVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.domain.ReplyListVO;
import com.shop.domain.ReplyVO;
import com.shop.persistence.MemberDAO;
import com.shop.persistence.ShopDAO;

@Service
public class ShopServiceIml implements ShopService {
	
	@Autowired
	private ShopDAO shopDAO;

	@Override
	public List<GoodsViewVO> list(int cateCode, int level) {
		
		int cateCodeRef = 0; //카테고리 참조코드
		
		if(level == 1) {
			cateCodeRef = cateCode;
			return shopDAO.list1(cateCode, cateCodeRef);
		}
		
		return shopDAO.list2(cateCode);
	}

	@Override
	public GoodsViewVO goodsView(int gdsNum) {
		return shopDAO.goodsView(gdsNum);
	}

	@Override
	public void registReply(ReplyVO reply) {
		shopDAO.registReply(reply);
		
	}

	@Override
	public List<ReplyListVO> replyList(int gdsNum) {
		return shopDAO.replyList(gdsNum);
	}

	@Override
	public void deleteReply(ReplyVO reply) {
		shopDAO.deleteReply(reply);
	}

	@Override
	public String idCheck(int repNum) {
		return shopDAO.idCheck(repNum);
	}

	@Override
	public void modifyReply(ReplyVO reply) {
		shopDAO.modifyReply(reply);
	}

	@Override
	public void addCart(CartVO cart) {
		shopDAO.addCart(cart);
	}

	@Override
	public List<CartListVO> cartList(String userId) {
		return shopDAO.cartList(userId);
	}

	@Override
	public void deleteCart(CartVO cart) {
		shopDAO.deleteCart(cart);
	}

	@Override
	public void orderInfo(OrderVO order) {
		shopDAO.orderInfo(order);
	}

	@Override
	public void orderInfo_Details(OrderDetailVO orderDetail) {
		shopDAO.orderInfo_Details(orderDetail);
	}

	@Override
	public void cartAllDelete(String userId) {
		shopDAO.cartAllDelete(userId);
		
	}

	@Override
	public List<OrderVO> orderList(OrderVO order) {
		return shopDAO.orderList(order);
	}

	@Override
	public List<OrderListVO> orderView(OrderVO order) {
		return shopDAO.orderView(order);
	}
	
	
	

}
