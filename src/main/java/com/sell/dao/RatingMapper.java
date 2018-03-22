package com.sell.dao;

import com.sell.pojo.Rating;

import java.util.List;

public interface RatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rating record);

    int insertSelective(Rating record);

    Rating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rating record);

    List<Rating> selectByFoodId(Integer foodId);

    List<Rating> selectBySellerId(Integer sellerId);

}