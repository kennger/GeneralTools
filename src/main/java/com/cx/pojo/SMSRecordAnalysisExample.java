package com.cx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SMSRecordAnalysisExample {
    /**
     * user_sms_record_analysis
     */
    protected String orderByClause;

    /**
     * user_sms_record_analysis
     */
    protected boolean distinct;

    /**
     * user_sms_record_analysis
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public SMSRecordAnalysisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-03-15
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * user_sms_record_analysis 2019-03-15
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowIsNull() {
            addCriterion("credit_consume_flow is null");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowIsNotNull() {
            addCriterion("credit_consume_flow is not null");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowEqualTo(String value) {
            addCriterion("credit_consume_flow =", value, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowNotEqualTo(String value) {
            addCriterion("credit_consume_flow <>", value, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowGreaterThan(String value) {
            addCriterion("credit_consume_flow >", value, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowGreaterThanOrEqualTo(String value) {
            addCriterion("credit_consume_flow >=", value, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowLessThan(String value) {
            addCriterion("credit_consume_flow <", value, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowLessThanOrEqualTo(String value) {
            addCriterion("credit_consume_flow <=", value, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowLike(String value) {
            addCriterion("credit_consume_flow like", value, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowNotLike(String value) {
            addCriterion("credit_consume_flow not like", value, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowIn(List<String> values) {
            addCriterion("credit_consume_flow in", values, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowNotIn(List<String> values) {
            addCriterion("credit_consume_flow not in", values, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowBetween(String value1, String value2) {
            addCriterion("credit_consume_flow between", value1, value2, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditConsumeFlowNotBetween(String value1, String value2) {
            addCriterion("credit_consume_flow not between", value1, value2, "creditConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowIsNull() {
            addCriterion("credit_repay_flow is null");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowIsNotNull() {
            addCriterion("credit_repay_flow is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowEqualTo(String value) {
            addCriterion("credit_repay_flow =", value, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowNotEqualTo(String value) {
            addCriterion("credit_repay_flow <>", value, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowGreaterThan(String value) {
            addCriterion("credit_repay_flow >", value, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowGreaterThanOrEqualTo(String value) {
            addCriterion("credit_repay_flow >=", value, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowLessThan(String value) {
            addCriterion("credit_repay_flow <", value, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowLessThanOrEqualTo(String value) {
            addCriterion("credit_repay_flow <=", value, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowLike(String value) {
            addCriterion("credit_repay_flow like", value, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowNotLike(String value) {
            addCriterion("credit_repay_flow not like", value, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowIn(List<String> values) {
            addCriterion("credit_repay_flow in", values, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowNotIn(List<String> values) {
            addCriterion("credit_repay_flow not in", values, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowBetween(String value1, String value2) {
            addCriterion("credit_repay_flow between", value1, value2, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andCreditRepayFlowNotBetween(String value1, String value2) {
            addCriterion("credit_repay_flow not between", value1, value2, "creditRepayFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowIsNull() {
            addCriterion("debit_consume_flow is null");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowIsNotNull() {
            addCriterion("debit_consume_flow is not null");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowEqualTo(String value) {
            addCriterion("debit_consume_flow =", value, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowNotEqualTo(String value) {
            addCriterion("debit_consume_flow <>", value, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowGreaterThan(String value) {
            addCriterion("debit_consume_flow >", value, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowGreaterThanOrEqualTo(String value) {
            addCriterion("debit_consume_flow >=", value, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowLessThan(String value) {
            addCriterion("debit_consume_flow <", value, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowLessThanOrEqualTo(String value) {
            addCriterion("debit_consume_flow <=", value, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowLike(String value) {
            addCriterion("debit_consume_flow like", value, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowNotLike(String value) {
            addCriterion("debit_consume_flow not like", value, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowIn(List<String> values) {
            addCriterion("debit_consume_flow in", values, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowNotIn(List<String> values) {
            addCriterion("debit_consume_flow not in", values, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowBetween(String value1, String value2) {
            addCriterion("debit_consume_flow between", value1, value2, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitConsumeFlowNotBetween(String value1, String value2) {
            addCriterion("debit_consume_flow not between", value1, value2, "debitConsumeFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowIsNull() {
            addCriterion("debit_transfer_flow is null");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowIsNotNull() {
            addCriterion("debit_transfer_flow is not null");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowEqualTo(String value) {
            addCriterion("debit_transfer_flow =", value, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowNotEqualTo(String value) {
            addCriterion("debit_transfer_flow <>", value, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowGreaterThan(String value) {
            addCriterion("debit_transfer_flow >", value, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowGreaterThanOrEqualTo(String value) {
            addCriterion("debit_transfer_flow >=", value, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowLessThan(String value) {
            addCriterion("debit_transfer_flow <", value, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowLessThanOrEqualTo(String value) {
            addCriterion("debit_transfer_flow <=", value, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowLike(String value) {
            addCriterion("debit_transfer_flow like", value, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowNotLike(String value) {
            addCriterion("debit_transfer_flow not like", value, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowIn(List<String> values) {
            addCriterion("debit_transfer_flow in", values, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowNotIn(List<String> values) {
            addCriterion("debit_transfer_flow not in", values, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowBetween(String value1, String value2) {
            addCriterion("debit_transfer_flow between", value1, value2, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andDebitTransferFlowNotBetween(String value1, String value2) {
            addCriterion("debit_transfer_flow not between", value1, value2, "debitTransferFlow");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoIsNull() {
            addCriterion("loan_platform_info is null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoIsNotNull() {
            addCriterion("loan_platform_info is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoEqualTo(String value) {
            addCriterion("loan_platform_info =", value, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoNotEqualTo(String value) {
            addCriterion("loan_platform_info <>", value, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoGreaterThan(String value) {
            addCriterion("loan_platform_info >", value, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoGreaterThanOrEqualTo(String value) {
            addCriterion("loan_platform_info >=", value, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoLessThan(String value) {
            addCriterion("loan_platform_info <", value, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoLessThanOrEqualTo(String value) {
            addCriterion("loan_platform_info <=", value, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoLike(String value) {
            addCriterion("loan_platform_info like", value, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoNotLike(String value) {
            addCriterion("loan_platform_info not like", value, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoIn(List<String> values) {
            addCriterion("loan_platform_info in", values, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoNotIn(List<String> values) {
            addCriterion("loan_platform_info not in", values, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoBetween(String value1, String value2) {
            addCriterion("loan_platform_info between", value1, value2, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andLoanPlatformInfoNotBetween(String value1, String value2) {
            addCriterion("loan_platform_info not between", value1, value2, "loanPlatformInfo");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(Boolean value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Boolean value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Boolean value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Boolean value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Boolean value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Boolean> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Boolean> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Boolean value1, Boolean value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }
    }

    /**
     * user_sms_record_analysis
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * user_sms_record_analysis 2019-03-15
     */
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