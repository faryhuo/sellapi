package com.sell.controller.portal;

import com.sell.common.ServiceResponse;
import com.sell.service.IGoodService;
import com.sell.vo.GoodDetail;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "goods")
public class GoodsController {
    @Autowired
    private IGoodService iGoodService;

    @RequestMapping(value = "getGoodListBySellerId.do",method = RequestMethod.GET)
    public ServiceResponse<List<GoodDetail>> getGoodListBySellerId(Integer sellerId){
        return iGoodService.getGoodListBySellerId(sellerId);
    }

}