package com.neusoft.service.dao;

import com.neusoft.po.DeliveryAddress;
import com.neusoft.po.Orders;

import java.util.List;

public interface OrdersService {
    //下单功能(默认为未支付，可以手动进行修改为已支付)
    public boolean order(Orders orders);
    //取消(删除)订单功能
    public boolean cancelOrder(Orders orders);
    //查看订单功能
    public Orders checkOrders(Integer userId);
    //修改订单地址功能
    public boolean updateAddress(Orders orders);
    //修改订单状态功能(用户付款，则将订单状态变为已支付)
    public boolean updateOrderState(Orders orders);

    //下订单（先清空当前用户购物车中当前商家的所有食品，然后生成订单和订单明细，最后返回订单号）
//    public int createOrders(String userId,Integer businessId,Integer daId);
//    public Orders getOrdersById(Integer orderId);
//    public List<Orders> listOrdersByUserId(String userId);

}
