package com.neusoft.service.Impl;

import com.neusoft.dao.DeliveryAddressMapper;
import com.neusoft.po.DeliveryAddress;
import com.neusoft.po.DeliveryAddressExample;
import com.neusoft.service.DeliveryaddressService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DeliveryaddressServiceImpl implements DeliveryaddressService {

    private DeliveryAddressMapper deliveryAddressMapper = null;

        //构造送货地址表的构造函数
    public DeliveryaddressServiceImpl() {
        String resource = "mybatis.xml";
        InputStream inputStream = null;//静态工厂方法
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//建造者模式

        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动commit的
        deliveryAddressMapper = sqlSession.getMapper(DeliveryAddressMapper.class);
    }

    //查询全表信息
    public List<DeliveryAddress> selAll(){
        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectAll();
     return  deliveryAddresses;
    }

    //通过主键查询
    public DeliveryAddress selectByPK(Integer daId){
        DeliveryAddress deliveryAddress = deliveryAddressMapper.selectByPrimaryKey(daId);
        return deliveryAddress;
    }

    //通过主键删除
    public boolean deleteByPK(Integer daId) {
        boolean flag = false;
        int i = deliveryAddressMapper.deleteByPrimaryKey(daId);
        if(i>0)
        {
            flag = true;
        }
        return flag;
    }

    //通过判断手机号和姓名是否相同添加地址信息
    public boolean regUser(DeliveryAddress deliveryAddress) {
        boolean flag = false;
        DeliveryAddressExample deliveryAddressExample = new DeliveryAddressExample();
        DeliveryAddressExample.Criteria criteria = deliveryAddressExample.createCriteria();
        //如果姓名和手机号和地址都重复，则显示重复添加
        criteria.andContactnameEqualTo(deliveryAddress.getContactname()).andContacttelEqualTo(deliveryAddress.getContacttel()).andAddressEqualTo(deliveryAddress.getAddress());
        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectByExample(deliveryAddressExample);
        if(deliveryAddresses.size()<=0)
        {
            int i = deliveryAddressMapper.insert(deliveryAddress);
            if(i>0)
            {
                flag = true;
            }
        }
        return flag;
    }

    //两表连接通过用户id查询两表信息
    public  List<DeliveryAddress> queryInfoWithUser(String userid) {
        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectByPrimaryKeyWithUser(userid);
        return deliveryAddresses;
    }

    //通过用户Id删除信息
    public int delInfoByExampleWithUser(String userid) {
        int i = deliveryAddressMapper.delInfoByExample(userid);
        if (i>0)
        {
            System.out.println("地址信息删除成功");
        }else
        {
            System.out.println("该用户为设置地址信息，无法删除");
        }
        return i;
    }

    //通过主键修改信息
    public int updateInfoWithUser(DeliveryAddress deliveryAddress){
        int i = 0;
        DeliveryAddressExample deliveryAddressExample = new DeliveryAddressExample();
        DeliveryAddressExample.Criteria criteria = deliveryAddressExample.createCriteria();
        criteria.andDaidEqualTo(deliveryAddress.getDaid());
        i = deliveryAddressMapper.updateByPrimaryKeySelective(deliveryAddress);
        if (i>0)
        {
            System.out.println("信息修改成功");
        }else{
            System.out.println("未找到相关地址信息，无法修改");
        }
        return i;
    }

    //通过用户名查询信息
    public List<DeliveryAddress> selectByUsername(String contactName){
        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectByUsername(contactName);
        return deliveryAddresses;
    }

    //通过手机号查询信息
    public List<DeliveryAddress> selectByUserPhone(String contactTel){
        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectByUserTel(contactTel);
        return deliveryAddresses;
    }

    //通过地址信息模糊查询
    public List<DeliveryAddress> selectLikeAddressWithUser(String address){
        List<DeliveryAddress> deliveryAddresses = deliveryAddressMapper.selectLikeAddress(address);
        return deliveryAddresses;
    }


}
