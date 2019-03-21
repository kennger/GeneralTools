package com.cx.service.services;

import com.cx.dao.*;
import com.cx.parse.SMSContextParse;
import com.cx.pojo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("sMSService")
public class SMSService {

    @Resource
    private SMSCreditFlowDao smsCreditFlowDao;

    @Resource
    private SMSCreditRepayDao smsCreditRepayDao;

    @Resource
    private SMSLoanPlatformDao smsLoanPlatformDao;

    @Resource
    private SMSDebitDataDao smsDebitDataDao;

    @Resource
    private SMSRecordDao smsRecordDao;

    @Resource
    private SMSRecordAnalysisDao smsRecordAnalysisDao;

    @Resource
    private SMSContextParse smsContextParse;

    public Map<String,Object> getCreditFlowByUserId(String userId) {

        Map<String, Object> mapOfCreditFlow = new HashMap<>();
        try {
            if (userId != null) {
                List<SMSCreditFlow> smsCreditFlows = smsCreditFlowDao.selectByUserId(userId);
                mapOfCreditFlow = smsContextParse.CreditFlowContextParse(smsCreditFlows);
                SMSRecordAnalysis smsRecordAnalysis = new SMSRecordAnalysis();
                int isExist = smsRecordAnalysisDao.selectByUserId(userId);
                if (isExist > 0) {

                    smsRecordAnalysis.setUserId(Integer.parseInt(userId));
                    smsRecordAnalysis.setCreditConsumeFlow(mapOfCreditFlow.toString());
                    smsRecordAnalysis.setMtime(new Date());
                    smsRecordAnalysisDao.updateCreditConsumeByUserId(smsRecordAnalysis);
                } else {
                    smsRecordAnalysis.setUserId(Integer.parseInt(userId));
                    smsRecordAnalysis.setCreditConsumeFlow(mapOfCreditFlow.toString());
                    smsRecordAnalysis.setCtime(new Date());
                    smsRecordAnalysis.setMtime(new Date());
                    smsRecordAnalysis.setIsdel(false);
                    smsRecordAnalysisDao.insert(smsRecordAnalysis);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mapOfCreditFlow;
    }


    public Map<String,Object> getCreditRepayByUserId(String userId) {

        Map<String, Object> mapOfCreditRepay = new HashMap<>();

        try{
            if (userId!=null){

                List<SMSCreditRepay> smsCreditRepays = smsCreditRepayDao.selectByUserId(userId);
                mapOfCreditRepay = smsContextParse.CreditRepayContextParse(smsCreditRepays);
                SMSRecordAnalysis smsRecordAnalysis = new SMSRecordAnalysis();
                smsRecordAnalysis.setUserId(Integer.parseInt(userId));
                smsRecordAnalysis.setCreditRepayFlow(mapOfCreditRepay.toString());
                smsRecordAnalysis.setMtime(new Date());
                smsRecordAnalysisDao.updateCreditRepayByUserId(smsRecordAnalysis);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mapOfCreditRepay;

    }

    public  Map<String,Object> getDebitDataByUserId(String userId){
        Map<String, Object> mapOfDebitData = new HashMap<>();
        try{
            if (userId!=null){
                List<SMSDebitData> smsDebitDatas =smsDebitDataDao.selectByUserId(userId);
                mapOfDebitData =smsContextParse.DebitDataContextParse(smsDebitDatas);
                SMSRecordAnalysis smsRecordAnalysis = new SMSRecordAnalysis();
                    smsRecordAnalysis.setUserId(Integer.parseInt(userId));
                    smsRecordAnalysis.setDebitConsumeFlow(mapOfDebitData.get("mapR").toString()+mapOfDebitData.get("mapC").toString());
                    smsRecordAnalysis.setMtime(new Date());
                    smsRecordAnalysis.setDebitTransferFlow(mapOfDebitData.get("mapT").toString());
                    smsRecordAnalysisDao.updateDebitConsumeByUserId(smsRecordAnalysis);
                    smsRecordAnalysisDao.updateDebitTransferByUserId(smsRecordAnalysis);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mapOfDebitData;
    }


    public void updateContentTitle(){

        List<SMSLoanPlatform> smsLoanPlatformList =smsLoanPlatformDao.selectAllBlankContentTitle();
        for(int i=0;i<smsLoanPlatformList.size();i++){
            SMSLoanPlatform smsLoanPlatform = smsLoanPlatformList.get(i);
            String content =smsLoanPlatform.getContent();
            String id = smsLoanPlatform.getId();
            String phonePlatform =smsLoanPlatform.getPhonePlatform();
            String contentTitle = smsContextParse.getContentTitleFromContent(content);
            if(contentTitle==null){
                smsLoanPlatform.setContentTitle(phonePlatform);
            }else { smsLoanPlatform.setContentTitle(contentTitle);}
            smsLoanPlatform.setId(id);
            smsLoanPlatform.setMtime(new Date());
            smsLoanPlatformDao.updateContentTitle(smsLoanPlatform);

            System.out.println(i+1+" "+id+" "+ contentTitle+" "+ phonePlatform);
        }

    }

    public List<String> getAllOfSMSUserId(){

        return smsRecordDao.getAllOfSMSUserId();
    }
}
