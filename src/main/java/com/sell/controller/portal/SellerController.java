package com.sell.controller.portal;

import com.sell.common.ServiceResponse;
import com.sell.service.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Seller")
public class SellerController {

    @Autowired
    private ISellerService iSellerService;

    @RequestMapping(value = "getSellerById.do" ,method = RequestMethod.GET)
    public ServiceResponse getSellerById(Integer id){
        return iSellerService.getSellerById(id);
    }
}
