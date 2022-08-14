package com.neusoft.service.Impl;

import com.neusoft.dao.CartMapper;
import com.neusoft.dao.DeliveryAddressMapper;
import com.neusoft.po.Cart;
import com.neusoft.po.CartExample;
import com.neusoft.po.DeliveryAddress;
import com.neusoft.po.DeliveryAddressExample;
import com.neusoft.service.CartService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CartServiceImpl implements CartService {

    private CartMapper cartMapper = null;

    //构造送货地址表的构造函数
    public CartServiceImpl() {
        String resource = "mybatis.xml";
        InputStream inputStream = null;//静态工厂方法
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//建造者模式

        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动commit的
        cartMapper = sqlSession.getMapper(CartMapper.class);
    }

    //查询全表信息
    public List<Cart> selAll(){
        List<Cart> carts = cartMapper.selectAll();
        return carts;
    }

    //两表连接通过用户id查询购物车表和用户表信息
    public  List<Cart> queryInfoWithElmeUser(String userid) {
        List<Cart> carts = cartMapper.selectByPrimaryKeyWithUser(userid);
        return carts;
    }

    //两表连接通过食物id查询购物车表和食品表信息
    public  List<Cart> queryInfoWithFood(Integer foodid) {
        List<Cart> carts = cartMapper.selectByPrimaryKeyWithFood(foodid);
        return carts;
    }

    //两表连接通过食物id查询购物车表和商家表信息
    public  List<Cart> queryInfoWithBusiness(Integer businessid) {
        List<Cart> carts = cartMapper.selectByPrimaryKeyWithBusiness(businessid);
        return carts;
    }

    //通过主键查询
    public Cart selByPK(Integer cartid) {
        Cart cart = cartMapper.selectByPrimaryKey(cartid);
        return cart;
    }

    //通过主键删除
    public boolean deleteByPK(Integer cartid)
    {
        boolean flag = false;
        int i = cartMapper.deleteByPrimaryKey(cartid);
        if(i>0)
        {
            flag = true;
        }
        return flag;
    }

    //全部删除功能
    public int delAll() {
        int cartid = 0;
        List<Cart> carts = cartMapper.selectAll();
        for(int i=0;i<carts.size();i++)
        {
            cartid = i+1;
            cartMapper.deleteByPrimaryKey(cartid);
        }
        if(cartid>0)
        {
            System.out.println("信息删除成功");
        }else
        {
            System.out.println("购物车内未添加商品");
        }
        return cartid;
    }

    //通过食品id搜索信息
    public List<Cart> selectByFoodId(Integer foodid){
        List<Cart> carts = cartMapper.selectByFoodid(foodid);
        return carts;
    }

    //通过商家id搜索信息
    public List<Cart> selectByBusinessId(Integer businessid){
        List<Cart> carts = cartMapper.selectByFoodid(businessid);
        return carts;
    }

    //通过用户id搜索信息
    public List<Cart> selectByElmeUserId(String userid){
        List<Cart> carts = cartMapper.selectByUserid(userid);
        return carts;
    }

    //修改购物车的数量
    public void updateCount(Cart cart){
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andFoodidEqualTo(cart.getFoodid()).andBusinessidEqualTo(cart.getBusinessid()).andUseridEqualTo(cart.getUserid());
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        if(carts.size()>0)
        {
            int i = cartMapper.updateQuantity(cart);
        }else
        {
          int i = cartMapper.insert(cart);
          if(i>0){
              System.out.println("添加到购物车");
          }
        }
    }
}
