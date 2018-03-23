package com.sell.controller.portal;

import com.sell.common.ServiceResponse;
import com.sell.service.IRatingService;
import org.omg.CORBA.ServerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Seller/Rating")
public class RatingController {

    @Autowired
    private IRatingService iRatingService;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ServiceResponse getSellerId(@PathVariable("id")  Integer id){
       return iRatingService.getRatingListBySellerId(id);
    }
}
