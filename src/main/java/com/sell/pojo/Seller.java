package com.sell.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Seller {
    private Integer id;

    private String name;

    private String description;

    private Double deliveryTime;

    private BigDecimal score;

    private BigDecimal serviceScore;

    private BigDecimal foodScore;

    private Double rankRate;

    private Double minPrice;

    private Double averagePrice;

    private Double deliveryPrice;

    private Integer ratingCount;

    private Integer sellCount;

    private String bulletin;

    private String icon;

    private Date createTime;

    private Date updateTime;

    public Seller(Integer id, String name, String description, Double deliveryTime, BigDecimal score, BigDecimal serviceScore, BigDecimal foodScore, Double rankRate, Double minPrice, Double deliveryPrice, Integer ratingCount, Integer sellCount, String bulletin, String icon, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deliveryTime = deliveryTime;
        this.score = score;
        this.serviceScore = serviceScore;
        this.foodScore = foodScore;
        this.rankRate = rankRate;
        this.minPrice = minPrice;
        this.deliveryPrice = deliveryPrice;
        this.ratingCount = ratingCount;
        this.sellCount = sellCount;
        this.bulletin = bulletin;
        this.icon = icon;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Seller() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Double deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(BigDecimal serviceScore) {
        this.serviceScore = serviceScore;
    }

    public BigDecimal getFoodScore() {
        return foodScore;
    }

    public void setFoodScore(BigDecimal foodScore) {
        this.foodScore = foodScore;
    }

    public Double getRankRate() {
        return rankRate;
    }

    public void setRankRate(Double rankRate) {
        this.rankRate = rankRate;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Integer getSellCount() {
        return sellCount;
    }

    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    public String getBulletin() {
        return bulletin;
    }

    public void setBulletin(String bulletin) {
        this.bulletin = bulletin == null ? null : bulletin.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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

    public Double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }
}