package com.neusoft.service;

import com.neusoft.po.DeliveryAddress;

import java.util.List;

public interface DeliveryaddressService {

    //查询全表信息
    public List<DeliveryAddress> selAll();

    //通过主键查询
    public DeliveryAddress selectByPK(Integer daId);

    //通过主键删除
    public boolean deleteByPK(Integer daId);

    //通过判断手机号和姓名是否相同添加地址信息
    public boolean regUser(DeliveryAddress deliveryAddress);

    //两表连接通过用户id查询两表信息
    public  List<DeliveryAddress> queryInfoWithUser(String userid);

    //通过用户Id删除信息
    public int delInfoByExampleWithUser(String userid);

    //通过主键修改地址信息
    public int updateInfoWithUser(DeliveryAddress deliveryAddress);

    //通过用户名查询信息
    public List<DeliveryAddress> selectByUsername(String contactName);

    //通过手机号查询信息
    public List<DeliveryAddress> selectByUserPhone(String contactTel);

    //通过地址信息模糊查询
    public List<DeliveryAddress> selectLikeAddressWithUser(String address);

}
