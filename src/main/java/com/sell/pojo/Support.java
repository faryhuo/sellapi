package com.sell.pojo;

import java.util.Date;

public class Support {
    private Integer type;

    private String description;

    private Date createTime;

    private Date updateTime;

    public Support(Integer type, String description, Date createTime, Date updateTime) {
        this.type = type;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Support() {
        super();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
}