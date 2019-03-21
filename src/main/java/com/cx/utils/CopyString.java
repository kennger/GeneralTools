package com.cx.utils;

public class CopyString {

    public static void test(){

        for(int i=0;i<100;i++){
            System.out.println("select user_id, GROUP_CONCAT(mobile) as contacts , ctime from p2p_risk.risk_contacts_"+i+" group by user_id");
            System.out.println("union");
        }
    }

    public static void main(String [] args){
        test();
    }
}
