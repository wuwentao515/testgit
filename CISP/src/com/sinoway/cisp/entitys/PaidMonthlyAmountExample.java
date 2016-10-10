package com.sinoway.cisp.entitys;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaidMonthlyAmountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaidMonthlyAmountExample() {
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
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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

        public Criteria andSinoidIsNull() {
            addCriterion("sinoid is null");
            return (Criteria) this;
        }

        public Criteria andSinoidIsNotNull() {
            addCriterion("sinoid is not null");
            return (Criteria) this;
        }

        public Criteria andSinoidEqualTo(String value) {
            addCriterion("sinoid =", value, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidNotEqualTo(String value) {
            addCriterion("sinoid <>", value, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidGreaterThan(String value) {
            addCriterion("sinoid >", value, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidGreaterThanOrEqualTo(String value) {
            addCriterion("sinoid >=", value, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidLessThan(String value) {
            addCriterion("sinoid <", value, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidLessThanOrEqualTo(String value) {
            addCriterion("sinoid <=", value, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidLike(String value) {
            addCriterion("sinoid like", value, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidNotLike(String value) {
            addCriterion("sinoid not like", value, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidIn(List<String> values) {
            addCriterion("sinoid in", values, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidNotIn(List<String> values) {
            addCriterion("sinoid not in", values, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidBetween(String value1, String value2) {
            addCriterion("sinoid between", value1, value2, "sinoid");
            return (Criteria) this;
        }

        public Criteria andSinoidNotBetween(String value1, String value2) {
            addCriterion("sinoid not between", value1, value2, "sinoid");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberIsNull() {
            addCriterion("paymentNumber is null");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberIsNotNull() {
            addCriterion("paymentNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberEqualTo(Integer value) {
            addCriterion("paymentNumber =", value, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberNotEqualTo(Integer value) {
            addCriterion("paymentNumber <>", value, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberGreaterThan(Integer value) {
            addCriterion("paymentNumber >", value, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentNumber >=", value, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberLessThan(Integer value) {
            addCriterion("paymentNumber <", value, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberLessThanOrEqualTo(Integer value) {
            addCriterion("paymentNumber <=", value, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberIn(List<Integer> values) {
            addCriterion("paymentNumber in", values, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberNotIn(List<Integer> values) {
            addCriterion("paymentNumber not in", values, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberBetween(Integer value1, Integer value2) {
            addCriterion("paymentNumber between", value1, value2, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaymentnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentNumber not between", value1, value2, "paymentnumber");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyIsNull() {
            addCriterion("paid_money is null");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyIsNotNull() {
            addCriterion("paid_money is not null");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyEqualTo(BigDecimal value) {
            addCriterion("paid_money =", value, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyNotEqualTo(BigDecimal value) {
            addCriterion("paid_money <>", value, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyGreaterThan(BigDecimal value) {
            addCriterion("paid_money >", value, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_money >=", value, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyLessThan(BigDecimal value) {
            addCriterion("paid_money <", value, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_money <=", value, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyIn(List<BigDecimal> values) {
            addCriterion("paid_money in", values, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyNotIn(List<BigDecimal> values) {
            addCriterion("paid_money not in", values, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_money between", value1, value2, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_money not between", value1, value2, "paidMoney");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNull() {
            addCriterion("paid_time is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNotNull() {
            addCriterion("paid_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualTo(Date value) {
            addCriterion("paid_time =", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualTo(Date value) {
            addCriterion("paid_time <>", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThan(Date value) {
            addCriterion("paid_time >", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paid_time >=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThan(Date value) {
            addCriterion("paid_time <", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualTo(Date value) {
            addCriterion("paid_time <=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIn(List<Date> values) {
            addCriterion("paid_time in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotIn(List<Date> values) {
            addCriterion("paid_time not in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeBetween(Date value1, Date value2) {
            addCriterion("paid_time between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotBetween(Date value1, Date value2) {
            addCriterion("paid_time not between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andSinotimeIsNull() {
            addCriterion("sinotime is null");
            return (Criteria) this;
        }

        public Criteria andSinotimeIsNotNull() {
            addCriterion("sinotime is not null");
            return (Criteria) this;
        }

        public Criteria andSinotimeEqualTo(Date value) {
            addCriterion("sinotime =", value, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeNotEqualTo(Date value) {
            addCriterion("sinotime <>", value, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeGreaterThan(Date value) {
            addCriterion("sinotime >", value, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sinotime >=", value, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeLessThan(Date value) {
            addCriterion("sinotime <", value, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeLessThanOrEqualTo(Date value) {
            addCriterion("sinotime <=", value, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeIn(List<Date> values) {
            addCriterion("sinotime in", values, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeNotIn(List<Date> values) {
            addCriterion("sinotime not in", values, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeBetween(Date value1, Date value2) {
            addCriterion("sinotime between", value1, value2, "sinotime");
            return (Criteria) this;
        }

        public Criteria andSinotimeNotBetween(Date value1, Date value2) {
            addCriterion("sinotime not between", value1, value2, "sinotime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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