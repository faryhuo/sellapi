package com.sell.vo;

import java.util.Date;
import java.util.List;

public class GoodDetail {
    private Integer id;

    private String name;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private List<FoodDetail> foodList;

    public GoodDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    public List<FoodDetail> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<FoodDetail> foodList) {
        this.foodList = foodList;
    }
}
