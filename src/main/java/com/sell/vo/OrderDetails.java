package com.sell.vo;

import com.sell.pojo.Seller;

import java.util.List;

public class OrderDetails {
    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<OrderGoodDetail> getGoods() {
        return goods;
    }

    public void setGoods(List<OrderGoodDetail> goods) {
        this.goods = goods;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private List<OrderGoodDetail> goods;
    private double total;
    private String status;
}
