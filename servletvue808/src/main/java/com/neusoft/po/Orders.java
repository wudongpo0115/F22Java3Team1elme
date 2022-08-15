package com.neusoft.po;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private Integer orderid;

    private String userid;

    private Integer businessid;

    private String orderdate;

    private Double ordertotal;

    private Integer daid;

    private Integer orderstate;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public Double getOrdertotal() {
        return ordertotal;
    }

    public void setOrdertotal(Double ordertotal) {
        this.ordertotal = ordertotal;
    }

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }


    //新增属性持有对象
    private OrderDetailet orderdetailet;
    private DeliveryAddress deliveryAddress;

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OrderDetailet getOrderDetailet() {
        return orderdetailet;
    }

    public void setOrderDetailet(OrderDetailet orderDetailet) {
        this.orderdetailet = orderDetailet;
    }

    public Orders(String userid, Integer businessid, Double ordertotal, Integer daid) {
        this.userid = userid;
        this.businessid = businessid;
        this.ordertotal = ordertotal;
        this.daid = daid;
    }

    public Orders(Integer orderid) {
        this.orderid = orderid;
    }

    public Orders() {
    }
    public Orders(Integer orderid, Integer orderstate) {
        this.orderid = orderid;
        this.orderstate = orderstate;
    }

    public Orders(Integer orderid, DeliveryAddress deliveryAddress) {
        this.orderid = orderid;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderid=" + orderid +
                ", userid='" + userid + '\'' +
                ", businessid=" + businessid +
                ", orderdate='" + orderdate + '\'' +
                ", ordertotal=" + ordertotal +
                ", daid=" + daid +
                ", orderstate=" + orderstate +
                ", orderdetailet=" + orderdetailet +
                ", deliveryAddress=" + deliveryAddress +
                '}';
    }

}