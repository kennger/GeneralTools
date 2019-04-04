package com.cx.service.services;

import com.cx.dao.LoanRepaymentPlanDao;
import com.cx.dao.UserLoanContactsDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("repaymentService")
public class RepaymentService {

    @Resource
    private LoanRepaymentPlanDao loanRepaymentPlanDao;

    @Resource
    private UserLoanContactsDao userLoanContactsDao;

    public Integer getOverdueCount(String phone){
        int overdueCount=0;
        if(phone!=null){

            String userId =userLoanContactsDao.getUserIdByPhone(phone);
            if(userId!=null){
                overdueCount  =loanRepaymentPlanDao.getOverdueCount(userId);
            }
        }
        return overdueCount;
    }
}
