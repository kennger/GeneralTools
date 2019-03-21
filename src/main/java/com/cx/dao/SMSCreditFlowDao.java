package com.cx.dao;

import com.cx.bean.SMSCreditFlowBo;
import com.cx.pojo.SMSCreditFlow;
import com.cx.pojo.SMSCreditFlowExample;

import java.util.List;

public interface SMSCreditFlowDao {
    /**
     *
     * @mbggenerated 2019-03-12
     */
    int countByExample(SMSCreditFlowExample example);

    /**
     *
     * @mbggenerated 2019-03-12
     */
    int insert(SMSCreditFlow record);

    /**
     *
     * @mbggenerated 2019-03-12
     */
    int insertSelective(SMSCreditFlow record);

    /**
     *
     * @mbggenerated 2019-03-12
     */
    List<SMSCreditFlow> selectByExample(SMSCreditFlowExample example);


    List<SMSCreditFlow> selectByUserId (String userId);
}