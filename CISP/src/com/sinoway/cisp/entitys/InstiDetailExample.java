package com.sinoway.cisp.entitys;

import java.util.ArrayList;
import java.util.List;

public class InstiDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstiDetailExample() {
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

        public Criteria andInstiCodeIsNull() {
            addCriterion("insti_code is null");
            return (Criteria) this;
        }

        public Criteria andInstiCodeIsNotNull() {
            addCriterion("insti_code is not null");
            return (Criteria) this;
        }

        public Criteria andInstiCodeEqualTo(Integer value) {
            addCriterion("insti_code =", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeNotEqualTo(Integer value) {
            addCriterion("insti_code <>", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeGreaterThan(Integer value) {
            addCriterion("insti_code >", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("insti_code >=", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeLessThan(Integer value) {
            addCriterion("insti_code <", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeLessThanOrEqualTo(Integer value) {
            addCriterion("insti_code <=", value, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeIn(List<Integer> values) {
            addCriterion("insti_code in", values, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeNotIn(List<Integer> values) {
            addCriterion("insti_code not in", values, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeBetween(Integer value1, Integer value2) {
            addCriterion("insti_code between", value1, value2, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("insti_code not between", value1, value2, "instiCode");
            return (Criteria) this;
        }

        public Criteria andInstiTypeIsNull() {
            addCriterion("insti_type is null");
            return (Criteria) this;
        }

        public Criteria andInstiTypeIsNotNull() {
            addCriterion("insti_type is not null");
            return (Criteria) this;
        }

        public Criteria andInstiTypeEqualTo(Integer value) {
            addCriterion("insti_type =", value, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeNotEqualTo(Integer value) {
            addCriterion("insti_type <>", value, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeGreaterThan(Integer value) {
            addCriterion("insti_type >", value, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("insti_type >=", value, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeLessThan(Integer value) {
            addCriterion("insti_type <", value, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeLessThanOrEqualTo(Integer value) {
            addCriterion("insti_type <=", value, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeIn(List<Integer> values) {
            addCriterion("insti_type in", values, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeNotIn(List<Integer> values) {
            addCriterion("insti_type not in", values, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeBetween(Integer value1, Integer value2) {
            addCriterion("insti_type between", value1, value2, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("insti_type not between", value1, value2, "instiType");
            return (Criteria) this;
        }

        public Criteria andInstiNameIsNull() {
            addCriterion("insti_name is null");
            return (Criteria) this;
        }

        public Criteria andInstiNameIsNotNull() {
            addCriterion("insti_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstiNameEqualTo(String value) {
            addCriterion("insti_name =", value, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameNotEqualTo(String value) {
            addCriterion("insti_name <>", value, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameGreaterThan(String value) {
            addCriterion("insti_name >", value, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameGreaterThanOrEqualTo(String value) {
            addCriterion("insti_name >=", value, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameLessThan(String value) {
            addCriterion("insti_name <", value, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameLessThanOrEqualTo(String value) {
            addCriterion("insti_name <=", value, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameLike(String value) {
            addCriterion("insti_name like", value, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameNotLike(String value) {
            addCriterion("insti_name not like", value, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameIn(List<String> values) {
            addCriterion("insti_name in", values, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameNotIn(List<String> values) {
            addCriterion("insti_name not in", values, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameBetween(String value1, String value2) {
            addCriterion("insti_name between", value1, value2, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiNameNotBetween(String value1, String value2) {
            addCriterion("insti_name not between", value1, value2, "instiName");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameIsNull() {
            addCriterion("insti_shortname is null");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameIsNotNull() {
            addCriterion("insti_shortname is not null");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameEqualTo(String value) {
            addCriterion("insti_shortname =", value, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameNotEqualTo(String value) {
            addCriterion("insti_shortname <>", value, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameGreaterThan(String value) {
            addCriterion("insti_shortname >", value, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("insti_shortname >=", value, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameLessThan(String value) {
            addCriterion("insti_shortname <", value, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameLessThanOrEqualTo(String value) {
            addCriterion("insti_shortname <=", value, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameLike(String value) {
            addCriterion("insti_shortname like", value, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameNotLike(String value) {
            addCriterion("insti_shortname not like", value, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameIn(List<String> values) {
            addCriterion("insti_shortname in", values, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameNotIn(List<String> values) {
            addCriterion("insti_shortname not in", values, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameBetween(String value1, String value2) {
            addCriterion("insti_shortname between", value1, value2, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andInstiShortnameNotBetween(String value1, String value2) {
            addCriterion("insti_shortname not between", value1, value2, "instiShortname");
            return (Criteria) this;
        }

        public Criteria andCorporationNameIsNull() {
            addCriterion("corporation_name is null");
            return (Criteria) this;
        }

        public Criteria andCorporationNameIsNotNull() {
            addCriterion("corporation_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationNameEqualTo(String value) {
            addCriterion("corporation_name =", value, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameNotEqualTo(String value) {
            addCriterion("corporation_name <>", value, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameGreaterThan(String value) {
            addCriterion("corporation_name >", value, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameGreaterThanOrEqualTo(String value) {
            addCriterion("corporation_name >=", value, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameLessThan(String value) {
            addCriterion("corporation_name <", value, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameLessThanOrEqualTo(String value) {
            addCriterion("corporation_name <=", value, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameLike(String value) {
            addCriterion("corporation_name like", value, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameNotLike(String value) {
            addCriterion("corporation_name not like", value, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameIn(List<String> values) {
            addCriterion("corporation_name in", values, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameNotIn(List<String> values) {
            addCriterion("corporation_name not in", values, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameBetween(String value1, String value2) {
            addCriterion("corporation_name between", value1, value2, "corporationName");
            return (Criteria) this;
        }

        public Criteria andCorporationNameNotBetween(String value1, String value2) {
            addCriterion("corporation_name not between", value1, value2, "corporationName");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIsNull() {
            addCriterion("social_credit_code is null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIsNotNull() {
            addCriterion("social_credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeEqualTo(String value) {
            addCriterion("social_credit_code =", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotEqualTo(String value) {
            addCriterion("social_credit_code <>", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeGreaterThan(String value) {
            addCriterion("social_credit_code >", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("social_credit_code >=", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLessThan(String value) {
            addCriterion("social_credit_code <", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("social_credit_code <=", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLike(String value) {
            addCriterion("social_credit_code like", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotLike(String value) {
            addCriterion("social_credit_code not like", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIn(List<String> values) {
            addCriterion("social_credit_code in", values, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotIn(List<String> values) {
            addCriterion("social_credit_code not in", values, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeBetween(String value1, String value2) {
            addCriterion("social_credit_code between", value1, value2, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotBetween(String value1, String value2) {
            addCriterion("social_credit_code not between", value1, value2, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIsNull() {
            addCriterion("credit_person is null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIsNotNull() {
            addCriterion("credit_person is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonEqualTo(String value) {
            addCriterion("credit_person =", value, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNotEqualTo(String value) {
            addCriterion("credit_person <>", value, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonGreaterThan(String value) {
            addCriterion("credit_person >", value, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonGreaterThanOrEqualTo(String value) {
            addCriterion("credit_person >=", value, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonLessThan(String value) {
            addCriterion("credit_person <", value, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonLessThanOrEqualTo(String value) {
            addCriterion("credit_person <=", value, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonLike(String value) {
            addCriterion("credit_person like", value, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNotLike(String value) {
            addCriterion("credit_person not like", value, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIn(List<String> values) {
            addCriterion("credit_person in", values, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNotIn(List<String> values) {
            addCriterion("credit_person not in", values, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBetween(String value1, String value2) {
            addCriterion("credit_person between", value1, value2, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNotBetween(String value1, String value2) {
            addCriterion("credit_person not between", value1, value2, "creditPerson");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIsNull() {
            addCriterion("general_manager is null");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIsNotNull() {
            addCriterion("general_manager is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerEqualTo(String value) {
            addCriterion("general_manager =", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotEqualTo(String value) {
            addCriterion("general_manager <>", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerGreaterThan(String value) {
            addCriterion("general_manager >", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerGreaterThanOrEqualTo(String value) {
            addCriterion("general_manager >=", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLessThan(String value) {
            addCriterion("general_manager <", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLessThanOrEqualTo(String value) {
            addCriterion("general_manager <=", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerLike(String value) {
            addCriterion("general_manager like", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotLike(String value) {
            addCriterion("general_manager not like", value, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerIn(List<String> values) {
            addCriterion("general_manager in", values, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotIn(List<String> values) {
            addCriterion("general_manager not in", values, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerBetween(String value1, String value2) {
            addCriterion("general_manager between", value1, value2, "generalManager");
            return (Criteria) this;
        }

        public Criteria andGeneralManagerNotBetween(String value1, String value2) {
            addCriterion("general_manager not between", value1, value2, "generalManager");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("registered_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("registered_address =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("registered_address <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("registered_address >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("registered_address <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("registered_address <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("registered_address like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("registered_address not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("registered_address in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("registered_address not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("registered_address between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("registered_address not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(String value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(String value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(String value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(String value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(String value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLike(String value) {
            addCriterion("registered_capital like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotLike(String value) {
            addCriterion("registered_capital not like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<String> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<String> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(String value1, String value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(String value1, String value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(Integer value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(Integer value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(Integer value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(Integer value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(Integer value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<Integer> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<Integer> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(Integer value1, Integer value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneIsNull() {
            addCriterion("insti_phone is null");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneIsNotNull() {
            addCriterion("insti_phone is not null");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneEqualTo(String value) {
            addCriterion("insti_phone =", value, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneNotEqualTo(String value) {
            addCriterion("insti_phone <>", value, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneGreaterThan(String value) {
            addCriterion("insti_phone >", value, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("insti_phone >=", value, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneLessThan(String value) {
            addCriterion("insti_phone <", value, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneLessThanOrEqualTo(String value) {
            addCriterion("insti_phone <=", value, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneLike(String value) {
            addCriterion("insti_phone like", value, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneNotLike(String value) {
            addCriterion("insti_phone not like", value, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneIn(List<String> values) {
            addCriterion("insti_phone in", values, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneNotIn(List<String> values) {
            addCriterion("insti_phone not in", values, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneBetween(String value1, String value2) {
            addCriterion("insti_phone between", value1, value2, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiPhoneNotBetween(String value1, String value2) {
            addCriterion("insti_phone not between", value1, value2, "instiPhone");
            return (Criteria) this;
        }

        public Criteria andInstiLocationIsNull() {
            addCriterion("insti_location is null");
            return (Criteria) this;
        }

        public Criteria andInstiLocationIsNotNull() {
            addCriterion("insti_location is not null");
            return (Criteria) this;
        }

        public Criteria andInstiLocationEqualTo(String value) {
            addCriterion("insti_location =", value, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationNotEqualTo(String value) {
            addCriterion("insti_location <>", value, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationGreaterThan(String value) {
            addCriterion("insti_location >", value, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationGreaterThanOrEqualTo(String value) {
            addCriterion("insti_location >=", value, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationLessThan(String value) {
            addCriterion("insti_location <", value, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationLessThanOrEqualTo(String value) {
            addCriterion("insti_location <=", value, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationLike(String value) {
            addCriterion("insti_location like", value, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationNotLike(String value) {
            addCriterion("insti_location not like", value, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationIn(List<String> values) {
            addCriterion("insti_location in", values, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationNotIn(List<String> values) {
            addCriterion("insti_location not in", values, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationBetween(String value1, String value2) {
            addCriterion("insti_location between", value1, value2, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andInstiLocationNotBetween(String value1, String value2) {
            addCriterion("insti_location not between", value1, value2, "instiLocation");
            return (Criteria) this;
        }

        public Criteria andWebUrlIsNull() {
            addCriterion("web_url is null");
            return (Criteria) this;
        }

        public Criteria andWebUrlIsNotNull() {
            addCriterion("web_url is not null");
            return (Criteria) this;
        }

        public Criteria andWebUrlEqualTo(String value) {
            addCriterion("web_url =", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlNotEqualTo(String value) {
            addCriterion("web_url <>", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlGreaterThan(String value) {
            addCriterion("web_url >", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlGreaterThanOrEqualTo(String value) {
            addCriterion("web_url >=", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlLessThan(String value) {
            addCriterion("web_url <", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlLessThanOrEqualTo(String value) {
            addCriterion("web_url <=", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlLike(String value) {
            addCriterion("web_url like", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlNotLike(String value) {
            addCriterion("web_url not like", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlIn(List<String> values) {
            addCriterion("web_url in", values, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlNotIn(List<String> values) {
            addCriterion("web_url not in", values, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlBetween(String value1, String value2) {
            addCriterion("web_url between", value1, value2, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlNotBetween(String value1, String value2) {
            addCriterion("web_url not between", value1, value2, "webUrl");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIsNull() {
            addCriterion("fax_number is null");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIsNotNull() {
            addCriterion("fax_number is not null");
            return (Criteria) this;
        }

        public Criteria andFaxNumberEqualTo(String value) {
            addCriterion("fax_number =", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotEqualTo(String value) {
            addCriterion("fax_number <>", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberGreaterThan(String value) {
            addCriterion("fax_number >", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("fax_number >=", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLessThan(String value) {
            addCriterion("fax_number <", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLessThanOrEqualTo(String value) {
            addCriterion("fax_number <=", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLike(String value) {
            addCriterion("fax_number like", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotLike(String value) {
            addCriterion("fax_number not like", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIn(List<String> values) {
            addCriterion("fax_number in", values, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotIn(List<String> values) {
            addCriterion("fax_number not in", values, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberBetween(String value1, String value2) {
            addCriterion("fax_number between", value1, value2, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotBetween(String value1, String value2) {
            addCriterion("fax_number not between", value1, value2, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNull() {
            addCriterion("access_type is null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNotNull() {
            addCriterion("access_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeEqualTo(String value) {
            addCriterion("access_type =", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotEqualTo(String value) {
            addCriterion("access_type <>", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThan(String value) {
            addCriterion("access_type >", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("access_type >=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThan(String value) {
            addCriterion("access_type <", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThanOrEqualTo(String value) {
            addCriterion("access_type <=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLike(String value) {
            addCriterion("access_type like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotLike(String value) {
            addCriterion("access_type not like", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIn(List<String> values) {
            addCriterion("access_type in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotIn(List<String> values) {
            addCriterion("access_type not in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeBetween(String value1, String value2) {
            addCriterion("access_type between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotBetween(String value1, String value2) {
            addCriterion("access_type not between", value1, value2, "accessType");
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