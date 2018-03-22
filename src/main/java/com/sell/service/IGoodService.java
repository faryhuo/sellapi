package com.sell.service;

import com.sell.common.ServiceResponse;
import com.sell.vo.GoodDetail;

import java.util.List;

public interface IGoodService {
    ServiceResponse<List<GoodDetail>> getGoodListBySellerId(Integer sellerId);
}
