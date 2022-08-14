package com.neusoft.service;

import com.neusoft.po.Cart;

import java.util.List;

public interface CartService {
    //查询全表信息
    public List<Cart> selAll();

    //两表连接通过用户id查询购物车表和用户表信息
    public  List<Cart> queryInfoWithElmeUser(String userid);

    //两表连接通过食物id查询购物车表和食品表信息
    public  List<Cart> queryInfoWithFood(Integer foodid);

    //两表连接通过食物id查询购物车表和商家表信息
    public  List<Cart> queryInfoWithBusiness(Integer businessid);

    //通过主键查询
    public Cart selByPK(Integer cartid);

    //通过主键删除
    public boolean deleteByPK(Integer cartid);

    //全部删除功能
    public int delAll();

    //通过食品id搜索信息
    public List<Cart> selectByFoodId(Integer foodid);

    //通过商家id搜索信息
    public List<Cart> selectByBusinessId(Integer businessid);

    //通过用户id搜索信息
    public List<Cart> selectByElmeUserId(String userid);
}
