package com.neusoft.service;

import com.neusoft.po.Cart;
import com.neusoft.po.DeliveryAddress;
import com.neusoft.service.Impl.CartServiceImpl;
import com.neusoft.service.Impl.DeliveryaddressServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestService {
    private DeliveryaddressServiceImpl deliveryaddressServiceImpl = null;
    private CartServiceImpl cartServiceImpl = null;

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

    }

    //通过主键修改信息
    @Test
    public void tastUpdateByPK(){
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        int i = deliveryaddressServiceImpl.updateInfoWithUser(new DeliveryAddress(5,"阿紫", 1, "13434543882", "中国台湾", "3"));
    }

    //通过用户名查询信息
    @Test
    public void testSelectByUaerName(){
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        List<DeliveryAddress> deliveryAddresses = deliveryaddressServiceImpl.selectByUsername("绿绿");
        System.out.println(deliveryAddresses);
    }

    //通过用户名查询信息
    @Test
    public void testSelectByUaerTel(){
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        List<DeliveryAddress> deliveryAddresses = deliveryaddressServiceImpl.selectByUserPhone("15686272135");
        System.out.println(deliveryAddresses);
    }

    //通过地址信息模糊查询
    @Test
    public void testSelectLikeAddress(){
        deliveryaddressServiceImpl = new DeliveryaddressServiceImpl();
        String address = "辽宁省";
        List<DeliveryAddress> deliveryAddresses = deliveryaddressServiceImpl.selectLikeAddressWithUser(address);
        System.out.println(deliveryAddresses);
    }

    //查询购物车全表信息的测试方法
    @Test
    public void testCartSelectAll() {
        cartServiceImpl = new CartServiceImpl();
        List<Cart> carts = cartServiceImpl.selAll();
        for (Cart items:carts)
        {
            System.out.println(items.toString());
        }
    }

    //两表连接通过用户id查询购物车表和用户表信息
    @Test
    public void testQueryWithUser() {
        cartServiceImpl = new CartServiceImpl();
        List<Cart> carts = cartServiceImpl.queryInfoWithElmeUser("2");
        for (Cart items:carts)
        {
            System.out.println(items.toStringElmeuser());
        }
    }

    //两表连接通过食物id查询购物车表和食品表信息
    @Test
    public void testQueryWithFood() {
        cartServiceImpl = new CartServiceImpl();
        List<Cart> carts = cartServiceImpl.queryInfoWithFood(1);
        for (Cart items:carts)
        {
            System.out.println(items.toStringFood());
        }
    }

    //两表连接通过商家id查询购物车表和商家表信息
    @Test
    public void testQueryWithBusiness() {
        cartServiceImpl = new CartServiceImpl();
        List<Cart> carts = cartServiceImpl.queryInfoWithBusiness(1);
        for (Cart items:carts)
        {
            System.out.println(items.toStringBusiness());
        }
    }

    //通过主键查询购物车表信息
    @Test
    public void testSelByPK() {
        cartServiceImpl = new CartServiceImpl();
        Cart cart = cartServiceImpl.selByPK(2);
        System.out.println(cart);
    }

    //通过主键删除
    @Test
    public void textDelInfoByPK() {
        cartServiceImpl = new CartServiceImpl();
        boolean b = cartServiceImpl.deleteByPK(3);
        if(b)
        {
            System.out.println("购物车信息删除成功");
        }else
        {
            System.out.println("删除失败");
        }
    }

    //购物车表全部删除
    @Test
    public void testDeleteAll(){
        cartServiceImpl = new CartServiceImpl();
        int i = cartServiceImpl.delAll();
    }

    //修改购物车的数量
    @Test
    public void testUpdateQuantity(){
        cartServiceImpl = new CartServiceImpl();

    }

    //通过食品id显示信息
    @Test
    public void testSelectByfood(){
        cartServiceImpl = new CartServiceImpl();
        List<Cart> carts = cartServiceImpl.selectByFoodId(1);
        System.out.println(carts.toString());
    }

    //通过商家id显示信息
    @Test
    public void testSelectByBusiness(){
        cartServiceImpl = new CartServiceImpl();
        List<Cart> carts = cartServiceImpl.selectByBusinessId(2);
        System.out.println(carts.toString());
    }

    //通过用户id显示信息
    @Test
    public void testSelectByUser(){
        cartServiceImpl = new CartServiceImpl();
        List<Cart> carts = cartServiceImpl.selectByElmeUserId("2");
        System.out.println(carts.toString());
    }
}
