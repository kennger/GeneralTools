package com.cx.parse.chuangjinBusiness;
import com.cx.utils.mapSort.MapSortByValueDemo;

import java.io.*;
import java.util.*;

public class CallRecordParse {


    private Map<String,Integer> getSortOfCallRecord(String callRecordList){

        MapSortByValueDemo mapSortByValueDemo =new MapSortByValueDemo();
        Map<String,Integer> map =new LinkedHashMap<>();
        Map<String,Integer> resultMap = new LinkedHashMap<>();

        try{
            if(callRecordList!=null) {
                String[] callRecordLists = callRecordList.split(",");
                for (int i = 0; i < callRecordLists.length; i++) {

                    String[] perCallRecords = callRecordLists[i].split("/");
                    String callNumber = perCallRecords[1].replace("\"","");
                    String callPhone = perCallRecords[0];
                    map.put(callPhone, Integer.parseInt(callNumber));
                }

                resultMap =mapSortByValueDemo.sortMapByValue(map);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultMap;
    }

    private List<String> getTop10(Map<String,Integer> map){

        List<String> list =new LinkedList<>();
        if(map!=null){
            for(String str :map.keySet()){
                list.add(str+"="+map.get(str));
                if(list.size()>10){
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String [] args) {

//        CallRecordParse callRecordParse =new CallRecordParse();
//        String str = "02120670400_未备注联系人/2,01051735538_未备注联系人/1,95595_光大银行/2,95202428_未备注联系人/1,9516785665_未备注联系人/3,15903409404_未备注联系人/1,15635158806_未备注联系人/3,15536688948_建军/1,15535191898_卢峰/1,15525086549_未备注联系人/1,15364949156_未备注联系人/61,15364943091_未备注联系人/1,15343409156_姑娘/13,15340708675_未备注联系人/1,15203467041_未备注联系人/3,13835136432_农夫水/1,13546382235_未备注联系人/6,02258326622_捷信消费金融有限公司/1,02258969479_捷信消费金融有限公司/1,02759359508_捷信消费金融有限公司/1,03918312136_未备注联系人/1,059585169654_未备注联系人/1,073189551448_捷信消费金融有限公司/1,13007005219_未备注联系人/1,13073544488_未备注联系人/14,13073552499_未备注联系人/1,13209806386_变云/5,13466801698_未备注联系人/1,13753177328_未备注联系人/7,073189552751_捷信消费金融有限公司/1,02258352138_捷信消费金融有限公司/1,02120892526_未备注联系人/1,95759017_未备注联系人/1,19935328123_未备注联系人/29,18734196589_未备注联系人/1,18234030427_未备注联系人/9,18035114298_未备注联系人/11,18003409155_儿子/73,17836600945_未备注联系人/1,17734945409_未备注联系人/7,17535148038_未备注联系人/1,15934043951_未备注联系人/1,15536060628_未备注联系人/3,15513273135_未备注联系人/1,15386745238_未备注联系人/1,15003409552_未备注联系人/2,02759415690_捷信消费金融有限公司/1,04596315397_未备注联系人/1,057128854260_未备注联系人/2,073182983251_捷信消费金融有限公司/1,075595511_中国平安/1,13073553843_尤俊明/13,13233658231_未备注联系人/1,13753480399_老爷子/6,13753487747_小弟/2,13834685138_老郭/2,13934505431_未备注联系人/3,15235115685_电工/1,13099088376_未备注联系人/18,18634335188_未备注联系人/2,15721809729_未备注联系人/1,15721811648_未备注联系人/1,15721829782_未备注联系人/1,15834134622_未备注联系人/3,15834163293_未备注联系人/1,17635385657_未备注联系人/1,18035149681_未备注联系人/1,18634320316_春平/7,03512916551_未备注联系人/1,18635792688_未备注联系人/2,18734851918_未备注联系人/1,556_未备注联系人/21,95075164_众安保险/1,95093277_未备注联系人/1,9516785896_未备注联系人/2,02180266719_未备注联系人/1,15536091036_张艳/1,03518387132_未备注联系人/1,073182983036_捷信消费金融有限公司/1,073182983590_捷信消费金融有限公司/1,073189552774_捷信消费金融有限公司/1,076995213622_未备注联系人/1,13100014226_未备注联系人/1,13191050603_未备注联系人/1,13403453222_未备注联系人/3,13453159725_未备注联系人/1,13513630069_未备注联系人/3,13754847424_未备注联系人/8,15034176975_未备注联系人/4,15507095250_未备注联系人/1,15536549236_未备注联系人/1,13363410826_未备注联系人/1";
//        System.out.println(callRecordParse.getSortOfCallRecord(str));
//        System.out.println(callRecordParse.getTop10(callRecordParse.getSortOfCallRecord(str)));


        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw

            /* 读入TXT文件 */
            String pathname = "D:\\Kettle\\近一个月用户与联系人通话统计.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
            File filename = new File(pathname); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line = "";
            line = br.readLine();

            String userId ="";
            String userPhone ="";
            String callPhoneNumberList ="";
            String callPhoneLongList ="";
            Map<String,Integer> resultMapOfCallNumber;
            List<String> resultTop10MapOfCallNumber;
            Map<String,Integer> resultMapOfCallLong;
            List<String> resultTop10MapOfCallLong;
            int i =0;
            CallRecordParse callRecordParse = new CallRecordParse();
            while (line != null) {
                line = br.readLine(); // 一次读入一行数据
                String [] lineSpilt =line.split(";");
                userId = lineSpilt[0];
                userPhone = lineSpilt[1];
                callPhoneNumberList = lineSpilt[2];
                callPhoneLongList = lineSpilt[3];
                resultMapOfCallNumber = callRecordParse.getSortOfCallRecord(callPhoneNumberList);
                resultTop10MapOfCallNumber =callRecordParse.getTop10(resultMapOfCallNumber);
                resultMapOfCallLong = callRecordParse.getSortOfCallRecord(callPhoneLongList);
                resultTop10MapOfCallLong =callRecordParse.getTop10(resultMapOfCallLong);
                i++;
                System.out.println(i+" "+userId+" "+userPhone+" "+resultTop10MapOfCallNumber);

//                Thread.sleep(10);
//                if (i>10){
//                    break;
//                }
                /* 写入Txt文件 */
                File writename = new File("C:\\Users\\Administrator\\Desktop\\近一个月用户与联系人通话统计后.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
                writename.createNewFile(); // 创建新文件
                BufferedWriter out = new BufferedWriter(new FileWriter(writename,true));
                out.write(i+"///"+userId+"///"+userPhone+
                        "///"+resultMapOfCallNumber.toString()+
                        "///"+resultTop10MapOfCallNumber.toString()+
                        "///"+resultMapOfCallLong.toString()+
                        "///"+resultTop10MapOfCallLong.toString()+"\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
                out.close(); // 最后记得关闭文件
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
