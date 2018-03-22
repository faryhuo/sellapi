package com.sell.dao;

import com.sell.pojo.Support;

import java.util.List;

public interface SupportMapper {
    int deleteByPrimaryKey(Integer type);

    int insert(Support record);

    int insertSelective(Support record);

    int updateByPrimaryKeySelective(Support record);

    int updateByPrimaryKey(Support record);

    List<Support> selectListBySellerId(Integer sellerId);
}