package com.sell.controller.portal;

import com.sell.common.ServiceResponse;
import com.sell.service.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Seller")
public class SellerController {

    @Autowired
    private ISellerService iSellerService;

    @RequestMapping(value = "{id}" ,method = RequestMethod.GET)
    public ServiceResponse getSellerById(@PathVariable("id") Integer id){
        return iSellerService.getSellerById(id);
    }


    @RequestMapping(value = "getSellerList" ,method = RequestMethod.GET)
    public ServiceResponse getSellerList(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                         @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize  ){
        return iSellerService.getSellerList(pageSize,pageNum);
    }



}
