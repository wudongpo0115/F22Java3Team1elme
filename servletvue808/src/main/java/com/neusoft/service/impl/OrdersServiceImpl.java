package com.neusoft.service.impl;

import com.neusoft.dao.BusinessMapper;
import com.neusoft.dao.DeliveryAddressMapper;
import com.neusoft.dao.ElmeuserMapper;
import com.neusoft.dao.OrdersMapper;
import com.neusoft.po.*;
import com.neusoft.service.dao.OrdersService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrdersServiceImpl implements OrdersService {
    private OrdersMapper ordersMapper = null;
    ElmeuserMapper elmeuserMapper = null;
    BusinessMapper businessMapper = null;
    DeliveryAddressMapper deliveryAddressMapper = null;

    public OrdersServiceImpl(){
        //读取mybatis配置文件
        String resource = "mybatis.xml";
        SqlSessionFactory sqlSessionFactory;
        try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
            //建造者模式
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }//静态工厂方法
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动commit的
//        sqlSession.方法();
        //拿到动态代理生成的实现类
        ordersMapper =sqlSession.getMapper(OrdersMapper.class);
        elmeuserMapper = sqlSession.getMapper(ElmeuserMapper.class);
        businessMapper = sqlSession.getMapper(BusinessMapper.class);
        deliveryAddressMapper = sqlSession.getMapper(DeliveryAddressMapper.class);

    }

    //下单功能(默认为未支付，可以手动进行修改为已支付)
    @Override
    public boolean order(Orders orders) {
        boolean flag = false;

        String userid = orders.getUserid();
        Integer businessid = orders.getBusinessid();
        Integer daid = orders.getDaid();

//        先创建样例对象
        ElmeuserExample elmeuserExample = new ElmeuserExample();
        BusinessExample businessExample = new BusinessExample();
        DeliveryAddressExample deliveryAddressExample = new DeliveryAddressExample();
//        创建内部类
        ElmeuserExample.Criteria elmeuserExampleCriteria = elmeuserExample.createCriteria();
        BusinessExample.Criteria businessExampleCriteria = businessExample.createCriteria();
        DeliveryAddressExample.Criteria deliveryAddressExampleCriteria = deliveryAddressExample.createCriteria();
//        添加具体条件
        elmeuserExampleCriteria.andUseridEqualTo(userid);
        businessExampleCriteria.andBusinessidEqualTo(businessid);
        deliveryAddressExampleCriteria.andDaidEqualTo(daid);
        //查询是否有具有相同的对象

        List<Elmeuser> elmeusers = elmeuserMapper.selectByExample(elmeuserExample);
        List<Business> businesses = businessMapper.selectByExample(businessExample);
        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectByExample(deliveryAddressExample);
        if (elmeusers.size()>0 && businesses.size()>0 && deliveryAddresses.size()>0){
            // 插入数据
            int i = ordersMapper.insertSelective(orders);
            if (i>0){
                flag = true;
            }
        }
        return flag;
    }
    //取消(删除)订单功能
    @Override
    public boolean cancelOrder(Orders orders) {
        // 创建样例对象
        OrdersExample ordersExample = new OrdersExample();

        // 创建内部类
        OrdersExample.Criteria criteria = ordersExample.createCriteria();

        //添加具体条件
        criteria.andOrderidEqualTo(orders.getOrderid());

        boolean flag = false;
        int i = ordersMapper.deleteByExample(ordersExample);
        if (i>0){
            flag = true;
        }
        return flag;
    }
    //查看订单功能
    @Override
    public Orders checkOrders(Integer userId) {
        Orders orders = ordersMapper.selectByUserIdWithDetailet(userId);
        return orders;
    }

    //修改订单状态功能(用户付款，则将订单状态变为已支付)
    @Override
    public boolean updateOrderState(Orders orders) {
        // 创建样例对象
        OrdersExample ordersExample = new OrdersExample();

        // 创建内部类
        OrdersExample.Criteria criteria = ordersExample.createCriteria();

        //添加具体条件
        criteria.andOrderidEqualTo(orders.getOrderid());

        boolean flag = false;
        int i = ordersMapper.updateByExampleSelective(orders,ordersExample);
        if (i>0){
            flag = true;
        }
        return flag;
    }

    //修改订单地址功能
    @Override
    public boolean updateAddress(Orders orders) {
        boolean flag = false;
        // 创建样例对象
        DeliveryAddressExample deliveryAddressExample = new DeliveryAddressExample();
        OrdersExample ordersExample = new OrdersExample();

        // 创建内部类
        DeliveryAddressExample.Criteria deliveryAddressExampleCriteria = deliveryAddressExample.createCriteria();
        OrdersExample.Criteria ordersExampleCriteria = ordersExample.createCriteria();

        //添加具体条件
        deliveryAddressExampleCriteria.andDaidEqualTo(orders.getDaid());
        ordersExampleCriteria.andOrderidEqualTo(orders.getOrderid());

        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectByExample(deliveryAddressExample);
        if (deliveryAddresses.size()<1){
            int i = ordersMapper.updateByExampleSelective(orders, ordersExample);
            if (i>0){
                flag = true;
            }
        }
        return flag;
    }
}
