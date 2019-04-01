package com.cx.utils;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadTxt {

    public  String smsParse (String str){

        String ifOverdueUnpay ="false";
        String ifAskedToPay = "false";
        String ifExcutedByCourt = "false";
//        String ifUnrealizedOverduePay = false;
        String ifOverduePay = "false";
        Map<String,String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        if(str.replace(" ","").contains("已逾期")
                ||str.replace(" ","").contains("已经逾期")
                ||str.replace(" ","").contains("存在逾期")
                ||str.replace(" ","").contains("已超期")
                ||str.replace(" ","").contains("已超过还款")
                ||str.replace(" ","").contains("已超出约定")
                ||str.replace(" ","").contains("已超过约定")
                ||str.replace(" ","").contains("已超出还款")
                ||str.replace(" ","").contains("逾期已超")
                ||str.replace(" ","").contains("不清偿")
                ||str.replace(" ","").contains("已严重超期")
                ||str.replace(" ","").contains("已过约定")
                ||str.replace(" ","").contains("已过还款")
                ||str.replace(" ","").contains("多次催收")
                ||str.replace(" ","").contains("多次提醒")
                ||str.replace(" ","").contains("多次致电")
                ||str.replace(" ","").contains("拒绝沟通")
                ||str.replace(" ","").contains("恶意拖欠")
                ||str.replace(" ","").contains("欠款催缴")
                ||str.replace(" ","").contains("多次催告")){
           ifOverdueUnpay ="逾期";
        }
        if(str.replace(" ","").contains("多次催收")
                ||str.replace(" ","").contains("多次提醒")
                ||str.replace(" ","").contains("多次致电")
                ||str.replace(" ","").contains("拒绝沟通")
                ||str.replace(" ","").contains("恶意拖欠")
                ||str.replace(" ","").contains("欠款催缴")
                ||str.replace(" ","").contains("多次催告")){
            ifAskedToPay = "被人工催收";
        }
        if(str.replace(" ","").contains("法院")&&
                str.replace(" ","").contains("已立案")) {
            ifExcutedByCourt = "被法院强制执行";
        }
//        if(str.replace(" ","").contains("已逾期")&&
//                str.replace(" ","").contains("已还清")&&
//                (!str.replace(" ","").contains("如已还")||
//                        !str.replace(" ","").contains("若已还")) ){
//            ifOverduePay ="逾期已还" ;
//        }
        
        list.add(ifOverdueUnpay);
        list.add(ifAskedToPay);
        list.add(ifExcutedByCourt);
//        list.add(ifOverduePay);

        return list.toString();
    }


    public String getCashFlowFromSMS (String str){
        String consumeResult ="";
        if(str.contains("银行")&&str.contains("信用卡")&&str.contains("消费")&&!str.contains("失败")){
            int indexOfConsume = str.indexOf("消费");
            int indexOfYuan = str.indexOf("元");
            String consumeAmount = str.substring(indexOfConsume,indexOfYuan);
            String regex ="[^(0-9)|(\\.(0-9))]";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(consumeAmount);
            consumeResult =m.replaceAll("").trim();
        }
        return consumeResult;
    }

   public static void main(String args[]) {
//        ReadTxt readTxt = new ReadTxt();
//        String str = "您尾号0316信用卡09/17-10/16账单应还款额￥7968.00，最低还款额￥804.90，到期还款日11月10日。截止11月10日本期剩余应还款额￥7968.00，剩余最低还款额￥804.90。请确保到期还款日全天还款卡余额充足。【交通银行】";
//        System.out.println(readTxt.getCashFlowFromSMS(str));
        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw

           /* 读入TXT文件 */
           String pathname = "C:\\Users\\Administrator\\Desktop\\sms.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
           File filename = new File(pathname); // 要读取以上路径的input。txt文件
           InputStreamReader reader = new InputStreamReader(
                   new FileInputStream(filename)); // 建立一个输入流对象reader
           BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
           String line = "";
           line = br.readLine();

           String userId ="";
           String content ="";
           String result ="";
           int i =0;
           ReadTxt readTxt = new ReadTxt();
           while (line != null) {
               line = br.readLine(); // 一次读入一行数据
               String [] lineSpilt =line.split("\\t");
               userId = lineSpilt[0];
               content = lineSpilt[1];
               result = readTxt.smsParse(content);
               i++;
               System.out.println(i+" "+userId+" "+result);

//                if (i>10){
//                    break;
//                }
               /* 写入Txt文件 */
                File writename = new File("C:\\Users\\Administrator\\Desktop\\output.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
                writename.createNewFile(); // 创建新文件
                BufferedWriter out = new BufferedWriter(new FileWriter(writename,true));
                out.write(i+" "+userId+" "+result+"\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
                out.close(); // 最后记得关闭文件
           }
           br.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
