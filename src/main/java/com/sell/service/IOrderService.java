package com.sell.service;

import com.sell.common.ServiceResponse;
import com.sell.vo.OrderDetails;

import java.util.List;

public interface IOrderService {
    ServiceResponse  getOrderList(int UserId, int pageSize, int pageNum);
}
