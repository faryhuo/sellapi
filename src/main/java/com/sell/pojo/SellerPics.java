package com.sell.pojo;

import java.util.Date;

public class SellerPics {
    private Integer id;

    private Integer sellerId;

    private String image;

    private Date createTime;

    private Date updateTime;

    public SellerPics(Integer id, Integer sellerId, String image, Date createTime, Date updateTime) {
        this.id = id;
        this.sellerId = sellerId;
        this.image = image;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SellerPics() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
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