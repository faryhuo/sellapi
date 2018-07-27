package com.sell.dao;

import com.sell.pojo.OrderGoods;

import java.util.List;

public interface OrderGoodsMapper {
    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    List<OrderGoods> selectByOrderId(String orderId);
}