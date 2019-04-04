package com.cx.dao;

import com.cx.pojo.LoanRepaymentPlan;
import com.cx.pojo.LoanRepaymentPlanExample;

import java.util.List;

public interface LoanRepaymentPlanDao {
    /**
     *
     * @mbggenerated 2019-04-02
     */
    int countByExample(LoanRepaymentPlanExample example);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int insert(LoanRepaymentPlan record);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int insertSelective(LoanRepaymentPlan record);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    List<LoanRepaymentPlan> selectByExample(LoanRepaymentPlanExample example);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    LoanRepaymentPlan selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int updateByPrimaryKeySelective(LoanRepaymentPlan record);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int updateByPrimaryKey(LoanRepaymentPlan record);

    int getOverdueCount(String userId);
}