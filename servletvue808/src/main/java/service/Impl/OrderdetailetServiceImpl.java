package service.Impl;

import com.neusoft.dao.FoodMapper;
import com.neusoft.dao.OrderDetailetMapper;
import com.neusoft.po.OrderDetailet;
import com.neusoft.po.OrderDetailetExample;
import com.neusoft.po.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import service.OrderdetailetService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrderdetailetServiceImpl implements OrderdetailetService {
     private OrderDetailetMapper orderDetailetMapper=null;
    public OrderdetailetServiceImpl() {
            String resource = "mybatis.xml";
            InputStream inputStream = null;//静态工厂方法
            try {
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//建造者模式
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
             orderDetailetMapper = sqlSession.getMapper(OrderDetailetMapper.class);

    }
//    查询所有信息
        public List<OrderDetailet> selectOrderDetailetAll(){
            List<OrderDetailet> orderDetailets1 = orderDetailetMapper.selectByExample(null);

            return orderDetailets1;
        }

//      删除订单明细通过主键
        public boolean DelectByPk(Integer odid){
        boolean flag=false;
            int i = orderDetailetMapper.deleteByPrimaryKey(odid);
            if (i>0){
                flag=true;
            }
            return flag;
        }

//     通过id删除
    public boolean delectOrderlist(Integer odid){
       boolean flag=false;
        int i = orderDetailetMapper.deleteByPrimaryKey(odid);
        if (i>0){
             flag=true;
        }
        return flag;
    }
//    通过主键查询order and ordertailet
public OrderDetailet selectall(Integer odId){
    OrderDetailetExample orderDetailetExample = new OrderDetailetExample();
    OrderDetailet orderDetailet = orderDetailetMapper.selectOrderDetailetBypkWithOrder(odId);
    return orderDetailet;
}
//查询orderDetailet Food;
    public OrderDetailet SelectBy(Integer foodid){
        OrderDetailetExample orderDetailetExample = new OrderDetailetExample();
        OrderDetailet orderDetailet = orderDetailetMapper.selectOrderDetailetBypkWithFood(foodid);
        return orderDetailet;
    }
//    添加


    public boolean Insert(OrderDetailet orderDetailet){
        boolean flag=false;
        int i = orderDetailetMapper.insert(orderDetailet);
        if (i>0){
            flag=true;
        }
        return  flag;
    }
}
