package com.sell.service;

import com.sell.common.ServiceResponse;
import com.sell.vo.FoodDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
@ContextConfiguration(locations = { "classpath:testApplicationContext.xml" })
public class FoodServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private IFoodService iFoodService;

    @Test(dataProvider ="providerData",timeOut = 3000)
    public void getFoodListByGoodId(int goodId,int expected) {
        ServiceResponse serviceResponse= iFoodService.getFoodListByGoodId(goodId);
        List<FoodDetail> list= (List<FoodDetail>) serviceResponse.getData();
        Assert.assertEquals(list.size(),expected);
    }

    @DataProvider(name = "providerData")
    public Object[][] provideData() {

        return new Object[][] { { 1,1  },{2,0} };
    }

}
