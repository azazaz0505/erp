package com.nt.erp.model;

public class Login {
    private Integer id;

    private String loginaccount;

    private String loginpasswd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginaccount() {
        return loginaccount;
    }

    public void setLoginaccount(String loginaccount) {
        this.loginaccount = loginaccount == null ? null : loginaccount.trim();
    }

    public String getLoginpasswd() {
        return loginpasswd;
    }

    public void setLoginpasswd(String loginpasswd) {
        this.loginpasswd = loginpasswd == null ? null : loginpasswd.trim();
    }
}