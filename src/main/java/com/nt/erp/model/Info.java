package com.nt.erp.model;

import java.util.Date;

public class Info {
    private Integer id;

    private Integer totalsizeleft;

    private Integer totalsizemodify;

    private Integer totalsizenumber;

    private Integer xxxlsizeleft;

    private Integer xxxlsizemodify;

    private Integer xxxlsizenumber;

    private Integer xxlsizeleft;

    private Integer xxlsizemodify;

    private Integer xxlsizenumber;

    private Integer xlsizeleft;

    private Integer xlsizemodify;

    private Integer xlsizenumber;

    private Integer lsizeleft;

    private Integer lsizemodify;

    private Integer lsizenumber;

    private Integer msizeleft;

    private Integer msizemodify;

    private Integer msizenumber;

    private Integer ssizeleft;

    private Integer ssizemodify;

    private Integer ssizenumber;

    private Date orderdate;

    private String stylename;

    private String styleid;
    
    private String color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalsizeleft() {
        return totalsizeleft;
    }

    public void setTotalsizeleft(Integer totalsizeleft) {
        this.totalsizeleft = totalsizeleft;
    }

    public Integer getTotalsizemodify() {
        return totalsizemodify;
    }

    public void setTotalsizemodify(Integer totalsizemodify) {
        this.totalsizemodify = totalsizemodify;
    }

    public Integer getTotalsizenumber() {
        return totalsizenumber;
    }

    public void setTotalsizenumber(Integer totalsizenumber) {
        this.totalsizenumber = totalsizenumber;
    }

    public Integer getXxxlsizeleft() {
        return xxxlsizeleft;
    }

    public void setXxxlsizeleft(Integer xxxlsizeleft) {
        this.xxxlsizeleft = xxxlsizeleft;
    }

    public Integer getXxxlsizemodify() {
        return xxxlsizemodify;
    }

    public void setXxxlsizemodify(Integer xxxlsizemodify) {
        this.xxxlsizemodify = xxxlsizemodify;
    }

    public Integer getXxxlsizenumber() {
        return xxxlsizenumber;
    }

    public void setXxxlsizenumber(Integer xxxlsizenumber) {
        this.xxxlsizenumber = xxxlsizenumber;
    }

    public Integer getXxlsizeleft() {
        return xxlsizeleft;
    }

    public void setXxlsizeleft(Integer xxlsizeleft) {
        this.xxlsizeleft = xxlsizeleft;
    }

    public Integer getXxlsizemodify() {
        return xxlsizemodify;
    }

    public void setXxlsizemodify(Integer xxlsizemodify) {
        this.xxlsizemodify = xxlsizemodify;
    }

    public Integer getXxlsizenumber() {
        return xxlsizenumber;
    }

    public void setXxlsizenumber(Integer xxlsizenumber) {
        this.xxlsizenumber = xxlsizenumber;
    }

    public Integer getXlsizeleft() {
        return xlsizeleft;
    }

    public void setXlsizeleft(Integer xlsizeleft) {
        this.xlsizeleft = xlsizeleft;
    }

    public Integer getXlsizemodify() {
        return xlsizemodify;
    }

    public void setXlsizemodify(Integer xlsizemodify) {
        this.xlsizemodify = xlsizemodify;
    }

    public Integer getXlsizenumber() {
        return xlsizenumber;
    }

    public void setXlsizenumber(Integer xlsizenumber) {
        this.xlsizenumber = xlsizenumber;
    }

    public Integer getLsizeleft() {
        return lsizeleft;
    }

    public void setLsizeleft(Integer lsizeleft) {
        this.lsizeleft = lsizeleft;
    }

    public Integer getLsizemodify() {
        return lsizemodify;
    }

    public void setLsizemodify(Integer lsizemodify) {
        this.lsizemodify = lsizemodify;
    }

    public Integer getLsizenumber() {
        return lsizenumber;
    }

    public void setLsizenumber(Integer lsizenumber) {
        this.lsizenumber = lsizenumber;
    }

    public Integer getMsizeleft() {
        return msizeleft;
    }

    public void setMsizeleft(Integer msizeleft) {
        this.msizeleft = msizeleft;
    }

    public Integer getMsizemodify() {
        return msizemodify;
    }

    public void setMsizemodify(Integer msizemodify) {
        this.msizemodify = msizemodify;
    }

    public Integer getMsizenumber() {
        return msizenumber;
    }

    public void setMsizenumber(Integer msizenumber) {
        this.msizenumber = msizenumber;
    }

    public Integer getSsizeleft() {
        return ssizeleft;
    }

    public void setSsizeleft(Integer ssizeleft) {
        this.ssizeleft = ssizeleft;
    }

    public Integer getSsizemodify() {
        return ssizemodify;
    }

    public void setSsizemodify(Integer ssizemodify) {
        this.ssizemodify = ssizemodify;
    }

    public Integer getSsizenumber() {
        return ssizenumber;
    }

    public void setSsizenumber(Integer ssizenumber) {
        this.ssizenumber = ssizenumber;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename == null ? null : stylename.trim();
    }

    public String getStyleid() {
        return styleid;
    }

