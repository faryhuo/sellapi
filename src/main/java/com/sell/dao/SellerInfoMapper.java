package com.sell.dao;

import com.sell.pojo.SellerInfo;

public interface SellerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);

    SellerInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SellerInfo record);

    int updateByPrimaryKey(SellerInfo record);
}