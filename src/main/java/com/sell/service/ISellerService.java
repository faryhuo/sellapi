package com.sell.service;

import com.sell.common.ServiceResponse;

public interface ISellerService {
    ServiceResponse getSellerById(Integer id);

    ServiceResponse getSellerList(int pageSize,int pageNum);
}
