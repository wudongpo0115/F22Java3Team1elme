package com.neusoft.po;

public class Food {
    private Integer foodid;

    private String foodname;

    private String foodexplain;

    private Double foodprice;

    private Integer businessid;

    private String remarks;

    private String foodimg;

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodexplain() {
        return foodexplain;
    }

    public void setFoodexplain(String foodexplain) {
        this.foodexplain = foodexplain;
    }

    public Double getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(Double foodprice) {
        this.foodprice = foodprice;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFoodimg() {
        return foodimg;
    }

    public void setFoodimg(String foodimg) {
        this.foodimg = foodimg;
    }

    private Business business;

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodid=" + foodid +
                ", foodname='" + foodname + '\'' +
                ", foodexplain='" + foodexplain + '\'' +
                ", foodprice=" + foodprice +
                ", businessid=" + businessid +
                ", remarks='" + remarks + '\'' +
                ", foodimg='" + foodimg + '\'' +
                ", business=" + business +
                '}';
    }

    public Food() {
    }

    public Food(Integer foodid, String foodname, String foodexplain, Double foodprice, Integer businessid, String remarks, String foodimg, Business business) {
        this.foodid = foodid;
        this.foodname = foodname;
        this.foodexplain = foodexplain;
        this.foodprice = foodprice;
        this.businessid = businessid;
        this.remarks = remarks;
        this.foodimg = foodimg;
        this.business = business;
    }
}