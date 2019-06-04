package com.cx.parse.chuangjinBusiness;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LoanPlatformParse {


    private static final String cashLoanPlatList ="369速贷,56钱包,e贷金,E秒贷,YY借呗,爱上花,爱信优品,安鑫花,安信花,百万金库,斑马速贷,帮你还,薄荷好借,抱金猪,抱米花,贝贝花,备胎信用,菠萝贷,财红,畅易无忧,成长钱包,充电钱包,达芬期,大财主,大黄鱼,大米贷款,大气钱庄,大王贷,大王贷款,带上钱,贷贷借,贷贷米,贷贷熊,贷高乐,贷款王,贷你富,贷上钱,贷无忧,蛋花花,滴滴出借,点金贷,叮当钱包,兜兜白条,兜兜贷,豆豆钱,短贷王,方便花,放心借,分分到,分期还,赶紧贷,哈啰贷,好果子,好借360,好信贷,好易借,荷包花,黑马现金,嗨钱网,红叶,虎鲸钱包,花不完,花啦花啦,花无忧,花小贷,花掌柜,惠花花,惠花钱,惠享卡,机有米,极光贷,极速荷包,极速借条,极速卡,急速购,急速快贷,加分贷,坚果贷,江山金服,解愁宝,借帮帮,借乐宝,借了发,借你钱,借你用,借钱白卡,借条大师,借享,借易块,今日易贷,金贝贝,金袋鼠,金惠卡,金领贷,金米贷,金鹏贷,金熊贷,金柚子,九秒贷,聚宝贝,聚宝钱包,君子借,卡易借,开心借,酷街商城,酷要贷,快贷,快花花,快借360,快闪卡贷,来点米,来借吧,来借呗,来借钱,来一笔,蓝领花,乐用贷,立即贷,凌云贷,零花宝,零钱易贷,领薪薪,麻花钱包,马上借呗,没钞蜂,每日好借,米盒贷,米来来,米米罐,米奇速借,米融,米小花,蜜小蜂,喵喵贷,秒贝,秒贝app,秒购,秒拿,秒下,摸金宝,魔借,你要贷,牛牛贷,牛牛借钱,侬要贷,诺秒贷,七秒贷,七条,奇速贷,千里速贷,钱夫人,钱易贷,钱周转,球球借,去借保,人人好信,人人快借,融小鱼,闪电白卡,闪电好信,闪电借款,闪借宝,闪来钱,闪现贷,闪租侠,神下款,数钱宝,速米袋,速用钱,随借随用,随心贷,随心借,碎银两,糖糖记账,天弘速贷,天天速贷,铜板花,万贯街,万牛钱包,万万借,万赢宝,微小借,维信闪贷,我享借,无忧借钱,无忧闪信,无忧虾借,五圆金贷,西瓜信用,喜乐街,现金巴士,现金大师,现金口贷,现金秒贷,现金速递,线上借,享钱借,享些花,响钱猫,向钱贷,小白贷款,小白来花,小白易贷,小财鱼,小带鱼,小鹅贷,小鹅袋,小蜂鸟,小红鱼,小黄蜂,小金钱包,小麦钱包,小木鱼,小牛优品,小树普惠,小微信用,小伍钱包,小小麦,小熊速贷,小赢卡贷,小赢理财,小赢钱包,小赢网金,携程网,薪期待,信米袋,信宜钱袋,信用白条,信用贷,星薪宝,讯到,讯秒,要钱快,壹周宝,易贷钱庄,易好卡,易借,易借款,易乐贷,易融贷,易融普惠,易通万卡,音速借条,银飞利,赢掌柜,应急侠,用钱宝,优时贷,优智借,悠融,由你花,友得贷,有财钱包,有个好信,有个金窝,有借必应,有零花,有米管家,有米卡,有米快花,有用分期,柚子钱包,娱钱包,逾期管家,逾期提醒,宇才科技,元气满满,原子贷,月零花,张飞借钱,掌e贷,账务管家,招财贷,指还王,众安贷,众势信用,周周贷款,周周到,猪花花,资易通,纵享贷";

    private String getCashLoanPlatInfo(String str){

        List<String> list = new LinkedList<>();
        int count=0;
        String result = null;
        if(str!=null){
            String [] perPlats =str.split(",");
            for(int i=0;i<perPlats.length;i++){
                String perPlat = perPlats[i].replace(" ","");
                if(cashLoanPlatList.contains(perPlat)&&!perPlat.equals("360")&&!perPlat.equals("")){
                    count++;
                    list.add(perPlat);
                }
            }
        }
        result = list.toString()+"//"+count;
        return result;
    }


    public static void main (String [] args){

        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw

            /* 读入TXT文件 */
            String pathname = "D:\\Kettle\\user_sms_loan_platform.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
            File filename = new File(pathname); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line = "";
            line = br.readLine();

            String userId ="";
            String platforms ="";

            int i =0;
            LoanPlatformParse loanPlatformParse = new LoanPlatformParse();
            while (line != null) {
                line = br.readLine(); // 一次读入一行数据
                String [] lineSpilt =line.split(" ");
                userId = lineSpilt[0];
                String result=null;
                if(lineSpilt.length>1) {
                    platforms = lineSpilt[1];
                    result = loanPlatformParse.getCashLoanPlatInfo(platforms);
                }
                i++;
                System.out.println(i+" "+userId+" "+result);

                Thread.sleep(10);
//                if (i>10){
//                    break;
//                }
                /* 写入Txt文件 */
                File writename = new File("C:\\Users\\Administrator\\Desktop\\loanPlatform0508.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
                writename.createNewFile(); // 创建新文件
                BufferedWriter out = new BufferedWriter(new FileWriter(writename,true));
                out.write(i+"///"+userId+"///"+result+ "\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
                out.close(); // 最后记得关闭文件
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



//        String s=",中国人寿,捷信公司,马上消费金融";
//        LoanPlatformParse loanPlatformParse = new LoanPlatformParse();
//        System.out.println(loanPlatformParse.getCashLoanPlatInfo(s));
    }
}
