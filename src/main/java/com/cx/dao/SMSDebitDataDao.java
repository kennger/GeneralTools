package com.cx.dao;

import com.cx.pojo.SMSDebitData;
import com.cx.pojo.SMSDebitDataExample;

import java.util.List;

public interface SMSDebitDataDao {
    /**
     *
     * @mbggenerated 2019-03-19
     */
    int countByExample(SMSDebitDataExample example);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int insert(SMSDebitData record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int insertSelective(SMSDebitData record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    List<SMSDebitData> selectByExample(SMSDebitDataExample example);

    List<SMSDebitData> selectByUserId(String userId);
}