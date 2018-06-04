package com.nt.erp.model;

public class Login {
    private String login_uuid;

    private String loginaccount;

    private String loginpasswd;

    public String getId() {
        return login_uuid;
    }

    public void setId(String login_uuid) {
        this.login_uuid = login_uuid;
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