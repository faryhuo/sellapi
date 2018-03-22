package com.sell.dao;

import com.sell.pojo.SellerPics;

public interface SellerPicsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SellerPics record);

    int insertSelective(SellerPics record);

    SellerPics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SellerPics record);

    int updateByPrimaryKey(SellerPics record);
}