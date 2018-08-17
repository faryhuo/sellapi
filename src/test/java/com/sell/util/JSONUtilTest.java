package com.sell.util;

import com.sell.common.ServiceResponse;
import com.sell.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
@ContextConfiguration(locations = { "classpath:testApplicationContext.xml" })
public class JSONUtilTest extends AbstractTestNGSpringContextTests {

    @BeforeClass
    public void init(){
    }


    @Test
    public void getJSONDataByFileName() {
        String jsonData=JSONUtil.getJSONByFileName("SAData.json");
        System.out.println(jsonData);
    }

}
