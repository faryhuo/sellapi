package com.sell.pojo;

import java.util.Date;

public class Goods {
    private Integer id;

    private String name;

    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Integer sellerId;

    public Goods(Integer id, String name, Integer type, Date createTime, Date updateTime, Integer sellerId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.sellerId = sellerId;
    }

    public Goods() {
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

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }
}