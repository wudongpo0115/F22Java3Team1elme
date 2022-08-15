package com.neusoft.service.impl;

import com.neusoft.dao.ElmeuserMapper;
import com.neusoft.po.Elmeuser;
import com.neusoft.po.ElmeuserExample;
import com.neusoft.service.dao.ElmeuserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ElmeuserServiceImpl implements ElmeuserService {
    private ElmeuserMapper elmeuserMapper = null;

    public ElmeuserServiceImpl(){
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
        elmeuserMapper = sqlSession.getMapper(ElmeuserMapper.class);
    }
    //浏览用户信息的业务
    @Override
    public Elmeuser queryUser(String userId) {
        Elmeuser elmeuser = elmeuserMapper.selectByPrimaryKey(userId);
        return  elmeuser;
    }
    // 实现用户注册的业务
    @Override
    public boolean regUser(Elmeuser elmeuser) {
        boolean flag = false;
//        先创建样例对象
        ElmeuserExample elmeuserExample = new ElmeuserExample();
//        创建内部类
        ElmeuserExample.Criteria criteria = elmeuserExample.createCriteria();
//        添加具体条件
        //判断用户名和用户ID是否存在
        criteria.andUsernameEqualTo(elmeuser.getUsername()).andUseridEqualTo(elmeuser.getUserid());

        List<Elmeuser> eleusers = elmeuserMapper.selectByExample(elmeuserExample);
        if (eleusers.size() <= 0){
//            2.插入数据
            int i = elmeuserMapper.insertSelective(elmeuser);
            if (i>0){
                flag = true;
            }
        }
        return flag;
    }
    // 实现用户登陆的业务
    @Override
    public boolean loginUser(Elmeuser elmeuser) {
        boolean flag = false;
        //先创建样例对象
        ElmeuserExample eleuserExample = new ElmeuserExample();
        //创建内部类
        ElmeuserExample.Criteria criteria = eleuserExample.createCriteria();
        //添加具体条件
        //判断用户名和密码是否正确
        criteria.andUsernameEqualTo(elmeuser.getUsername()).andPsdEqualTo(elmeuser.getPsd());
        List<Elmeuser> eleusers = elmeuserMapper.selectByExample(eleuserExample);
        if (eleusers.size()>0){
            flag = true;
        }
        return flag;
    }
}
