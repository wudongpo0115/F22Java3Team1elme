package service.Impl;

import com.neusoft.dao.FoodMapper;
import com.neusoft.po.Food;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import service.FoodService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FoodServiceImpl implements FoodService {
    private FoodMapper foodMapper=null;
    public FoodServiceImpl() {
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
         foodMapper = sqlSession.getMapper(FoodMapper.class);

    }
//    food全查询
    public List<Food> SelectFoodInfo(){
        List<Food> food = foodMapper.selectFoodInfo();
        return food;
    }
//    通过id查询
    public Food SelectFoodById(Integer foodid){
        Food food = foodMapper.selectByPrimaryKey(foodid);
        return food;
    }
//    id查询两表信息
    public List<Food> SelectFoodInfoWithBusiness(Integer businessid){
        List<Food> foods = foodMapper.SelectFoodInfoWithBusiness(businessid);
        return foods;
    }

    // 通过食品名查询
    public Food SelectFoodByName(String foodName){
        Food food = foodMapper.selectByName(foodName);
        return food;
    }
}
