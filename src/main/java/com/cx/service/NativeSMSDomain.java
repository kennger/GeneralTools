package com.cx.service;

import com.cx.domain.SMSDomain;
import com.cx.pojo.SMSLoanPlatform;
import com.cx.service.services.SMSService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("nativeDomain")
public class NativeSMSDomain implements SMSDomain  {

    @Resource
    private SMSService smsService;

    public Map<String,Object> getCreditFlowByUserId(String userId){

        return smsService.getCreditFlowByUserId(userId);
    }

    public Map<String,Object> getCreditRepayByUserId(String userId){

        return smsService.getCreditRepayByUserId(userId);
    }

    public Map<String,Object> getDebitDataByUserId(String userId){

        return smsService.getDebitDataByUserId(userId);
    }


    public void updateContentTitle(){
        smsService.updateContentTitle();
    }

    public List<String> getAllOfSMSUserId(){

        return smsService.getAllOfSMSUserId();
    }
}
