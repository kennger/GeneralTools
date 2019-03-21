package com.cx.pojo;

import java.util.Date;

public class SMSRecordAnalysis {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 信用卡消费流水
     */
    private String creditConsumeFlow;

    /**
     * 信用卡还款流水
     */
    private String creditRepayFlow;

    /**
     * 储蓄卡消费流水
     */
    private String debitConsumeFlow;

    /**
     * 储蓄卡转账流水
     */
    private String debitTransferFlow;

    /**
     * 用户借款平台信息
     */
    private String loanPlatformInfo;

    /**
     * 是否删除
     */
    private Boolean isdel;

    /**
     * 
     */
    private Date ctime;

    /**
     * 
     */
    private Date mtime;

    /**
     * 其他信息
     */
    private String other;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 信用卡消费流水
     * @return credit_consume_flow 信用卡消费流水
     */
    public String getCreditConsumeFlow() {
        return creditConsumeFlow;
    }

    /**
     * 信用卡消费流水
     * @param creditConsumeFlow 信用卡消费流水
     */
    public void setCreditConsumeFlow(String creditConsumeFlow) {
        this.creditConsumeFlow = creditConsumeFlow == null ? null : creditConsumeFlow.trim();
    }

    /**
     * 信用卡还款流水
     * @return credit_repay_flow 信用卡还款流水
     */
    public String getCreditRepayFlow() {
        return creditRepayFlow;
    }

    /**
     * 信用卡还款流水
     * @param creditRepayFlow 信用卡还款流水
     */
    public void setCreditRepayFlow(String creditRepayFlow) {
        this.creditRepayFlow = creditRepayFlow == null ? null : creditRepayFlow.trim();
    }

    /**
     * 储蓄卡消费流水
     * @return debit_consume_flow 储蓄卡消费流水
     */
    public String getDebitConsumeFlow() {
        return debitConsumeFlow;
    }

    /**
     * 储蓄卡消费流水
     * @param debitConsumeFlow 储蓄卡消费流水
     */
    public void setDebitConsumeFlow(String debitConsumeFlow) {
        this.debitConsumeFlow = debitConsumeFlow == null ? null : debitConsumeFlow.trim();
    }

    /**
     * 储蓄卡转账流水
     * @return debit_transfer_flow 储蓄卡转账流水
     */
    public String getDebitTransferFlow() {
        return debitTransferFlow;
    }

    /**
     * 储蓄卡转账流水
     * @param debitTransferFlow 储蓄卡转账流水
     */
    public void setDebitTransferFlow(String debitTransferFlow) {
        this.debitTransferFlow = debitTransferFlow == null ? null : debitTransferFlow.trim();
    }

    /**
     * 用户借款平台信息
     * @return loan_platform_info 用户借款平台信息
     */
    public String getLoanPlatformInfo() {
        return loanPlatformInfo;
    }

    /**
     * 用户借款平台信息
     * @param loanPlatformInfo 用户借款平台信息
     */
    public void setLoanPlatformInfo(String loanPlatformInfo) {
        this.loanPlatformInfo = loanPlatformInfo == null ? null : loanPlatformInfo.trim();
    }

    /**
     * 是否删除
     * @return isdel 是否删除
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * 是否删除
     * @param isdel 是否删除
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    /**
     * 
     * @return ctime 
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 
     * @param ctime 
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 
     * @return mtime 
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * 
     * @param mtime 
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * 其他信息
     * @return other 其他信息
     */
    public String getOther() {
        return other;
    }

    /**
     * 其他信息
     * @param other 其他信息
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}