    public void setStyleid(String styleid) {
        this.styleid = styleid == null ? null : styleid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", totalsizeleft=").append(totalsizeleft);
        sb.append(", totalsizemodify=").append(totalsizemodify);
        sb.append(", totalsizenumber=").append(totalsizenumber);
        sb.append(", xxxlsizeleft=").append(xxxlsizeleft);
        sb.append(", xxxlsizemodify=").append(xxxlsizemodify);
        sb.append(", xxxlsizenumber=").append(xxxlsizenumber);
        sb.append(", xxlsizeleft=").append(xxlsizeleft);
        sb.append(", xxlsizemodify=").append(xxlsizemodify);
        sb.append(", xxlsizenumber=").append(xxlsizenumber);
        sb.append(", xlsizeleft=").append(xlsizeleft);
        sb.append(", xlsizemodify=").append(xlsizemodify);
        sb.append(", xlsizenumber=").append(xlsizenumber);
        sb.append(", lsizeleft=").append(lsizeleft);
        sb.append(", lsizemodify=").append(lsizemodify);
        sb.append(", lsizenumber=").append(lsizenumber);
        sb.append(", msizeleft=").append(msizeleft);
        sb.append(", msizemodify=").append(msizemodify);
        sb.append(", msizenumber=").append(msizenumber);
        sb.append(", ssizeleft=").append(ssizeleft);
        sb.append(", ssizemodify=").append(ssizemodify);
        sb.append(", ssizenumber=").append(ssizenumber);
        sb.append(", orderdate=").append(orderdate);
        sb.append(", stylename=").append(stylename);
        sb.append(", styleid=").append(styleid);
        sb.append("]");
        return sb.toString();
    }

    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
     * 这是Mybatis Generator拓展插件生成的类(请勿删除).
     * This class corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public static class Builder {
        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        private Info obj;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder() {
            this.obj = new Info();
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder id(Integer id) {
            obj.id = id;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder totalsizeleft(Integer totalsizeleft) {
            obj.totalsizeleft = totalsizeleft;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder totalsizemodify(Integer totalsizemodify) {
            obj.totalsizemodify = totalsizemodify;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder totalsizenumber(Integer totalsizenumber) {
            obj.totalsizenumber = totalsizenumber;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xxxlsizeleft(Integer xxxlsizeleft) {
            obj.xxxlsizeleft = xxxlsizeleft;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xxxlsizemodify(Integer xxxlsizemodify) {
            obj.xxxlsizemodify = xxxlsizemodify;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xxxlsizenumber(Integer xxxlsizenumber) {
            obj.xxxlsizenumber = xxxlsizenumber;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xxlsizeleft(Integer xxlsizeleft) {
            obj.xxlsizeleft = xxlsizeleft;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xxlsizemodify(Integer xxlsizemodify) {
            obj.xxlsizemodify = xxlsizemodify;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xxlsizenumber(Integer xxlsizenumber) {
            obj.xxlsizenumber = xxlsizenumber;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xlsizeleft(Integer xlsizeleft) {
            obj.xlsizeleft = xlsizeleft;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xlsizemodify(Integer xlsizemodify) {
            obj.xlsizemodify = xlsizemodify;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder xlsizenumber(Integer xlsizenumber) {
            obj.xlsizenumber = xlsizenumber;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder lsizeleft(Integer lsizeleft) {
            obj.lsizeleft = lsizeleft;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder lsizemodify(Integer lsizemodify) {
            obj.lsizemodify = lsizemodify;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder lsizenumber(Integer lsizenumber) {
            obj.lsizenumber = lsizenumber;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder msizeleft(Integer msizeleft) {
            obj.msizeleft = msizeleft;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder msizemodify(Integer msizemodify) {
            obj.msizemodify = msizemodify;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder msizenumber(Integer msizenumber) {
            obj.msizenumber = msizenumber;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder ssizeleft(Integer ssizeleft) {
            obj.ssizeleft = ssizeleft;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder ssizemodify(Integer ssizemodify) {
            obj.ssizemodify = ssizemodify;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder ssizenumber(Integer ssizenumber) {
            obj.ssizenumber = ssizenumber;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder orderdate(Date orderdate) {
            obj.orderdate = orderdate;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder stylename(String stylename) {
            obj.stylename = stylename;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder styleid(String styleid) {
            obj.styleid = styleid;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public Info build() {
            return this.obj;
        }
    }

    /**
     * 这是Mybatis Generator拓展插件生成的枚举(请勿删除).
     * This class corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public enum Column {
        id("id"),
        totalsizeleft("totalsizeleft"),
        totalsizemodify("totalsizemodify"),
        totalsizenumber("totalsizenumber"),
        xxxlsizeleft("xxxlsizeleft"),
        xxxlsizemodify("xxxlsizemodify"),
        xxxlsizenumber("xxxlsizenumber"),
        xxlsizeleft("xxlsizeleft"),
        xxlsizemodify("xxlsizemodify"),
        xxlsizenumber("xxlsizenumber"),
        xlsizeleft("xlsizeleft"),
        xlsizemodify("xlsizemodify"),
        xlsizenumber("xlsizenumber"),
        lsizeleft("lsizeleft"),
        lsizemodify("lsizemodify"),
        lsizenumber("lsizenumber"),
        msizeleft("msizeleft"),
        msizemodify("msizemodify"),
        msizenumber("msizenumber"),
        ssizeleft("ssizeleft"),
        ssizemodify("ssizemodify"),
        ssizenumber("ssizenumber"),
        orderdate("orderdate"),
        stylename("stylename"),
        styleid("styleid");

        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        private final String column;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public String value() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public String getValue() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}