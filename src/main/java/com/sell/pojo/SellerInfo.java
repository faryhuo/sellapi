package com.sell.pojo;

import java.util.Date;

public class SellerInfo {
    private Integer id;

    private Integer sellerId;

    private String info;

    private Date updateTime;

    private Date createTime;

    public SellerInfo(Integer id, Integer sellerId, String info, Date updateTime, Date createTime) {
        this.id = id;
        this.sellerId = sellerId;
        this.info = info;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    public SellerInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}