package com.sinoway.cisp.entitys;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractAcceptDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractAcceptDetailExample() {
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

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("contract_id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("contract_id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractSumIsNull() {
            addCriterion("contract_sum is null");
            return (Criteria) this;
        }

        public Criteria andContractSumIsNotNull() {
            addCriterion("contract_sum is not null");
            return (Criteria) this;
        }

        public Criteria andContractSumEqualTo(BigDecimal value) {
            addCriterion("contract_sum =", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumNotEqualTo(BigDecimal value) {
            addCriterion("contract_sum <>", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumGreaterThan(BigDecimal value) {
            addCriterion("contract_sum >", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("contract_sum >=", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumLessThan(BigDecimal value) {
            addCriterion("contract_sum <", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("contract_sum <=", value, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumIn(List<BigDecimal> values) {
            addCriterion("contract_sum in", values, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumNotIn(List<BigDecimal> values) {
            addCriterion("contract_sum not in", values, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contract_sum between", value1, value2, "contractSum");
            return (Criteria) this;
        }

        public Criteria andContractSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contract_sum not between", value1, value2, "contractSum");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(Date value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(Date value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(Date value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(Date value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(Date value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<Date> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<Date> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(Date value1, Date value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(Date value1, Date value2) {
            addCriterion("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("contract_type like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("contract_type not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeIsNull() {
            addCriterion("guara_type is null");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeIsNotNull() {
            addCriterion("guara_type is not null");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeEqualTo(String value) {
            addCriterion("guara_type =", value, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeNotEqualTo(String value) {
            addCriterion("guara_type <>", value, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeGreaterThan(String value) {
            addCriterion("guara_type >", value, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeGreaterThanOrEqualTo(String value) {
            addCriterion("guara_type >=", value, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeLessThan(String value) {
            addCriterion("guara_type <", value, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeLessThanOrEqualTo(String value) {
            addCriterion("guara_type <=", value, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeLike(String value) {
            addCriterion("guara_type like", value, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeNotLike(String value) {
            addCriterion("guara_type not like", value, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeIn(List<String> values) {
            addCriterion("guara_type in", values, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeNotIn(List<String> values) {
            addCriterion("guara_type not in", values, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeBetween(String value1, String value2) {
            addCriterion("guara_type between", value1, value2, "guaraType");
            return (Criteria) this;
        }

        public Criteria andGuaraTypeNotBetween(String value1, String value2) {
            addCriterion("guara_type not between", value1, value2, "guaraType");
            return (Criteria) this;
        }

        public Criteria andPayPeriodIsNull() {
            addCriterion("pay_period is null");
            return (Criteria) this;
        }

        public Criteria andPayPeriodIsNotNull() {
            addCriterion("pay_period is not null");
            return (Criteria) this;
        }

        public Criteria andPayPeriodEqualTo(String value) {
            addCriterion("pay_period =", value, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodNotEqualTo(String value) {
            addCriterion("pay_period <>", value, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodGreaterThan(String value) {
            addCriterion("pay_period >", value, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_period >=", value, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodLessThan(String value) {
            addCriterion("pay_period <", value, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodLessThanOrEqualTo(String value) {
            addCriterion("pay_period <=", value, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodLike(String value) {
            addCriterion("pay_period like", value, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodNotLike(String value) {
            addCriterion("pay_period not like", value, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodIn(List<String> values) {
            addCriterion("pay_period in", values, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodNotIn(List<String> values) {
            addCriterion("pay_period not in", values, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodBetween(String value1, String value2) {
            addCriterion("pay_period between", value1, value2, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayPeriodNotBetween(String value1, String value2) {
            addCriterion("pay_period not between", value1, value2, "payPeriod");
            return (Criteria) this;
        }

        public Criteria andPayLocationIsNull() {
            addCriterion("pay_location is null");
            return (Criteria) this;
        }

        public Criteria andPayLocationIsNotNull() {
            addCriterion("pay_location is not null");
            return (Criteria) this;
        }

        public Criteria andPayLocationEqualTo(String value) {
            addCriterion("pay_location =", value, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationNotEqualTo(String value) {
            addCriterion("pay_location <>", value, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationGreaterThan(String value) {
            addCriterion("pay_location >", value, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationGreaterThanOrEqualTo(String value) {
            addCriterion("pay_location >=", value, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationLessThan(String value) {
            addCriterion("pay_location <", value, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationLessThanOrEqualTo(String value) {
            addCriterion("pay_location <=", value, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationLike(String value) {
            addCriterion("pay_location like", value, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationNotLike(String value) {
            addCriterion("pay_location not like", value, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationIn(List<String> values) {
            addCriterion("pay_location in", values, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationNotIn(List<String> values) {
            addCriterion("pay_location not in", values, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationBetween(String value1, String value2) {
            addCriterion("pay_location between", value1, value2, "payLocation");
            return (Criteria) this;
        }

        public Criteria andPayLocationNotBetween(String value1, String value2) {
            addCriterion("pay_location not between", value1, value2, "payLocation");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNull() {
            addCriterion("contract_status is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("contract_status is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(String value) {
            addCriterion("contract_status =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(String value) {
            addCriterion("contract_status <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(String value) {
            addCriterion("contract_status >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(String value) {
            addCriterion("contract_status >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(String value) {
            addCriterion("contract_status <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(String value) {
            addCriterion("contract_status <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLike(String value) {
            addCriterion("contract_status like", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotLike(String value) {
            addCriterion("contract_status not like", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<String> values) {
            addCriterion("contract_status in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<String> values) {
            addCriterion("contract_status not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(String value1, String value2) {
            addCriterion("contract_status between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(String value1, String value2) {
            addCriterion("contract_status not between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNull() {
            addCriterion("settle_time is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNotNull() {
            addCriterion("settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeEqualTo(Date value) {
            addCriterion("settle_time =", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotEqualTo(Date value) {
            addCriterion("settle_time <>", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThan(Date value) {
            addCriterion("settle_time >", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settle_time >=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThan(Date value) {
            addCriterion("settle_time <", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThanOrEqualTo(Date value) {
            addCriterion("settle_time <=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIn(List<Date> values) {
            addCriterion("settle_time in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotIn(List<Date> values) {
            addCriterion("settle_time not in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeBetween(Date value1, Date value2) {
            addCriterion("settle_time between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotBetween(Date value1, Date value2) {
            addCriterion("settle_time not between", value1, value2, "settleTime");
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