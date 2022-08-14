package service.Impl;

import com.neusoft.dao.BusinessMapper;
import com.neusoft.po.Business;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BusinessServiceImpl {
    private BusinessMapper businessMapper=null;
    public BusinessServiceImpl(){
        String resource = "mybatis.xml";
        InputStream inputStream = null;//静态工厂方法
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//建造者模式

        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动commit的
//        sqlSession.方法();
        //拿到动态代理生成的实现类
         businessMapper =sqlSession.getMapper(BusinessMapper.class);
    }
//        查找商家
    public List<Business> SelectBusinessInfo(){
        List<Business> businesses = businessMapper.selectBusinessInfo();
        return businesses;
    }
    public Business SelectBusinessInfoById(Integer businessid){
        Business business = businessMapper.selectByPrimaryKey(businessid);
        return business;
    }
    public Business SelectBusinessInfoByName(String businessname){
        Business business = businessMapper.selectByName(businessname);
        return business;
    }
}
