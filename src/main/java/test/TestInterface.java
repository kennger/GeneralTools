package test;

import com.cx.dao.UserLoanContactsDao;
import com.cx.domain.CallRecordDomain;
import com.cx.domain.RepaymentDomain;
import com.cx.domain.SMSDomain;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
public class TestInterface {


    @Autowired
    private SMSDomain nativeDomain;
    @Autowired
    private CallRecordDomain callRecordDomain;
    @Autowired
    private RepaymentDomain repaymentDomain;


    @Test
    public void testCreditFlow() {
//
//        String userId ="1748";
//        System.out.println(nativeDomain.getCreditFlowByUserId(userId));

        int start =0;
        int pageSize =100;
        List<String> list = nativeDomain.getAllOfSMSUserId(start);
        for(int i=0;i<list.size();i++){
            System.out.println(i+1+" "+list.get(i)+" "+nativeDomain.getCreditFlowByUserId(list.get(i)));
//            Thread.sleep(500);
        }


    }

    @Test
    public void testCreditRepay() {

//        String userId ="65";
//        System.out.println(nativeDomain.getCreditRepayByUserId(userId));

//
        int start =0;
        int pageSize =100;
        List<String> list = nativeDomain.getAllOfSMSUserId(start);
        for(int i=0;i<list.size();i++){
            System.out.println(i+1+" "+list.get(i)+" "+nativeDomain.getCreditRepayByUserId(list.get(i)));
//            Thread.sleep(500);
        }


    }

    @Test
    public void testDebitData(){
       String userId ="1748";
       System.out.println(nativeDomain.getDebitDataByUserId(userId));
    }

    @Test
    public void testUpdate(){
       nativeDomain.updateContentTitle();
    }


    @Test
    public void testOfUserID(){

        int start =0;
        int pageSize=100;
        System.out.println(nativeDomain.getAllOfSMSUserId(start));

    }


    @Test
    public void testOfCallRecord(){

        try{
            List<String> listOfUserId = callRecordDomain.getUserLoanId();
            for(int i=0;i<listOfUserId.size();i++){
                List<String> listOfContactsLoanPhone= callRecordDomain.getContactsLoanTelephone(listOfUserId.get(i));
                if(listOfContactsLoanPhone.size()>0) {
                    List<String> listOfOverdue = new ArrayList<>();
                    int count =0;
                    for(int j=0;j<listOfContactsLoanPhone.size();j++){
                        int overdueCount = repaymentDomain.getOverdueCount(listOfContactsLoanPhone.get(j));
                        listOfOverdue.add(listOfContactsLoanPhone.get(j)+"/"+overdueCount);
                        if(overdueCount>0){
                            count++;
                        }
                    }

                    System.out.println(i + 1 + "###" +
                            listOfUserId.get(i) + "###"
                            + listOfContactsLoanPhone + "###"
                            + listOfContactsLoanPhone.size()+"###"
                            + listOfOverdue.toString()+"###"
                            + count);
//                    if(i>10){
//                        break;
//                    }

                    File writename = new File("C:\\Users\\Administrator\\Desktop\\contactsLoan01.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
                    writename.createNewFile(); // 创建新文件
                    BufferedWriter out = new BufferedWriter(new FileWriter(writename,true));
                    out.write(i+1 + "#" +
                            listOfUserId.get(i) + "#"
                            + listOfContactsLoanPhone + "#"
                            + listOfContactsLoanPhone.size()+ "#"
                            + listOfOverdue+"#"
                            + count+"\r\n"); // \r\n即为换行
                    out.flush(); // 把缓存区内容压入文件
                    out.close(); // 最后记得关闭文件
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
