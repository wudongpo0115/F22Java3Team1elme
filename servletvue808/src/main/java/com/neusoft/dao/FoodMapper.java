package com.neusoft.dao;

import com.neusoft.po.Food;
import com.neusoft.po.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMapper {
    long countByExample(FoodExample example);

    int deleteByExample(FoodExample example);

    int deleteByPrimaryKey(Integer foodid);

    int insert(Food row);

    int insertSelective(Food row);

    List<Food> selectByExampleWithBLOBs(FoodExample example);

    List<Food> selectByExample(FoodExample example);

    Food selectByPrimaryKey(Integer foodid);

    int updateByExampleSelective(@Param("row") Food row, @Param("example") FoodExample example);

    int updateByExampleWithBLOBs(@Param("row") Food row, @Param("example") FoodExample example);

    int updateByExample(@Param("row") Food row, @Param("example") FoodExample example);

    int updateByPrimaryKeySelective(Food row);

    int updateByPrimaryKeyWithBLOBs(Food row);

    int updateByPrimaryKey(Food row);
}