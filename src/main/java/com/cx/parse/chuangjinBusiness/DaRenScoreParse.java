package com.cx.parse.chuangjinBusiness;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.util.ObjectUtils.isEmpty;

public class DaRenScoreParse {

    private double getRepayAmountCoef(double amount){
        double coef=0;
        if(!isEmpty(amount)){
            if(amount>0&amount<=2000){
                coef=0.2;
            }else if (amount>2000&amount<=4000){
                coef=0.3;
            }else if (amount>4000&amount<=7000){
                coef=0.5;
            }else if (amount>7000&amount<=10000){
                coef=0.7;
            }else coef=1.0;
        }
        return coef;
    }

    private double getOverdueCoef(double amount){
        double coef=0;
        if(!isEmpty(amount)){
            if(amount>0&amount<=2000){
                coef=0.25;
            }else if (amount>2000&amount<=4000){
                coef=0.35;
            }else if (amount>4000&amount<=7000){
                coef=0.5;
            }else if (amount>7000&amount<=10000){
                coef=0.75;
            }else coef=1.0;
        }
        return coef;
    }

    private double getLess10RepayOverduePerCoef(double per){
        double coef=0;
        if(!isEmpty(per)){
            if(per>-1&per<=0.3){
                coef=1;
            }else if (per>0.3&per<=0.4){
                coef=1.2;
            }else if (per>0.4&per<=0.5){
                coef=1.5;
            }else if (per>0.5&per<=0.6){
                coef=2;
            }else if (per>0.6&per<=0.99){
                coef=2.5;
            }else coef=3;
        }
        return coef;
    }

    private double getOverdueDaysCoef(int days){
        double coef=0;
        if(!isEmpty(days)){
            if(days>-1&days<=1){
                coef=0;
            }else if (days>1&days<=7){
                coef=-20;
            }else if (days>7&days<=14){
                coef=-40;
            }else if (days>14&days<=20){
                coef=-60;
            }else if (days>20&days<=30){
                coef=-80;
            }else if (days>30&days<=90){
                coef=-100;
            }else if (days>90&days<=180){
                coef=-120;
            }else coef=-140;
        }
        return coef;
    }
    private double getMore10RepayOverduePerCoef(double per){
        double coef=0;
        if(per!=0){
            if(per>-1&per<=0.07){
                coef=0.8;
            }else if (per>0.07&per<=0.15){
                coef=1.5;
            }else if (per>0.15&per<=0.2){
                coef=3;
            }else if (per>0.2&per<=0.25){
                coef=5;
            }else if (per>0.25&per<=0.3){
                coef=8;
            }else if (per>0.3&per<=0.5){
                coef=12;
            }else if (per>0.5&per<=0.75){
                coef=18;
            }else coef=25;
        }
        return coef;
    }


    private String getDaRenScore(List<String> list){

        DaRenScoreParse daRenScoreParse =new DaRenScoreParse();
        int repayCount =0;
        double repayScore =0;
        double overdueScore=0;
        double score_per=0;
        double score =0;
        double repayOverdueCoef=0.3;
        int overdueCount =0;
        double overdueRate=0;
        List<String> list_new= new ArrayList<>();
        if(list.size()>0){
            for(int i =0;i<list.size();i++){
                String [] strings =list.get(i).split(",");
                repayCount=i+1;
                if(strings[7].equals("3")){
                    repayScore = 1/(i+1)*daRenScoreParse.getRepayAmountCoef(Double.parseDouble(strings[3]))*40*repayOverdueCoef;
                }else{
                    repayScore = 1/(i+1)*daRenScoreParse.getRepayAmountCoef(Double.parseDouble(strings[3]))*40;
                    overdueCount++;
                }
                overdueRate =overdueCount/repayCount;

                if(strings[7].equals("3")){
                    overdueScore =0;
                }else if (repayCount<11){
                    overdueScore =daRenScoreParse.getOverdueCoef(Double.parseDouble(strings[3]))*
                            daRenScoreParse.getOverdueDaysCoef(Integer.parseInt(strings[8]))*
                            daRenScoreParse.getLess10RepayOverduePerCoef(overdueRate);
                }else{
                    overdueScore=daRenScoreParse.getOverdueCoef(Double.parseDouble(strings[3]))*
                            daRenScoreParse.getOverdueDaysCoef(Integer.parseInt(strings[8]))*
                            daRenScoreParse.getMore10RepayOverduePerCoef(overdueRate);
                }

                score_per=repayScore+overdueScore;
                score +=score_per;
                list_new.add(strings[0]+","+repayCount+","+overdueCount+","+score_per+","+score);

            }
        }
        return list_new.toString();
    }

    public static void main(String [] args){

        String [] s={"9811,3-2017112900000021,2017-11-29 14:29:13,25000,1,1,2017-12-01,3,0,2017-12-01"
                ,"9811,2-2017120500000046,2017-12-05 12:10:54,4000,1,1,2018-01-03,3,0,2018-01-03"
                ,"9811,4-2017122500000009,2017-12-25 08:43:10,5000,1,1,2018-01-23,3,0,2018-01-23"
                ,"9811,4-2017123100000023,2017-12-31 09:49:52,5000,1,1,2018-02-13,3,0,2018-02-13"
                ,"9811,4-2018010300000068,2018-01-03 13:46:49,7000,1,1,2018-02-16,3,0,2018-02-16"
                ,"9811,4-2018011600000087,2018-01-16 15:28:48,6000,1,1,2018-03-01,3,0,2018-03-01"};

        List<String> list = Arrays.asList(s);
        DaRenScoreParse daRenScoreParse =new DaRenScoreParse();
        System.out.println(daRenScoreParse.getDaRenScore(list));

    }
}
