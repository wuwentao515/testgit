package com.sinoway.cisp.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DissentDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DissentDetailExample() {
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

        public Criteria andDissentIdIsNull() {
            addCriterion("dissent_id is null");
            return (Criteria) this;
        }

        public Criteria andDissentIdIsNotNull() {
            addCriterion("dissent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDissentIdEqualTo(String value) {
            addCriterion("dissent_id =", value, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdNotEqualTo(String value) {
            addCriterion("dissent_id <>", value, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdGreaterThan(String value) {
            addCriterion("dissent_id >", value, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdGreaterThanOrEqualTo(String value) {
            addCriterion("dissent_id >=", value, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdLessThan(String value) {
            addCriterion("dissent_id <", value, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdLessThanOrEqualTo(String value) {
            addCriterion("dissent_id <=", value, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdLike(String value) {
            addCriterion("dissent_id like", value, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdNotLike(String value) {
            addCriterion("dissent_id not like", value, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdIn(List<String> values) {
            addCriterion("dissent_id in", values, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdNotIn(List<String> values) {
            addCriterion("dissent_id not in", values, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdBetween(String value1, String value2) {
            addCriterion("dissent_id between", value1, value2, "dissentId");
            return (Criteria) this;
        }

        public Criteria andDissentIdNotBetween(String value1, String value2) {
            addCriterion("dissent_id not between", value1, value2, "dissentId");
            return (Criteria) this;
        }

        public Criteria andCardidIsNull() {
            addCriterion("cardid is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("cardid is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(String value) {
            addCriterion("cardid =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(String value) {
            addCriterion("cardid <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(String value) {
            addCriterion("cardid >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(String value) {
            addCriterion("cardid >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(String value) {
            addCriterion("cardid <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(String value) {
            addCriterion("cardid <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLike(String value) {
            addCriterion("cardid like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotLike(String value) {
            addCriterion("cardid not like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<String> values) {
            addCriterion("cardid in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<String> values) {
            addCriterion("cardid not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(String value1, String value2) {
            addCriterion("cardid between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(String value1, String value2) {
            addCriterion("cardid not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIsNull() {
            addCriterion("appeal_time is null");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIsNotNull() {
            addCriterion("appeal_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppealTimeEqualTo(Date value) {
            addCriterion("appeal_time =", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotEqualTo(Date value) {
            addCriterion("appeal_time <>", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeGreaterThan(Date value) {
            addCriterion("appeal_time >", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appeal_time >=", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeLessThan(Date value) {
            addCriterion("appeal_time <", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeLessThanOrEqualTo(Date value) {
            addCriterion("appeal_time <=", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIn(List<Date> values) {
            addCriterion("appeal_time in", values, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotIn(List<Date> values) {
            addCriterion("appeal_time not in", values, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeBetween(Date value1, Date value2) {
            addCriterion("appeal_time between", value1, value2, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotBetween(Date value1, Date value2) {
            addCriterion("appeal_time not between", value1, value2, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealDetailIsNull() {
            addCriterion("appeal_detail is null");
            return (Criteria) this;
        }

        public Criteria andAppealDetailIsNotNull() {
            addCriterion("appeal_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAppealDetailEqualTo(String value) {
            addCriterion("appeal_detail =", value, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailNotEqualTo(String value) {
            addCriterion("appeal_detail <>", value, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailGreaterThan(String value) {
            addCriterion("appeal_detail >", value, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_detail >=", value, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailLessThan(String value) {
            addCriterion("appeal_detail <", value, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailLessThanOrEqualTo(String value) {
            addCriterion("appeal_detail <=", value, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailLike(String value) {
            addCriterion("appeal_detail like", value, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailNotLike(String value) {
            addCriterion("appeal_detail not like", value, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailIn(List<String> values) {
            addCriterion("appeal_detail in", values, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailNotIn(List<String> values) {
            addCriterion("appeal_detail not in", values, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailBetween(String value1, String value2) {
            addCriterion("appeal_detail between", value1, value2, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andAppealDetailNotBetween(String value1, String value2) {
            addCriterion("appeal_detail not between", value1, value2, "appealDetail");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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