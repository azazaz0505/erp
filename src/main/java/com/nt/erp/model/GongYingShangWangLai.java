package com.nt.erp.model;

import java.util.Date;

public class GongYingShangWangLai {
    private Integer uuid;

    private String fukuanleixing;

    private String gongyingshangmingcheng;

    private String shiyou;

    private String zhifufangshi;

    private String fapiaoxinxi;

    private String fapiaoshuilv;

    private Double hetongzongjine;

    private Double yifukuanjine;

    private Date fukuanriqi;

    private Double rukuzongjine;

    private String zhuangtai;

    private Date shenqingriqi;

    private String bumen;

    private String jingbanren;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getFukuanleixing() {
        return fukuanleixing;
    }

    public void setFukuanleixing(String fukuanleixing) {
        this.fukuanleixing = fukuanleixing == null ? null : fukuanleixing.trim();
    }

    public String getGongyingshangmingcheng() {
        return gongyingshangmingcheng;
    }

    public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
        this.gongyingshangmingcheng = gongyingshangmingcheng == null ? null : gongyingshangmingcheng.trim();
    }

    public String getShiyou() {
        return shiyou;
    }

    public void setShiyou(String shiyou) {
        this.shiyou = shiyou == null ? null : shiyou.trim();
    }

    public String getZhifufangshi() {
        return zhifufangshi;
    }

    public void setZhifufangshi(String zhifufangshi) {
        this.zhifufangshi = zhifufangshi == null ? null : zhifufangshi.trim();
    }

    public String getFapiaoxinxi() {
        return fapiaoxinxi;
    }

    public void setFapiaoxinxi(String fapiaoxinxi) {
        this.fapiaoxinxi = fapiaoxinxi == null ? null : fapiaoxinxi.trim();
    }

    public String getFapiaoshuilv() {
        return fapiaoshuilv;
    }

    public void setFapiaoshuilv(String fapiaoshuilv) {
        this.fapiaoshuilv = fapiaoshuilv == null ? null : fapiaoshuilv.trim();
    }

    public Double getHetongzongjine() {
        return hetongzongjine;
    }

    public void setHetongzongjine(Double hetongzongjine) {
        this.hetongzongjine = hetongzongjine;
    }

    public Double getYifukuanjine() {
        return yifukuanjine;
    }

    public void setYifukuanjine(Double yifukuanjine) {
        this.yifukuanjine = yifukuanjine;
    }

    public Date getFukuanriqi() {
        return fukuanriqi;
    }

    public void setFukuanriqi(Date fukuanriqi) {
        this.fukuanriqi = fukuanriqi;
    }

    public Double getRukuzongjine() {
        return rukuzongjine;
    }

    public void setRukuzongjine(Double rukuzongjine) {
        this.rukuzongjine = rukuzongjine;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai == null ? null : zhuangtai.trim();
    }

    public Date getShenqingriqi() {
        return shenqingriqi;
    }

    public void setShenqingriqi(Date shenqingriqi) {
        this.shenqingriqi = shenqingriqi;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen == null ? null : bumen.trim();
    }

    public String getJingbanren() {
        return jingbanren;
    }

    public void setJingbanren(String jingbanren) {
        this.jingbanren = jingbanren == null ? null : jingbanren.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", fukuanleixing=").append(fukuanleixing);
        sb.append(", gongyingshangmingcheng=").append(gongyingshangmingcheng);
        sb.append(", shiyou=").append(shiyou);
        sb.append(", zhifufangshi=").append(zhifufangshi);
        sb.append(", fapiaoxinxi=").append(fapiaoxinxi);
        sb.append(", fapiaoshuilv=").append(fapiaoshuilv);
        sb.append(", hetongzongjine=").append(hetongzongjine);
        sb.append(", yifukuanjine=").append(yifukuanjine);
        sb.append(", fukuanriqi=").append(fukuanriqi);
        sb.append(", rukuzongjine=").append(rukuzongjine);
        sb.append(", zhuangtai=").append(zhuangtai);
        sb.append(", shenqingriqi=").append(shenqingriqi);
        sb.append(", bumen=").append(bumen);
        sb.append(", jingbanren=").append(jingbanren);
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
        public Builder fukuanleixing(String fukuanleixing) {
            obj.fukuanleixing = fukuanleixing;
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
        public Builder shiyou(String shiyou) {
            obj.shiyou = shiyou;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder zhifufangshi(String zhifufangshi) {
            obj.zhifufangshi = zhifufangshi;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder fapiaoxinxi(String fapiaoxinxi) {
            obj.fapiaoxinxi = fapiaoxinxi;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder fapiaoshuilv(String fapiaoshuilv) {
            obj.fapiaoshuilv = fapiaoshuilv;
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
        public Builder fukuanriqi(Date fukuanriqi) {
            obj.fukuanriqi = fukuanriqi;
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
        public Builder zhuangtai(String zhuangtai) {
            obj.zhuangtai = zhuangtai;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder shenqingriqi(Date shenqingriqi) {
            obj.shenqingriqi = shenqingriqi;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder bumen(String bumen) {
            obj.bumen = bumen;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder jingbanren(String jingbanren) {
            obj.jingbanren = jingbanren;
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
        fukuanleixing("fukuanleixing"),
        gongyingshangmingcheng("gongyingshangmingcheng"),
        shiyou("shiyou"),
        zhifufangshi("zhifufangshi"),
        fapiaoxinxi("fapiaoxinxi"),
        fapiaoshuilv("fapiaoshuilv"),
        hetongzongjine("hetongzongjine"),
        yifukuanjine("yifukuanjine"),
        fukuanriqi("fukuanriqi"),
        rukuzongjine("rukuzongjine"),
        zhuangtai("zhuangtai"),
        shenqingriqi("shenqingriqi"),
        bumen("bumen"),
        jingbanren("jingbanren");

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