package com.cx.dao;

import com.cx.pojo.SMSRecord;
import com.cx.pojo.SMSRecordExample;

import java.util.List;

public interface SMSRecordDao {
    /**
     *
     * @mbggenerated 2019-03-15
     */
    int countByExample(SMSRecordExample example);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    int insert(SMSRecord record);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    int insertSelective(SMSRecord record);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    List<SMSRecord> selectByExample(SMSRecordExample example);


    List<String> getAllOfSMSUserId();
}