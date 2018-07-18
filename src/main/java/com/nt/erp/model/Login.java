package com.nt.erp.model;

public class Login {
    private String loginaccount;

    private String loginpasswd;

    private String loginUuid;

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

    public String getLoginUuid() {
        return loginUuid;
    }

    public void setLoginUuid(String loginUuid) {
        this.loginUuid = loginUuid == null ? null : loginUuid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginaccount=").append(loginaccount);
        sb.append(", loginpasswd=").append(loginpasswd);
        sb.append(", loginUuid=").append(loginUuid);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 这是Mybatis Generator拓展插件生成的类(请勿删除).
     * This class corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public static class Builder {
        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        private Login obj;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder() {
            this.obj = new Login();
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder loginaccount(String loginaccount) {
            obj.loginaccount = loginaccount;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder loginpasswd(String loginpasswd) {
            obj.loginpasswd = loginpasswd;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder loginUuid(String loginUuid) {
            obj.loginUuid = loginUuid;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public Login build() {
            return this.obj;
        }
    }

    /**
     * 这是Mybatis Generator拓展插件生成的枚举(请勿删除).
     * This class corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public enum Column {
        loginaccount("loginaccount"),
        loginpasswd("loginpasswd"),
        loginUuid("login_uuid");

        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        private final String column;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public String value() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public String getValue() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}