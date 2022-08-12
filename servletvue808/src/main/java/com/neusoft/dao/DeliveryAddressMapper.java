package com.neusoft.dao;

import com.neusoft.po.DeliveryAddress;
import com.neusoft.po.DeliveryAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryAddressMapper {
    long countByExample(DeliveryAddressExample example);

    int deleteByExample(DeliveryAddressExample example);

    int deleteByPrimaryKey(Integer daid);

    int insert(DeliveryAddress row);

    int insertSelective(DeliveryAddress row);

    List<DeliveryAddress> selectByExample(DeliveryAddressExample example);

    DeliveryAddress selectByPrimaryKey(Integer daid);

    int updateByExampleSelective(@Param("row") DeliveryAddress row, @Param("example") DeliveryAddressExample example);

    int updateByExample(@Param("row") DeliveryAddress row, @Param("example") DeliveryAddressExample example);

    int updateByPrimaryKeySelective(DeliveryAddress row);

    int updateByPrimaryKey(DeliveryAddress row);
}