package com.neusoft.service;

import com.neusoft.po.DeliveryAddress;
import com.neusoft.service.Impl.DeliveryaddressServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestService {
    private DeliveryaddressServiceImpl deliveryaddressServiceImpl = null;

    //查询全表信息的测试方法
    @Test
    public void testSelectAllInfo() {
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        List<DeliveryAddress> deliveryAddresses = deliveryaddressServiceImpl.selAll();
        for (DeliveryAddress items:deliveryAddresses)
        {
            System.out.println(items);
        }
    }

    //通过主键查询信息
    @Test
    public void testSelectByPK() {
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        DeliveryAddress deliveryAddress = deliveryaddressServiceImpl.selectByPK(2);
        System.out.println(deliveryAddress);
    }

    //通过主键删除
    @Test
    public void textDelByPK() {
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        boolean b = deliveryaddressServiceImpl.deleteByPK(1);
        if(b)
        {
            System.out.println("送货地址删除成功");
        }else
        {
            System.out.println("删除失败");
        }
    }

    //通过判断手机号和姓名是否相同添加地址信息
    @Test
    public void testSelectByExampleAndTnsert(){
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        boolean b = deliveryaddressServiceImpl.regUser(new DeliveryAddress("花花", 0, "12323232334", "辽宁省大连市旅顺口区", "1"));
        if(b){
            System.out.print("地址信息添加成功");
        }else{
            System.out.println("该用户地址信息已存在，请勿重复添加");
        }
    }

    //两表连接通过用户id查询两表信息
    @Test
    public void testQueryInfoWithUser() {
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        List<DeliveryAddress> deliveryAddresses = deliveryaddressServiceImpl.queryInfoWithUser("2");
        System.out.println(deliveryAddresses);
    }

    //通过用户Id删除信息
    @Test
    public void testDelByExample() {
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        int i = deliveryaddressServiceImpl.delInfoByExampleWithUser("2");
        if (i>0)
        {
            System.out.println("地址信息删除成功");
        }else
        {
            System.out.println("该用户为设置地址信息，无法删除");
        }
    }


}
