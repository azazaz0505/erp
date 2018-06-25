package com.nt.erp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer offset;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer rows;

    public InfoExample() {
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
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public InfoExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public InfoExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public InfoExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public InfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    public InfoExample orderBy(String ... orderByClauses) {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftIsNull() {
            addCriterion("totalsizeleft is null");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftIsNotNull() {
            addCriterion("totalsizeleft is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftEqualTo(Integer value) {
            addCriterion("totalsizeleft =", value, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftNotEqualTo(Integer value) {
            addCriterion("totalsizeleft <>", value, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftGreaterThan(Integer value) {
            addCriterion("totalsizeleft >", value, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalsizeleft >=", value, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftLessThan(Integer value) {
            addCriterion("totalsizeleft <", value, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftLessThanOrEqualTo(Integer value) {
            addCriterion("totalsizeleft <=", value, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftIn(List<Integer> values) {
            addCriterion("totalsizeleft in", values, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftNotIn(List<Integer> values) {
            addCriterion("totalsizeleft not in", values, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftBetween(Integer value1, Integer value2) {
            addCriterion("totalsizeleft between", value1, value2, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizeleftNotBetween(Integer value1, Integer value2) {
            addCriterion("totalsizeleft not between", value1, value2, "totalsizeleft");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyIsNull() {
            addCriterion("totalsizemodify is null");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyIsNotNull() {
            addCriterion("totalsizemodify is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyEqualTo(Integer value) {
            addCriterion("totalsizemodify =", value, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyNotEqualTo(Integer value) {
            addCriterion("totalsizemodify <>", value, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyGreaterThan(Integer value) {
            addCriterion("totalsizemodify >", value, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalsizemodify >=", value, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyLessThan(Integer value) {
            addCriterion("totalsizemodify <", value, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyLessThanOrEqualTo(Integer value) {
            addCriterion("totalsizemodify <=", value, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyIn(List<Integer> values) {
            addCriterion("totalsizemodify in", values, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyNotIn(List<Integer> values) {
            addCriterion("totalsizemodify not in", values, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyBetween(Integer value1, Integer value2) {
            addCriterion("totalsizemodify between", value1, value2, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizemodifyNotBetween(Integer value1, Integer value2) {
            addCriterion("totalsizemodify not between", value1, value2, "totalsizemodify");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberIsNull() {
            addCriterion("totalsizenumber is null");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberIsNotNull() {
            addCriterion("totalsizenumber is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberEqualTo(Integer value) {
            addCriterion("totalsizenumber =", value, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberNotEqualTo(Integer value) {
            addCriterion("totalsizenumber <>", value, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberGreaterThan(Integer value) {
            addCriterion("totalsizenumber >", value, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalsizenumber >=", value, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberLessThan(Integer value) {
            addCriterion("totalsizenumber <", value, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberLessThanOrEqualTo(Integer value) {
            addCriterion("totalsizenumber <=", value, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberIn(List<Integer> values) {
            addCriterion("totalsizenumber in", values, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberNotIn(List<Integer> values) {
            addCriterion("totalsizenumber not in", values, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberBetween(Integer value1, Integer value2) {
            addCriterion("totalsizenumber between", value1, value2, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andTotalsizenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("totalsizenumber not between", value1, value2, "totalsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftIsNull() {
            addCriterion("xxxlsizeleft is null");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftIsNotNull() {
            addCriterion("xxxlsizeleft is not null");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftEqualTo(Integer value) {
            addCriterion("xxxlsizeleft =", value, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftNotEqualTo(Integer value) {
            addCriterion("xxxlsizeleft <>", value, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftGreaterThan(Integer value) {
            addCriterion("xxxlsizeleft >", value, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxxlsizeleft >=", value, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftLessThan(Integer value) {
            addCriterion("xxxlsizeleft <", value, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftLessThanOrEqualTo(Integer value) {
            addCriterion("xxxlsizeleft <=", value, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftIn(List<Integer> values) {
            addCriterion("xxxlsizeleft in", values, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftNotIn(List<Integer> values) {
            addCriterion("xxxlsizeleft not in", values, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftBetween(Integer value1, Integer value2) {
            addCriterion("xxxlsizeleft between", value1, value2, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizeleftNotBetween(Integer value1, Integer value2) {
            addCriterion("xxxlsizeleft not between", value1, value2, "xxxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyIsNull() {
            addCriterion("xxxlsizemodify is null");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyIsNotNull() {
            addCriterion("xxxlsizemodify is not null");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyEqualTo(Integer value) {
            addCriterion("xxxlsizemodify =", value, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyNotEqualTo(Integer value) {
            addCriterion("xxxlsizemodify <>", value, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyGreaterThan(Integer value) {
            addCriterion("xxxlsizemodify >", value, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxxlsizemodify >=", value, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyLessThan(Integer value) {
            addCriterion("xxxlsizemodify <", value, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyLessThanOrEqualTo(Integer value) {
            addCriterion("xxxlsizemodify <=", value, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyIn(List<Integer> values) {
            addCriterion("xxxlsizemodify in", values, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyNotIn(List<Integer> values) {
            addCriterion("xxxlsizemodify not in", values, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyBetween(Integer value1, Integer value2) {
            addCriterion("xxxlsizemodify between", value1, value2, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizemodifyNotBetween(Integer value1, Integer value2) {
            addCriterion("xxxlsizemodify not between", value1, value2, "xxxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberIsNull() {
            addCriterion("xxxlsizenumber is null");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberIsNotNull() {
            addCriterion("xxxlsizenumber is not null");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberEqualTo(Integer value) {
            addCriterion("xxxlsizenumber =", value, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberNotEqualTo(Integer value) {
            addCriterion("xxxlsizenumber <>", value, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberGreaterThan(Integer value) {
            addCriterion("xxxlsizenumber >", value, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxxlsizenumber >=", value, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberLessThan(Integer value) {
            addCriterion("xxxlsizenumber <", value, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberLessThanOrEqualTo(Integer value) {
            addCriterion("xxxlsizenumber <=", value, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberIn(List<Integer> values) {
            addCriterion("xxxlsizenumber in", values, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberNotIn(List<Integer> values) {
            addCriterion("xxxlsizenumber not in", values, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberBetween(Integer value1, Integer value2) {
            addCriterion("xxxlsizenumber between", value1, value2, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxxlsizenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("xxxlsizenumber not between", value1, value2, "xxxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftIsNull() {
            addCriterion("xxlsizeleft is null");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftIsNotNull() {
            addCriterion("xxlsizeleft is not null");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftEqualTo(Integer value) {
            addCriterion("xxlsizeleft =", value, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftNotEqualTo(Integer value) {
            addCriterion("xxlsizeleft <>", value, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftGreaterThan(Integer value) {
            addCriterion("xxlsizeleft >", value, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxlsizeleft >=", value, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftLessThan(Integer value) {
            addCriterion("xxlsizeleft <", value, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftLessThanOrEqualTo(Integer value) {
            addCriterion("xxlsizeleft <=", value, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftIn(List<Integer> values) {
            addCriterion("xxlsizeleft in", values, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftNotIn(List<Integer> values) {
            addCriterion("xxlsizeleft not in", values, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftBetween(Integer value1, Integer value2) {
            addCriterion("xxlsizeleft between", value1, value2, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizeleftNotBetween(Integer value1, Integer value2) {
            addCriterion("xxlsizeleft not between", value1, value2, "xxlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyIsNull() {
            addCriterion("xxlsizemodify is null");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyIsNotNull() {
            addCriterion("xxlsizemodify is not null");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyEqualTo(Integer value) {
            addCriterion("xxlsizemodify =", value, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyNotEqualTo(Integer value) {
            addCriterion("xxlsizemodify <>", value, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyGreaterThan(Integer value) {
            addCriterion("xxlsizemodify >", value, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxlsizemodify >=", value, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyLessThan(Integer value) {
            addCriterion("xxlsizemodify <", value, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyLessThanOrEqualTo(Integer value) {
            addCriterion("xxlsizemodify <=", value, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyIn(List<Integer> values) {
            addCriterion("xxlsizemodify in", values, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyNotIn(List<Integer> values) {
            addCriterion("xxlsizemodify not in", values, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyBetween(Integer value1, Integer value2) {
            addCriterion("xxlsizemodify between", value1, value2, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizemodifyNotBetween(Integer value1, Integer value2) {
            addCriterion("xxlsizemodify not between", value1, value2, "xxlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberIsNull() {
            addCriterion("xxlsizenumber is null");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberIsNotNull() {
            addCriterion("xxlsizenumber is not null");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberEqualTo(Integer value) {
            addCriterion("xxlsizenumber =", value, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberNotEqualTo(Integer value) {
            addCriterion("xxlsizenumber <>", value, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberGreaterThan(Integer value) {
            addCriterion("xxlsizenumber >", value, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("xxlsizenumber >=", value, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberLessThan(Integer value) {
            addCriterion("xxlsizenumber <", value, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberLessThanOrEqualTo(Integer value) {
            addCriterion("xxlsizenumber <=", value, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberIn(List<Integer> values) {
            addCriterion("xxlsizenumber in", values, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberNotIn(List<Integer> values) {
            addCriterion("xxlsizenumber not in", values, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberBetween(Integer value1, Integer value2) {
            addCriterion("xxlsizenumber between", value1, value2, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXxlsizenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("xxlsizenumber not between", value1, value2, "xxlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftIsNull() {
            addCriterion("xlsizeleft is null");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftIsNotNull() {
            addCriterion("xlsizeleft is not null");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftEqualTo(Integer value) {
            addCriterion("xlsizeleft =", value, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftNotEqualTo(Integer value) {
            addCriterion("xlsizeleft <>", value, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftGreaterThan(Integer value) {
            addCriterion("xlsizeleft >", value, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("xlsizeleft >=", value, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftLessThan(Integer value) {
            addCriterion("xlsizeleft <", value, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftLessThanOrEqualTo(Integer value) {
            addCriterion("xlsizeleft <=", value, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftIn(List<Integer> values) {
            addCriterion("xlsizeleft in", values, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftNotIn(List<Integer> values) {
            addCriterion("xlsizeleft not in", values, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftBetween(Integer value1, Integer value2) {
            addCriterion("xlsizeleft between", value1, value2, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizeleftNotBetween(Integer value1, Integer value2) {
            addCriterion("xlsizeleft not between", value1, value2, "xlsizeleft");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyIsNull() {
            addCriterion("xlsizemodify is null");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyIsNotNull() {
            addCriterion("xlsizemodify is not null");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyEqualTo(Integer value) {
            addCriterion("xlsizemodify =", value, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyNotEqualTo(Integer value) {
            addCriterion("xlsizemodify <>", value, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyGreaterThan(Integer value) {
            addCriterion("xlsizemodify >", value, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("xlsizemodify >=", value, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyLessThan(Integer value) {
            addCriterion("xlsizemodify <", value, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyLessThanOrEqualTo(Integer value) {
            addCriterion("xlsizemodify <=", value, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyIn(List<Integer> values) {
            addCriterion("xlsizemodify in", values, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyNotIn(List<Integer> values) {
            addCriterion("xlsizemodify not in", values, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyBetween(Integer value1, Integer value2) {
            addCriterion("xlsizemodify between", value1, value2, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizemodifyNotBetween(Integer value1, Integer value2) {
            addCriterion("xlsizemodify not between", value1, value2, "xlsizemodify");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberIsNull() {
            addCriterion("xlsizenumber is null");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberIsNotNull() {
            addCriterion("xlsizenumber is not null");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberEqualTo(Integer value) {
            addCriterion("xlsizenumber =", value, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberNotEqualTo(Integer value) {
            addCriterion("xlsizenumber <>", value, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberGreaterThan(Integer value) {
            addCriterion("xlsizenumber >", value, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("xlsizenumber >=", value, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberLessThan(Integer value) {
            addCriterion("xlsizenumber <", value, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberLessThanOrEqualTo(Integer value) {
            addCriterion("xlsizenumber <=", value, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberIn(List<Integer> values) {
            addCriterion("xlsizenumber in", values, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberNotIn(List<Integer> values) {
            addCriterion("xlsizenumber not in", values, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberBetween(Integer value1, Integer value2) {
            addCriterion("xlsizenumber between", value1, value2, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andXlsizenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("xlsizenumber not between", value1, value2, "xlsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizeleftIsNull() {
            addCriterion("lsizeleft is null");
            return (Criteria) this;
        }

        public Criteria andLsizeleftIsNotNull() {
            addCriterion("lsizeleft is not null");
            return (Criteria) this;
        }

        public Criteria andLsizeleftEqualTo(Integer value) {
            addCriterion("lsizeleft =", value, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftNotEqualTo(Integer value) {
            addCriterion("lsizeleft <>", value, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftGreaterThan(Integer value) {
            addCriterion("lsizeleft >", value, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("lsizeleft >=", value, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftLessThan(Integer value) {
            addCriterion("lsizeleft <", value, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftLessThanOrEqualTo(Integer value) {
            addCriterion("lsizeleft <=", value, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftIn(List<Integer> values) {
            addCriterion("lsizeleft in", values, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftNotIn(List<Integer> values) {
            addCriterion("lsizeleft not in", values, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftBetween(Integer value1, Integer value2) {
            addCriterion("lsizeleft between", value1, value2, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizeleftNotBetween(Integer value1, Integer value2) {
            addCriterion("lsizeleft not between", value1, value2, "lsizeleft");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyIsNull() {
            addCriterion("lsizemodify is null");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyIsNotNull() {
            addCriterion("lsizemodify is not null");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyEqualTo(Integer value) {
            addCriterion("lsizemodify =", value, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyNotEqualTo(Integer value) {
            addCriterion("lsizemodify <>", value, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyGreaterThan(Integer value) {
            addCriterion("lsizemodify >", value, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("lsizemodify >=", value, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyLessThan(Integer value) {
            addCriterion("lsizemodify <", value, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyLessThanOrEqualTo(Integer value) {
            addCriterion("lsizemodify <=", value, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyIn(List<Integer> values) {
            addCriterion("lsizemodify in", values, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyNotIn(List<Integer> values) {
            addCriterion("lsizemodify not in", values, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyBetween(Integer value1, Integer value2) {
            addCriterion("lsizemodify between", value1, value2, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizemodifyNotBetween(Integer value1, Integer value2) {
            addCriterion("lsizemodify not between", value1, value2, "lsizemodify");
            return (Criteria) this;
        }

        public Criteria andLsizenumberIsNull() {
            addCriterion("lsizenumber is null");
            return (Criteria) this;
        }

        public Criteria andLsizenumberIsNotNull() {
            addCriterion("lsizenumber is not null");
            return (Criteria) this;
        }

        public Criteria andLsizenumberEqualTo(Integer value) {
            addCriterion("lsizenumber =", value, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberNotEqualTo(Integer value) {
            addCriterion("lsizenumber <>", value, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberGreaterThan(Integer value) {
            addCriterion("lsizenumber >", value, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("lsizenumber >=", value, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberLessThan(Integer value) {
            addCriterion("lsizenumber <", value, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberLessThanOrEqualTo(Integer value) {
            addCriterion("lsizenumber <=", value, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberIn(List<Integer> values) {
            addCriterion("lsizenumber in", values, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberNotIn(List<Integer> values) {
            addCriterion("lsizenumber not in", values, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberBetween(Integer value1, Integer value2) {
            addCriterion("lsizenumber between", value1, value2, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andLsizenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("lsizenumber not between", value1, value2, "lsizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizeleftIsNull() {
            addCriterion("msizeleft is null");
            return (Criteria) this;
        }

        public Criteria andMsizeleftIsNotNull() {
            addCriterion("msizeleft is not null");
            return (Criteria) this;
        }

        public Criteria andMsizeleftEqualTo(Integer value) {
            addCriterion("msizeleft =", value, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftNotEqualTo(Integer value) {
            addCriterion("msizeleft <>", value, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftGreaterThan(Integer value) {
            addCriterion("msizeleft >", value, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("msizeleft >=", value, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftLessThan(Integer value) {
            addCriterion("msizeleft <", value, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftLessThanOrEqualTo(Integer value) {
            addCriterion("msizeleft <=", value, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftIn(List<Integer> values) {
            addCriterion("msizeleft in", values, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftNotIn(List<Integer> values) {
            addCriterion("msizeleft not in", values, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftBetween(Integer value1, Integer value2) {
            addCriterion("msizeleft between", value1, value2, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizeleftNotBetween(Integer value1, Integer value2) {
            addCriterion("msizeleft not between", value1, value2, "msizeleft");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyIsNull() {
            addCriterion("msizemodify is null");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyIsNotNull() {
            addCriterion("msizemodify is not null");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyEqualTo(Integer value) {
            addCriterion("msizemodify =", value, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyNotEqualTo(Integer value) {
            addCriterion("msizemodify <>", value, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyGreaterThan(Integer value) {
            addCriterion("msizemodify >", value, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("msizemodify >=", value, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyLessThan(Integer value) {
            addCriterion("msizemodify <", value, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyLessThanOrEqualTo(Integer value) {
            addCriterion("msizemodify <=", value, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyIn(List<Integer> values) {
            addCriterion("msizemodify in", values, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyNotIn(List<Integer> values) {
            addCriterion("msizemodify not in", values, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyBetween(Integer value1, Integer value2) {
            addCriterion("msizemodify between", value1, value2, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizemodifyNotBetween(Integer value1, Integer value2) {
            addCriterion("msizemodify not between", value1, value2, "msizemodify");
            return (Criteria) this;
        }

        public Criteria andMsizenumberIsNull() {
            addCriterion("msizenumber is null");
            return (Criteria) this;
        }

        public Criteria andMsizenumberIsNotNull() {
            addCriterion("msizenumber is not null");
            return (Criteria) this;
        }

        public Criteria andMsizenumberEqualTo(Integer value) {
            addCriterion("msizenumber =", value, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberNotEqualTo(Integer value) {
            addCriterion("msizenumber <>", value, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberGreaterThan(Integer value) {
            addCriterion("msizenumber >", value, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("msizenumber >=", value, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberLessThan(Integer value) {
            addCriterion("msizenumber <", value, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberLessThanOrEqualTo(Integer value) {
            addCriterion("msizenumber <=", value, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberIn(List<Integer> values) {
            addCriterion("msizenumber in", values, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberNotIn(List<Integer> values) {
            addCriterion("msizenumber not in", values, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberBetween(Integer value1, Integer value2) {
            addCriterion("msizenumber between", value1, value2, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andMsizenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("msizenumber not between", value1, value2, "msizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizeleftIsNull() {
            addCriterion("ssizeleft is null");
            return (Criteria) this;
        }

        public Criteria andSsizeleftIsNotNull() {
            addCriterion("ssizeleft is not null");
            return (Criteria) this;
        }

        public Criteria andSsizeleftEqualTo(Integer value) {
            addCriterion("ssizeleft =", value, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftNotEqualTo(Integer value) {
            addCriterion("ssizeleft <>", value, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftGreaterThan(Integer value) {
            addCriterion("ssizeleft >", value, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssizeleft >=", value, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftLessThan(Integer value) {
            addCriterion("ssizeleft <", value, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftLessThanOrEqualTo(Integer value) {
            addCriterion("ssizeleft <=", value, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftIn(List<Integer> values) {
            addCriterion("ssizeleft in", values, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftNotIn(List<Integer> values) {
            addCriterion("ssizeleft not in", values, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftBetween(Integer value1, Integer value2) {
            addCriterion("ssizeleft between", value1, value2, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizeleftNotBetween(Integer value1, Integer value2) {
            addCriterion("ssizeleft not between", value1, value2, "ssizeleft");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyIsNull() {
            addCriterion("ssizemodify is null");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyIsNotNull() {
            addCriterion("ssizemodify is not null");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyEqualTo(Integer value) {
            addCriterion("ssizemodify =", value, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyNotEqualTo(Integer value) {
            addCriterion("ssizemodify <>", value, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyGreaterThan(Integer value) {
            addCriterion("ssizemodify >", value, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssizemodify >=", value, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyLessThan(Integer value) {
            addCriterion("ssizemodify <", value, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyLessThanOrEqualTo(Integer value) {
            addCriterion("ssizemodify <=", value, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyIn(List<Integer> values) {
            addCriterion("ssizemodify in", values, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyNotIn(List<Integer> values) {
            addCriterion("ssizemodify not in", values, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyBetween(Integer value1, Integer value2) {
            addCriterion("ssizemodify between", value1, value2, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizemodifyNotBetween(Integer value1, Integer value2) {
            addCriterion("ssizemodify not between", value1, value2, "ssizemodify");
            return (Criteria) this;
        }

        public Criteria andSsizenumberIsNull() {
            addCriterion("ssizenumber is null");
            return (Criteria) this;
        }

        public Criteria andSsizenumberIsNotNull() {
            addCriterion("ssizenumber is not null");
            return (Criteria) this;
        }

        public Criteria andSsizenumberEqualTo(Integer value) {
            addCriterion("ssizenumber =", value, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberNotEqualTo(Integer value) {
            addCriterion("ssizenumber <>", value, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberGreaterThan(Integer value) {
            addCriterion("ssizenumber >", value, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssizenumber >=", value, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberLessThan(Integer value) {
            addCriterion("ssizenumber <", value, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberLessThanOrEqualTo(Integer value) {
            addCriterion("ssizenumber <=", value, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberIn(List<Integer> values) {
            addCriterion("ssizenumber in", values, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberNotIn(List<Integer> values) {
            addCriterion("ssizenumber not in", values, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberBetween(Integer value1, Integer value2) {
            addCriterion("ssizenumber between", value1, value2, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andSsizenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ssizenumber not between", value1, value2, "ssizenumber");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderdate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterionForJDBCDate("orderdate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("orderdate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterionForJDBCDate("orderdate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderdate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterionForJDBCDate("orderdate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderdate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterionForJDBCDate("orderdate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("orderdate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderdate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderdate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andStylenameIsNull() {
            addCriterion("stylename is null");
            return (Criteria) this;
        }

        public Criteria andStylenameIsNotNull() {
            addCriterion("stylename is not null");
            return (Criteria) this;
        }

        public Criteria andStylenameEqualTo(String value) {
            addCriterion("stylename =", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotEqualTo(String value) {
            addCriterion("stylename <>", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameGreaterThan(String value) {
            addCriterion("stylename >", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameGreaterThanOrEqualTo(String value) {
            addCriterion("stylename >=", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLessThan(String value) {
            addCriterion("stylename <", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLessThanOrEqualTo(String value) {
            addCriterion("stylename <=", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLike(String value) {
            addCriterion("stylename like", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotLike(String value) {
            addCriterion("stylename not like", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameIn(List<String> values) {
            addCriterion("stylename in", values, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotIn(List<String> values) {
            addCriterion("stylename not in", values, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameBetween(String value1, String value2) {
            addCriterion("stylename between", value1, value2, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotBetween(String value1, String value2) {
            addCriterion("stylename not between", value1, value2, "stylename");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNull() {
            addCriterion("styleid is null");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNotNull() {
            addCriterion("styleid is not null");
            return (Criteria) this;
        }

        public Criteria andStyleidEqualTo(String value) {
            addCriterion("styleid =", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotEqualTo(String value) {
            addCriterion("styleid <>", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThan(String value) {
            addCriterion("styleid >", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThanOrEqualTo(String value) {
            addCriterion("styleid >=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThan(String value) {
            addCriterion("styleid <", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThanOrEqualTo(String value) {
            addCriterion("styleid <=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLike(String value) {
            addCriterion("styleid like", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotLike(String value) {
            addCriterion("styleid not like", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidIn(List<String> values) {
            addCriterion("styleid in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotIn(List<String> values) {
            addCriterion("styleid not in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidBetween(String value1, String value2) {
            addCriterion("styleid between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotBetween(String value1, String value2) {
            addCriterion("styleid not between", value1, value2, "styleid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private InfoExample example;

        protected Criteria(InfoExample example) {
            super();
            this.example = example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public InfoExample example() {
            return this.example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table infos
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
         * This class corresponds to the database table infos
         *
         * @mbg.generated
         * @author hewei
         */
        public interface ICriteriaAdd {
            /**
             * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
             * This method corresponds to the database table infos
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