package com.sell.dao;

import com.sell.pojo.Support;

public interface SupportMapper {
    int deleteByPrimaryKey(Integer type);

    int insert(Support record);

    int insertSelective(Support record);

    Support selectByPrimaryKey(Integer type);

    int updateByPrimaryKeySelective(Support record);

    int updateByPrimaryKey(Support record);
}