package com.nt.erp.model;

import java.util.ArrayList;
import java.util.List;

public class GongYingShangWangLaiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer offset;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer rows;

    public GongYingShangWangLaiExample() {
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
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public GongYingShangWangLaiExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public GongYingShangWangLaiExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public GongYingShangWangLaiExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public GongYingShangWangLaiExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    public GongYingShangWangLaiExample orderBy(String ... orderByClauses) {
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

        public Criteria andGongyingshangmingchengIsNull() {
            addCriterion("gongyingshangmingcheng is null");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengIsNotNull() {
            addCriterion("gongyingshangmingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengEqualTo(String value) {
            addCriterion("gongyingshangmingcheng =", value, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengNotEqualTo(String value) {
            addCriterion("gongyingshangmingcheng <>", value, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengGreaterThan(String value) {
            addCriterion("gongyingshangmingcheng >", value, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("gongyingshangmingcheng >=", value, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengLessThan(String value) {
            addCriterion("gongyingshangmingcheng <", value, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengLessThanOrEqualTo(String value) {
            addCriterion("gongyingshangmingcheng <=", value, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengLike(String value) {
            addCriterion("gongyingshangmingcheng like", value, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengNotLike(String value) {
            addCriterion("gongyingshangmingcheng not like", value, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengIn(List<String> values) {
            addCriterion("gongyingshangmingcheng in", values, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengNotIn(List<String> values) {
            addCriterion("gongyingshangmingcheng not in", values, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengBetween(String value1, String value2) {
            addCriterion("gongyingshangmingcheng between", value1, value2, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshangmingchengNotBetween(String value1, String value2) {
            addCriterion("gongyingshangmingcheng not between", value1, value2, "gongyingshangmingcheng");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaIsNull() {
            addCriterion("gongyingshanbianma is null");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaIsNotNull() {
            addCriterion("gongyingshanbianma is not null");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaEqualTo(String value) {
            addCriterion("gongyingshanbianma =", value, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaNotEqualTo(String value) {
            addCriterion("gongyingshanbianma <>", value, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaGreaterThan(String value) {
            addCriterion("gongyingshanbianma >", value, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaGreaterThanOrEqualTo(String value) {
            addCriterion("gongyingshanbianma >=", value, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaLessThan(String value) {
            addCriterion("gongyingshanbianma <", value, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaLessThanOrEqualTo(String value) {
            addCriterion("gongyingshanbianma <=", value, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaLike(String value) {
            addCriterion("gongyingshanbianma like", value, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaNotLike(String value) {
            addCriterion("gongyingshanbianma not like", value, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaIn(List<String> values) {
            addCriterion("gongyingshanbianma in", values, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaNotIn(List<String> values) {
            addCriterion("gongyingshanbianma not in", values, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaBetween(String value1, String value2) {
            addCriterion("gongyingshanbianma between", value1, value2, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andGongyingshanbianmaNotBetween(String value1, String value2) {
            addCriterion("gongyingshanbianma not between", value1, value2, "gongyingshanbianma");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineIsNull() {
            addCriterion("hetongzongjine is null");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineIsNotNull() {
            addCriterion("hetongzongjine is not null");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineEqualTo(Double value) {
            addCriterion("hetongzongjine =", value, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineNotEqualTo(Double value) {
            addCriterion("hetongzongjine <>", value, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineGreaterThan(Double value) {
            addCriterion("hetongzongjine >", value, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineGreaterThanOrEqualTo(Double value) {
            addCriterion("hetongzongjine >=", value, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineLessThan(Double value) {
            addCriterion("hetongzongjine <", value, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineLessThanOrEqualTo(Double value) {
            addCriterion("hetongzongjine <=", value, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineIn(List<Double> values) {
            addCriterion("hetongzongjine in", values, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineNotIn(List<Double> values) {
            addCriterion("hetongzongjine not in", values, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineBetween(Double value1, Double value2) {
            addCriterion("hetongzongjine between", value1, value2, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andHetongzongjineNotBetween(Double value1, Double value2) {
            addCriterion("hetongzongjine not between", value1, value2, "hetongzongjine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineIsNull() {
            addCriterion("yikaipiaojine is null");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineIsNotNull() {
            addCriterion("yikaipiaojine is not null");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineEqualTo(Double value) {
            addCriterion("yikaipiaojine =", value, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineNotEqualTo(Double value) {
            addCriterion("yikaipiaojine <>", value, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineGreaterThan(Double value) {
            addCriterion("yikaipiaojine >", value, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineGreaterThanOrEqualTo(Double value) {
            addCriterion("yikaipiaojine >=", value, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineLessThan(Double value) {
            addCriterion("yikaipiaojine <", value, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineLessThanOrEqualTo(Double value) {
            addCriterion("yikaipiaojine <=", value, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineIn(List<Double> values) {
            addCriterion("yikaipiaojine in", values, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineNotIn(List<Double> values) {
            addCriterion("yikaipiaojine not in", values, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineBetween(Double value1, Double value2) {
            addCriterion("yikaipiaojine between", value1, value2, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYikaipiaojineNotBetween(Double value1, Double value2) {
            addCriterion("yikaipiaojine not between", value1, value2, "yikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineIsNull() {
            addCriterion("weikaipiaojine is null");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineIsNotNull() {
            addCriterion("weikaipiaojine is not null");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineEqualTo(Double value) {
            addCriterion("weikaipiaojine =", value, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineNotEqualTo(Double value) {
            addCriterion("weikaipiaojine <>", value, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineGreaterThan(Double value) {
            addCriterion("weikaipiaojine >", value, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineGreaterThanOrEqualTo(Double value) {
            addCriterion("weikaipiaojine >=", value, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineLessThan(Double value) {
            addCriterion("weikaipiaojine <", value, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineLessThanOrEqualTo(Double value) {
            addCriterion("weikaipiaojine <=", value, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineIn(List<Double> values) {
            addCriterion("weikaipiaojine in", values, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineNotIn(List<Double> values) {
            addCriterion("weikaipiaojine not in", values, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineBetween(Double value1, Double value2) {
            addCriterion("weikaipiaojine between", value1, value2, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andWeikaipiaojineNotBetween(Double value1, Double value2) {
            addCriterion("weikaipiaojine not between", value1, value2, "weikaipiaojine");
            return (Criteria) this;
        }

        public Criteria andYufukuanIsNull() {
            addCriterion("yufukuan is null");
            return (Criteria) this;
        }

        public Criteria andYufukuanIsNotNull() {
            addCriterion("yufukuan is not null");
            return (Criteria) this;
        }

        public Criteria andYufukuanEqualTo(Double value) {
            addCriterion("yufukuan =", value, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanNotEqualTo(Double value) {
            addCriterion("yufukuan <>", value, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanGreaterThan(Double value) {
            addCriterion("yufukuan >", value, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanGreaterThanOrEqualTo(Double value) {
            addCriterion("yufukuan >=", value, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanLessThan(Double value) {
            addCriterion("yufukuan <", value, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanLessThanOrEqualTo(Double value) {
            addCriterion("yufukuan <=", value, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanIn(List<Double> values) {
            addCriterion("yufukuan in", values, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanNotIn(List<Double> values) {
            addCriterion("yufukuan not in", values, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanBetween(Double value1, Double value2) {
            addCriterion("yufukuan between", value1, value2, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYufukuanNotBetween(Double value1, Double value2) {
            addCriterion("yufukuan not between", value1, value2, "yufukuan");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineIsNull() {
            addCriterion("yifukuanjine is null");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineIsNotNull() {
            addCriterion("yifukuanjine is not null");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineEqualTo(Double value) {
            addCriterion("yifukuanjine =", value, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineNotEqualTo(Double value) {
            addCriterion("yifukuanjine <>", value, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineGreaterThan(Double value) {
            addCriterion("yifukuanjine >", value, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineGreaterThanOrEqualTo(Double value) {
            addCriterion("yifukuanjine >=", value, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineLessThan(Double value) {
            addCriterion("yifukuanjine <", value, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineLessThanOrEqualTo(Double value) {
            addCriterion("yifukuanjine <=", value, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineIn(List<Double> values) {
            addCriterion("yifukuanjine in", values, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineNotIn(List<Double> values) {
            addCriterion("yifukuanjine not in", values, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineBetween(Double value1, Double value2) {
            addCriterion("yifukuanjine between", value1, value2, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andYifukuanjineNotBetween(Double value1, Double value2) {
            addCriterion("yifukuanjine not between", value1, value2, "yifukuanjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineIsNull() {
            addCriterion("rukuzongjine is null");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineIsNotNull() {
            addCriterion("rukuzongjine is not null");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineEqualTo(Double value) {
            addCriterion("rukuzongjine =", value, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineNotEqualTo(Double value) {
            addCriterion("rukuzongjine <>", value, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineGreaterThan(Double value) {
            addCriterion("rukuzongjine >", value, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineGreaterThanOrEqualTo(Double value) {
            addCriterion("rukuzongjine >=", value, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineLessThan(Double value) {
            addCriterion("rukuzongjine <", value, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineLessThanOrEqualTo(Double value) {
            addCriterion("rukuzongjine <=", value, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineIn(List<Double> values) {
            addCriterion("rukuzongjine in", values, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineNotIn(List<Double> values) {
            addCriterion("rukuzongjine not in", values, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineBetween(Double value1, Double value2) {
            addCriterion("rukuzongjine between", value1, value2, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andRukuzongjineNotBetween(Double value1, Double value2) {
            addCriterion("rukuzongjine not between", value1, value2, "rukuzongjine");
            return (Criteria) this;
        }

        public Criteria andFukuanIsNull() {
            addCriterion("fukuan is null");
            return (Criteria) this;
        }

        public Criteria andFukuanIsNotNull() {
            addCriterion("fukuan is not null");
            return (Criteria) this;
        }

        public Criteria andFukuanEqualTo(String value) {
            addCriterion("fukuan =", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanNotEqualTo(String value) {
            addCriterion("fukuan <>", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanGreaterThan(String value) {
            addCriterion("fukuan >", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanGreaterThanOrEqualTo(String value) {
            addCriterion("fukuan >=", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanLessThan(String value) {
            addCriterion("fukuan <", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanLessThanOrEqualTo(String value) {
            addCriterion("fukuan <=", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanLike(String value) {
            addCriterion("fukuan like", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanNotLike(String value) {
            addCriterion("fukuan not like", value, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanIn(List<String> values) {
            addCriterion("fukuan in", values, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanNotIn(List<String> values) {
            addCriterion("fukuan not in", values, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanBetween(String value1, String value2) {
            addCriterion("fukuan between", value1, value2, "fukuan");
            return (Criteria) this;
        }

        public Criteria andFukuanNotBetween(String value1, String value2) {
            addCriterion("fukuan not between", value1, value2, "fukuan");
            return (Criteria) this;
        }

        public Criteria andBaobiaoIsNull() {
            addCriterion("baobiao is null");
            return (Criteria) this;
        }

        public Criteria andBaobiaoIsNotNull() {
            addCriterion("baobiao is not null");
            return (Criteria) this;
        }

        public Criteria andBaobiaoEqualTo(String value) {
            addCriterion("baobiao =", value, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoNotEqualTo(String value) {
            addCriterion("baobiao <>", value, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoGreaterThan(String value) {
            addCriterion("baobiao >", value, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoGreaterThanOrEqualTo(String value) {
            addCriterion("baobiao >=", value, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoLessThan(String value) {
            addCriterion("baobiao <", value, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoLessThanOrEqualTo(String value) {
            addCriterion("baobiao <=", value, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoLike(String value) {
            addCriterion("baobiao like", value, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoNotLike(String value) {
            addCriterion("baobiao not like", value, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoIn(List<String> values) {
            addCriterion("baobiao in", values, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoNotIn(List<String> values) {
            addCriterion("baobiao not in", values, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoBetween(String value1, String value2) {
            addCriterion("baobiao between", value1, value2, "baobiao");
            return (Criteria) this;
        }

        public Criteria andBaobiaoNotBetween(String value1, String value2) {
            addCriterion("baobiao not between", value1, value2, "baobiao");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GongYingShangWangLaiExample example;

        protected Criteria(GongYingShangWangLaiExample example) {
            super();
            this.example = example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public GongYingShangWangLaiExample example() {
            return this.example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table gongyingshangwanglai
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
         * This class corresponds to the database table gongyingshangwanglai
         *
         * @mbg.generated
         * @author hewei
         */
        public interface ICriteriaAdd {
            /**
             * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
             * This method corresponds to the database table gongyingshangwanglai
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