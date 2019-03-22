package test;

import com.cx.domain.SMSDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
public class TestInterface {


    @Autowired
    private SMSDomain nativeDomain;

    @Test
    public void testCreditFlow() {
//
//        String userId ="1748";
//        System.out.println(nativeDomain.getCreditFlowByUserId(userId));


        List<String> list = nativeDomain.getAllOfSMSUserId();
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
        List<String> list = nativeDomain.getAllOfSMSUserId();
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

        System.out.println(nativeDomain.getAllOfSMSUserId());
        System.out.println(nativeDomain.getAllOfSMSUserId().size());
    }

}
