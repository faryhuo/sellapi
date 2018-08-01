package com.sell.service.impl;

import com.sell.common.ServiceResponse;
import com.sell.dao.UserMapper;
import com.sell.pojo.User;
import com.sell.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public ServiceResponse getUserInfo(Integer userId) {
        User user= userMapper.selectByPrimaryKey(userId);
        return ServiceResponse.createBySuccess(user);
    }

    @Override
    public ServiceResponse login(Integer UserId, String pwd) {
        return null;
    }
}
