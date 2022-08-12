package com.neusoft.dao;

import com.neusoft.po.OrderDetailet;
import com.neusoft.po.OrderDetailetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailetMapper {
    long countByExample(OrderDetailetExample example);

    int deleteByExample(OrderDetailetExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(OrderDetailet row);

    int insertSelective(OrderDetailet row);

    List<OrderDetailet> selectByExample(OrderDetailetExample example);

    OrderDetailet selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("row") OrderDetailet row, @Param("example") OrderDetailetExample example);

    int updateByExample(@Param("row") OrderDetailet row, @Param("example") OrderDetailetExample example);

    int updateByPrimaryKeySelective(OrderDetailet row);

    int updateByPrimaryKey(OrderDetailet row);
}