package com.sell.service.impl;

import com.sell.common.ServiceResponse;
import com.sell.dao.SellerInfoMapper;
import com.sell.dao.SellerMapper;
import com.sell.pojo.Seller;
import com.sell.pojo.SellerInfo;
import com.sell.service.ISellerService;
import com.sell.vo.SellerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service("iSellerService")
public class SellerServiceImpl implements ISellerService {

    @Autowired
    private SellerMapper sellerMapper;
    @Autowired
    private SellerInfoMapper sellerInfoMapper;


    public ServiceResponse getSellerById(Integer id){
        SellerDetails sellerDetails=new SellerDetails();
        Seller seller=sellerMapper.selectByPrimaryKey(id);
        List<SellerInfo> sellerInfoList=sellerInfoMapper.selectListBySellerId(id);
        assembleSellerDetail(sellerDetails,seller,sellerInfoList);
        return  ServiceResponse.createBySuccess(sellerDetails);
    }

    private void assembleSellerDetail(SellerDetails sellerDetails,Seller seller,List<SellerInfo> sellerInfoList){
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
        if(sellerInfoList!=null) {
            List<String> infos=new LinkedList<String>();
            for (int i = 0;i<sellerInfoList.size();i++){
                infos.add(sellerInfoList.get(i).getInfo());
            }
            sellerDetails.setInfos(infos);
        }
    }
}
