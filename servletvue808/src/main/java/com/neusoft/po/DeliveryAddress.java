package com.neusoft.po;

import java.util.List;

public class DeliveryAddress {
    private Integer daid;

    private String contactname;

    private Integer contactsex;

    private String contacttel;

    private String address;

    private String userid;



    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public Integer getContactsex() {
        return contactsex;
    }

    public void setContactsex(Integer contactsex) {
        this.contactsex = contactsex;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public DeliveryAddress() {
    }

    public DeliveryAddress( String contactname, Integer contactsex, String contacttel, String address, String userid) {
        this.contactname = contactname;
        this.contactsex = contactsex;
        this.contacttel = contacttel;
        this.address = address;
        this.userid = userid;
    }

    public DeliveryAddress( int daid, String contactname, Integer contactsex, String contacttel, String address, String userid) {
        this.daid = daid;
        this.contactname = contactname;
        this.contactsex = contactsex;
        this.contacttel = contacttel;
        this.address = address;
        this.userid = userid;
    }


    @Override
    public String toString() {
        return "DeliveryAddress{" +
                "daid=" + daid +
                ", contactname='" + contactname + '\'' +
                ", contactsex=" + contactsex +
                ", contacttel='" + contacttel + '\'' +
                ", address='" + address + '\'' +
                ", userid='" + userid + '\n' +
                ", elmeuser='" + elmeuser + '\n' +
                ", elmeuserList='" + elmeuserList + '\'' +
                '}';
    }

    //用户表与送货地址一对一的getting和setting
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

    public DeliveryAddress(Integer daid) {
        this.daid = daid;
    }
}