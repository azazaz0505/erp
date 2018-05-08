package com.nt.erp.bean;

import javax.ws.rs.PathParam;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginBean {
    
    @PathParam("loginAccount")
    @NotEmpty(message = "loginAccount不能为空;")
    private String loginAccount;
    
    private String loginPasswd;

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }
    
    
}
