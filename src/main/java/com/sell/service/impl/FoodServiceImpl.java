package com.sell.service.impl;

import com.sell.common.ServiceResponse;
import com.sell.dao.FoodsMapper;
import com.sell.dao.RatingMapper;
import com.sell.pojo.Foods;
import com.sell.pojo.Rating;
import com.sell.service.IFoodService;
import com.sell.vo.FoodDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("iFoodService")
public class FoodServiceImpl implements IFoodService{

    @Autowired
    private FoodsMapper foodsMapper;

    @Autowired
    private RatingMapper ratingMapper;

    @Override
    public ServiceResponse getFoodListByGoodId(Integer goodId) {
        List<FoodDetail> foodDetails= new LinkedList<FoodDetail>();
        List<Foods> foodsList= foodsMapper.selectListByGoodId(goodId);
        assembleFoodDetail(foodDetails,foodsList);
        for(int i=0;i<foodDetails.size();i++){
            List<Rating> ratings=ratingMapper.selectByFoodId(foodDetails.get(i).getId());
            foodDetails.get(i).setRatings(ratings);
        }
        return ServiceResponse.createBySuccess(foodDetails);
    }

    private void assembleFoodDetail(List<FoodDetail> foodDetails,List<Foods> foodsList){
        for(int i=0;i<foodsList.size();i++){
            FoodDetail foodDetail=new FoodDetail();
            Foods food=foodsList.get(i);
            foodDetail.setDescription(food.getDescription());
            foodDetail.setIcon(food.getIcon());
            foodDetail.setId(food.getId());
            foodDetail.setImage(food.getImage());
            foodDetail.setInfo(food.getInfo());
            foodDetail.setName(food.getName());
            foodDetail.setOldPrice(food.getOldPrice());
            foodDetail.setPrice(food.getPrice());
            foodDetail.setRating(food.getRating());
            foodDetail.setSellCount(food.getSellCount());
            foodDetails.add(foodDetail);
        }
    }
}
