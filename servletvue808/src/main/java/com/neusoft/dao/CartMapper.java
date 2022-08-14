package com.neusoft.dao;

import com.neusoft.po.Cart;
import com.neusoft.po.CartExample;
import java.util.List;

import com.neusoft.po.DeliveryAddress;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    long countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer cartid);

    int insert(Cart row);

    int insertSelective(Cart row);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer cartid);

    int updateByExampleSelective(@Param("row") Cart row, @Param("example") CartExample example);

    int updateByExample(@Param("row") Cart row, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart row);

    int updateByPrimaryKey(Cart row);

    //查询全表信息
    List<Cart> selectAll();

    //两表连接通过用户id查询购物车表和用户表信息
    List<Cart> selectByPrimaryKeyWithUser (String userid);

    //两表连接通过食物id查询购物车表和食品表信息
    List<Cart> selectByPrimaryKeyWithFood (Integer foodid);

    //两表连接通过食物id查询购物车表和商家表信息
    List<Cart> selectByPrimaryKeyWithBusiness (Integer businessid);

    //添加数量
    int updateQuantity( Cart row);

    //通过食品id搜索信息
    List<Cart> selectByFoodid(Integer foodid);

    //通过商家id搜索信息
    List<Cart> selectByBusinessid(Integer businessid);

    //通过用户id搜索信息
    List<Cart> selectByUserid(String userid);
}