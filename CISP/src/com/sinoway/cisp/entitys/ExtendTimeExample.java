package com.sinoway.cisp.entitys;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExtendTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtendTimeExample() {
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

        public Criteria andExtendLimitTimeIsNull() {
            addCriterion("extend_limit_time is null");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeIsNotNull() {
            addCriterion("extend_limit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeEqualTo(Date value) {
            addCriterion("extend_limit_time =", value, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeNotEqualTo(Date value) {
            addCriterion("extend_limit_time <>", value, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeGreaterThan(Date value) {
            addCriterion("extend_limit_time >", value, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("extend_limit_time >=", value, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeLessThan(Date value) {
            addCriterion("extend_limit_time <", value, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeLessThanOrEqualTo(Date value) {
            addCriterion("extend_limit_time <=", value, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeIn(List<Date> values) {
            addCriterion("extend_limit_time in", values, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeNotIn(List<Date> values) {
            addCriterion("extend_limit_time not in", values, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeBetween(Date value1, Date value2) {
            addCriterion("extend_limit_time between", value1, value2, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andExtendLimitTimeNotBetween(Date value1, Date value2) {
            addCriterion("extend_limit_time not between", value1, value2, "extendLimitTime");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidIsNull() {
            addCriterion("whole_not_paid is null");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidIsNotNull() {
            addCriterion("whole_not_paid is not null");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidEqualTo(BigDecimal value) {
            addCriterion("whole_not_paid =", value, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidNotEqualTo(BigDecimal value) {
            addCriterion("whole_not_paid <>", value, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidGreaterThan(BigDecimal value) {
            addCriterion("whole_not_paid >", value, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("whole_not_paid >=", value, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidLessThan(BigDecimal value) {
            addCriterion("whole_not_paid <", value, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("whole_not_paid <=", value, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidIn(List<BigDecimal> values) {
            addCriterion("whole_not_paid in", values, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidNotIn(List<BigDecimal> values) {
            addCriterion("whole_not_paid not in", values, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("whole_not_paid between", value1, value2, "wholeNotPaid");
            return (Criteria) this;
        }

        public Criteria andWholeNotPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("whole_not_paid not between", value1, value2, "wholeNotPaid");
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