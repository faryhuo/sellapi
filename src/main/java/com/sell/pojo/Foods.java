package com.sell.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Foods {
    private Integer id;

    private String name;

    private BigDecimal price;

    private BigDecimal oldPrice;

    private String description;

    private Integer sellCount;

    private Integer rating;

    private String info;

    private String icon;

    private String image;

    private Date createTime;

    private Date updateTime;

    private Integer goodsId;

    public Foods(Integer id, String name, BigDecimal price, BigDecimal oldPrice, String description, Integer sellCount, Integer rating, String info, String icon, String image, Date createTime, Date updateTime, Integer goodsId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.oldPrice = oldPrice;
        this.description = description;
        this.sellCount = sellCount;
        this.rating = rating;
        this.info = info;
        this.icon = icon;
        this.image = image;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.goodsId = goodsId;
    }

    public Foods() {
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSellCount() {
        return sellCount;
    }

    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}