package com.sell.service;

import com.sell.common.ServiceResponse;

public interface IRatingService {
    ServiceResponse getRatingListBySellerId(Integer sellerId);

    ServiceResponse getRatingListByFoodId(Integer foodId);

}
