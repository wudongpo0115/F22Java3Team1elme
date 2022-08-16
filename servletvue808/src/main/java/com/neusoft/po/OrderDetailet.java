package com.neusoft.po;

import java.util.List;

public class OrderDetailet {
    private Integer odid;

    private Integer orderid;

    private Integer foodid;

    private Integer quantity;

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public Integer getOrderid() {
        return orderid;
    }


    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OrderDetailet() {
    }

    public OrderDetailet(Integer odid, Integer orderid, Integer foodid, Integer quantity) {
        this.odid = odid;
        this.orderid = orderid;
        this.foodid = foodid;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetailet{" +
                "odid=" + odid +
                ", orderid=" + orderid +
                ", foodid=" + foodid +
                ", quantity=" + quantity +
                '}';
    }


//    1对orders
    private Orders orders;

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

//    1对food
    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}