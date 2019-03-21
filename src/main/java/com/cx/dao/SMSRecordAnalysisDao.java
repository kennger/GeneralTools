package com.cx.dao;

import com.cx.pojo.SMSRecordAnalysis;
import com.cx.pojo.SMSRecordAnalysisExample;

import java.util.List;

public interface SMSRecordAnalysisDao {
    /**
     *
     * @mbggenerated 2019-03-15
     */
    int countByExample(SMSRecordAnalysisExample example);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    int insert(SMSRecordAnalysis record);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    int insertSelective(SMSRecordAnalysis record);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    List<SMSRecordAnalysis> selectByExample(SMSRecordAnalysisExample example);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    SMSRecordAnalysis selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    int updateByPrimaryKeySelective(SMSRecordAnalysis record);

    /**
     *
     * @mbggenerated 2019-03-15
     */
    int updateByPrimaryKey(SMSRecordAnalysis record);


    int updateCreditConsumeByUserId(SMSRecordAnalysis record);

    int updateCreditRepayByUserId(SMSRecordAnalysis record);

    int updateDebitConsumeByUserId(SMSRecordAnalysis record);

    int updateDebitTransferByUserId(SMSRecordAnalysis record);

    int selectByUserId(String userId);
}