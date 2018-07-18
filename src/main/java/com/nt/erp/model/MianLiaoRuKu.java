package com.nt.erp.model;

import java.util.Date;

public class MianLiaoRuKu {
    private Integer uuid;

    private Integer rukudanhao;

    private String shouhuocangku;

    private String rukufangshi;

    private Date rikushijian;

    private String beizhu;

    private String opration;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getRukudanhao() {
        return rukudanhao;
    }

    public void setRukudanhao(Integer rukudanhao) {
        this.rukudanhao = rukudanhao;
    }

    public String getShouhuocangku() {
        return shouhuocangku;
    }

    public void setShouhuocangku(String shouhuocangku) {
        this.shouhuocangku = shouhuocangku == null ? null : shouhuocangku.trim();
    }

    public String getRukufangshi() {
        return rukufangshi;
    }

    public void setRukufangshi(String rukufangshi) {
        this.rukufangshi = rukufangshi == null ? null : rukufangshi.trim();
    }

    public Date getRikushijian() {
        return rikushijian;
    }

    public void setRikushijian(Date rikushijian) {
        this.rikushijian = rikushijian;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getOpration() {
        return opration;
    }

    public void setOpration(String opration) {
        this.opration = opration == null ? null : opration.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", rukudanhao=").append(rukudanhao);
        sb.append(", shouhuocangku=").append(shouhuocangku);
        sb.append(", rukufangshi=").append(rukufangshi);
        sb.append(", rikushijian=").append(rikushijian);
        sb.append(", beizhu=").append(beizhu);
        sb.append(", opration=").append(opration);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 这是Mybatis Generator拓展插件生成的类(请勿删除).
     * This class corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public static class Builder {
        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        private MianLiaoRuKu obj;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder() {
            this.obj = new MianLiaoRuKu();
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
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
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder rukudanhao(Integer rukudanhao) {
            obj.rukudanhao = rukudanhao;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder shouhuocangku(String shouhuocangku) {
            obj.shouhuocangku = shouhuocangku;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder rukufangshi(String rukufangshi) {
            obj.rukufangshi = rukufangshi;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder rikushijian(Date rikushijian) {
            obj.rikushijian = rikushijian;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder beizhu(String beizhu) {
            obj.beizhu = beizhu;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder opration(String opration) {
            obj.opration = opration;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public MianLiaoRuKu build() {
            return this.obj;
        }
    }

    /**
     * 这是Mybatis Generator拓展插件生成的枚举(请勿删除).
     * This class corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public enum Column {
        uuid("uuid"),
        rukudanhao("rukudanhao"),
        shouhuocangku("shouhuocangku"),
        rukufangshi("rukufangshi"),
        rikushijian("rikushijian"),
        beizhu("beizhu"),
        opration("opration");

        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        private final String column;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public String value() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public String getValue() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}