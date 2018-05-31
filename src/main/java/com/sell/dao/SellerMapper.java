package com.sell.dao;

import com.sell.pojo.Seller;

import java.util.List;

public interface SellerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);

    List<Seller> selectList();
}