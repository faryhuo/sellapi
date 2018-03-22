package com.sell.dao;

import com.sell.pojo.Rating;

public interface RatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rating record);

    int insertSelective(Rating record);

    Rating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rating record);

    int updateByPrimaryKey(Rating record);
}