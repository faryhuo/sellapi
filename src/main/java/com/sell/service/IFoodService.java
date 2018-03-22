package com.sell.service;

import com.sell.common.ServiceResponse;

public interface IFoodService {
    ServiceResponse getFoodListByGoodId(Integer goodId);
}
