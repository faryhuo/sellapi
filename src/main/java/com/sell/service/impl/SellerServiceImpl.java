package com.sell.service.impl;

import com.sell.common.ServiceResponse;
import com.sell.dao.SellerMapper;
import com.sell.pojo.Seller;
import com.sell.service.ISellerService;
import com.sell.vo.SellerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iSellerService")
public class SellerServiceImpl implements ISellerService {

    @Autowired
    private SellerMapper sellerMapper;

    public ServiceResponse getSellerById(Integer id){
        SellerDetails sellerDetails=new SellerDetails();
        Seller seller=sellerMapper.selectByPrimaryKey(id);
        assembleSellerDetail(sellerDetails,seller);
        return  ServiceResponse.createBySuccess(sellerDetails);
    }

    private void assembleSellerDetail(SellerDetails sellerDetails,Seller seller){
        sellerDetails.setAvatar(seller.getAvatar());
        sellerDetails.setBulletin(seller.getBulletin());
        sellerDetails.setDeliveryPrice(seller.getDeliveryPrice());
        sellerDetails.setDeliveryTime(seller.getDeliveryTime());
        sellerDetails.setDescription(seller.getDescription());
        sellerDetails.setFoodScore(seller.getFoodScore());
        sellerDetails.setId(seller.getId());
        sellerDetails.setMinPrice(seller.getMinPrice());
        sellerDetails.setName(seller.getName());
        sellerDetails.setRankRate(seller.getRankRate());
        sellerDetails.setRatingCount(seller.getRatingCount());
        sellerDetails.setScore(seller.getScore());
        sellerDetails.setSellCount(seller.getSellCount());
        sellerDetails.setServiceScore(seller.getServiceScore());
    }
}
