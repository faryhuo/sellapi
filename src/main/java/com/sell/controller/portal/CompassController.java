package com.sell.controller.portal;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sell.common.ServiceResponse;
import com.sell.util.JSONUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "api/Compass")
public class CompassController {



    @RequestMapping(value = "/getSAData",method = RequestMethod.GET)
    public ServiceResponse getSAData(HttpSession session) {
        String jsonData= JSONUtil.getJSONByFileName("SAData.json");
        JSONObject json=JSONObject.parseObject(jsonData);
        return ServiceResponse.createBySuccess(json);
    }

    @RequestMapping(value = "/getEnquiryData",method = RequestMethod.GET)
    public ServiceResponse getEnquiryData(HttpSession session) {
        String jsonData= JSONUtil.getJSONByFileName("SAEnquiryData.json");
        System.out.println(jsonData);
        JSONObject json=JSONObject.parseObject(jsonData);

        JSONArray jsonArr=json.getJSONArray("data");
        return ServiceResponse.createBySuccess(jsonArr);
    }

    @RequestMapping(value = "/getClientList",method = RequestMethod.GET)
    public ServiceResponse getClientList(HttpSession session) {
        String jsonData= JSONUtil.getJSONByFileName("ClientData.json");
        JSONArray jsonArr=JSONArray.parseArray(jsonData);
        return ServiceResponse.createBySuccess(jsonArr);
    }
}
