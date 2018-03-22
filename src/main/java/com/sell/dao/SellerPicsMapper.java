package com.sell.dao;

import com.sell.pojo.SellerPics;

import java.util.List;

public interface SellerPicsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SellerPics record);

    int insertSelective(SellerPics record);

    SellerPics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SellerPics record);

    int updateByPrimaryKey(SellerPics record);

    List<SellerPics> selectListBySellerId(Integer sellerId);
}