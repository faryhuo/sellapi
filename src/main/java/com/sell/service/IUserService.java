package com.sell.service;

import com.sell.common.ServiceResponse;

public interface IUserService {
    ServiceResponse getUserInfo(Integer UserId);
    ServiceResponse login(Integer UserId,String pwd);

}
