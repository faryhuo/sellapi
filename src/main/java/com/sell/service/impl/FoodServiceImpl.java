package com.sell.service.impl;

import com.sell.common.ServiceResponse;
import com.sell.dao.FoodsMapper;
import com.sell.pojo.Foods;
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

    @Override
    public ServiceResponse getFoodListByGoodId(Integer goodId) {
        List<FoodDetail> foodDetails= new LinkedList<FoodDetail>();
        List<Foods> foodsList= foodsMapper.selectListByGoodId(goodId);
        assembleFoodDetail(foodDetails,foodsList);
        return ServiceResponse.createBySuccess(foodsList);
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
        }
    }
}
