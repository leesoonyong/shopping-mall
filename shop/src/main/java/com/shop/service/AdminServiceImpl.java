package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.CategoryVO;
import com.shop.domain.GoodsVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.domain.ReplyListVO;
import com.shop.persistence.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;
	
	
	@Override
	public List<CategoryVO> category() {
		return adminDAO.category();
	}


	@Override
	public void register(GoodsVO vo) {
		adminDAO.register(vo);
	}


	@Override
	public List<GoodsViewVO> goodslist() {
		return adminDAO.goodslist();
	}


	@Override
	public GoodsViewVO goodsView(int gdsNum) {
		return adminDAO.goodsView(gdsNum);
	}


	@Override
	public void goodsModify(GoodsVO vo) {
		adminDAO.goodsModify(vo);
	}


	@Override
	public void goodsDelete(int gdsNum) {
		adminDAO.goodsDelete(gdsNum);
	}


	@Override
	public List<OrderVO> orderList() {
		return adminDAO.orderList();
	}


	@Override
	public List<OrderListVO> orderView(OrderVO order) {
		return adminDAO.orderView(order); 
	}


	@Override
	public void delivery(OrderVO order) {
		adminDAO.delivery(order);
	}


	@Override
	public void changeStock(GoodsVO goods) {
		adminDAO.changeStock(goods);
	}


	@Override
	public List<ReplyListVO> allReply() {
		return adminDAO.allReply();
	}


	@Override
	public void deleteReply(int repNum) {
		adminDAO.deleteReply(repNum);
	} 

}
