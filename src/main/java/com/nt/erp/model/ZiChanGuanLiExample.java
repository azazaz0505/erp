package com.nt.erp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZiChanGuanLiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer offset;

    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    protected Integer rows;

    public ZiChanGuanLiExample() {
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
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public ZiChanGuanLiExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public ZiChanGuanLiExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public ZiChanGuanLiExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public ZiChanGuanLiExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    public ZiChanGuanLiExample orderBy(String ... orderByClauses) {
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

        public Criteria andGudingzichanbianaIsNull() {
            addCriterion("gudingzichanbiana is null");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaIsNotNull() {
            addCriterion("gudingzichanbiana is not null");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaEqualTo(String value) {
            addCriterion("gudingzichanbiana =", value, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaNotEqualTo(String value) {
            addCriterion("gudingzichanbiana <>", value, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaGreaterThan(String value) {
            addCriterion("gudingzichanbiana >", value, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaGreaterThanOrEqualTo(String value) {
            addCriterion("gudingzichanbiana >=", value, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaLessThan(String value) {
            addCriterion("gudingzichanbiana <", value, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaLessThanOrEqualTo(String value) {
            addCriterion("gudingzichanbiana <=", value, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaLike(String value) {
            addCriterion("gudingzichanbiana like", value, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaNotLike(String value) {
            addCriterion("gudingzichanbiana not like", value, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaIn(List<String> values) {
            addCriterion("gudingzichanbiana in", values, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaNotIn(List<String> values) {
            addCriterion("gudingzichanbiana not in", values, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaBetween(String value1, String value2) {
            addCriterion("gudingzichanbiana between", value1, value2, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanbianaNotBetween(String value1, String value2) {
            addCriterion("gudingzichanbiana not between", value1, value2, "gudingzichanbiana");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengIsNull() {
            addCriterion("gudingzichanmingcheng is null");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengIsNotNull() {
            addCriterion("gudingzichanmingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengEqualTo(String value) {
            addCriterion("gudingzichanmingcheng =", value, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengNotEqualTo(String value) {
            addCriterion("gudingzichanmingcheng <>", value, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengGreaterThan(String value) {
            addCriterion("gudingzichanmingcheng >", value, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("gudingzichanmingcheng >=", value, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengLessThan(String value) {
            addCriterion("gudingzichanmingcheng <", value, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengLessThanOrEqualTo(String value) {
            addCriterion("gudingzichanmingcheng <=", value, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengLike(String value) {
            addCriterion("gudingzichanmingcheng like", value, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengNotLike(String value) {
            addCriterion("gudingzichanmingcheng not like", value, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengIn(List<String> values) {
            addCriterion("gudingzichanmingcheng in", values, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengNotIn(List<String> values) {
            addCriterion("gudingzichanmingcheng not in", values, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengBetween(String value1, String value2) {
            addCriterion("gudingzichanmingcheng between", value1, value2, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanmingchengNotBetween(String value1, String value2) {
            addCriterion("gudingzichanmingcheng not between", value1, value2, "gudingzichanmingcheng");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingIsNull() {
            addCriterion("gudingzichanleixing is null");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingIsNotNull() {
            addCriterion("gudingzichanleixing is not null");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingEqualTo(String value) {
            addCriterion("gudingzichanleixing =", value, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingNotEqualTo(String value) {
            addCriterion("gudingzichanleixing <>", value, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingGreaterThan(String value) {
            addCriterion("gudingzichanleixing >", value, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingGreaterThanOrEqualTo(String value) {
            addCriterion("gudingzichanleixing >=", value, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingLessThan(String value) {
            addCriterion("gudingzichanleixing <", value, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingLessThanOrEqualTo(String value) {
            addCriterion("gudingzichanleixing <=", value, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingLike(String value) {
            addCriterion("gudingzichanleixing like", value, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingNotLike(String value) {
            addCriterion("gudingzichanleixing not like", value, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingIn(List<String> values) {
            addCriterion("gudingzichanleixing in", values, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingNotIn(List<String> values) {
            addCriterion("gudingzichanleixing not in", values, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingBetween(String value1, String value2) {
            addCriterion("gudingzichanleixing between", value1, value2, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andGudingzichanleixingNotBetween(String value1, String value2) {
            addCriterion("gudingzichanleixing not between", value1, value2, "gudingzichanleixing");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianIsNull() {
            addCriterion("zhejiunianxian is null");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianIsNotNull() {
            addCriterion("zhejiunianxian is not null");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianEqualTo(Date value) {
            addCriterion("zhejiunianxian =", value, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianNotEqualTo(Date value) {
            addCriterion("zhejiunianxian <>", value, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianGreaterThan(Date value) {
            addCriterion("zhejiunianxian >", value, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianGreaterThanOrEqualTo(Date value) {
            addCriterion("zhejiunianxian >=", value, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianLessThan(Date value) {
            addCriterion("zhejiunianxian <", value, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianLessThanOrEqualTo(Date value) {
            addCriterion("zhejiunianxian <=", value, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianIn(List<Date> values) {
            addCriterion("zhejiunianxian in", values, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianNotIn(List<Date> values) {
            addCriterion("zhejiunianxian not in", values, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianBetween(Date value1, Date value2) {
            addCriterion("zhejiunianxian between", value1, value2, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andZhejiunianxianNotBetween(Date value1, Date value2) {
            addCriterion("zhejiunianxian not between", value1, value2, "zhejiunianxian");
            return (Criteria) this;
        }

        public Criteria andYuanzhiIsNull() {
            addCriterion("yuanzhi is null");
            return (Criteria) this;
        }

        public Criteria andYuanzhiIsNotNull() {
            addCriterion("yuanzhi is not null");
            return (Criteria) this;
        }

        public Criteria andYuanzhiEqualTo(String value) {
            addCriterion("yuanzhi =", value, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiNotEqualTo(String value) {
            addCriterion("yuanzhi <>", value, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiGreaterThan(String value) {
            addCriterion("yuanzhi >", value, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiGreaterThanOrEqualTo(String value) {
            addCriterion("yuanzhi >=", value, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiLessThan(String value) {
            addCriterion("yuanzhi <", value, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiLessThanOrEqualTo(String value) {
            addCriterion("yuanzhi <=", value, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiLike(String value) {
            addCriterion("yuanzhi like", value, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiNotLike(String value) {
            addCriterion("yuanzhi not like", value, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiIn(List<String> values) {
            addCriterion("yuanzhi in", values, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiNotIn(List<String> values) {
            addCriterion("yuanzhi not in", values, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiBetween(String value1, String value2) {
            addCriterion("yuanzhi between", value1, value2, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andYuanzhiNotBetween(String value1, String value2) {
            addCriterion("yuanzhi not between", value1, value2, "yuanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiIsNull() {
            addCriterion("jingcanzhi is null");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiIsNotNull() {
            addCriterion("jingcanzhi is not null");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiEqualTo(String value) {
            addCriterion("jingcanzhi =", value, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiNotEqualTo(String value) {
            addCriterion("jingcanzhi <>", value, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiGreaterThan(String value) {
            addCriterion("jingcanzhi >", value, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiGreaterThanOrEqualTo(String value) {
            addCriterion("jingcanzhi >=", value, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiLessThan(String value) {
            addCriterion("jingcanzhi <", value, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiLessThanOrEqualTo(String value) {
            addCriterion("jingcanzhi <=", value, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiLike(String value) {
            addCriterion("jingcanzhi like", value, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiNotLike(String value) {
            addCriterion("jingcanzhi not like", value, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiIn(List<String> values) {
            addCriterion("jingcanzhi in", values, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiNotIn(List<String> values) {
            addCriterion("jingcanzhi not in", values, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiBetween(String value1, String value2) {
            addCriterion("jingcanzhi between", value1, value2, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andJingcanzhiNotBetween(String value1, String value2) {
            addCriterion("jingcanzhi not between", value1, value2, "jingcanzhi");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("operation not between", value1, value2, "operation");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ZiChanGuanLiExample example;

        protected Criteria(ZiChanGuanLiExample example) {
            super();
            this.example = example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public ZiChanGuanLiExample example() {
            return this.example;
        }

        /**
         * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
         * This method corresponds to the database table zichanguanli
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
         * This class corresponds to the database table zichanguanli
         *
         * @mbg.generated
         * @author hewei
         */
        public interface ICriteriaAdd {
            /**
             * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
             * This method corresponds to the database table zichanguanli
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