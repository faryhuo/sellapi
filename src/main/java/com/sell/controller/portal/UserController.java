package com.sell.controller.portal;


import com.sell.common.ServiceResponse;
import com.sell.pojo.User;
import com.sell.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "api/User")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/getUserInfo")
    public ServiceResponse getUserInfo(HttpSession session){
        User u=new User();u.setUserId(1);
        session.setAttribute("USER",u);
        User user=(User)session.getAttribute("USER");
        return iUserService.getUserInfo(user.getUserId());
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public  ServiceResponse login(){
        return iUserService.login(1,"d");
    }
}
