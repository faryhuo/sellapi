package com.sell.vo;

import com.sell.pojo.Rating;
import com.sell.pojo.Support;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SellerDetails {
    private Integer id;

    private String name;

    private String description;

    private Double deliveryTime;

    private BigDecimal score;

    private BigDecimal serviceScore;

    private BigDecimal foodScore;

    private Double rankRate;

    private Double minPrice;

    private Double deliveryPrice;

    private Integer ratingCount;

    private Integer sellCount;

    private String bulletin;

    private String icon;

    private Date createTime;

    private Date updateTime;


    private List<GoodDetail> goods;

    private List<Rating> ratings;

    private List<String> infos;

    private List<String> pics;

    private List<Support> supports;

    public SellerDetails() {
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


    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<GoodDetail> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodDetail> goods) {
        this.goods = goods;
    }

    public List<String> getInfos() {
        return infos;
    }

    public void setInfos(List<String> infos) {
        this.infos = infos;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public List<Support> getSupports() {
        return supports;
    }

    public void setSupports(List<Support> supports) {
        this.supports = supports;
    }
}
