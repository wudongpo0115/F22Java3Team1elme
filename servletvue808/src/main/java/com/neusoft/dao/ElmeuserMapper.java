package com.neusoft.dao;

import com.neusoft.po.Elmeuser;
import com.neusoft.po.ElmeuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElmeuserMapper {
    long countByExample(ElmeuserExample example);

    int deleteByExample(ElmeuserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Elmeuser row);

    int insertSelective(Elmeuser row);

    List<Elmeuser> selectByExampleWithBLOBs(ElmeuserExample example);

    List<Elmeuser> selectByExample(ElmeuserExample example);

    Elmeuser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("row") Elmeuser row, @Param("example") ElmeuserExample example);

    int updateByExampleWithBLOBs(@Param("row") Elmeuser row, @Param("example") ElmeuserExample example);

    int updateByExample(@Param("row") Elmeuser row, @Param("example") ElmeuserExample example);

    int updateByPrimaryKeySelective(Elmeuser row);

    int updateByPrimaryKeyWithBLOBs(Elmeuser row);

    int updateByPrimaryKey(Elmeuser row);
}