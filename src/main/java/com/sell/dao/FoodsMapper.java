package com.sell.dao;

import com.sell.pojo.Foods;
import com.sell.pojo.Rating;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Foods record);

    int insertSelective(Foods record);

    Foods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Foods record);

    int updateByPrimaryKey(Foods record);

    List<Foods> selectListByGoodId(@Param("goodId") Integer goodId);

}