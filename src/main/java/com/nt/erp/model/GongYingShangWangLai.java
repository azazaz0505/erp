package com.nt.erp.model;

public class GongYingShangWangLai {
    private Integer uuid;

    private String gongyingshangmingcheng;

    private String gongyingshanbianma;

    private Double hetongzongjine;

    private Double yikaipiaojine;

    private Double weikaipiaojine;

    private Double yufukuan;

    private Double yifukuanjine;

    private Double rukuzongjine;

    private String fukuan;

    private String baobiao;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getGongyingshangmingcheng() {
        return gongyingshangmingcheng;
    }

    public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
        this.gongyingshangmingcheng = gongyingshangmingcheng == null ? null : gongyingshangmingcheng.trim();
    }

    public String getGongyingshanbianma() {
        return gongyingshanbianma;
    }

    public void setGongyingshanbianma(String gongyingshanbianma) {
        this.gongyingshanbianma = gongyingshanbianma == null ? null : gongyingshanbianma.trim();
    }

    public Double getHetongzongjine() {
        return hetongzongjine;
    }

    public void setHetongzongjine(Double hetongzongjine) {
        this.hetongzongjine = hetongzongjine;
    }

    public Double getYikaipiaojine() {
        return yikaipiaojine;
    }

    public void setYikaipiaojine(Double yikaipiaojine) {
        this.yikaipiaojine = yikaipiaojine;
    }

    public Double getWeikaipiaojine() {
        return weikaipiaojine;
    }

    public void setWeikaipiaojine(Double weikaipiaojine) {
        this.weikaipiaojine = weikaipiaojine;
    }

    public Double getYufukuan() {
        return yufukuan;
    }

    public void setYufukuan(Double yufukuan) {
        this.yufukuan = yufukuan;
    }

    public Double getYifukuanjine() {
        return yifukuanjine;
    }

    public void setYifukuanjine(Double yifukuanjine) {
        this.yifukuanjine = yifukuanjine;
    }

    public Double getRukuzongjine() {
        return rukuzongjine;
    }

    public void setRukuzongjine(Double rukuzongjine) {
        this.rukuzongjine = rukuzongjine;
    }

    public String getFukuan() {
        return fukuan;
    }

    public void setFukuan(String fukuan) {
        this.fukuan = fukuan == null ? null : fukuan.trim();
    }

    public String getBaobiao() {
        return baobiao;
    }

    public void setBaobiao(String baobiao) {
        this.baobiao = baobiao == null ? null : baobiao.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", gongyingshangmingcheng=").append(gongyingshangmingcheng);
        sb.append(", gongyingshanbianma=").append(gongyingshanbianma);
        sb.append(", hetongzongjine=").append(hetongzongjine);
        sb.append(", yikaipiaojine=").append(yikaipiaojine);
        sb.append(", weikaipiaojine=").append(weikaipiaojine);
        sb.append(", yufukuan=").append(yufukuan);
        sb.append(", yifukuanjine=").append(yifukuanjine);
        sb.append(", rukuzongjine=").append(rukuzongjine);
        sb.append(", fukuan=").append(fukuan);
        sb.append(", baobiao=").append(baobiao);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 这是Mybatis Generator拓展插件生成的类(请勿删除).
     * This class corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public static class Builder {
        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        private GongYingShangWangLai obj;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder() {
            this.obj = new GongYingShangWangLai();
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
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
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder gongyingshangmingcheng(String gongyingshangmingcheng) {
            obj.gongyingshangmingcheng = gongyingshangmingcheng;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder gongyingshanbianma(String gongyingshanbianma) {
            obj.gongyingshanbianma = gongyingshanbianma;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder hetongzongjine(Double hetongzongjine) {
            obj.hetongzongjine = hetongzongjine;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder yikaipiaojine(Double yikaipiaojine) {
            obj.yikaipiaojine = yikaipiaojine;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder weikaipiaojine(Double weikaipiaojine) {
            obj.weikaipiaojine = weikaipiaojine;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder yufukuan(Double yufukuan) {
            obj.yufukuan = yufukuan;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder yifukuanjine(Double yifukuanjine) {
            obj.yifukuanjine = yifukuanjine;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder rukuzongjine(Double rukuzongjine) {
            obj.rukuzongjine = rukuzongjine;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder fukuan(String fukuan) {
            obj.fukuan = fukuan;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder baobiao(String baobiao) {
            obj.baobiao = baobiao;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public GongYingShangWangLai build() {
            return this.obj;
        }
    }

    /**
     * 这是Mybatis Generator拓展插件生成的枚举(请勿删除).
     * This class corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public enum Column {
        uuid("uuid"),
        gongyingshangmingcheng("gongyingshangmingcheng"),
        gongyingshanbianma("gongyingshanbianma"),
        hetongzongjine("hetongzongjine"),
        yikaipiaojine("yikaipiaojine"),
        weikaipiaojine("weikaipiaojine"),
        yufukuan("yufukuan"),
        yifukuanjine("yifukuanjine"),
        rukuzongjine("rukuzongjine"),
        fukuan("fukuan"),
        baobiao("baobiao");

        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        private final String column;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public String value() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public String getValue() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}