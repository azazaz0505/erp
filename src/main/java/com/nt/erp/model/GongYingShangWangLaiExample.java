package com.nt.erp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andFukuanleixingIsNull() {
            addCriterion("fukuanleixing is null");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingIsNotNull() {
            addCriterion("fukuanleixing is not null");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingEqualTo(String value) {
            addCriterion("fukuanleixing =", value, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingNotEqualTo(String value) {
            addCriterion("fukuanleixing <>", value, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingGreaterThan(String value) {
            addCriterion("fukuanleixing >", value, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingGreaterThanOrEqualTo(String value) {
            addCriterion("fukuanleixing >=", value, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingLessThan(String value) {
            addCriterion("fukuanleixing <", value, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingLessThanOrEqualTo(String value) {
            addCriterion("fukuanleixing <=", value, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingLike(String value) {
            addCriterion("fukuanleixing like", value, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingNotLike(String value) {
            addCriterion("fukuanleixing not like", value, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingIn(List<String> values) {
            addCriterion("fukuanleixing in", values, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingNotIn(List<String> values) {
            addCriterion("fukuanleixing not in", values, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingBetween(String value1, String value2) {
            addCriterion("fukuanleixing between", value1, value2, "fukuanleixing");
            return (Criteria) this;
        }

        public Criteria andFukuanleixingNotBetween(String value1, String value2) {
            addCriterion("fukuanleixing not between", value1, value2, "fukuanleixing");
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

        public Criteria andShiyouIsNull() {
            addCriterion("shiyou is null");
            return (Criteria) this;
        }

        public Criteria andShiyouIsNotNull() {
            addCriterion("shiyou is not null");
            return (Criteria) this;
        }

        public Criteria andShiyouEqualTo(String value) {
            addCriterion("shiyou =", value, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouNotEqualTo(String value) {
            addCriterion("shiyou <>", value, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouGreaterThan(String value) {
            addCriterion("shiyou >", value, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouGreaterThanOrEqualTo(String value) {
            addCriterion("shiyou >=", value, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouLessThan(String value) {
            addCriterion("shiyou <", value, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouLessThanOrEqualTo(String value) {
            addCriterion("shiyou <=", value, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouLike(String value) {
            addCriterion("shiyou like", value, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouNotLike(String value) {
            addCriterion("shiyou not like", value, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouIn(List<String> values) {
            addCriterion("shiyou in", values, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouNotIn(List<String> values) {
            addCriterion("shiyou not in", values, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouBetween(String value1, String value2) {
            addCriterion("shiyou between", value1, value2, "shiyou");
            return (Criteria) this;
        }

        public Criteria andShiyouNotBetween(String value1, String value2) {
            addCriterion("shiyou not between", value1, value2, "shiyou");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiIsNull() {
            addCriterion("zhifufangshi is null");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiIsNotNull() {
            addCriterion("zhifufangshi is not null");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiEqualTo(String value) {
            addCriterion("zhifufangshi =", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiNotEqualTo(String value) {
            addCriterion("zhifufangshi <>", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiGreaterThan(String value) {
            addCriterion("zhifufangshi >", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiGreaterThanOrEqualTo(String value) {
            addCriterion("zhifufangshi >=", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiLessThan(String value) {
            addCriterion("zhifufangshi <", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiLessThanOrEqualTo(String value) {
            addCriterion("zhifufangshi <=", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiLike(String value) {
            addCriterion("zhifufangshi like", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiNotLike(String value) {
            addCriterion("zhifufangshi not like", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiIn(List<String> values) {
            addCriterion("zhifufangshi in", values, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiNotIn(List<String> values) {
            addCriterion("zhifufangshi not in", values, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiBetween(String value1, String value2) {
            addCriterion("zhifufangshi between", value1, value2, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiNotBetween(String value1, String value2) {
            addCriterion("zhifufangshi not between", value1, value2, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiIsNull() {
            addCriterion("fapiaoxinxi is null");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiIsNotNull() {
            addCriterion("fapiaoxinxi is not null");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiEqualTo(String value) {
            addCriterion("fapiaoxinxi =", value, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiNotEqualTo(String value) {
            addCriterion("fapiaoxinxi <>", value, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiGreaterThan(String value) {
            addCriterion("fapiaoxinxi >", value, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiGreaterThanOrEqualTo(String value) {
            addCriterion("fapiaoxinxi >=", value, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiLessThan(String value) {
            addCriterion("fapiaoxinxi <", value, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiLessThanOrEqualTo(String value) {
            addCriterion("fapiaoxinxi <=", value, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiLike(String value) {
            addCriterion("fapiaoxinxi like", value, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiNotLike(String value) {
            addCriterion("fapiaoxinxi not like", value, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiIn(List<String> values) {
            addCriterion("fapiaoxinxi in", values, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiNotIn(List<String> values) {
            addCriterion("fapiaoxinxi not in", values, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiBetween(String value1, String value2) {
            addCriterion("fapiaoxinxi between", value1, value2, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoxinxiNotBetween(String value1, String value2) {
            addCriterion("fapiaoxinxi not between", value1, value2, "fapiaoxinxi");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvIsNull() {
            addCriterion("fapiaoshuilv is null");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvIsNotNull() {
            addCriterion("fapiaoshuilv is not null");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvEqualTo(String value) {
            addCriterion("fapiaoshuilv =", value, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvNotEqualTo(String value) {
            addCriterion("fapiaoshuilv <>", value, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvGreaterThan(String value) {
            addCriterion("fapiaoshuilv >", value, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvGreaterThanOrEqualTo(String value) {
            addCriterion("fapiaoshuilv >=", value, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvLessThan(String value) {
            addCriterion("fapiaoshuilv <", value, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvLessThanOrEqualTo(String value) {
            addCriterion("fapiaoshuilv <=", value, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvLike(String value) {
            addCriterion("fapiaoshuilv like", value, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvNotLike(String value) {
            addCriterion("fapiaoshuilv not like", value, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvIn(List<String> values) {
            addCriterion("fapiaoshuilv in", values, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvNotIn(List<String> values) {
            addCriterion("fapiaoshuilv not in", values, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvBetween(String value1, String value2) {
            addCriterion("fapiaoshuilv between", value1, value2, "fapiaoshuilv");
            return (Criteria) this;
        }

        public Criteria andFapiaoshuilvNotBetween(String value1, String value2) {
            addCriterion("fapiaoshuilv not between", value1, value2, "fapiaoshuilv");
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

        public Criteria andFukuanriqiIsNull() {
            addCriterion("fukuanriqi is null");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiIsNotNull() {
            addCriterion("fukuanriqi is not null");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiEqualTo(Date value) {
            addCriterionForJDBCDate("fukuanriqi =", value, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiNotEqualTo(Date value) {
            addCriterionForJDBCDate("fukuanriqi <>", value, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiGreaterThan(Date value) {
            addCriterionForJDBCDate("fukuanriqi >", value, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fukuanriqi >=", value, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiLessThan(Date value) {
            addCriterionForJDBCDate("fukuanriqi <", value, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fukuanriqi <=", value, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiIn(List<Date> values) {
            addCriterionForJDBCDate("fukuanriqi in", values, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiNotIn(List<Date> values) {
            addCriterionForJDBCDate("fukuanriqi not in", values, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fukuanriqi between", value1, value2, "fukuanriqi");
            return (Criteria) this;
        }

        public Criteria andFukuanriqiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fukuanriqi not between", value1, value2, "fukuanriqi");
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

        public Criteria andZhuangtaiIsNull() {
            addCriterion("zhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("zhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(String value) {
            addCriterion("zhuangtai =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(String value) {
            addCriterion("zhuangtai <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(String value) {
            addCriterion("zhuangtai >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("zhuangtai >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(String value) {
            addCriterion("zhuangtai <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("zhuangtai <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLike(String value) {
            addCriterion("zhuangtai like", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotLike(String value) {
            addCriterion("zhuangtai not like", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<String> values) {
            addCriterion("zhuangtai in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<String> values) {
            addCriterion("zhuangtai not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(String value1, String value2) {
            addCriterion("zhuangtai between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(String value1, String value2) {
            addCriterion("zhuangtai not between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiIsNull() {
            addCriterion("shenqingriqi is null");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiIsNotNull() {
            addCriterion("shenqingriqi is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiEqualTo(Date value) {
            addCriterionForJDBCDate("shenqingriqi =", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiNotEqualTo(Date value) {
            addCriterionForJDBCDate("shenqingriqi <>", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiGreaterThan(Date value) {
            addCriterionForJDBCDate("shenqingriqi >", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shenqingriqi >=", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiLessThan(Date value) {
            addCriterionForJDBCDate("shenqingriqi <", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shenqingriqi <=", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiIn(List<Date> values) {
            addCriterionForJDBCDate("shenqingriqi in", values, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiNotIn(List<Date> values) {
            addCriterionForJDBCDate("shenqingriqi not in", values, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shenqingriqi between", value1, value2, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shenqingriqi not between", value1, value2, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andBumenIsNull() {
            addCriterion("bumen is null");
            return (Criteria) this;
        }

        public Criteria andBumenIsNotNull() {
            addCriterion("bumen is not null");
            return (Criteria) this;
        }

        public Criteria andBumenEqualTo(String value) {
            addCriterion("bumen =", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotEqualTo(String value) {
            addCriterion("bumen <>", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThan(String value) {
            addCriterion("bumen >", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThanOrEqualTo(String value) {
            addCriterion("bumen >=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThan(String value) {
            addCriterion("bumen <", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThanOrEqualTo(String value) {
            addCriterion("bumen <=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLike(String value) {
            addCriterion("bumen like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotLike(String value) {
            addCriterion("bumen not like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenIn(List<String> values) {
            addCriterion("bumen in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotIn(List<String> values) {
            addCriterion("bumen not in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenBetween(String value1, String value2) {
            addCriterion("bumen between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotBetween(String value1, String value2) {
            addCriterion("bumen not between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andJingbanrenIsNull() {
            addCriterion("jingbanren is null");
            return (Criteria) this;
        }

        public Criteria andJingbanrenIsNotNull() {
            addCriterion("jingbanren is not null");
            return (Criteria) this;
        }

        public Criteria andJingbanrenEqualTo(String value) {
            addCriterion("jingbanren =", value, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenNotEqualTo(String value) {
            addCriterion("jingbanren <>", value, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenGreaterThan(String value) {
            addCriterion("jingbanren >", value, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenGreaterThanOrEqualTo(String value) {
            addCriterion("jingbanren >=", value, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenLessThan(String value) {
            addCriterion("jingbanren <", value, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenLessThanOrEqualTo(String value) {
            addCriterion("jingbanren <=", value, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenLike(String value) {
            addCriterion("jingbanren like", value, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenNotLike(String value) {
            addCriterion("jingbanren not like", value, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenIn(List<String> values) {
            addCriterion("jingbanren in", values, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenNotIn(List<String> values) {
            addCriterion("jingbanren not in", values, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenBetween(String value1, String value2) {
            addCriterion("jingbanren between", value1, value2, "jingbanren");
            return (Criteria) this;
        }

        public Criteria andJingbanrenNotBetween(String value1, String value2) {
            addCriterion("jingbanren not between", value1, value2, "jingbanren");
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