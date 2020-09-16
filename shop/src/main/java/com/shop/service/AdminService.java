package com.shop.service;

import java.util.List;

import com.shop.domain.CategoryVO;
import com.shop.domain.GoodsVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.domain.ReplyListVO;

public interface AdminService {
	//ī�װ���
	public List<CategoryVO> category();
	
	//��ǰ���
	public void register(GoodsVO vo);
	
	//��ǰ����Ʈ
	public List<GoodsViewVO> goodslist();
	
	//��ǰ��ȸ + ī�װ��� ����
	public GoodsViewVO goodsView(int gdsNum);
	
	//��ǰ����
	public void goodsModify(GoodsVO vo);
	
	//��ǰ����
	public void goodsDelete(int gdsNum);
	
	//�ֹ����
	public List<OrderVO> orderList();
	
	//Ư�� �ֹ� ���
	public List<OrderListVO> orderView(OrderVO order);
	
	//��ۻ���
	public void delivery(OrderVO order);
	
	//��ǰ ���� ����
	public void changeStock(GoodsVO goods);
	
	//��� ��� ��ȸ
	public List<ReplyListVO>allReply();
	
	//��ۻ���
	public void deleteReply(int repNum);
}