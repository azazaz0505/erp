package com.nt.erp.model;

public class KuWeiGuanLi {
    private Integer uuid;

    private String address;

    private String name;

    private String level;

    private String capacity;

    private String operation;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity == null ? null : capacity.trim();
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
        sb.append(", address=").append(address);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", capacity=").append(capacity);
        sb.append(", operation=").append(operation);
        sb.append("]");
        return sb.toString();
    }

    /**
     * 这是Mybatis Generator拓展插件生成的类(请勿删除).
     * This class corresponds to the database table kuweiguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public static class Builder {
        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        private KuWeiGuanLi obj;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder() {
            this.obj = new KuWeiGuanLi();
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
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
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder address(String address) {
            obj.address = address;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder name(String name) {
            obj.name = name;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder level(String level) {
            obj.level = level;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public Builder capacity(String capacity) {
            obj.capacity = capacity;
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
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
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public KuWeiGuanLi build() {
            return this.obj;
        }
    }

    /**
     * 这是Mybatis Generator拓展插件生成的枚举(请勿删除).
     * This class corresponds to the database table kuweiguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public enum Column {
        uuid("uuid"),
        address("address"),
        name("name"),
        level("level"),
        capacity("capacity"),
        operation("operation");

        /**
         * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
         * This field corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        private final String column;

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public String value() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public String getValue() {
            return this.column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table kuweiguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}