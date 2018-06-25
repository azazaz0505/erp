package com.nt.erp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MianLiaoRuKuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer offset;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer rows;

    public MianLiaoRuKuExample() {
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
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoRuKuExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoRuKuExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoRuKuExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoRuKuExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    public MianLiaoRuKuExample orderBy(String ... orderByClauses) {
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

        public Criteria andRukudanhaoIsNull() {
            addCriterion("rukudanhao is null");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoIsNotNull() {
            addCriterion("rukudanhao is not null");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoEqualTo(Integer value) {
            addCriterion("rukudanhao =", value, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoNotEqualTo(Integer value) {
            addCriterion("rukudanhao <>", value, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoGreaterThan(Integer value) {
            addCriterion("rukudanhao >", value, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rukudanhao >=", value, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoLessThan(Integer value) {
            addCriterion("rukudanhao <", value, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoLessThanOrEqualTo(Integer value) {
            addCriterion("rukudanhao <=", value, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoIn(List<Integer> values) {
            addCriterion("rukudanhao in", values, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoNotIn(List<Integer> values) {
            addCriterion("rukudanhao not in", values, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoBetween(Integer value1, Integer value2) {
            addCriterion("rukudanhao between", value1, value2, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andRukudanhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("rukudanhao not between", value1, value2, "rukudanhao");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuIsNull() {
            addCriterion("shouhuocangku is null");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuIsNotNull() {
            addCriterion("shouhuocangku is not null");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuEqualTo(String value) {
            addCriterion("shouhuocangku =", value, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuNotEqualTo(String value) {
            addCriterion("shouhuocangku <>", value, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuGreaterThan(String value) {
            addCriterion("shouhuocangku >", value, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuGreaterThanOrEqualTo(String value) {
            addCriterion("shouhuocangku >=", value, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuLessThan(String value) {
            addCriterion("shouhuocangku <", value, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuLessThanOrEqualTo(String value) {
            addCriterion("shouhuocangku <=", value, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuLike(String value) {
            addCriterion("shouhuocangku like", value, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuNotLike(String value) {
            addCriterion("shouhuocangku not like", value, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuIn(List<String> values) {
            addCriterion("shouhuocangku in", values, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuNotIn(List<String> values) {
            addCriterion("shouhuocangku not in", values, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuBetween(String value1, String value2) {
            addCriterion("shouhuocangku between", value1, value2, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andShouhuocangkuNotBetween(String value1, String value2) {
            addCriterion("shouhuocangku not between", value1, value2, "shouhuocangku");
            return (Criteria) this;
        }

        public Criteria andRukufangshiIsNull() {
            addCriterion("rukufangshi is null");
            return (Criteria) this;
        }

        public Criteria andRukufangshiIsNotNull() {
            addCriterion("rukufangshi is not null");
            return (Criteria) this;
        }

        public Criteria andRukufangshiEqualTo(String value) {
            addCriterion("rukufangshi =", value, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiNotEqualTo(String value) {
            addCriterion("rukufangshi <>", value, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiGreaterThan(String value) {
            addCriterion("rukufangshi >", value, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiGreaterThanOrEqualTo(String value) {
            addCriterion("rukufangshi >=", value, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiLessThan(String value) {
            addCriterion("rukufangshi <", value, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiLessThanOrEqualTo(String value) {
            addCriterion("rukufangshi <=", value, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiLike(String value) {
            addCriterion("rukufangshi like", value, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiNotLike(String value) {
            addCriterion("rukufangshi not like", value, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiIn(List<String> values) {
            addCriterion("rukufangshi in", values, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiNotIn(List<String> values) {
            addCriterion("rukufangshi not in", values, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiBetween(String value1, String value2) {
            addCriterion("rukufangshi between", value1, value2, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRukufangshiNotBetween(String value1, String value2) {
            addCriterion("rukufangshi not between", value1, value2, "rukufangshi");
            return (Criteria) this;
        }

        public Criteria andRikushijianIsNull() {
            addCriterion("rikushijian is null");
            return (Criteria) this;
        }

        public Criteria andRikushijianIsNotNull() {
            addCriterion("rikushijian is not null");
            return (Criteria) this;
        }

        public Criteria andRikushijianEqualTo(Date value) {
            addCriterion("rikushijian =", value, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianNotEqualTo(Date value) {
            addCriterion("rikushijian <>", value, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianGreaterThan(Date value) {
            addCriterion("rikushijian >", value, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("rikushijian >=", value, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianLessThan(Date value) {
            addCriterion("rikushijian <", value, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianLessThanOrEqualTo(Date value) {
            addCriterion("rikushijian <=", value, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianIn(List<Date> values) {
            addCriterion("rikushijian in", values, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianNotIn(List<Date> values) {
            addCriterion("rikushijian not in", values, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianBetween(Date value1, Date value2) {
            addCriterion("rikushijian between", value1, value2, "rikushijian");
            return (Criteria) this;
        }

        public Criteria andRikushijianNotBetween(Date value1, Date value2) {
            addCriterion("rikushijian not between", value1, value2, "rikushijian");
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
        private MianLiaoRuKuExample example;

        protected Criteria(MianLiaoRuKuExample example) {
            super();
            this.example = example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public MianLiaoRuKuExample example() {
            return this.example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table mianliaoruku
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
         * This class corresponds to the database table mianliaoruku
         *
         * @mbg.generated
         * @author hewei
         */
        public interface ICriteriaAdd {
            /**
             * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
             * This method corresponds to the database table mianliaoruku
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