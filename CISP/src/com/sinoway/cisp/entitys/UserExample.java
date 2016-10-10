package com.sinoway.cisp.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserPswIsNull() {
            addCriterion("user_psw is null");
            return (Criteria) this;
        }

        public Criteria andUserPswIsNotNull() {
            addCriterion("user_psw is not null");
            return (Criteria) this;
        }

        public Criteria andUserPswEqualTo(String value) {
            addCriterion("user_psw =", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswNotEqualTo(String value) {
            addCriterion("user_psw <>", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswGreaterThan(String value) {
            addCriterion("user_psw >", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswGreaterThanOrEqualTo(String value) {
            addCriterion("user_psw >=", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswLessThan(String value) {
            addCriterion("user_psw <", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswLessThanOrEqualTo(String value) {
            addCriterion("user_psw <=", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswLike(String value) {
            addCriterion("user_psw like", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswNotLike(String value) {
            addCriterion("user_psw not like", value, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswIn(List<String> values) {
            addCriterion("user_psw in", values, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswNotIn(List<String> values) {
            addCriterion("user_psw not in", values, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswBetween(String value1, String value2) {
            addCriterion("user_psw between", value1, value2, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserPswNotBetween(String value1, String value2) {
            addCriterion("user_psw not between", value1, value2, "userPsw");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNull() {
            addCriterion("user_mail is null");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNotNull() {
            addCriterion("user_mail is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailEqualTo(String value) {
            addCriterion("user_mail =", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotEqualTo(String value) {
            addCriterion("user_mail <>", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThan(String value) {
            addCriterion("user_mail >", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThanOrEqualTo(String value) {
            addCriterion("user_mail >=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThan(String value) {
            addCriterion("user_mail <", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThanOrEqualTo(String value) {
            addCriterion("user_mail <=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLike(String value) {
            addCriterion("user_mail like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotLike(String value) {
            addCriterion("user_mail not like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailIn(List<String> values) {
            addCriterion("user_mail in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotIn(List<String> values) {
            addCriterion("user_mail not in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailBetween(String value1, String value2) {
            addCriterion("user_mail between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotBetween(String value1, String value2) {
            addCriterion("user_mail not between", value1, value2, "userMail");
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

        public Criteria andLastTimeLoginIsNull() {
            addCriterion("last_time_login is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginIsNotNull() {
            addCriterion("last_time_login is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginEqualTo(Date value) {
            addCriterion("last_time_login =", value, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginNotEqualTo(Date value) {
            addCriterion("last_time_login <>", value, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginGreaterThan(Date value) {
            addCriterion("last_time_login >", value, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time_login >=", value, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginLessThan(Date value) {
            addCriterion("last_time_login <", value, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginLessThanOrEqualTo(Date value) {
            addCriterion("last_time_login <=", value, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginIn(List<Date> values) {
            addCriterion("last_time_login in", values, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginNotIn(List<Date> values) {
            addCriterion("last_time_login not in", values, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginBetween(Date value1, Date value2) {
            addCriterion("last_time_login between", value1, value2, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andLastTimeLoginNotBetween(Date value1, Date value2) {
            addCriterion("last_time_login not between", value1, value2, "lastTimeLogin");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNull() {
            addCriterion("qqnum is null");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNotNull() {
            addCriterion("qqnum is not null");
            return (Criteria) this;
        }

        public Criteria andQqnumEqualTo(String value) {
            addCriterion("qqnum =", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotEqualTo(String value) {
            addCriterion("qqnum <>", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThan(String value) {
            addCriterion("qqnum >", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThanOrEqualTo(String value) {
            addCriterion("qqnum >=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThan(String value) {
            addCriterion("qqnum <", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThanOrEqualTo(String value) {
            addCriterion("qqnum <=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLike(String value) {
            addCriterion("qqnum like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotLike(String value) {
            addCriterion("qqnum not like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumIn(List<String> values) {
            addCriterion("qqnum in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotIn(List<String> values) {
            addCriterion("qqnum not in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumBetween(String value1, String value2) {
            addCriterion("qqnum between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotBetween(String value1, String value2) {
            addCriterion("qqnum not between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andIslockIsNull() {
            addCriterion("islock is null");
            return (Criteria) this;
        }

        public Criteria andIslockIsNotNull() {
            addCriterion("islock is not null");
            return (Criteria) this;
        }

        public Criteria andIslockEqualTo(String value) {
            addCriterion("islock =", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotEqualTo(String value) {
            addCriterion("islock <>", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThan(String value) {
            addCriterion("islock >", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThanOrEqualTo(String value) {
            addCriterion("islock >=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThan(String value) {
            addCriterion("islock <", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThanOrEqualTo(String value) {
            addCriterion("islock <=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLike(String value) {
            addCriterion("islock like", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotLike(String value) {
            addCriterion("islock not like", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockIn(List<String> values) {
            addCriterion("islock in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotIn(List<String> values) {
            addCriterion("islock not in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockBetween(String value1, String value2) {
            addCriterion("islock between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotBetween(String value1, String value2) {
            addCriterion("islock not between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andUserKeyIsNull() {
            addCriterion("user_key is null");
            return (Criteria) this;
        }

        public Criteria andUserKeyIsNotNull() {
            addCriterion("user_key is not null");
            return (Criteria) this;
        }

        public Criteria andUserKeyEqualTo(String value) {
            addCriterion("user_key =", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotEqualTo(String value) {
            addCriterion("user_key <>", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThan(String value) {
            addCriterion("user_key >", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThanOrEqualTo(String value) {
            addCriterion("user_key >=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThan(String value) {
            addCriterion("user_key <", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThanOrEqualTo(String value) {
            addCriterion("user_key <=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLike(String value) {
            addCriterion("user_key like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotLike(String value) {
            addCriterion("user_key not like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyIn(List<String> values) {
            addCriterion("user_key in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotIn(List<String> values) {
            addCriterion("user_key not in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyBetween(String value1, String value2) {
            addCriterion("user_key between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotBetween(String value1, String value2) {
            addCriterion("user_key not between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserPrivateIsNull() {
            addCriterion("user_private is null");
            return (Criteria) this;
        }

        public Criteria andUserPrivateIsNotNull() {
            addCriterion("user_private is not null");
            return (Criteria) this;
        }

        public Criteria andUserPrivateEqualTo(String value) {
            addCriterion("user_private =", value, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateNotEqualTo(String value) {
            addCriterion("user_private <>", value, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateGreaterThan(String value) {
            addCriterion("user_private >", value, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateGreaterThanOrEqualTo(String value) {
            addCriterion("user_private >=", value, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateLessThan(String value) {
            addCriterion("user_private <", value, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateLessThanOrEqualTo(String value) {
            addCriterion("user_private <=", value, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateLike(String value) {
            addCriterion("user_private like", value, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateNotLike(String value) {
            addCriterion("user_private not like", value, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateIn(List<String> values) {
            addCriterion("user_private in", values, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateNotIn(List<String> values) {
            addCriterion("user_private not in", values, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateBetween(String value1, String value2) {
            addCriterion("user_private between", value1, value2, "userPrivate");
            return (Criteria) this;
        }

        public Criteria andUserPrivateNotBetween(String value1, String value2) {
            addCriterion("user_private not between", value1, value2, "userPrivate");
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