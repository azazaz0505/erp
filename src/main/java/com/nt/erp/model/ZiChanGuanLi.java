package com.nt.erp.model;

import java.util.Date;

public class ZiChanGuanLi {
    private Integer uuid;

    private String gudingzichanbiana;

    private String gudingzichanmingcheng;

    private String gudingzichanleixing;

    private Date zhejiunianxian;

    private String yuanzhi;

    private String jingcanzhi;

    private String operation;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getGudingzichanbiana() {
        return gudingzichanbiana;
    }

    public void setGudingzichanbiana(String gudingzichanbiana) {
        this.gudingzichanbiana = gudingzichanbiana == null ? null : gudingzichanbiana.trim();
    }

    public String getGudingzichanmingcheng() {
        return gudingzichanmingcheng;
    }

    public void setGudingzichanmingcheng(String gudingzichanmingcheng) {
        this.gudingzichanmingcheng = gudingzichanmingcheng == null ? null : gudingzichanmingcheng.trim();
    }

    public String getGudingzichanleixing() {
        return gudingzichanleixing;
    }

    public void setGudingzichanleixing(String gudingzichanleixing) {
        this.gudingzichanleixing = gudingzichanleixing == null ? null : gudingzichanleixing.trim();
    }

    public Date getZhejiunianxian() {
        return zhejiunianxian;
    }

    public void setZhejiunianxian(Date zhejiunianxian) {
        this.zhejiunianxian = zhejiunianxian;
    }

    public String getYuanzhi() {
        return yuanzhi;
    }

    public void setYuanzhi(String yuanzhi) {
        this.yuanzhi = yuanzhi == null ? null : yuanzhi.trim();
    }

    public String getJingcanzhi() {
        return jingcanzhi;
    }

    public void setJingcanzhi(String jingcanzhi) {
        this.jingcanzhi = jingcanzhi == null ? null : jingcanzhi.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", gudingzichanbiana=").append(gudingzichanbiana);
        sb.append(", gudingzichanmingcheng=").append(gudingzichanmingcheng);
        sb.append(", gudingzichanleixing=").append(gudingzichanleixing);
        sb.append(", zhejiunianxian=").append(zhejiunianxian);
        sb.append(", yuanzhi=").append(yuanzhi);
        sb.append(", jingcanzhi=").append(jingcanzhi);
        sb.append(", operation=").append(operation);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 这是Mybatis Generator拓展插件生成的类(请勿删除).
     * This class corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public static class Builder {
        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        private ZiChanGuanLi obj;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder() {
            this.obj = new ZiChanGuanLi();
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder uuid(Integer uuid) {
            obj.uuid = uuid;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder gudingzichanbiana(String gudingzichanbiana) {
            obj.gudingzichanbiana = gudingzichanbiana;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder gudingzichanmingcheng(String gudingzichanmingcheng) {
            obj.gudingzichanmingcheng = gudingzichanmingcheng;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder gudingzichanleixing(String gudingzichanleixing) {
            obj.gudingzichanleixing = gudingzichanleixing;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder zhejiunianxian(Date zhejiunianxian) {
            obj.zhejiunianxian = zhejiunianxian;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder yuanzhi(String yuanzhi) {
            obj.yuanzhi = yuanzhi;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder jingcanzhi(String jingcanzhi) {
            obj.jingcanzhi = jingcanzhi;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder operation(String operation) {
            obj.operation = operation;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public ZiChanGuanLi build() {
            return this.obj;
        }
    }

    /**
     * 这是Mybatis Generator拓展插件生成的枚举(请勿删除).
     * This class corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public enum Column {
        uuid("uuid"),
        gudingzichanbiana("gudingzichanbiana"),
        gudingzichanmingcheng("gudingzichanmingcheng"),
        gudingzichanleixing("gudingzichanleixing"),
        zhejiunianxian("zhejiunianxian"),
        yuanzhi("yuanzhi"),
        jingcanzhi("jingcanzhi"),
        operation("operation");

        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        private final String column;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public String value() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public String getValue() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}