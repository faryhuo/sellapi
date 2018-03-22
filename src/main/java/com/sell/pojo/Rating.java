package com.sell.pojo;

import java.util.Date;

public class Rating {
    private Integer id;

    private String username;

    private Date rateTime;

    private Integer rateType;

    private String text;

    private String avatar;

    private Date createTime;

    private Date updateTime;

    private Integer categoryId;

    private Integer categoryType;

    public Rating(Integer id, String username, Date rateTime, Integer rateType, String text, String avatar, Date createTime, Date updateTime, Integer categoryId, Integer categoryType) {
        this.id = id;
        this.username = username;
        this.rateTime = rateTime;
        this.rateType = rateType;
        this.text = text;
        this.avatar = avatar;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.categoryId = categoryId;
        this.categoryType = categoryType;
    }

    public Rating() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getRateTime() {
        return rateTime;
    }

    public void setRateTime(Date rateTime) {
        this.rateTime = rateTime;
    }

    public Integer getRateType() {
        return rateType;
    }

    public void setRateType(Integer rateType) {
        this.rateType = rateType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}