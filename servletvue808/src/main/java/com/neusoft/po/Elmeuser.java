package com.neusoft.po;

public class Elmeuser {
    private String userid;

    private String psd;

    private String username;

    private Integer usersex;

    private Integer deltag;

    private String userimg;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public Integer getDeltag() {
        return deltag;
    }

    public void setDeltag(Integer deltag) {
        this.deltag = deltag;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public Elmeuser() {
    }

    public Elmeuser(String userid, String psd, String username, Integer usersex, Integer deltag, String userimg) {
        this.userid = userid;
        this.psd = psd;
        this.username = username;
        this.usersex = usersex;
        this.deltag = deltag;
        this.userimg = userimg;
    }

    @Override
    public String toString() {
        return "Elmeuser{" +
                "userid='" + userid + '\'' +
                ", psd='" + psd + '\'' +
                ", username='" + username + '\'' +
                ", usersex=" + usersex +
                ", deltag=" + deltag +
                ", userimg='" + userimg + '\'' +
                '}';
    }
}