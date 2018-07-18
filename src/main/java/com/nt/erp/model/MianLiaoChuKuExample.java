package com.nt.erp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MianLiaoChuKuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer offset;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer rows;

    public MianLiaoChuKuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoChuKuExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoChuKuExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoChuKuExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoChuKuExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoChuKuExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Integer value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Integer value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Integer value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Integer value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Integer value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Integer> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Integer> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Integer value1, Integer value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoIsNull() {
            addCriterion("chukudanhao is null");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoIsNotNull() {
            addCriterion("chukudanhao is not null");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoEqualTo(Integer value) {
            addCriterion("chukudanhao =", value, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoNotEqualTo(Integer value) {
            addCriterion("chukudanhao <>", value, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoGreaterThan(Integer value) {
            addCriterion("chukudanhao >", value, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("chukudanhao >=", value, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoLessThan(Integer value) {
            addCriterion("chukudanhao <", value, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoLessThanOrEqualTo(Integer value) {
            addCriterion("chukudanhao <=", value, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoIn(List<Integer> values) {
            addCriterion("chukudanhao in", values, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoNotIn(List<Integer> values) {
            addCriterion("chukudanhao not in", values, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoBetween(Integer value1, Integer value2) {
            addCriterion("chukudanhao between", value1, value2, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChukudanhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("chukudanhao not between", value1, value2, "chukudanhao");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuIsNull() {
            addCriterion("chuhuocangku is null");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuIsNotNull() {
            addCriterion("chuhuocangku is not null");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuEqualTo(String value) {
            addCriterion("chuhuocangku =", value, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuNotEqualTo(String value) {
            addCriterion("chuhuocangku <>", value, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuGreaterThan(String value) {
            addCriterion("chuhuocangku >", value, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuGreaterThanOrEqualTo(String value) {
            addCriterion("chuhuocangku >=", value, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuLessThan(String value) {
            addCriterion("chuhuocangku <", value, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuLessThanOrEqualTo(String value) {
            addCriterion("chuhuocangku <=", value, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuLike(String value) {
            addCriterion("chuhuocangku like", value, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuNotLike(String value) {
            addCriterion("chuhuocangku not like", value, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuIn(List<String> values) {
            addCriterion("chuhuocangku in", values, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuNotIn(List<String> values) {
            addCriterion("chuhuocangku not in", values, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuBetween(String value1, String value2) {
            addCriterion("chuhuocangku between", value1, value2, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChuhuocangkuNotBetween(String value1, String value2) {
            addCriterion("chuhuocangku not between", value1, value2, "chuhuocangku");
            return (Criteria) this;
        }

        public Criteria andChukufangshiIsNull() {
            addCriterion("chukufangshi is null");
            return (Criteria) this;
        }

        public Criteria andChukufangshiIsNotNull() {
            addCriterion("chukufangshi is not null");
            return (Criteria) this;
        }

        public Criteria andChukufangshiEqualTo(String value) {
            addCriterion("chukufangshi =", value, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiNotEqualTo(String value) {
            addCriterion("chukufangshi <>", value, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiGreaterThan(String value) {
            addCriterion("chukufangshi >", value, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiGreaterThanOrEqualTo(String value) {
            addCriterion("chukufangshi >=", value, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiLessThan(String value) {
            addCriterion("chukufangshi <", value, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiLessThanOrEqualTo(String value) {
            addCriterion("chukufangshi <=", value, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiLike(String value) {
            addCriterion("chukufangshi like", value, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiNotLike(String value) {
            addCriterion("chukufangshi not like", value, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiIn(List<String> values) {
            addCriterion("chukufangshi in", values, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiNotIn(List<String> values) {
            addCriterion("chukufangshi not in", values, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiBetween(String value1, String value2) {
            addCriterion("chukufangshi between", value1, value2, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukufangshiNotBetween(String value1, String value2) {
            addCriterion("chukufangshi not between", value1, value2, "chukufangshi");
            return (Criteria) this;
        }

        public Criteria andChukushijianIsNull() {
            addCriterion("chukushijian is null");
            return (Criteria) this;
        }

        public Criteria andChukushijianIsNotNull() {
            addCriterion("chukushijian is not null");
            return (Criteria) this;
        }

        public Criteria andChukushijianEqualTo(Date value) {
            addCriterion("chukushijian =", value, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianNotEqualTo(Date value) {
            addCriterion("chukushijian <>", value, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianGreaterThan(Date value) {
            addCriterion("chukushijian >", value, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("chukushijian >=", value, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianLessThan(Date value) {
            addCriterion("chukushijian <", value, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianLessThanOrEqualTo(Date value) {
            addCriterion("chukushijian <=", value, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianIn(List<Date> values) {
            addCriterion("chukushijian in", values, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianNotIn(List<Date> values) {
            addCriterion("chukushijian not in", values, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianBetween(Date value1, Date value2) {
            addCriterion("chukushijian between", value1, value2, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andChukushijianNotBetween(Date value1, Date value2) {
            addCriterion("chukushijian not between", value1, value2, "chukushijian");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andOprationIsNull() {
            addCriterion("opration is null");
            return (Criteria) this;
        }

        public Criteria andOprationIsNotNull() {
            addCriterion("opration is not null");
            return (Criteria) this;
        }

        public Criteria andOprationEqualTo(String value) {
            addCriterion("opration =", value, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationNotEqualTo(String value) {
            addCriterion("opration <>", value, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationGreaterThan(String value) {
            addCriterion("opration >", value, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationGreaterThanOrEqualTo(String value) {
            addCriterion("opration >=", value, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationLessThan(String value) {
            addCriterion("opration <", value, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationLessThanOrEqualTo(String value) {
            addCriterion("opration <=", value, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationLike(String value) {
            addCriterion("opration like", value, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationNotLike(String value) {
            addCriterion("opration not like", value, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationIn(List<String> values) {
            addCriterion("opration in", values, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationNotIn(List<String> values) {
            addCriterion("opration not in", values, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationBetween(String value1, String value2) {
            addCriterion("opration between", value1, value2, "opration");
            return (Criteria) this;
        }

        public Criteria andOprationNotBetween(String value1, String value2) {
            addCriterion("opration not between", value1, value2, "opration");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private MianLiaoChuKuExample example;

        protected Criteria(MianLiaoChuKuExample example) {
            super();
            this.example = example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public MianLiaoChuKuExample example() {
            return this.example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的接口(请勿删除).
         * This class corresponds to the database table mianliaochuku
         *
         * @mbg.generated
         * @author hewei
         */
        public interface ICriteriaAdd {
            /**
             * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
             * This method corresponds to the database table mianliaochuku
             *
             * @mbg.generated
             * @author hewei
             */
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}