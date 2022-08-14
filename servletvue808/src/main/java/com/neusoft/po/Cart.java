package com.neusoft.po;

import java.util.List;

public class Cart {
    private Integer cartid;

    private Integer foodid;

    private Integer businessid;

    private String userid;

    private Integer quantity;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Cart() {
    }

    public Cart(Integer foodid, Integer businessid, String userid, Integer quantity) {
        this.foodid = foodid;
        this.businessid = businessid;
        this.userid = userid;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartid=" + cartid +
                ", foodid=" + foodid +
                ", businessid=" + businessid +
                ", userid='" + userid + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    //外键连接的食品表
    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    private List<Food> foodList;

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }


    public String toStringFood() {
        return "Cart{" +
                "cartid=" + cartid +
                ", foodid=" + foodid +
                ", businessid=" + businessid +
                ", userid='" + userid + '\'' +
                ", quantity=" + quantity +
                ", food=" + food +
                ", foodList=" + foodList +
                '}';
    }

    //外键连接的商家表
    private Business business;

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    private List<Business> businessList;

    public List<Business> getBusinessList() {
        return businessList;
    }

    public void setBusinessList(List<Business> businessList) {
        this.businessList = businessList;
    }

    public String toStringBusiness() {
        return "Cart{" +
                "cartid=" + cartid +
                ", foodid=" + foodid +
                ", businessid=" + businessid +
                ", userid='" + userid + '\'' +
                ", quantity=" + quantity +
                ", business=" + business +
                ", businessList=" + businessList +
                '}';
    }

    //外键连接的用户表
    private Elmeuser elmeuser;

    public Elmeuser getElmeuser() {
        return elmeuser;
    }

    public void setElmeuser(Elmeuser elmeuser) {
        this.elmeuser = elmeuser;
    }

    private List<Elmeuser> elmeuserList;

    public List<Elmeuser> getElmeuserList() {
        return elmeuserList;
    }

    public void setElmeuserList(List<Elmeuser> elmeuserList) {
        this.elmeuserList = elmeuserList;
    }


    public String toStringElmeuser() {
        return "Cart{" +
                "cartid=" + cartid +
                ", foodid=" + foodid +
                ", businessid=" + businessid +
                ", userid='" + userid + '\'' +
                ", quantity=" + quantity +
                ", elmeuser=" + elmeuser +
                ", elmeuserList=" + elmeuserList +
                '}';
    }
}