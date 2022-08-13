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

    //查询全表信息
    List<DeliveryAddress> selectAll();

    //两表连接通过用户id查询两表信息
    List<DeliveryAddress> selectByPrimaryKeyWithUser (String userid);

    //通过用户Id删除信息
    int delInfoByExample(String userid);
}