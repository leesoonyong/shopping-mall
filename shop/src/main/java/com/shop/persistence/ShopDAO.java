package com.shop.persistence;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.domain.CartListVO;
import com.shop.domain.CartVO;
import com.shop.domain.GoodsViewVO;
import com.shop.domain.OrderDetailVO;
import com.shop.domain.OrderListVO;
import com.shop.domain.OrderVO;
import com.shop.domain.ReplyListVO;
import com.shop.domain.ReplyVO;

@Repository("ShopDAO")
public class ShopDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	private static String namespace = "com.shop.mappers.shop";
	
	public List<GoodsViewVO> list1(int cateCode, int cateCodeRef){
		HashMap<String, Object> map = new HashMap<String,Object>();
		
		map.put("cateCode", cateCode);
		map.put("cateCodeRef", cateCodeRef);
		
		return mybatis.selectList(namespace + ".list_1" ,map);
	}
	
	
	//ī�װ��� 2���з�
	public List<GoodsViewVO> list2(int cateCode){
		return mybatis.selectList(namespace + ".list_2", cateCode);
	}
	
	//��ǰ��ȸ
	public GoodsViewVO goodsView(int gdsNum) {
		 return mybatis.selectOne("com.shop.mappers.admin" + ".goodsView", gdsNum);
	}
	
	//��ǰ���� ���
	public void registReply(ReplyVO reply) {
	
		mybatis.insert(namespace + ".registReply", reply);
	}
	//��ǰ���� ����Ʈ
	public List<ReplyListVO> replyList(int gdsNum){
		return mybatis.selectList(namespace + ".replyList", gdsNum);
	}
	
	//�������
	public void deleteReply(ReplyVO reply) {
		mybatis.delete(namespace + ".deleteReply", reply);
	}
	
	//���̵� üũ
	public String idCheck(int repNum) {
		return mybatis.selectOne(namespace + ".replyUserIdCheck", repNum);
	}
	
	//�������
	public void modifyReply(ReplyVO reply) {
		System.out.println("dao���� �� ����Ȯ��");
		System.out.println(reply.getRepCon());
		System.out.println(reply.getRepNum());
		System.out.println(reply.getUserId());
		mybatis.update(namespace + ".modifyReply", reply);
	}
	
	//īƮ���
	public void addCart(CartVO cart) {
		mybatis.insert(namespace + ".addCart", cart);
	}
	
	//īƮ����Ʈ
	public List<CartListVO>cartList(String userId){
		return mybatis.selectList(namespace + ".cartList", userId);
	}
	
	//īƮ����
	public void deleteCart(CartVO cart) {
		mybatis.delete(namespace + ".deleteCart", cart);
	}
	
	//�ֹ� ����
	public void orderInfo(OrderVO order) {
		mybatis.insert(namespace + ".orderInfo", order); 
	}
	//�ֹ� �� ����
	public void orderInfo_Details(OrderDetailVO orderDetail) {
		mybatis.insert(namespace + ".orderInfo_Details", orderDetail);
	}
	//�ֹ� ���� īƮ���� �����
	public void cartAllDelete(String userId) {
		mybatis.delete(namespace + ".cartAllDelete", userId);
	}
	//�ֹ� ���
	public List<OrderVO> orderList(OrderVO order){
		return mybatis.selectList(namespace + ".orderList", order);
	}
	
	//Ư�� �ֹ� ���
	public List<OrderListVO> orderView(OrderVO order){
		return mybatis.selectList(namespace + ".orderView", order);
	}
}