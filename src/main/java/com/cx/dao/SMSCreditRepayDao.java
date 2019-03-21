package com.cx.dao;

import com.cx.pojo.SMSCreditRepay;
import com.cx.pojo.SMSCreditRepayExample;

import java.util.List;

public interface SMSCreditRepayDao {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int countByExample(SMSCreditRepayExample example);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SMSCreditRepay record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SMSCreditRepay record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    List<SMSCreditRepay> selectByExample(SMSCreditRepayExample example);

    List<SMSCreditRepay> selectByUserId(String userId);
}