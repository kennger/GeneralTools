package com.cx.utils.connectMysql;

import com.cx.utils.ReadTxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String args[]) {
        try {
            JDBCFacade jdbc= new JDBCFacade();
            jdbc.open("com.mysql.jdbc.Driver","jdbc:mysql://47.96.125.53:3307/riskdb_kxg?useUnicode=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC",
                    "risk_kxg","Risk_kxg@20190213");
            ResultSet rs =  jdbc.executeQuery("select user_id from dwd_risk_appuser_sms_record group by user_id");

            int i =0;
            ReadTxt readTxt = new ReadTxt();
            List<String> list = new ArrayList<>();

            while(rs.next()){
                String userID = rs.getString("user_id") ;
                i++;
                System.out.println(i+" "+userID);
                list.add(userID);
            }

            for(int j =0;j<list.size();j++) {
                jdbc.open("com.mysql.jdbc.Driver","jdbc:mysql://47.96.125.53:3307/riskdb_kxg?useUnicode=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC",
                        "risk_kxg","Risk_kxg@20190213");
                ResultSet rs_id = jdbc.executeQuery("select content from dwd_risk_appuser_sms_record where user_id= " + list.get(j) + "");
                List<String> list1 = new ArrayList<>();
                list1.clear();
                while(rs_id.next()){
                    String content = rs_id.getString("content") ;
//                    System.out.println(content);

                    list1.add(content);
                }
                String result = readTxt.smsParse(list1.toString());
                System.out.println(j+1+ " "+ list.get(j)+" "+result);
//                if(j>10){
//                    break;
//                }

                /* 写入Txt文件 */
                File writename = new File("C:\\Users\\Administrator\\Desktop\\output_total.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
                writename.createNewFile(); // 创建新文件
                BufferedWriter out = new BufferedWriter(new FileWriter(writename,true));
                out.write(j+1+ " "+ list.get(j)+" "+result+"\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
                out.close(); // 最后记得关闭文件
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
