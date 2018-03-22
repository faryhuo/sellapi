package com.sell.service.impl;

import com.sell.common.ServiceResponse;
import com.sell.dao.SellerInfoMapper;
import com.sell.dao.SellerMapper;
import com.sell.dao.SellerPicsMapper;
import com.sell.dao.SupportMapper;
import com.sell.pojo.Seller;
import com.sell.pojo.SellerInfo;
import com.sell.pojo.SellerPics;
import com.sell.pojo.Support;
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

    @Autowired
    private SupportMapper supportMapper;

    @Autowired
    private SellerPicsMapper sellerPicsMapper;

    public ServiceResponse getSellerById(Integer id){
        SellerDetails sellerDetails=new SellerDetails();
        Seller seller=sellerMapper.selectByPrimaryKey(id);
        List<SellerInfo> sellerInfoList=sellerInfoMapper.selectListBySellerId(id);
        List<SellerPics> sellerPics=sellerPicsMapper.selectListBySellerId(id);
        List<Support> supportList=supportMapper.selectListBySellerId(id);
        assembleSellerDetail(sellerDetails,seller,sellerInfoList,sellerPics,supportList);
        return  ServiceResponse.createBySuccess(sellerDetails);
    }

    private void assembleSellerDetail(
            SellerDetails sellerDetails,
            Seller seller,List<SellerInfo> sellerInfoList,
            List<SellerPics> sellerPics, List<Support> supportList){
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
        if(sellerPics!=null){
            List<String> pics=new LinkedList<String>();
            for (int i = 0;i<sellerPics.size();i++){
                pics.add(sellerPics.get(i).getImage());
            }
            sellerDetails.setPics(pics);
        }
        if(supportList!=null){
            sellerDetails.setSupports(supportList);
        }
    }
}
