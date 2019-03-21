package com.cx.domain;

import com.cx.pojo.SMSLoanPlatform;

import java.util.List;
import java.util.Map;

public interface SMSDomain {

    Map<String,Object> getCreditFlowByUserId(String userId);

    Map<String,Object> getCreditRepayByUserId(String userId);

    Map<String,Object> getDebitDataByUserId(String userId);

    void updateContentTitle();

    List<String> getAllOfSMSUserId ();


}
