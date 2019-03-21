package com.cx.dao;

import com.cx.pojo.SMSLoanPlatform;
import com.cx.pojo.SMSLoanPlatformExample;

import java.util.List;

public interface SMSLoanPlatformDao {
    /**
     *
     * @mbggenerated 2019-03-20
     */
    int countByExample(SMSLoanPlatformExample example);

    /**
     *
     * @mbggenerated 2019-03-20
     */
    int insert(SMSLoanPlatform record);

    /**
     *
     * @mbggenerated 2019-03-20
     */
    int insertSelective(SMSLoanPlatform record);

    /**
     *
     * @mbggenerated 2019-03-20
     */
    List<SMSLoanPlatform> selectByExample(SMSLoanPlatformExample example);

    List<SMSLoanPlatform> selectAllBlankContentTitle();

    int updateContentTitle (SMSLoanPlatform record);
}