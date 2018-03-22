package com.sell.service.impl;

import com.sell.common.ServiceResponse;
import com.sell.dao.GoodsMapper;
import com.sell.pojo.Goods;
import com.sell.service.IGoodService;
import com.sell.vo.GoodDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("iGoodService")
public class GoodServiceImpl implements IGoodService{

    @Autowired
    private GoodsMapper goodsMapper;

    public ServiceResponse<List<GoodDetail>> getGoodListBySellerId(Integer sellerId){
        List<Goods> goodList=goodsMapper.selectListBySellerId(sellerId);
        List<GoodDetail>goodDetailList=new LinkedList<GoodDetail>();
        for(int i=0;i<goodList.size();i++){
            GoodDetail goodDetail=new GoodDetail();
            Goods goods=goodList.get(i);
            assembleGoodDetail(goodDetail,goods);
            goodDetailList.add(goodDetail);
        }
        return ServiceResponse.createBySuccess(goodDetailList);
    }


    private void assembleGoodDetail(GoodDetail goodDetail,Goods goods){
        goodDetail.setId(goods.getId());
        goodDetail.setName(goods.getName());
        goodDetail.setType(goods.getType());
    }

}
