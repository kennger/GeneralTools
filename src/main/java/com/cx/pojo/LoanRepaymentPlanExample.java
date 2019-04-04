package com.cx.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoanRepaymentPlanExample {
    /**
     * loan_repayment_plan
     */
    protected String orderByClause;

    /**
     * loan_repayment_plan
     */
    protected boolean distinct;

    /**
     * loan_repayment_plan
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public LoanRepaymentPlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-02
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
     * @mbggenerated 2019-04-02
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-02
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * loan_repayment_plan 2019-04-02
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentIsNull() {
            addCriterion("repayment_content is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentIsNotNull() {
            addCriterion("repayment_content is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentEqualTo(Short value) {
            addCriterion("repayment_content =", value, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentNotEqualTo(Short value) {
            addCriterion("repayment_content <>", value, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentGreaterThan(Short value) {
            addCriterion("repayment_content >", value, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentGreaterThanOrEqualTo(Short value) {
            addCriterion("repayment_content >=", value, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentLessThan(Short value) {
            addCriterion("repayment_content <", value, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentLessThanOrEqualTo(Short value) {
            addCriterion("repayment_content <=", value, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentIn(List<Short> values) {
            addCriterion("repayment_content in", values, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentNotIn(List<Short> values) {
            addCriterion("repayment_content not in", values, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentBetween(Short value1, Short value2) {
            addCriterion("repayment_content between", value1, value2, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andRepaymentContentNotBetween(Short value1, Short value2) {
            addCriterion("repayment_content not between", value1, value2, "repaymentContent");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNull() {
            addCriterion("contract_number is null");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNotNull() {
            addCriterion("contract_number is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumberEqualTo(String value) {
            addCriterion("contract_number =", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotEqualTo(String value) {
            addCriterion("contract_number <>", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThan(String value) {
            addCriterion("contract_number >", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contract_number >=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThan(String value) {
            addCriterion("contract_number <", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThanOrEqualTo(String value) {
            addCriterion("contract_number <=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLike(String value) {
            addCriterion("contract_number like", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotLike(String value) {
            addCriterion("contract_number not like", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberIn(List<String> values) {
            addCriterion("contract_number in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotIn(List<String> values) {
            addCriterion("contract_number not in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberBetween(String value1, String value2) {
            addCriterion("contract_number between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotBetween(String value1, String value2) {
            addCriterion("contract_number not between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeIsNull() {
            addCriterion("repayment_plan_code is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeIsNotNull() {
            addCriterion("repayment_plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeEqualTo(String value) {
            addCriterion("repayment_plan_code =", value, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeNotEqualTo(String value) {
            addCriterion("repayment_plan_code <>", value, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeGreaterThan(String value) {
            addCriterion("repayment_plan_code >", value, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_plan_code >=", value, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeLessThan(String value) {
            addCriterion("repayment_plan_code <", value, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("repayment_plan_code <=", value, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeLike(String value) {
            addCriterion("repayment_plan_code like", value, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeNotLike(String value) {
            addCriterion("repayment_plan_code not like", value, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeIn(List<String> values) {
            addCriterion("repayment_plan_code in", values, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeNotIn(List<String> values) {
            addCriterion("repayment_plan_code not in", values, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeBetween(String value1, String value2) {
            addCriterion("repayment_plan_code between", value1, value2, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andRepaymentPlanCodeNotBetween(String value1, String value2) {
            addCriterion("repayment_plan_code not between", value1, value2, "repaymentPlanCode");
            return (Criteria) this;
        }

        public Criteria andIsRefundIsNull() {
            addCriterion("is_refund is null");
            return (Criteria) this;
        }

        public Criteria andIsRefundIsNotNull() {
            addCriterion("is_refund is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefundEqualTo(Short value) {
            addCriterion("is_refund =", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotEqualTo(Short value) {
            addCriterion("is_refund <>", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundGreaterThan(Short value) {
            addCriterion("is_refund >", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundGreaterThanOrEqualTo(Short value) {
            addCriterion("is_refund >=", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundLessThan(Short value) {
            addCriterion("is_refund <", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundLessThanOrEqualTo(Short value) {
            addCriterion("is_refund <=", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundIn(List<Short> values) {
            addCriterion("is_refund in", values, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotIn(List<Short> values) {
            addCriterion("is_refund not in", values, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundBetween(Short value1, Short value2) {
            addCriterion("is_refund between", value1, value2, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotBetween(Short value1, Short value2) {
            addCriterion("is_refund not between", value1, value2, "isRefund");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Short value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Short value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Short value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Short value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Short value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Short value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Short> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Short> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Short value1, Short value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Short value1, Short value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateIsNull() {
            addCriterion("repayment_due_date is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateIsNotNull() {
            addCriterion("repayment_due_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_due_date =", value, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_due_date <>", value, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateGreaterThan(Date value) {
            addCriterionForJDBCDate("repayment_due_date >", value, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_due_date >=", value, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateLessThan(Date value) {
            addCriterionForJDBCDate("repayment_due_date <", value, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_due_date <=", value, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_due_date in", values, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_due_date not in", values, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_due_date between", value1, value2, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDueDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_due_date not between", value1, value2, "repaymentDueDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIsNull() {
            addCriterion("repayment_status is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIsNotNull() {
            addCriterion("repayment_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusEqualTo(Integer value) {
            addCriterion("repayment_status =", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotEqualTo(Integer value) {
            addCriterion("repayment_status <>", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusGreaterThan(Integer value) {
            addCriterion("repayment_status >", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_status >=", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLessThan(Integer value) {
            addCriterion("repayment_status <", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_status <=", value, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusIn(List<Integer> values) {
            addCriterion("repayment_status in", values, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotIn(List<Integer> values) {
            addCriterion("repayment_status not in", values, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("repayment_status between", value1, value2, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_status not between", value1, value2, "repaymentStatus");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNull() {
            addCriterion("repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNotNull() {
            addCriterion("repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_date =", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_date <>", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("repayment_date >", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_date >=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("repayment_date <", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repayment_date <=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_date in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repayment_date not in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_date between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repayment_date not between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalIsNull() {
            addCriterion("receivable_principal is null");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalIsNotNull() {
            addCriterion("receivable_principal is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalEqualTo(BigDecimal value) {
            addCriterion("receivable_principal =", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalNotEqualTo(BigDecimal value) {
            addCriterion("receivable_principal <>", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalGreaterThan(BigDecimal value) {
            addCriterion("receivable_principal >", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_principal >=", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalLessThan(BigDecimal value) {
            addCriterion("receivable_principal <", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_principal <=", value, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalIn(List<BigDecimal> values) {
            addCriterion("receivable_principal in", values, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalNotIn(List<BigDecimal> values) {
            addCriterion("receivable_principal not in", values, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_principal between", value1, value2, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivablePrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_principal not between", value1, value2, "receivablePrincipal");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeIsNull() {
            addCriterion("receivable_handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeIsNotNull() {
            addCriterion("receivable_handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeEqualTo(BigDecimal value) {
            addCriterion("receivable_handling_charge =", value, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeNotEqualTo(BigDecimal value) {
            addCriterion("receivable_handling_charge <>", value, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeGreaterThan(BigDecimal value) {
            addCriterion("receivable_handling_charge >", value, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_handling_charge >=", value, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeLessThan(BigDecimal value) {
            addCriterion("receivable_handling_charge <", value, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_handling_charge <=", value, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeIn(List<BigDecimal> values) {
            addCriterion("receivable_handling_charge in", values, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeNotIn(List<BigDecimal> values) {
            addCriterion("receivable_handling_charge not in", values, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_handling_charge between", value1, value2, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableHandlingChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_handling_charge not between", value1, value2, "receivableHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestIsNull() {
            addCriterion("receivable_interest is null");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestIsNotNull() {
            addCriterion("receivable_interest is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestEqualTo(BigDecimal value) {
            addCriterion("receivable_interest =", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestNotEqualTo(BigDecimal value) {
            addCriterion("receivable_interest <>", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestGreaterThan(BigDecimal value) {
            addCriterion("receivable_interest >", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_interest >=", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestLessThan(BigDecimal value) {
            addCriterion("receivable_interest <", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_interest <=", value, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestIn(List<BigDecimal> values) {
            addCriterion("receivable_interest in", values, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestNotIn(List<BigDecimal> values) {
            addCriterion("receivable_interest not in", values, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_interest between", value1, value2, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_interest not between", value1, value2, "receivableInterest");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalIsNull() {
            addCriterion("receivable_total is null");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalIsNotNull() {
            addCriterion("receivable_total is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalEqualTo(BigDecimal value) {
            addCriterion("receivable_total =", value, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalNotEqualTo(BigDecimal value) {
            addCriterion("receivable_total <>", value, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalGreaterThan(BigDecimal value) {
            addCriterion("receivable_total >", value, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_total >=", value, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalLessThan(BigDecimal value) {
            addCriterion("receivable_total <", value, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_total <=", value, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalIn(List<BigDecimal> values) {
            addCriterion("receivable_total in", values, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalNotIn(List<BigDecimal> values) {
            addCriterion("receivable_total not in", values, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_total between", value1, value2, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andReceivableTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_total not between", value1, value2, "receivableTotal");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeIsNull() {
            addCriterion("interest_free_coupon_reduce_handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeIsNotNull() {
            addCriterion("interest_free_coupon_reduce_handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeEqualTo(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_handling_charge =", value, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeNotEqualTo(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_handling_charge <>", value, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeGreaterThan(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_handling_charge >", value, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_handling_charge >=", value, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeLessThan(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_handling_charge <", value, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_handling_charge <=", value, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeIn(List<BigDecimal> values) {
            addCriterion("interest_free_coupon_reduce_handling_charge in", values, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeNotIn(List<BigDecimal> values) {
            addCriterion("interest_free_coupon_reduce_handling_charge not in", values, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_free_coupon_reduce_handling_charge between", value1, value2, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceHandlingChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_free_coupon_reduce_handling_charge not between", value1, value2, "interestFreeCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestIsNull() {
            addCriterion("interest_free_coupon_reduce_interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestIsNotNull() {
            addCriterion("interest_free_coupon_reduce_interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestEqualTo(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_interest =", value, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestNotEqualTo(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_interest <>", value, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestGreaterThan(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_interest >", value, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_interest >=", value, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestLessThan(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_interest <", value, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_free_coupon_reduce_interest <=", value, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestIn(List<BigDecimal> values) {
            addCriterion("interest_free_coupon_reduce_interest in", values, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestNotIn(List<BigDecimal> values) {
            addCriterion("interest_free_coupon_reduce_interest not in", values, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_free_coupon_reduce_interest between", value1, value2, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponReduceInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_free_coupon_reduce_interest not between", value1, value2, "interestFreeCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberIsNull() {
            addCriterion("interest_free_coupon_number is null");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberIsNotNull() {
            addCriterion("interest_free_coupon_number is not null");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberEqualTo(Long value) {
            addCriterion("interest_free_coupon_number =", value, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberNotEqualTo(Long value) {
            addCriterion("interest_free_coupon_number <>", value, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberGreaterThan(Long value) {
            addCriterion("interest_free_coupon_number >", value, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("interest_free_coupon_number >=", value, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberLessThan(Long value) {
            addCriterion("interest_free_coupon_number <", value, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberLessThanOrEqualTo(Long value) {
            addCriterion("interest_free_coupon_number <=", value, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberIn(List<Long> values) {
            addCriterion("interest_free_coupon_number in", values, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberNotIn(List<Long> values) {
            addCriterion("interest_free_coupon_number not in", values, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberBetween(Long value1, Long value2) {
            addCriterion("interest_free_coupon_number between", value1, value2, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andInterestFreeCouponNumberNotBetween(Long value1, Long value2) {
            addCriterion("interest_free_coupon_number not between", value1, value2, "interestFreeCouponNumber");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNull() {
            addCriterion("overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(Short value) {
            addCriterion("overdue_days =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(Short value) {
            addCriterion("overdue_days <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(Short value) {
            addCriterion("overdue_days >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("overdue_days >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(Short value) {
            addCriterion("overdue_days <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(Short value) {
            addCriterion("overdue_days <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<Short> values) {
            addCriterion("overdue_days in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<Short> values) {
            addCriterion("overdue_days not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(Short value1, Short value2) {
            addCriterion("overdue_days between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(Short value1, Short value2) {
            addCriterion("overdue_days not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeIsNull() {
            addCriterion("overdue_type is null");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeIsNotNull() {
            addCriterion("overdue_type is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeEqualTo(Short value) {
            addCriterion("overdue_type =", value, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeNotEqualTo(Short value) {
            addCriterion("overdue_type <>", value, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeGreaterThan(Short value) {
            addCriterion("overdue_type >", value, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("overdue_type >=", value, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeLessThan(Short value) {
            addCriterion("overdue_type <", value, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeLessThanOrEqualTo(Short value) {
            addCriterion("overdue_type <=", value, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeIn(List<Short> values) {
            addCriterion("overdue_type in", values, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeNotIn(List<Short> values) {
            addCriterion("overdue_type not in", values, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeBetween(Short value1, Short value2) {
            addCriterion("overdue_type between", value1, value2, "overdueType");
            return (Criteria) this;
        }

        public Criteria andOverdueTypeNotBetween(Short value1, Short value2) {
            addCriterion("overdue_type not between", value1, value2, "overdueType");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyIsNull() {
            addCriterion("receivable_penalty is null");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyIsNotNull() {
            addCriterion("receivable_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyEqualTo(BigDecimal value) {
            addCriterion("receivable_penalty =", value, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyNotEqualTo(BigDecimal value) {
            addCriterion("receivable_penalty <>", value, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyGreaterThan(BigDecimal value) {
            addCriterion("receivable_penalty >", value, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_penalty >=", value, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyLessThan(BigDecimal value) {
            addCriterion("receivable_penalty <", value, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receivable_penalty <=", value, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyIn(List<BigDecimal> values) {
            addCriterion("receivable_penalty in", values, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyNotIn(List<BigDecimal> values) {
            addCriterion("receivable_penalty not in", values, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_penalty between", value1, value2, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andReceivablePenaltyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receivable_penalty not between", value1, value2, "receivablePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeIsNull() {
            addCriterion("manual_modify_reduce_handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeIsNotNull() {
            addCriterion("manual_modify_reduce_handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_handling_charge =", value, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeNotEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_handling_charge <>", value, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeGreaterThan(BigDecimal value) {
            addCriterion("manual_modify_reduce_handling_charge >", value, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_handling_charge >=", value, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeLessThan(BigDecimal value) {
            addCriterion("manual_modify_reduce_handling_charge <", value, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_handling_charge <=", value, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeIn(List<BigDecimal> values) {
            addCriterion("manual_modify_reduce_handling_charge in", values, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeNotIn(List<BigDecimal> values) {
            addCriterion("manual_modify_reduce_handling_charge not in", values, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_modify_reduce_handling_charge between", value1, value2, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceHandlingChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_modify_reduce_handling_charge not between", value1, value2, "manualModifyReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestIsNull() {
            addCriterion("manual_modify_reduce_interest is null");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestIsNotNull() {
            addCriterion("manual_modify_reduce_interest is not null");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_interest =", value, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestNotEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_interest <>", value, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestGreaterThan(BigDecimal value) {
            addCriterion("manual_modify_reduce_interest >", value, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_interest >=", value, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestLessThan(BigDecimal value) {
            addCriterion("manual_modify_reduce_interest <", value, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_interest <=", value, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestIn(List<BigDecimal> values) {
            addCriterion("manual_modify_reduce_interest in", values, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestNotIn(List<BigDecimal> values) {
            addCriterion("manual_modify_reduce_interest not in", values, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_modify_reduce_interest between", value1, value2, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReduceInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_modify_reduce_interest not between", value1, value2, "manualModifyReduceInterest");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyIsNull() {
            addCriterion("manual_modify_reduce_penalty is null");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyIsNotNull() {
            addCriterion("manual_modify_reduce_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_penalty =", value, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyNotEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_penalty <>", value, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyGreaterThan(BigDecimal value) {
            addCriterion("manual_modify_reduce_penalty >", value, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_penalty >=", value, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyLessThan(BigDecimal value) {
            addCriterion("manual_modify_reduce_penalty <", value, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("manual_modify_reduce_penalty <=", value, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyIn(List<BigDecimal> values) {
            addCriterion("manual_modify_reduce_penalty in", values, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyNotIn(List<BigDecimal> values) {
            addCriterion("manual_modify_reduce_penalty not in", values, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_modify_reduce_penalty between", value1, value2, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andManualModifyReducePenaltyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("manual_modify_reduce_penalty not between", value1, value2, "manualModifyReducePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeIsNull() {
            addCriterion("prepayment_reduce_handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeIsNotNull() {
            addCriterion("prepayment_reduce_handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeEqualTo(BigDecimal value) {
            addCriterion("prepayment_reduce_handling_charge =", value, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeNotEqualTo(BigDecimal value) {
            addCriterion("prepayment_reduce_handling_charge <>", value, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeGreaterThan(BigDecimal value) {
            addCriterion("prepayment_reduce_handling_charge >", value, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prepayment_reduce_handling_charge >=", value, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeLessThan(BigDecimal value) {
            addCriterion("prepayment_reduce_handling_charge <", value, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prepayment_reduce_handling_charge <=", value, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeIn(List<BigDecimal> values) {
            addCriterion("prepayment_reduce_handling_charge in", values, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeNotIn(List<BigDecimal> values) {
            addCriterion("prepayment_reduce_handling_charge not in", values, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepayment_reduce_handling_charge between", value1, value2, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceHandlingChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepayment_reduce_handling_charge not between", value1, value2, "prepaymentReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestIsNull() {
            addCriterion("prepayment_reduce_interest is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestIsNotNull() {
            addCriterion("prepayment_reduce_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestEqualTo(BigDecimal value) {
            addCriterion("prepayment_reduce_interest =", value, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestNotEqualTo(BigDecimal value) {
            addCriterion("prepayment_reduce_interest <>", value, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestGreaterThan(BigDecimal value) {
            addCriterion("prepayment_reduce_interest >", value, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prepayment_reduce_interest >=", value, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestLessThan(BigDecimal value) {
            addCriterion("prepayment_reduce_interest <", value, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prepayment_reduce_interest <=", value, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestIn(List<BigDecimal> values) {
            addCriterion("prepayment_reduce_interest in", values, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestNotIn(List<BigDecimal> values) {
            addCriterion("prepayment_reduce_interest not in", values, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepayment_reduce_interest between", value1, value2, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReduceInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepayment_reduce_interest not between", value1, value2, "prepaymentReduceInterest");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyIsNull() {
            addCriterion("prepayment_receivable_penalty is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyIsNotNull() {
            addCriterion("prepayment_receivable_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyEqualTo(BigDecimal value) {
            addCriterion("prepayment_receivable_penalty =", value, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyNotEqualTo(BigDecimal value) {
            addCriterion("prepayment_receivable_penalty <>", value, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyGreaterThan(BigDecimal value) {
            addCriterion("prepayment_receivable_penalty >", value, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prepayment_receivable_penalty >=", value, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyLessThan(BigDecimal value) {
            addCriterion("prepayment_receivable_penalty <", value, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prepayment_receivable_penalty <=", value, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyIn(List<BigDecimal> values) {
            addCriterion("prepayment_receivable_penalty in", values, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyNotIn(List<BigDecimal> values) {
            addCriterion("prepayment_receivable_penalty not in", values, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepayment_receivable_penalty between", value1, value2, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andPrepaymentReceivablePenaltyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepayment_receivable_penalty not between", value1, value2, "prepaymentReceivablePenalty");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalIsNull() {
            addCriterion("repayment_coupon_reduce_principal is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalIsNotNull() {
            addCriterion("repayment_coupon_reduce_principal is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_principal =", value, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalNotEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_principal <>", value, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalGreaterThan(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_principal >", value, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_principal >=", value, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalLessThan(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_principal <", value, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_principal <=", value, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalIn(List<BigDecimal> values) {
            addCriterion("repayment_coupon_reduce_principal in", values, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalNotIn(List<BigDecimal> values) {
            addCriterion("repayment_coupon_reduce_principal not in", values, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_coupon_reduce_principal between", value1, value2, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReducePrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_coupon_reduce_principal not between", value1, value2, "repaymentCouponReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeIsNull() {
            addCriterion("repayment_coupon_reduce_handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeIsNotNull() {
            addCriterion("repayment_coupon_reduce_handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_handling_charge =", value, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeNotEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_handling_charge <>", value, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeGreaterThan(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_handling_charge >", value, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_handling_charge >=", value, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeLessThan(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_handling_charge <", value, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_handling_charge <=", value, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeIn(List<BigDecimal> values) {
            addCriterion("repayment_coupon_reduce_handling_charge in", values, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeNotIn(List<BigDecimal> values) {
            addCriterion("repayment_coupon_reduce_handling_charge not in", values, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_coupon_reduce_handling_charge between", value1, value2, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceHandlingChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_coupon_reduce_handling_charge not between", value1, value2, "repaymentCouponReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestIsNull() {
            addCriterion("repayment_coupon_reduce_interest is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestIsNotNull() {
            addCriterion("repayment_coupon_reduce_interest is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_interest =", value, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestNotEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_interest <>", value, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestGreaterThan(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_interest >", value, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_interest >=", value, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestLessThan(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_interest <", value, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_coupon_reduce_interest <=", value, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestIn(List<BigDecimal> values) {
            addCriterion("repayment_coupon_reduce_interest in", values, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestNotIn(List<BigDecimal> values) {
            addCriterion("repayment_coupon_reduce_interest not in", values, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_coupon_reduce_interest between", value1, value2, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentCouponReduceInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_coupon_reduce_interest not between", value1, value2, "repaymentCouponReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalIsNull() {
            addCriterion("collection_reduce_principal is null");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalIsNotNull() {
            addCriterion("collection_reduce_principal is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_principal =", value, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalNotEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_principal <>", value, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalGreaterThan(BigDecimal value) {
            addCriterion("collection_reduce_principal >", value, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_principal >=", value, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalLessThan(BigDecimal value) {
            addCriterion("collection_reduce_principal <", value, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_principal <=", value, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalIn(List<BigDecimal> values) {
            addCriterion("collection_reduce_principal in", values, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalNotIn(List<BigDecimal> values) {
            addCriterion("collection_reduce_principal not in", values, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_reduce_principal between", value1, value2, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_reduce_principal not between", value1, value2, "collectionReducePrincipal");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeIsNull() {
            addCriterion("collection_reduce_handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeIsNotNull() {
            addCriterion("collection_reduce_handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_handling_charge =", value, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeNotEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_handling_charge <>", value, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeGreaterThan(BigDecimal value) {
            addCriterion("collection_reduce_handling_charge >", value, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_handling_charge >=", value, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeLessThan(BigDecimal value) {
            addCriterion("collection_reduce_handling_charge <", value, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_handling_charge <=", value, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeIn(List<BigDecimal> values) {
            addCriterion("collection_reduce_handling_charge in", values, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeNotIn(List<BigDecimal> values) {
            addCriterion("collection_reduce_handling_charge not in", values, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_reduce_handling_charge between", value1, value2, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceHandlingChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_reduce_handling_charge not between", value1, value2, "collectionReduceHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestIsNull() {
            addCriterion("collection_reduce_interest is null");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestIsNotNull() {
            addCriterion("collection_reduce_interest is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_interest =", value, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestNotEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_interest <>", value, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestGreaterThan(BigDecimal value) {
            addCriterion("collection_reduce_interest >", value, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_interest >=", value, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestLessThan(BigDecimal value) {
            addCriterion("collection_reduce_interest <", value, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_interest <=", value, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestIn(List<BigDecimal> values) {
            addCriterion("collection_reduce_interest in", values, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestNotIn(List<BigDecimal> values) {
            addCriterion("collection_reduce_interest not in", values, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_reduce_interest between", value1, value2, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReduceInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_reduce_interest not between", value1, value2, "collectionReduceInterest");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyIsNull() {
            addCriterion("collection_reduce_penalty is null");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyIsNotNull() {
            addCriterion("collection_reduce_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_penalty =", value, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyNotEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_penalty <>", value, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyGreaterThan(BigDecimal value) {
            addCriterion("collection_reduce_penalty >", value, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_penalty >=", value, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyLessThan(BigDecimal value) {
            addCriterion("collection_reduce_penalty <", value, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_reduce_penalty <=", value, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyIn(List<BigDecimal> values) {
            addCriterion("collection_reduce_penalty in", values, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyNotIn(List<BigDecimal> values) {
            addCriterion("collection_reduce_penalty not in", values, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_reduce_penalty between", value1, value2, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andCollectionReducePenaltyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_reduce_penalty not between", value1, value2, "collectionReducePenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalIsNull() {
            addCriterion("actual_repayment_principal is null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalIsNotNull() {
            addCriterion("actual_repayment_principal is not null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_principal =", value, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_principal <>", value, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalGreaterThan(BigDecimal value) {
            addCriterion("actual_repayment_principal >", value, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_principal >=", value, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalLessThan(BigDecimal value) {
            addCriterion("actual_repayment_principal <", value, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_principal <=", value, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_principal in", values, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_principal not in", values, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_principal between", value1, value2, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_principal not between", value1, value2, "actualRepaymentPrincipal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeIsNull() {
            addCriterion("actual_repayment_handling_charge is null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeIsNotNull() {
            addCriterion("actual_repayment_handling_charge is not null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_handling_charge =", value, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeNotEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_handling_charge <>", value, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeGreaterThan(BigDecimal value) {
            addCriterion("actual_repayment_handling_charge >", value, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_handling_charge >=", value, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeLessThan(BigDecimal value) {
            addCriterion("actual_repayment_handling_charge <", value, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_handling_charge <=", value, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_handling_charge in", values, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeNotIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_handling_charge not in", values, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_handling_charge between", value1, value2, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentHandlingChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_handling_charge not between", value1, value2, "actualRepaymentHandlingCharge");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestIsNull() {
            addCriterion("actual_repayment_interest is null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestIsNotNull() {
            addCriterion("actual_repayment_interest is not null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_interest =", value, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestNotEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_interest <>", value, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestGreaterThan(BigDecimal value) {
            addCriterion("actual_repayment_interest >", value, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_interest >=", value, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestLessThan(BigDecimal value) {
            addCriterion("actual_repayment_interest <", value, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_interest <=", value, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_interest in", values, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestNotIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_interest not in", values, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_interest between", value1, value2, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_interest not between", value1, value2, "actualRepaymentInterest");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyIsNull() {
            addCriterion("actual_repayment_penalty is null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyIsNotNull() {
            addCriterion("actual_repayment_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_penalty =", value, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyNotEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_penalty <>", value, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyGreaterThan(BigDecimal value) {
            addCriterion("actual_repayment_penalty >", value, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_penalty >=", value, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyLessThan(BigDecimal value) {
            addCriterion("actual_repayment_penalty <", value, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_penalty <=", value, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_penalty in", values, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyNotIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_penalty not in", values, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_penalty between", value1, value2, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentPenaltyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_penalty not between", value1, value2, "actualRepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyIsNull() {
            addCriterion("actual_prepayment_penalty is null");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyIsNotNull() {
            addCriterion("actual_prepayment_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyEqualTo(BigDecimal value) {
            addCriterion("actual_prepayment_penalty =", value, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyNotEqualTo(BigDecimal value) {
            addCriterion("actual_prepayment_penalty <>", value, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyGreaterThan(BigDecimal value) {
            addCriterion("actual_prepayment_penalty >", value, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_prepayment_penalty >=", value, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyLessThan(BigDecimal value) {
            addCriterion("actual_prepayment_penalty <", value, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_prepayment_penalty <=", value, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyIn(List<BigDecimal> values) {
            addCriterion("actual_prepayment_penalty in", values, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyNotIn(List<BigDecimal> values) {
            addCriterion("actual_prepayment_penalty not in", values, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_prepayment_penalty between", value1, value2, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualPrepaymentPenaltyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_prepayment_penalty not between", value1, value2, "actualPrepaymentPenalty");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalIsNull() {
            addCriterion("actual_repayment_total is null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalIsNotNull() {
            addCriterion("actual_repayment_total is not null");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_total =", value, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalNotEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_total <>", value, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalGreaterThan(BigDecimal value) {
            addCriterion("actual_repayment_total >", value, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_total >=", value, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalLessThan(BigDecimal value) {
            addCriterion("actual_repayment_total <", value, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_repayment_total <=", value, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_total in", values, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalNotIn(List<BigDecimal> values) {
            addCriterion("actual_repayment_total not in", values, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_total between", value1, value2, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andActualRepaymentTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_repayment_total not between", value1, value2, "actualRepaymentTotal");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andRtimeIsNull() {
            addCriterion("rtime is null");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNotNull() {
            addCriterion("rtime is not null");
            return (Criteria) this;
        }

        public Criteria andRtimeEqualTo(Date value) {
            addCriterion("rtime =", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotEqualTo(Date value) {
            addCriterion("rtime <>", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThan(Date value) {
            addCriterion("rtime >", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rtime >=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThan(Date value) {
            addCriterion("rtime <", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThanOrEqualTo(Date value) {
            addCriterion("rtime <=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeIn(List<Date> values) {
            addCriterion("rtime in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotIn(List<Date> values) {
            addCriterion("rtime not in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeBetween(Date value1, Date value2) {
            addCriterion("rtime between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotBetween(Date value1, Date value2) {
            addCriterion("rtime not between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(Long value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(Long value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(Long value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(Long value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(Long value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(Long value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<Long> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<Long> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(Long value1, Long value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(Long value1, Long value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(Long value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(Long value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(Long value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(Long value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(Long value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(Long value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<Long> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<Long> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(Long value1, Long value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(Long value1, Long value2) {
            addCriterion("updater not between", value1, value2, "updater");
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

        public Criteria andIsdelEqualTo(Short value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(Short value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(Short value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(Short value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(Short value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(Short value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<Short> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<Short> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(Short value1, Short value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(Short value1, Short value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNull() {
            addCriterion("periods is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsIsNotNull() {
            addCriterion("periods is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsEqualTo(Short value) {
            addCriterion("periods =", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotEqualTo(Short value) {
            addCriterion("periods <>", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThan(Short value) {
            addCriterion("periods >", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsGreaterThanOrEqualTo(Short value) {
            addCriterion("periods >=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThan(Short value) {
            addCriterion("periods <", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsLessThanOrEqualTo(Short value) {
            addCriterion("periods <=", value, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsIn(List<Short> values) {
            addCriterion("periods in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotIn(List<Short> values) {
            addCriterion("periods not in", values, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsBetween(Short value1, Short value2) {
            addCriterion("periods between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andPeriodsNotBetween(Short value1, Short value2) {
            addCriterion("periods not between", value1, value2, "periods");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdIsNull() {
            addCriterion("third_account_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdIsNotNull() {
            addCriterion("third_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdEqualTo(String value) {
            addCriterion("third_account_id =", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdNotEqualTo(String value) {
            addCriterion("third_account_id <>", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdGreaterThan(String value) {
            addCriterion("third_account_id >", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_account_id >=", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdLessThan(String value) {
            addCriterion("third_account_id <", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdLessThanOrEqualTo(String value) {
            addCriterion("third_account_id <=", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdLike(String value) {
            addCriterion("third_account_id like", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdNotLike(String value) {
            addCriterion("third_account_id not like", value, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdIn(List<String> values) {
            addCriterion("third_account_id in", values, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdNotIn(List<String> values) {
            addCriterion("third_account_id not in", values, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdBetween(String value1, String value2) {
            addCriterion("third_account_id between", value1, value2, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdAccountIdNotBetween(String value1, String value2) {
            addCriterion("third_account_id not between", value1, value2, "thirdAccountId");
            return (Criteria) this;
        }

        public Criteria andThirdChargeIsNull() {
            addCriterion("third_charge is null");
            return (Criteria) this;
        }

        public Criteria andThirdChargeIsNotNull() {
            addCriterion("third_charge is not null");
            return (Criteria) this;
        }

        public Criteria andThirdChargeEqualTo(BigDecimal value) {
            addCriterion("third_charge =", value, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeNotEqualTo(BigDecimal value) {
            addCriterion("third_charge <>", value, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeGreaterThan(BigDecimal value) {
            addCriterion("third_charge >", value, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("third_charge >=", value, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeLessThan(BigDecimal value) {
            addCriterion("third_charge <", value, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("third_charge <=", value, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeIn(List<BigDecimal> values) {
            addCriterion("third_charge in", values, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeNotIn(List<BigDecimal> values) {
            addCriterion("third_charge not in", values, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("third_charge between", value1, value2, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andThirdChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("third_charge not between", value1, value2, "thirdCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeIsNull() {
            addCriterion("platform_charge is null");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeIsNotNull() {
            addCriterion("platform_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeEqualTo(BigDecimal value) {
            addCriterion("platform_charge =", value, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeNotEqualTo(BigDecimal value) {
            addCriterion("platform_charge <>", value, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeGreaterThan(BigDecimal value) {
            addCriterion("platform_charge >", value, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_charge >=", value, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeLessThan(BigDecimal value) {
            addCriterion("platform_charge <", value, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_charge <=", value, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeIn(List<BigDecimal> values) {
            addCriterion("platform_charge in", values, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeNotIn(List<BigDecimal> values) {
            addCriterion("platform_charge not in", values, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_charge between", value1, value2, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andPlatformChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_charge not between", value1, value2, "platformCharge");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryIsNull() {
            addCriterion("is_compensatory is null");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryIsNotNull() {
            addCriterion("is_compensatory is not null");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryEqualTo(Integer value) {
            addCriterion("is_compensatory =", value, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryNotEqualTo(Integer value) {
            addCriterion("is_compensatory <>", value, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryGreaterThan(Integer value) {
            addCriterion("is_compensatory >", value, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_compensatory >=", value, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryLessThan(Integer value) {
            addCriterion("is_compensatory <", value, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryLessThanOrEqualTo(Integer value) {
            addCriterion("is_compensatory <=", value, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryIn(List<Integer> values) {
            addCriterion("is_compensatory in", values, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryNotIn(List<Integer> values) {
            addCriterion("is_compensatory not in", values, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryBetween(Integer value1, Integer value2) {
            addCriterion("is_compensatory between", value1, value2, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andIsCompensatoryNotBetween(Integer value1, Integer value2) {
            addCriterion("is_compensatory not between", value1, value2, "isCompensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeIsNull() {
            addCriterion("compensatory_time is null");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeIsNotNull() {
            addCriterion("compensatory_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeEqualTo(Date value) {
            addCriterion("compensatory_time =", value, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeNotEqualTo(Date value) {
            addCriterion("compensatory_time <>", value, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeGreaterThan(Date value) {
            addCriterion("compensatory_time >", value, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("compensatory_time >=", value, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeLessThan(Date value) {
            addCriterion("compensatory_time <", value, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeLessThanOrEqualTo(Date value) {
            addCriterion("compensatory_time <=", value, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeIn(List<Date> values) {
            addCriterion("compensatory_time in", values, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeNotIn(List<Date> values) {
            addCriterion("compensatory_time not in", values, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeBetween(Date value1, Date value2) {
            addCriterion("compensatory_time between", value1, value2, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCompensatoryTimeNotBetween(Date value1, Date value2) {
            addCriterion("compensatory_time not between", value1, value2, "compensatoryTime");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeIsNull() {
            addCriterion("combination_fee is null");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeIsNotNull() {
            addCriterion("combination_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeEqualTo(BigDecimal value) {
            addCriterion("combination_fee =", value, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeNotEqualTo(BigDecimal value) {
            addCriterion("combination_fee <>", value, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeGreaterThan(BigDecimal value) {
            addCriterion("combination_fee >", value, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("combination_fee >=", value, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeLessThan(BigDecimal value) {
            addCriterion("combination_fee <", value, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("combination_fee <=", value, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeIn(List<BigDecimal> values) {
            addCriterion("combination_fee in", values, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeNotIn(List<BigDecimal> values) {
            addCriterion("combination_fee not in", values, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("combination_fee between", value1, value2, "combinationFee");
            return (Criteria) this;
        }

        public Criteria andCombinationFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("combination_fee not between", value1, value2, "combinationFee");
            return (Criteria) this;
        }
    }

    /**
     * loan_repayment_plan
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * loan_repayment_plan 2019-04-02
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