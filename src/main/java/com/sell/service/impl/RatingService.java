package com.sell.service.impl;

import com.sell.common.ServiceResponse;
import com.sell.dao.RatingMapper;
import com.sell.service.IRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iRatingService")
public class RatingService implements IRatingService{

    @Autowired
    private RatingMapper ratingMapper;


    public ServiceResponse getRatingListBySellerId(Integer sellerId){
        return ServiceResponse.createBySuccess(ratingMapper.selectBySellerId(sellerId));
    }

    public ServiceResponse getRatingListByFoodId(Integer foodId) {
        return ServiceResponse.createBySuccess(ratingMapper.selectByFoodId(foodId));
    }
}
