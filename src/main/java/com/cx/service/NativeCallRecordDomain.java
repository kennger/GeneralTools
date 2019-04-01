package com.cx.service;

import com.cx.domain.CallRecordDomain;
import com.cx.service.services.CallRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("nativeCallRecordDomain")
public class NativeCallRecordDomain implements CallRecordDomain {

    @Resource
    private CallRecordService callRecordService;


    public List<String> getUserLoanId(){

        return callRecordService.getUserLoanId();
    }

    public List<String> getContactsLoanTelephone(String userId){

        return callRecordService.getContactsLoanTelephone(userId);
    }

}
