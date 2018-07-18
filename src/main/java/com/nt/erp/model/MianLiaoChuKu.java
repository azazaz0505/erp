package com.nt.erp.model;

import java.util.Date;

public class MianLiaoChuKu {
    private Integer uuid;

    private Integer chukudanhao;

    private String chuhuocangku;

    private String chukufangshi;

    private Date chukushijian;

    private String beizhu;

    private String opration;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getChukudanhao() {
        return chukudanhao;
    }

    public void setChukudanhao(Integer chukudanhao) {
        this.chukudanhao = chukudanhao;
    }

    public String getChuhuocangku() {
        return chuhuocangku;
    }

    public void setChuhuocangku(String chuhuocangku) {
        this.chuhuocangku = chuhuocangku == null ? null : chuhuocangku.trim();
    }

    public String getChukufangshi() {
        return chukufangshi;
    }

    public void setChukufangshi(String chukufangshi) {
        this.chukufangshi = chukufangshi == null ? null : chukufangshi.trim();
    }

    public Date getChukushijian() {
        return chukushijian;
    }

    public void setChukushijian(Date chukushijian) {
        this.chukushijian = chukushijian;
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
        sb.append(", chukudanhao=").append(chukudanhao);
        sb.append(", chuhuocangku=").append(chuhuocangku);
        sb.append(", chukufangshi=").append(chukufangshi);
        sb.append(", chukushijian=").append(chukushijian);
        sb.append(", beizhu=").append(beizhu);
        sb.append(", opration=").append(opration);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 这是Mybatis Generator拓展插件生成的类(请勿删除).
     * This class corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public static class Builder {
        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        private MianLiaoChuKu obj;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder() {
            this.obj = new MianLiaoChuKu();
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
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
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder chukudanhao(Integer chukudanhao) {
            obj.chukudanhao = chukudanhao;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder chuhuocangku(String chuhuocangku) {
            obj.chuhuocangku = chuhuocangku;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder chukufangshi(String chukufangshi) {
            obj.chukufangshi = chukufangshi;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder chukushijian(Date chukushijian) {
            obj.chukushijian = chukushijian;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
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
         * This method corresponds to the database table mianliaochuku
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
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public MianLiaoChuKu build() {
            return this.obj;
        }
    }

    /**
     * 这是Mybatis Generator拓展插件生成的枚举(请勿删除).
     * This class corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public enum Column {
        uuid("uuid"),
        chukudanhao("chukudanhao"),
        chuhuocangku("chuhuocangku"),
        chukufangshi("chukufangshi"),
        chukushijian("chukushijian"),
        beizhu("beizhu"),
        opration("opration");

        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        private final String column;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public String value() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public String getValue() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}