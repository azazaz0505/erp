package com.nt.erp.model;

import java.util.ArrayList;
import java.util.List;

public class LoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer offset;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer rows;

    public LoginExample() {
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
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public LoginExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public LoginExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public LoginExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public LoginExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    public LoginExample orderBy(String ... orderByClauses) {
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

        public Criteria andLoginaccountIsNull() {
            addCriterion("loginaccount is null");
            return (Criteria) this;
        }

        public Criteria andLoginaccountIsNotNull() {
            addCriterion("loginaccount is not null");
            return (Criteria) this;
        }

        public Criteria andLoginaccountEqualTo(String value) {
            addCriterion("loginaccount =", value, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountNotEqualTo(String value) {
            addCriterion("loginaccount <>", value, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountGreaterThan(String value) {
            addCriterion("loginaccount >", value, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountGreaterThanOrEqualTo(String value) {
            addCriterion("loginaccount >=", value, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountLessThan(String value) {
            addCriterion("loginaccount <", value, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountLessThanOrEqualTo(String value) {
            addCriterion("loginaccount <=", value, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountLike(String value) {
            addCriterion("loginaccount like", value, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountNotLike(String value) {
            addCriterion("loginaccount not like", value, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountIn(List<String> values) {
            addCriterion("loginaccount in", values, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountNotIn(List<String> values) {
            addCriterion("loginaccount not in", values, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountBetween(String value1, String value2) {
            addCriterion("loginaccount between", value1, value2, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginaccountNotBetween(String value1, String value2) {
            addCriterion("loginaccount not between", value1, value2, "loginaccount");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdIsNull() {
            addCriterion("loginpasswd is null");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdIsNotNull() {
            addCriterion("loginpasswd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdEqualTo(String value) {
            addCriterion("loginpasswd =", value, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdNotEqualTo(String value) {
            addCriterion("loginpasswd <>", value, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdGreaterThan(String value) {
            addCriterion("loginpasswd >", value, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdGreaterThanOrEqualTo(String value) {
            addCriterion("loginpasswd >=", value, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdLessThan(String value) {
            addCriterion("loginpasswd <", value, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdLessThanOrEqualTo(String value) {
            addCriterion("loginpasswd <=", value, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdLike(String value) {
            addCriterion("loginpasswd like", value, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdNotLike(String value) {
            addCriterion("loginpasswd not like", value, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdIn(List<String> values) {
            addCriterion("loginpasswd in", values, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdNotIn(List<String> values) {
            addCriterion("loginpasswd not in", values, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdBetween(String value1, String value2) {
            addCriterion("loginpasswd between", value1, value2, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginpasswdNotBetween(String value1, String value2) {
            addCriterion("loginpasswd not between", value1, value2, "loginpasswd");
            return (Criteria) this;
        }

        public Criteria andLoginUuidIsNull() {
            addCriterion("login_uuid is null");
            return (Criteria) this;
        }

        public Criteria andLoginUuidIsNotNull() {
            addCriterion("login_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUuidEqualTo(String value) {
            addCriterion("login_uuid =", value, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidNotEqualTo(String value) {
            addCriterion("login_uuid <>", value, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidGreaterThan(String value) {
            addCriterion("login_uuid >", value, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidGreaterThanOrEqualTo(String value) {
            addCriterion("login_uuid >=", value, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidLessThan(String value) {
            addCriterion("login_uuid <", value, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidLessThanOrEqualTo(String value) {
            addCriterion("login_uuid <=", value, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidLike(String value) {
            addCriterion("login_uuid like", value, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidNotLike(String value) {
            addCriterion("login_uuid not like", value, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidIn(List<String> values) {
            addCriterion("login_uuid in", values, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidNotIn(List<String> values) {
            addCriterion("login_uuid not in", values, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidBetween(String value1, String value2) {
            addCriterion("login_uuid between", value1, value2, "loginUuid");
            return (Criteria) this;
        }

        public Criteria andLoginUuidNotBetween(String value1, String value2) {
            addCriterion("login_uuid not between", value1, value2, "loginUuid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private LoginExample example;

        protected Criteria(LoginExample example) {
            super();
            this.example = example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public LoginExample example() {
            return this.example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table login
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
         * This class corresponds to the database table login
         *
         * @mbg.generated
         * @author hewei
         */
        public interface ICriteriaAdd {
            /**
             * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
             * This method corresponds to the database table login
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