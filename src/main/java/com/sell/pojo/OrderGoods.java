package com.sell.pojo;

import java.util.Date;

public class OrderGoods {
    private String orderId;

    private String goodName;

    private Integer goodCount;

    private Double price;

    private Date createDate;

    private Date updateDate;

    public OrderGoods(String orderId, String goodName, Integer goodCount, Double price, Date createDate, Date updateDate) {
        this.orderId = orderId;
        this.goodName = goodName;
        this.goodCount = goodCount;
        this.price = price;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public OrderGoods() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}