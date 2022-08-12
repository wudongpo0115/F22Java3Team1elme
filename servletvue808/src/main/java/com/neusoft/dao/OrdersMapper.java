package com.neusoft.dao;

import com.neusoft.po.Orders;
import com.neusoft.po.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Orders row);

    int insertSelective(Orders row);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("row") Orders row, @Param("example") OrdersExample example);

    int updateByExample(@Param("row") Orders row, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders row);

    int updateByPrimaryKey(Orders row);
}