package com.cx.service;

import com.cx.domain.RepaymentDomain;
import com.cx.service.services.RepaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("nativeRepaymentDomain")
public class NativeRepaymentDomain implements RepaymentDomain {

    @Resource
    private RepaymentService repaymentService;

    public Integer getOverdueCount(String phone){

        return repaymentService.getOverdueCount(phone);
    }
}
