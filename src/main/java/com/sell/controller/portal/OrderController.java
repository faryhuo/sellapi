package com.sell.controller.portal;


import com.sell.common.ServiceResponse;
import com.sell.pojo.User;
import com.sell.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "api/Order")
public class OrderController {

    @Autowired
    private IOrderService iOrderService;

    @RequestMapping(value = "getOrderList" ,method = RequestMethod.GET)
    public ServiceResponse getOrderList(HttpSession session, @RequestParam(value = "pageNum",defaultValue = "10")
            int pageNum,@RequestParam(value = "pageSize",defaultValue = "1") int pageSize){
        User u=new User();u.setUserId(1);
        session.setAttribute("USER",u);
        User user=(User)session.getAttribute("USER");
        return iOrderService.getOrderList(user.getUserId(),pageSize,pageNum);
    }
}
