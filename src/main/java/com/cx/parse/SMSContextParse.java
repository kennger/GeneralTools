package com.cx.parse;

import com.cx.pojo.SMSCreditFlow;
import com.cx.pojo.SMSCreditRepay;
import com.cx.pojo.SMSDebitData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.commons.lang3.StringUtils.isEmpty;

@Service
public class SMSContextParse {


    public Map<String,Object> CreditFlowContextParse (List<SMSCreditFlow> listSMSCreditFlow) {

        double totalConsumeFlow = 0;
        double perResultFlow;
        String symbol =",";

        Map<String,Object> map =new HashMap<>();
        Map<String,Double> mapOfDay = new LinkedHashMap<>();
        Map<String,Double> mapOfMonth = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        try {
            if (listSMSCreditFlow != null) {

                for (int i = 0; i < listSMSCreditFlow.size(); i++) {
                    SMSCreditFlow smsCreditFlow = listSMSCreditFlow.get(i);
                    String Content =smsCreditFlow.getContent();
                    Date sendTime =smsCreditFlow.getSendTime();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
                    String date = simpleDateFormat.format(sendTime);
                    String monthDate =date.substring(0,6);
                    String formatListString = FormatAmountBySymbol(Content,symbol);
                    String replaceListString = formatListString.replace(",", " ")
                            .trim().replace("。", " ")
                            .trim().replace("，", " ")
                            .trim().replace("(","")
                            .trim().replace(")","");
                    String[] strings = replaceListString.split(" ");


                    String resultFlow = null;
                    for (int j = 0; j < strings.length; j++) {

                        if(formatListString.contains("折合人民币")&&strings[j].contains("折合人民币")){
                            int indexOfExchange = strings[j].indexOf("折合人民币");
                            String stringOfFlow = strings[j].substring(indexOfExchange);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if (!formatListString.contains("折合人民币")&&strings[j].contains("消费")) {
                            int indexOfConsume ;
                            if(strings[j].contains("消费记录")){
                                indexOfConsume = strings[j].indexOf("有");
                            }else {
                                indexOfConsume = strings[j].indexOf("消费");
                            }
                            String stringOfFlow = strings[j].substring(indexOfConsume);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if (!formatListString.contains("折合人民币")&&
                                !strings[j].contains("消费")&&strings[j].contains("支付")) {
                            int indexOfPay = strings[j].indexOf("支付");
                            String stringOfFlow = strings[j].substring(indexOfPay);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if (resultFlow != null) {
                            break;
                        }
                    }
                    if(!isEmpty(resultFlow)) {
                        perResultFlow = Double.parseDouble(resultFlow);
                        mapOfDay.put(date,perResultFlow);
                        list.add(monthDate+"_"+perResultFlow);
                        totalConsumeFlow += perResultFlow;
                    }
                }
                mapOfMonth = getMonthAmount(list);
             }
            map.put("mapOfDay",mapOfDay);
            map.put("mapOfMonth",mapOfMonth);
            map.put("totalConsumeFlow",totalConsumeFlow);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    public Map<String,Object>  CreditRepayContextParse(List<SMSCreditRepay> listSMSCreditRepay){

        double totalRepayFlow = 0;
        double perResultFlow;

        String symbol =",";

        Map<String,Object> map =new HashMap<>();
        Map<String,Double> mapOfDay = new LinkedHashMap<>();
        Map<String,Double> mapOfMonth = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();

        try {
            if (listSMSCreditRepay != null) {


                for (int i = 0; i < listSMSCreditRepay.size(); i++) {
                    SMSCreditRepay smsCreditRepay = listSMSCreditRepay.get(i);
                    String Content =smsCreditRepay.getContent();
                    Date sendTime =smsCreditRepay.getSendTime();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
                    String date = simpleDateFormat.format(sendTime);
                    String monthDate =date.substring(0,6);
                    String formatListString = FormatAmountBySymbol(Content,symbol);
                    String replaceListString = formatListString.replace(",", " ")
                            .trim().replace("。", " ")
                            .trim().replace("，", " ")
                            .trim().replace("(","")
                            .trim().replace(")","");
                    String[] strings = replaceListString.split(" ");

                    String resultFlow = null;
                    for (int j = 0; j < strings.length; j++) {

                        if(strings[j].contains("还款")&&!strings[j].contains("应")){
                            int indexOfRepay = strings[j].indexOf("还款");
                            String stringOfFlow = strings[j].substring(indexOfRepay);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if(strings[j].contains("实扣")){
                            int indexOfDeductionly = strings[j].indexOf("实扣");
                            String stringOfFlow = strings[j].substring(indexOfDeductionly);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if(strings[j].contains("入账")){
                            int indexOfIn = strings[j].indexOf("入账");
                            String stringOfFlow = strings[j].substring(indexOfIn);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if(strings[j].contains("转入")){
                            int indexOfTransfer = strings[j].indexOf("转入");
                            String stringOfFlow = strings[j].substring(indexOfTransfer);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if (strings[j].contains("存入")) {
                            int indexOfSave = strings[j].indexOf("存入");
                            String stringOfFlow = strings[j].substring(indexOfSave);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if (strings[j].contains("扣款")) {
                            int indexOfDeduction = strings[j].indexOf("扣款");
                            String stringOfFlow = strings[j].substring(indexOfDeduction);
                            String regex = "[^(0-9)|(\\.(0-9))]";
                            Pattern p = Pattern.compile(regex);
                            Matcher m = p.matcher(stringOfFlow);
                            resultFlow = m.replaceAll("").trim();
                        }

                        if (resultFlow != null) {
                            break;
                        }

                    }
                    if(!isEmpty(resultFlow)) {
                        perResultFlow = Double.parseDouble(resultFlow);
                        mapOfDay.put(date,perResultFlow);
                        totalRepayFlow += perResultFlow;
                        list.add(monthDate+"_"+perResultFlow);
                    }
                }
                mapOfMonth = getMonthAmount(list);
            }

            map.put("mapOfDay",mapOfDay);
            map.put("mapOfMonth",mapOfMonth);
            map.put("totalRepayFlow",totalRepayFlow);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }


    public Map<String,Object>  DebitDataContextParse(List<SMSDebitData> listSMSDebitData){

        String symbol =",";
        Map<String,Object> map = new HashMap<>();

        double totalTransferInFlow = 0;
        double perResultFlowT;
        Map<String,Object> mapT =new HashMap<>();
        Map<String,Double> mapOfDayT = new LinkedHashMap<>();
        Map<String,Double> mapOfMonthT = new LinkedHashMap<>();
        List<String> listT = new ArrayList<>();

        double totalRepayLoanOut = 0;
        double perResultFlowR;
        Map<String,Object> mapR =new HashMap<>();
        Map<String,Double> mapOfDayR = new LinkedHashMap<>();
        Map<String,Double> mapOfMonthR = new LinkedHashMap<>();
        List<String> listR = new ArrayList<>();

        double totalConsumeOut = 0;
        double perResultFlowC;
        Map<String,Object> mapC =new HashMap<>();
        Map<String,Double> mapOfDayC = new LinkedHashMap<>();
        Map<String,Double> mapOfMonthC = new LinkedHashMap<>();
        List<String> listC = new ArrayList<>();

        try {
            if (listSMSDebitData != null) {

                for (int i = 0; i < listSMSDebitData.size(); i++) {
                    SMSDebitData smsDebitData = listSMSDebitData.get(i);
                    String Content =smsDebitData.getContent();
                    Date sendTime =smsDebitData.getSendTime();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
                    String date = simpleDateFormat.format(sendTime);
                    String monthDate =date.substring(0,6);
                    String formatListString = FormatAmountBySymbol(Content,symbol);
                    String replaceListString = formatListString.replace(",", " ")
                            .trim().replace("。", " ")
                            .trim().replace("，", " ")
                            .trim().replace("(","")
                            .trim().replace(")","");
                    String[] strings = replaceListString.split(" ");


                    String resultFlowT = null;
                    String resultFlowR = null;
                    String resultFlowC = null;
                    for (int j = 0; j < strings.length; j++) {

                        if(formatListString.contains("转入")||
                                formatListString.contains("入账")||
                                formatListString.contains("收入")||
                                formatListString.contains("收到")||
                                formatListString.contains("存入")){

                            if(strings[j].contains("转入")) {
                                int indexOfRepay = strings[j].indexOf("转入");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowT =getRegexAmount(stringOfFlow);
                            }
                            if(!strings[j].contains("转入")&&strings[j].contains("入账")){
                                int indexOfRepay = strings[j].indexOf("入账");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowT =getRegexAmount(stringOfFlow);
                            }
                            if(!strings[j].contains("转入")&&!strings[j].contains("入账")&&
                                    strings[j].contains("收入")){
                                int indexOfRepay = strings[j].indexOf("收入");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowT =getRegexAmount(stringOfFlow);
                            }
                            if(!strings[j].contains("转入")&&!strings[j].contains("入账")&&
                                    !strings[j].contains("收入")&&strings[j].contains("收到")){
                                int indexOfRepay = strings[j].indexOf("收到");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowT =getRegexAmount(stringOfFlow);
                            }
                            if(!strings[j].contains("转入")&&!strings[j].contains("入账")&&
                                    !strings[j].contains("收入")&&!strings[j].contains("收到")&&
                                    strings[j].contains("存入")){
                                int indexOfRepay = strings[j].indexOf("存入");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowT =getRegexAmount(stringOfFlow);
                            }
                        }

                        if((formatListString.contains("还款")||formatListString.contains("贷款"))&&
                                (formatListString.contains("支出")||formatListString.contains("支取"))){
                            if(strings[j].contains("支出")){
                                int indexOfRepay = strings[j].indexOf("支出");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowR =getRegexAmount(stringOfFlow);
                            }

                            if(strings[j].contains("支取")){
                                int indexOfRepay = strings[j].indexOf("支取");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowR =getRegexAmount(stringOfFlow);
                            }
                        }

                        if(!formatListString.contains("转入")&&
                                !formatListString.contains("入账")&&
                                !formatListString.contains("存入")&&
                                !formatListString.contains("收到")&&
                                !formatListString.contains("收入")&&
                                !formatListString.contains("还款")&&
                                !formatListString.contains("贷款")){

                            if(strings[j].contains("支出")){
                                int indexOfRepay = strings[j].indexOf("支出");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowC =getRegexAmount(stringOfFlow);
                            }
                            if(strings[j].contains("转账")){
                                int indexOfRepay = strings[j].indexOf("转账");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowC =getRegexAmount(stringOfFlow);
                            }

                            if(strings[j].contains("转出")){
                                int indexOfRepay = strings[j].indexOf("转出");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowC =getRegexAmount(stringOfFlow);
                            }

                            if(strings[j].contains("支付")&&!strings[j].contains("转出")){
                                int indexOfRepay = strings[j].indexOf("转出");
                                String stringOfFlow = strings[j].substring(indexOfRepay);
                                resultFlowC =getRegexAmount(stringOfFlow);
                            }
                        }
                        if(resultFlowT!=null){
                            break;
                        }
                        if(resultFlowR!=null){
                            break;
                        }
                        if(resultFlowC!=null){
                            break;
                        }

                    }

                    if(!isEmpty(resultFlowT)) {
                        perResultFlowT = Double.parseDouble(resultFlowT);
                        mapOfDayT.put(date,perResultFlowT);
                        totalTransferInFlow += perResultFlowT;
                        listT.add(monthDate+"_"+perResultFlowT);
                    }
                    if(!isEmpty(resultFlowR)) {
                        perResultFlowR = Double.parseDouble(resultFlowR);
                        mapOfDayT.put(date,perResultFlowR);
                        totalRepayLoanOut += perResultFlowR;
                        listR.add(monthDate+"_"+perResultFlowR);
                    }

                    if(!isEmpty(resultFlowC)) {
                        perResultFlowC = Double.parseDouble(resultFlowC);
                        mapOfDayC.put(date,perResultFlowC);
                        totalConsumeOut += perResultFlowC;
                        listC.add(monthDate+"_"+perResultFlowC);
                    }
                }
                mapOfMonthT = getMonthAmount(listT);
                mapOfMonthR = getMonthAmount(listR);
                mapOfMonthC = getMonthAmount(listC);
            }

            mapT.put("mapOfDayT",mapOfDayT);
            mapT.put("mapOfMonthT",mapOfMonthT);
            mapT.put("totalTransferInFlow",totalTransferInFlow);

            mapR.put("mapOfDayR",mapOfDayR);
            mapR.put("mapOfMonthR",mapOfMonthR);
            mapR.put("totalRepayLoanOut",totalRepayLoanOut);

            mapC.put("mapOfDayC",mapOfDayC);
            mapC.put("mapOfMonthC",mapOfMonthC);
            mapC.put("totalConsumeOut",totalConsumeOut);

        } catch (Exception e) {
            e.printStackTrace();
        }

        map.put("mapT",mapT);
        map.put("mapR",mapR);
        map.put("mapC",mapC);

        return map;
    }

    private String FormatAmountBySymbol (String string,String symbol){
        String reStr = "";
        String result = string;
        int indexOfSymbol = string.indexOf(symbol);
        if(indexOfSymbol>0) {
            StringBuffer sb = new StringBuffer(string);
            String leftSymbol = string.substring(indexOfSymbol - 1, indexOfSymbol);
            String rightSymbol = string.substring(indexOfSymbol + 1, indexOfSymbol + 2);
            if (StringUtils.isNumeric(leftSymbol)&&StringUtils.isNumeric(rightSymbol)) {
                result = sb.replace(indexOfSymbol, indexOfSymbol + 1, reStr).toString();
                int indexOfSbStr = result.indexOf(symbol);
                if (indexOfSbStr > 0) {
                    result = FormatAmountBySymbol(result, symbol);
                }

            }
        }
        return result;
    }

    public String getContentTitleFromContent(String content){

        String contentTitle=null;
        try {
            if (content != null) {
                if (content.contains("[")) {
                    int indexOfLeft = content.indexOf("[");
                    if(!content.contains("]") ){
                        contentTitle = content.substring(indexOfLeft+1);
                    }else {
                        int indexOfRight =content.indexOf("]");
                        contentTitle = content.substring(indexOfLeft+1,indexOfRight);
                    }
                }
                if (content.contains("【")) {
                    int indexOfLeft = content.indexOf("【");
                    if(!content.contains("】")){
                        contentTitle = content.substring(indexOfLeft+1);
                    }else {
                        int indexOfRight = content.indexOf("】");
                        contentTitle = content.substring(indexOfLeft+1,indexOfRight);
                    }


                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return contentTitle;
    }

   private Map<String,Double> getMonthAmount(List<String> list){

       Map<String,Double> map =new TreeMap<String,Double>();
        if(list.size()>0){
            for(String str:list){
             if(map.get(str.substring(0,6))==null){
                 map.put(str.substring(0,6),Double.parseDouble(str.substring(7)));
             }else {
                 map.put(str.substring(0,6),map.get(str.substring(0,6))+Double.parseDouble(str.substring(7)));
             }
            }
        }
        return map;
   }


   private String getRegexAmount(String stringOfFlow){

       String resultFlow ;
       String regex = "[^(0-9)|(\\.(0-9))]";
       Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(stringOfFlow);
       resultFlow = m.replaceAll("").trim();

       return resultFlow;
   }


    public static void main(String [] args){

        SMSContextParse smsContextParse = new SMSContextParse();
        String str ="【钱站】（钱站还款提醒）您本期待还金额3403.68元，将于2018年12月14日自动扣款，请确保银行卡或账户余额充足。您可通过下载凡秘APP，进入我的-债转查询来查看您该笔借款的出借人债权转让相关信息。凡秘APP下载地址http://t.cn/EvKEEuF";
        String symbol =",";
        System.out.println("###################"+ smsContextParse.getContentTitleFromContent(str));

    }

}
