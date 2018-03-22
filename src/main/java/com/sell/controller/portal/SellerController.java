package com.sell.controller.portal;

import com.sell.common.ServiceResponse;
import com.sell.service.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Seller")
public class SellerController {

    @Autowired
    private ISellerService iSellerService;

    @RequestMapping(value = "{id}" ,method = RequestMethod.GET)
    public ServiceResponse getSellerById(@PathVariable("id") Integer id){
        return iSellerService.getSellerById(id);
    }
}
