package com.sell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sell.common.ServiceResponse;
import com.sell.dao.OrderGoodsMapper;
import com.sell.dao.OrderMapper;
import com.sell.pojo.Goods;
import com.sell.pojo.Order;
import com.sell.pojo.OrderGoods;
import com.sell.pojo.Seller;
import com.sell.service.IOrderService;
import com.sell.vo.OrderDetails;
import com.sell.vo.OrderGoodDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("iOrderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderGoodsMapper orderGoodsMapper;
    @Override
    public ServiceResponse getOrderList(int userId,int pageSize, int pageNum) {
        List<OrderDetails> list=new ArrayList<OrderDetails>();
/*        PageHelper.startPage(pageNum,pageSize);*/
        List<Order> orderList=orderMapper.selectByUserId(userId);
        for(Order order : orderList){
            String orderId=order.getOrderId();
            List<OrderGoods> goods=orderGoodsMapper.selectByOrderId(orderId);
            OrderDetails orderDetail=new OrderDetails();
            assembleOrderGoodDetail(orderDetail,goods);
            Seller seller=new Seller();
            seller.setName(order.getSellerName());
            seller.setIcon(order.getIcon());
            orderDetail.setSeller(seller);
            list.add(orderDetail);
        }
/*        PageInfo pageResult=new PageInfo(list);
        pageResult.setList(list);*/
        return  ServiceResponse.createBySuccess(list);
    }

    private void assembleOrderGoodDetail( OrderDetails orderDetail,List<OrderGoods> goods) {
        List<OrderGoodDetail> list=new ArrayList<OrderGoodDetail>();
        orderDetail.setGoods(list);
        double total=0;
        for(OrderGoods good : goods){
            OrderGoodDetail orderGoodDetail=new OrderGoodDetail();
            orderGoodDetail.setCount(good.getGoodCount());
            orderGoodDetail.setName(good.getGoodName());
            list.add(orderGoodDetail);
            total+=good.getPrice();
        }
        orderDetail.setTotal(total);
    }
}
