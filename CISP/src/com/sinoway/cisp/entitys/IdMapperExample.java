package com.sinoway.cisp.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IdMapperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdMapperExample() {
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

        public Criteria andInstiidIsNull() {
            addCriterion("instiid is null");
            return (Criteria) this;
        }

        public Criteria andInstiidIsNotNull() {
            addCriterion("instiid is not null");
            return (Criteria) this;
        }

        public Criteria andInstiidEqualTo(String value) {
            addCriterion("instiid =", value, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidNotEqualTo(String value) {
            addCriterion("instiid <>", value, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidGreaterThan(String value) {
            addCriterion("instiid >", value, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidGreaterThanOrEqualTo(String value) {
            addCriterion("instiid >=", value, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidLessThan(String value) {
            addCriterion("instiid <", value, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidLessThanOrEqualTo(String value) {
            addCriterion("instiid <=", value, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidLike(String value) {
            addCriterion("instiid like", value, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidNotLike(String value) {
            addCriterion("instiid not like", value, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidIn(List<String> values) {
            addCriterion("instiid in", values, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidNotIn(List<String> values) {
            addCriterion("instiid not in", values, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidBetween(String value1, String value2) {
            addCriterion("instiid between", value1, value2, "instiid");
            return (Criteria) this;
        }

        public Criteria andInstiidNotBetween(String value1, String value2) {
            addCriterion("instiid not between", value1, value2, "instiid");
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

        public Criteria andInstiCodeIsNull() {
            addCriterion("insti_code is null");
            return (Criteria) this;
        }

        public Criteria andInstiCodeIsNotNull() {
            addCriterion("insti_code is not null");
            return (Criteria) this;
        }

        public Criteria andInstiCodeEqualTo(String value) {
            addCriterion("insti_code =", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeNotEqualTo(String value) {
            addCriterion("insti_code <>", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeGreaterThan(String value) {
            addCriterion("insti_code >", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("insti_code >=", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeLessThan(String value) {
            addCriterion("insti_code <", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeLessThanOrEqualTo(String value) {
            addCriterion("insti_code <=", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeLike(String value) {
            addCriterion("insti_code like", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeNotLike(String value) {
            addCriterion("insti_code not like", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeIn(List<String> values) {
            addCriterion("insti_code in", values, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeNotIn(List<String> values) {
            addCriterion("insti_code not in", values, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeBetween(String value1, String value2) {
            addCriterion("insti_code between", value1, value2, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeNotBetween(String value1, String value2) {
            addCriterion("insti_code not between", value1, value2, "instiCode");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNull() {
            addCriterion("data_from is null");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNotNull() {
            addCriterion("data_from is not null");
            return (Criteria) this;
        }

        public Criteria andDataFromEqualTo(String value) {
            addCriterion("data_from =", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotEqualTo(String value) {
            addCriterion("data_from <>", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThan(String value) {
            addCriterion("data_from >", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThanOrEqualTo(String value) {
            addCriterion("data_from >=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThan(String value) {
            addCriterion("data_from <", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThanOrEqualTo(String value) {
            addCriterion("data_from <=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLike(String value) {
            addCriterion("data_from like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotLike(String value) {
            addCriterion("data_from not like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromIn(List<String> values) {
            addCriterion("data_from in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotIn(List<String> values) {
            addCriterion("data_from not in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromBetween(String value1, String value2) {
            addCriterion("data_from between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotBetween(String value1, String value2) {
            addCriterion("data_from not between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andCrStatusIsNull() {
            addCriterion("cr_status is null");
            return (Criteria) this;
        }

        public Criteria andCrStatusIsNotNull() {
            addCriterion("cr_status is not null");
            return (Criteria) this;
        }

        public Criteria andCrStatusEqualTo(String value) {
            addCriterion("cr_status =", value, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusNotEqualTo(String value) {
            addCriterion("cr_status <>", value, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusGreaterThan(String value) {
            addCriterion("cr_status >", value, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cr_status >=", value, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusLessThan(String value) {
            addCriterion("cr_status <", value, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusLessThanOrEqualTo(String value) {
            addCriterion("cr_status <=", value, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusLike(String value) {
            addCriterion("cr_status like", value, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusNotLike(String value) {
            addCriterion("cr_status not like", value, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusIn(List<String> values) {
            addCriterion("cr_status in", values, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusNotIn(List<String> values) {
            addCriterion("cr_status not in", values, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusBetween(String value1, String value2) {
            addCriterion("cr_status between", value1, value2, "crStatus");
            return (Criteria) this;
        }

        public Criteria andCrStatusNotBetween(String value1, String value2) {
            addCriterion("cr_status not between", value1, value2, "crStatus");
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