package com.sell.pojo;

import java.util.Date;

public class Order {
    private String orderId;

    private Integer userId;

    private String sellerName;

    private String icon;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    public Order(String orderId, Integer userId, String sellerName, String icon, Integer status, Date createDate, Date updateDate) {
        this.orderId = orderId;
        this.userId = userId;
        this.sellerName = sellerName;
        this.icon = icon;
        this.status = status;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Order() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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