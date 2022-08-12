package com.neusoft.po;

public class Business {
    private Integer businessid;

    private String businessname;

    private String businessaddress;

    private String businessexplain;

    private Integer ordertypeid;

    private Double starprice;

    private Double deliveryprice;

    private String remarks;

    private String businessimg;

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress;
    }

    public String getBusinessexplain() {
        return businessexplain;
    }

    public void setBusinessexplain(String businessexplain) {
        this.businessexplain = businessexplain;
    }

    public Integer getOrdertypeid() {
        return ordertypeid;
    }

    public void setOrdertypeid(Integer ordertypeid) {
        this.ordertypeid = ordertypeid;
    }

    public Double getStarprice() {
        return starprice;
    }

    public void setStarprice(Double starprice) {
        this.starprice = starprice;
    }

    public Double getDeliveryprice() {
        return deliveryprice;
    }

    public void setDeliveryprice(Double deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBusinessimg() {
        return businessimg;
    }

    public void setBusinessimg(String businessimg) {
        this.businessimg = businessimg;
    }
}