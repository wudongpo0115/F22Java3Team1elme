import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import po.dong.dao.BusinessMapper;
import po.dong.dao.ElmeuserMapper;
import po.dong.po.Business;
import po.dong.po.Elmeuser;

import java.io.IOException;
import java.io.InputStream;

public class testMyBatis {
    @Test
    public  void test01() throws IOException {
        //读取mybatis配置文件
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);//静态工厂方法
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//建造者模式

        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动commit的
//        sqlSession.方法();
        //拿到动态代理生成的实现类
        BusinessMapper businessMapper = sqlSession.getMapper(BusinessMapper.class);

        Business business = new Business("zs","大连","没事",9969,"不需要","无");
        businessMapper.insert(business);
        Business business1 = businessMapper.selectByPrimaryKey(100001);
//        int i = businessMapper.insert(new Business("zs", "大连", "没事", 9969, "不需要", "无"));
        System.out.println(business1);
//        sqlSession.commit();
        sqlSession.close();
    }


}
