package com.cx.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.aliyun.odps.Instance;
import com.aliyun.odps.Odps;
import com.aliyun.odps.OdpsException;
import com.aliyun.odps.account.Account;
import com.aliyun.odps.account.AliyunAccount;
import com.aliyun.odps.data.Record;
import com.aliyun.odps.task.SQLTask;

public class TestSql {


    private static final String accessId = "LTAIp48JMGmSL6Bb";
    private static final String accessKey = "ClDJmBDAOeeOPuuA2XXURDQ45Xp1zx";
    private static final String endPoint = "http://service.odps.aliyun.com/api";
    private static final String project = "chuangjin_risk";


    public String getResultFromSMS (String userId){

        String sql= "select content from chuangjin_dw.dwd_risk_appuser_sms_record where user_id ='"+userId+"';";
        Account account = new AliyunAccount(accessId, accessKey);
        Odps odps = new Odps(account);
        odps.setEndpoint(endPoint);
        odps.setDefaultProject(project);
        Instance i;
        ReadTxt readTxt = new ReadTxt();
        String smsResult ="";
        try {
            i = SQLTask.run(odps, sql);
            i.waitForSuccess();
            List<Record> records = SQLTask.getResult(i);
            int j =0;
            List<String> list = new ArrayList<>();
            for(Record r:records){
                j++;
                System.out.println(j+" "+r.get(0).toString().replace(" ","").replace("\r\n",""));
                list.add(r.get(0).toString().replace(" ",""));
            }
//            System.out.println(list.toString());
            smsResult = readTxt.smsParse(list.toString());
        } catch (OdpsException e) {
            e.printStackTrace();
        }
        return smsResult;
    }
    public static void  main(String[] args) {
       TestSql testSql = new TestSql();
        String userId = "120451";
        System.out.println(testSql.getResultFromSMS(userId));

//        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw
//
//            /* 读入TXT文件 */
//            String pathname = "C:\\Users\\Administrator\\Desktop\\6000.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
//            File filename = new File(pathname); // 要读取以上路径的input。txt文件
//            InputStreamReader reader = new InputStreamReader(
//                    new FileInputStream(filename)); // 建立一个输入流对象reader
//            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
//            String line = "";
//            line = br.readLine();
//
//            TestSql testSql = new TestSql();
//            String result ="";
//            int i =0;
//            while (line != null) {
//                line = br.readLine(); // 一次读入一行数据
//                i++;
//                System.out.println(i+" "+ line+ " "+testSql.getResultFromSMS(line));
//                result =testSql.getResultFromSMS(line);
//
////                if (i>10){
////                    break;
////                }
//                /* 写入Txt文件 */
//                File writename = new File("C:\\Users\\Administrator\\Desktop\\output1.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
//                writename.createNewFile(); // 创建新文件
//                BufferedWriter out = new BufferedWriter(new FileWriter(writename,true));
//                out.write(i+" "+line+" "+result+"\r\n"); // \r\n即为换行
//                out.flush(); // 把缓存区内容压入文件
//                out.close(); // 最后记得关闭文件
//            }
//            br.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
