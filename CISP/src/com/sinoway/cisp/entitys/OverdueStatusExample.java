package com.sinoway.cisp.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverdueStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OverdueStatusExample() {
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

        public Criteria andColSnIsNull() {
            addCriterion("col_sn is null");
            return (Criteria) this;
        }

        public Criteria andColSnIsNotNull() {
            addCriterion("col_sn is not null");
            return (Criteria) this;
        }

        public Criteria andColSnEqualTo(String value) {
            addCriterion("col_sn =", value, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnNotEqualTo(String value) {
            addCriterion("col_sn <>", value, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnGreaterThan(String value) {
            addCriterion("col_sn >", value, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnGreaterThanOrEqualTo(String value) {
            addCriterion("col_sn >=", value, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnLessThan(String value) {
            addCriterion("col_sn <", value, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnLessThanOrEqualTo(String value) {
            addCriterion("col_sn <=", value, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnLike(String value) {
            addCriterion("col_sn like", value, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnNotLike(String value) {
            addCriterion("col_sn not like", value, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnIn(List<String> values) {
            addCriterion("col_sn in", values, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnNotIn(List<String> values) {
            addCriterion("col_sn not in", values, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnBetween(String value1, String value2) {
            addCriterion("col_sn between", value1, value2, "colSn");
            return (Criteria) this;
        }

        public Criteria andColSnNotBetween(String value1, String value2) {
            addCriterion("col_sn not between", value1, value2, "colSn");
            return (Criteria) this;
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

        public Criteria andPaymentLevelIsNull() {
            addCriterion("payment_level is null");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelIsNotNull() {
            addCriterion("payment_level is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelEqualTo(Integer value) {
            addCriterion("payment_level =", value, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelNotEqualTo(Integer value) {
            addCriterion("payment_level <>", value, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelGreaterThan(Integer value) {
            addCriterion("payment_level >", value, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_level >=", value, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelLessThan(Integer value) {
            addCriterion("payment_level <", value, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelLessThanOrEqualTo(Integer value) {
            addCriterion("payment_level <=", value, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelIn(List<Integer> values) {
            addCriterion("payment_level in", values, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelNotIn(List<Integer> values) {
            addCriterion("payment_level not in", values, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelBetween(Integer value1, Integer value2) {
            addCriterion("payment_level between", value1, value2, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_level not between", value1, value2, "paymentLevel");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeIsNull() {
            addCriterion("overdue_start_time is null");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeIsNotNull() {
            addCriterion("overdue_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeEqualTo(Date value) {
            addCriterion("overdue_start_time =", value, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeNotEqualTo(Date value) {
            addCriterion("overdue_start_time <>", value, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeGreaterThan(Date value) {
            addCriterion("overdue_start_time >", value, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("overdue_start_time >=", value, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeLessThan(Date value) {
            addCriterion("overdue_start_time <", value, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("overdue_start_time <=", value, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeIn(List<Date> values) {
            addCriterion("overdue_start_time in", values, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeNotIn(List<Date> values) {
            addCriterion("overdue_start_time not in", values, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeBetween(Date value1, Date value2) {
            addCriterion("overdue_start_time between", value1, value2, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("overdue_start_time not between", value1, value2, "overdueStartTime");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonIsNull() {
            addCriterion("overdue_reason is null");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonIsNotNull() {
            addCriterion("overdue_reason is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonEqualTo(String value) {
            addCriterion("overdue_reason =", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonNotEqualTo(String value) {
            addCriterion("overdue_reason <>", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonGreaterThan(String value) {
            addCriterion("overdue_reason >", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_reason >=", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonLessThan(String value) {
            addCriterion("overdue_reason <", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonLessThanOrEqualTo(String value) {
            addCriterion("overdue_reason <=", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonLike(String value) {
            addCriterion("overdue_reason like", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonNotLike(String value) {
            addCriterion("overdue_reason not like", value, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonIn(List<String> values) {
            addCriterion("overdue_reason in", values, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonNotIn(List<String> values) {
            addCriterion("overdue_reason not in", values, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonBetween(String value1, String value2) {
            addCriterion("overdue_reason between", value1, value2, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueReasonNotBetween(String value1, String value2) {
            addCriterion("overdue_reason not between", value1, value2, "overdueReason");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkIsNull() {
            addCriterion("overdue_status_mark is null");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkIsNotNull() {
            addCriterion("overdue_status_mark is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkEqualTo(String value) {
            addCriterion("overdue_status_mark =", value, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkNotEqualTo(String value) {
            addCriterion("overdue_status_mark <>", value, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkGreaterThan(String value) {
            addCriterion("overdue_status_mark >", value, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_status_mark >=", value, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkLessThan(String value) {
            addCriterion("overdue_status_mark <", value, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkLessThanOrEqualTo(String value) {
            addCriterion("overdue_status_mark <=", value, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkLike(String value) {
            addCriterion("overdue_status_mark like", value, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkNotLike(String value) {
            addCriterion("overdue_status_mark not like", value, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkIn(List<String> values) {
            addCriterion("overdue_status_mark in", values, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkNotIn(List<String> values) {
            addCriterion("overdue_status_mark not in", values, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkBetween(String value1, String value2) {
            addCriterion("overdue_status_mark between", value1, value2, "overdueStatusMark");
            return (Criteria) this;
        }

        public Criteria andOverdueStatusMarkNotBetween(String value1, String value2) {
            addCriterion("overdue_status_mark not between", value1, value2, "overdueStatusMark");
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