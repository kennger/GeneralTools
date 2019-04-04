package com.cx.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class LoanRepaymentPlan {
    /**
     * 贷款产品
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 还款内容（1.全部费用；2.渠道费用；3.平台费用;4.服务加速包;5:保证金）
     */
    private Short repaymentContent;

    /**
     * 合同号
     */
    private String contractNumber;

    /**
     * 还款计划编号
     */
    private String repaymentPlanCode;

    /**
     * 是否已退款（0：未退款；1：已退款）
     */
    private Short isRefund;

    /**
     * 期次
     */
    private Short period;

    /**
     * 应还日期
     */
    private Date repaymentDueDate;

    /**
     * 还款状态(1=正常未还,2=正常还款中,3=正常已还,4=逾期未还,5=逾期还款中,6=逾期已还,7=正常还款用户异常,8=逾期还款用户异常,9=正常还款支付异常,10逾期还款支付异常)
     */
    private Integer repaymentStatus;

    /**
     * 还款日期
     */
    private Date repaymentDate;

    /**
     * 应收本金
     */
    private BigDecimal receivablePrincipal;

    /**
     * 应收手续费
     */
    private BigDecimal receivableHandlingCharge;

    /**
     * 应收利息
     */
    private BigDecimal receivableInterest;

    /**
     * 应收总合计
     */
    private BigDecimal receivableTotal;

    /**
     * 免息券减免手续费
     */
    private BigDecimal interestFreeCouponReduceHandlingCharge;

    /**
     * 免息券减免利息
     */
    private BigDecimal interestFreeCouponReduceInterest;

    /**
     * 免息券号
     */
    private Long interestFreeCouponNumber;

    /**
     * 逾期天数
     */
    private Short overdueDays;

    /**
     * 逾期分类(1=M1_30天,2=M2_60天,3=M3_90天,4=M4_120天.5=M5_150天.6=M6_180天.7=M7_360天.8=M8_999999天)
     */
    private Short overdueType;

    /**
     * 应收罚金
     */
    private BigDecimal receivablePenalty;

    /**
     * 人工变更减免手续费
     */
    private BigDecimal manualModifyReduceHandlingCharge;

    /**
     * 人工变更减免利息
     */
    private BigDecimal manualModifyReduceInterest;

    /**
     * 人工变更减免罚金
     */
    private BigDecimal manualModifyReducePenalty;

    /**
     * 提前还款减免手续费
     */
    private BigDecimal prepaymentReduceHandlingCharge;

    /**
     * 提前还款减免利息
     */
    private BigDecimal prepaymentReduceInterest;

    /**
     * 应收提前还款违约金
     */
    private BigDecimal prepaymentReceivablePenalty;

    /**
     * 还款券减免本金
     */
    private BigDecimal repaymentCouponReducePrincipal;

    /**
     * 还款券减免手续费
     */
    private BigDecimal repaymentCouponReduceHandlingCharge;

    /**
     * 还款券减免利息
     */
    private BigDecimal repaymentCouponReduceInterest;

    /**
     * 催收减免本金
     */
    private BigDecimal collectionReducePrincipal;

    /**
     * 催收减免手续费
     */
    private BigDecimal collectionReduceHandlingCharge;

    /**
     * 催收减免利息
     */
    private BigDecimal collectionReduceInterest;

    /**
     * 催收减免罚金
     */
    private BigDecimal collectionReducePenalty;

    /**
     * 实还本金
     */
    private BigDecimal actualRepaymentPrincipal;

    /**
     * 实还手续费
     */
    private BigDecimal actualRepaymentHandlingCharge;

    /**
     * 实还利息
     */
    private BigDecimal actualRepaymentInterest;

    /**
     * 实还罚金
     */
    private BigDecimal actualRepaymentPenalty;

    /**
     * 实还提前还款违约金
     */
    private BigDecimal actualPrepaymentPenalty;

    /**
     * 实还总合计
     */
    private BigDecimal actualRepaymentTotal;

    /**
     * 
     */
    private Integer version;

    /**
     * 
     */
    private Date ctime;

    /**
     * 
     */
    private Date mtime;

    /**
     * 
     */
    private Date rtime;

    /**
     * 
     */
    private Long creater;

    /**
     * 
     */
    private Long updater;

    /**
     * 
     */
    private Short isdel;

    /**
     * 总期次
     */
    private Short periods;

    /**
     * 资金渠道类型(platform:平台;zongheng:纵横理财)
     */
    private String channel;

    /**
     * 借款人第三方资金渠道账户id
     */
    private String thirdAccountId;

    /**
     * 第三方资金渠道服务费
     */
    private BigDecimal thirdCharge;

    /**
     * 展业达人服务费
     */
    private BigDecimal platformCharge;

    /**
     * 是否代偿(0:否;1:是)
     */
    private Integer isCompensatory;

    /**
     * 代偿时间
     */
    private Date compensatoryTime;

    /**
     * 综合息费
     */
    private BigDecimal combinationFee;

    /**
     * 贷款产品
     * @return id 贷款产品
     */
    public Long getId() {
        return id;
    }

    /**
     * 贷款产品
     * @param id 贷款产品
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 还款内容（1.全部费用；2.渠道费用；3.平台费用;4.服务加速包;5:保证金）
     * @return repayment_content 还款内容（1.全部费用；2.渠道费用；3.平台费用;4.服务加速包;5:保证金）
     */
    public Short getRepaymentContent() {
        return repaymentContent;
    }

    /**
     * 还款内容（1.全部费用；2.渠道费用；3.平台费用;4.服务加速包;5:保证金）
     * @param repaymentContent 还款内容（1.全部费用；2.渠道费用；3.平台费用;4.服务加速包;5:保证金）
     */
    public void setRepaymentContent(Short repaymentContent) {
        this.repaymentContent = repaymentContent;
    }

    /**
     * 合同号
     * @return contract_number 合同号
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * 合同号
     * @param contractNumber 合同号
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber == null ? null : contractNumber.trim();
    }

    /**
     * 还款计划编号
     * @return repayment_plan_code 还款计划编号
     */
    public String getRepaymentPlanCode() {
        return repaymentPlanCode;
    }

    /**
     * 还款计划编号
     * @param repaymentPlanCode 还款计划编号
     */
    public void setRepaymentPlanCode(String repaymentPlanCode) {
        this.repaymentPlanCode = repaymentPlanCode == null ? null : repaymentPlanCode.trim();
    }

    /**
     * 是否已退款（0：未退款；1：已退款）
     * @return is_refund 是否已退款（0：未退款；1：已退款）
     */
    public Short getIsRefund() {
        return isRefund;
    }

    /**
     * 是否已退款（0：未退款；1：已退款）
     * @param isRefund 是否已退款（0：未退款；1：已退款）
     */
    public void setIsRefund(Short isRefund) {
        this.isRefund = isRefund;
    }

    /**
     * 期次
     * @return period 期次
     */
    public Short getPeriod() {
        return period;
    }

    /**
     * 期次
     * @param period 期次
     */
    public void setPeriod(Short period) {
        this.period = period;
    }

    /**
     * 应还日期
     * @return repayment_due_date 应还日期
     */
    public Date getRepaymentDueDate() {
        return repaymentDueDate;
    }

    /**
     * 应还日期
     * @param repaymentDueDate 应还日期
     */
    public void setRepaymentDueDate(Date repaymentDueDate) {
        this.repaymentDueDate = repaymentDueDate;
    }

    /**
     * 还款状态(1=正常未还,2=正常还款中,3=正常已还,4=逾期未还,5=逾期还款中,6=逾期已还,7=正常还款用户异常,8=逾期还款用户异常,9=正常还款支付异常,10逾期还款支付异常)
     * @return repayment_status 还款状态(1=正常未还,2=正常还款中,3=正常已还,4=逾期未还,5=逾期还款中,6=逾期已还,7=正常还款用户异常,8=逾期还款用户异常,9=正常还款支付异常,10逾期还款支付异常)
     */
    public Integer getRepaymentStatus() {
        return repaymentStatus;
    }

    /**
     * 还款状态(1=正常未还,2=正常还款中,3=正常已还,4=逾期未还,5=逾期还款中,6=逾期已还,7=正常还款用户异常,8=逾期还款用户异常,9=正常还款支付异常,10逾期还款支付异常)
     * @param repaymentStatus 还款状态(1=正常未还,2=正常还款中,3=正常已还,4=逾期未还,5=逾期还款中,6=逾期已还,7=正常还款用户异常,8=逾期还款用户异常,9=正常还款支付异常,10逾期还款支付异常)
     */
    public void setRepaymentStatus(Integer repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
    }

    /**
     * 还款日期
     * @return repayment_date 还款日期
     */
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 还款日期
     * @param repaymentDate 还款日期
     */
    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * 应收本金
     * @return receivable_principal 应收本金
     */
    public BigDecimal getReceivablePrincipal() {
        return receivablePrincipal;
    }

    /**
     * 应收本金
     * @param receivablePrincipal 应收本金
     */
    public void setReceivablePrincipal(BigDecimal receivablePrincipal) {
        this.receivablePrincipal = receivablePrincipal;
    }

    /**
     * 应收手续费
     * @return receivable_handling_charge 应收手续费
     */
    public BigDecimal getReceivableHandlingCharge() {
        return receivableHandlingCharge;
    }

    /**
     * 应收手续费
     * @param receivableHandlingCharge 应收手续费
     */
    public void setReceivableHandlingCharge(BigDecimal receivableHandlingCharge) {
        this.receivableHandlingCharge = receivableHandlingCharge;
    }

    /**
     * 应收利息
     * @return receivable_interest 应收利息
     */
    public BigDecimal getReceivableInterest() {
        return receivableInterest;
    }

    /**
     * 应收利息
     * @param receivableInterest 应收利息
     */
    public void setReceivableInterest(BigDecimal receivableInterest) {
        this.receivableInterest = receivableInterest;
    }

    /**
     * 应收总合计
     * @return receivable_total 应收总合计
     */
    public BigDecimal getReceivableTotal() {
        return receivableTotal;
    }

    /**
     * 应收总合计
     * @param receivableTotal 应收总合计
     */
    public void setReceivableTotal(BigDecimal receivableTotal) {
        this.receivableTotal = receivableTotal;
    }

    /**
     * 免息券减免手续费
     * @return interest_free_coupon_reduce_handling_charge 免息券减免手续费
     */
    public BigDecimal getInterestFreeCouponReduceHandlingCharge() {
        return interestFreeCouponReduceHandlingCharge;
    }

    /**
     * 免息券减免手续费
     * @param interestFreeCouponReduceHandlingCharge 免息券减免手续费
     */
    public void setInterestFreeCouponReduceHandlingCharge(BigDecimal interestFreeCouponReduceHandlingCharge) {
        this.interestFreeCouponReduceHandlingCharge = interestFreeCouponReduceHandlingCharge;
    }

    /**
     * 免息券减免利息
     * @return interest_free_coupon_reduce_interest 免息券减免利息
     */
    public BigDecimal getInterestFreeCouponReduceInterest() {
        return interestFreeCouponReduceInterest;
    }

    /**
     * 免息券减免利息
     * @param interestFreeCouponReduceInterest 免息券减免利息
     */
    public void setInterestFreeCouponReduceInterest(BigDecimal interestFreeCouponReduceInterest) {
        this.interestFreeCouponReduceInterest = interestFreeCouponReduceInterest;
    }

    /**
     * 免息券号
     * @return interest_free_coupon_number 免息券号
     */
    public Long getInterestFreeCouponNumber() {
        return interestFreeCouponNumber;
    }

    /**
     * 免息券号
     * @param interestFreeCouponNumber 免息券号
     */
    public void setInterestFreeCouponNumber(Long interestFreeCouponNumber) {
        this.interestFreeCouponNumber = interestFreeCouponNumber;
    }

    /**
     * 逾期天数
     * @return overdue_days 逾期天数
     */
    public Short getOverdueDays() {
        return overdueDays;
    }

    /**
     * 逾期天数
     * @param overdueDays 逾期天数
     */
    public void setOverdueDays(Short overdueDays) {
        this.overdueDays = overdueDays;
    }

    /**
     * 逾期分类(1=M1_30天,2=M2_60天,3=M3_90天,4=M4_120天.5=M5_150天.6=M6_180天.7=M7_360天.8=M8_999999天)
     * @return overdue_type 逾期分类(1=M1_30天,2=M2_60天,3=M3_90天,4=M4_120天.5=M5_150天.6=M6_180天.7=M7_360天.8=M8_999999天)
     */
    public Short getOverdueType() {
        return overdueType;
    }

    /**
     * 逾期分类(1=M1_30天,2=M2_60天,3=M3_90天,4=M4_120天.5=M5_150天.6=M6_180天.7=M7_360天.8=M8_999999天)
     * @param overdueType 逾期分类(1=M1_30天,2=M2_60天,3=M3_90天,4=M4_120天.5=M5_150天.6=M6_180天.7=M7_360天.8=M8_999999天)
     */
    public void setOverdueType(Short overdueType) {
        this.overdueType = overdueType;
    }

    /**
     * 应收罚金
     * @return receivable_penalty 应收罚金
     */
    public BigDecimal getReceivablePenalty() {
        return receivablePenalty;
    }

    /**
     * 应收罚金
     * @param receivablePenalty 应收罚金
     */
    public void setReceivablePenalty(BigDecimal receivablePenalty) {
        this.receivablePenalty = receivablePenalty;
    }

    /**
     * 人工变更减免手续费
     * @return manual_modify_reduce_handling_charge 人工变更减免手续费
     */
    public BigDecimal getManualModifyReduceHandlingCharge() {
        return manualModifyReduceHandlingCharge;
    }

    /**
     * 人工变更减免手续费
     * @param manualModifyReduceHandlingCharge 人工变更减免手续费
     */
    public void setManualModifyReduceHandlingCharge(BigDecimal manualModifyReduceHandlingCharge) {
        this.manualModifyReduceHandlingCharge = manualModifyReduceHandlingCharge;
    }

    /**
     * 人工变更减免利息
     * @return manual_modify_reduce_interest 人工变更减免利息
     */
    public BigDecimal getManualModifyReduceInterest() {
        return manualModifyReduceInterest;
    }

    /**
     * 人工变更减免利息
     * @param manualModifyReduceInterest 人工变更减免利息
     */
    public void setManualModifyReduceInterest(BigDecimal manualModifyReduceInterest) {
        this.manualModifyReduceInterest = manualModifyReduceInterest;
    }

    /**
     * 人工变更减免罚金
     * @return manual_modify_reduce_penalty 人工变更减免罚金
     */
    public BigDecimal getManualModifyReducePenalty() {
        return manualModifyReducePenalty;
    }

    /**
     * 人工变更减免罚金
     * @param manualModifyReducePenalty 人工变更减免罚金
     */
    public void setManualModifyReducePenalty(BigDecimal manualModifyReducePenalty) {
        this.manualModifyReducePenalty = manualModifyReducePenalty;
    }

    /**
     * 提前还款减免手续费
     * @return prepayment_reduce_handling_charge 提前还款减免手续费
     */
    public BigDecimal getPrepaymentReduceHandlingCharge() {
        return prepaymentReduceHandlingCharge;
    }

    /**
     * 提前还款减免手续费
     * @param prepaymentReduceHandlingCharge 提前还款减免手续费
     */
    public void setPrepaymentReduceHandlingCharge(BigDecimal prepaymentReduceHandlingCharge) {
        this.prepaymentReduceHandlingCharge = prepaymentReduceHandlingCharge;
    }

    /**
     * 提前还款减免利息
     * @return prepayment_reduce_interest 提前还款减免利息
     */
    public BigDecimal getPrepaymentReduceInterest() {
        return prepaymentReduceInterest;
    }

    /**
     * 提前还款减免利息
     * @param prepaymentReduceInterest 提前还款减免利息
     */
    public void setPrepaymentReduceInterest(BigDecimal prepaymentReduceInterest) {
        this.prepaymentReduceInterest = prepaymentReduceInterest;
    }

    /**
     * 应收提前还款违约金
     * @return prepayment_receivable_penalty 应收提前还款违约金
     */
    public BigDecimal getPrepaymentReceivablePenalty() {
        return prepaymentReceivablePenalty;
    }

    /**
     * 应收提前还款违约金
     * @param prepaymentReceivablePenalty 应收提前还款违约金
     */
    public void setPrepaymentReceivablePenalty(BigDecimal prepaymentReceivablePenalty) {
        this.prepaymentReceivablePenalty = prepaymentReceivablePenalty;
    }

    /**
     * 还款券减免本金
     * @return repayment_coupon_reduce_principal 还款券减免本金
     */
    public BigDecimal getRepaymentCouponReducePrincipal() {
        return repaymentCouponReducePrincipal;
    }

    /**
     * 还款券减免本金
     * @param repaymentCouponReducePrincipal 还款券减免本金
     */
    public void setRepaymentCouponReducePrincipal(BigDecimal repaymentCouponReducePrincipal) {
        this.repaymentCouponReducePrincipal = repaymentCouponReducePrincipal;
    }

    /**
     * 还款券减免手续费
     * @return repayment_coupon_reduce_handling_charge 还款券减免手续费
     */
    public BigDecimal getRepaymentCouponReduceHandlingCharge() {
        return repaymentCouponReduceHandlingCharge;
    }

    /**
     * 还款券减免手续费
     * @param repaymentCouponReduceHandlingCharge 还款券减免手续费
     */
    public void setRepaymentCouponReduceHandlingCharge(BigDecimal repaymentCouponReduceHandlingCharge) {
        this.repaymentCouponReduceHandlingCharge = repaymentCouponReduceHandlingCharge;
    }

    /**
     * 还款券减免利息
     * @return repayment_coupon_reduce_interest 还款券减免利息
     */
    public BigDecimal getRepaymentCouponReduceInterest() {
        return repaymentCouponReduceInterest;
    }

    /**
     * 还款券减免利息
     * @param repaymentCouponReduceInterest 还款券减免利息
     */
    public void setRepaymentCouponReduceInterest(BigDecimal repaymentCouponReduceInterest) {
        this.repaymentCouponReduceInterest = repaymentCouponReduceInterest;
    }

    /**
     * 催收减免本金
     * @return collection_reduce_principal 催收减免本金
     */
    public BigDecimal getCollectionReducePrincipal() {
        return collectionReducePrincipal;
    }

    /**
     * 催收减免本金
     * @param collectionReducePrincipal 催收减免本金
     */
    public void setCollectionReducePrincipal(BigDecimal collectionReducePrincipal) {
        this.collectionReducePrincipal = collectionReducePrincipal;
    }

    /**
     * 催收减免手续费
     * @return collection_reduce_handling_charge 催收减免手续费
     */
    public BigDecimal getCollectionReduceHandlingCharge() {
        return collectionReduceHandlingCharge;
    }

    /**
     * 催收减免手续费
     * @param collectionReduceHandlingCharge 催收减免手续费
     */
    public void setCollectionReduceHandlingCharge(BigDecimal collectionReduceHandlingCharge) {
        this.collectionReduceHandlingCharge = collectionReduceHandlingCharge;
    }

    /**
     * 催收减免利息
     * @return collection_reduce_interest 催收减免利息
     */
    public BigDecimal getCollectionReduceInterest() {
        return collectionReduceInterest;
    }

    /**
     * 催收减免利息
     * @param collectionReduceInterest 催收减免利息
     */
    public void setCollectionReduceInterest(BigDecimal collectionReduceInterest) {
        this.collectionReduceInterest = collectionReduceInterest;
    }

    /**
     * 催收减免罚金
     * @return collection_reduce_penalty 催收减免罚金
     */
    public BigDecimal getCollectionReducePenalty() {
        return collectionReducePenalty;
    }

    /**
     * 催收减免罚金
     * @param collectionReducePenalty 催收减免罚金
     */
    public void setCollectionReducePenalty(BigDecimal collectionReducePenalty) {
        this.collectionReducePenalty = collectionReducePenalty;
    }

    /**
     * 实还本金
     * @return actual_repayment_principal 实还本金
     */
    public BigDecimal getActualRepaymentPrincipal() {
        return actualRepaymentPrincipal;
    }

    /**
     * 实还本金
     * @param actualRepaymentPrincipal 实还本金
     */
    public void setActualRepaymentPrincipal(BigDecimal actualRepaymentPrincipal) {
        this.actualRepaymentPrincipal = actualRepaymentPrincipal;
    }

    /**
     * 实还手续费
     * @return actual_repayment_handling_charge 实还手续费
     */
    public BigDecimal getActualRepaymentHandlingCharge() {
        return actualRepaymentHandlingCharge;
    }

    /**
     * 实还手续费
     * @param actualRepaymentHandlingCharge 实还手续费
     */
    public void setActualRepaymentHandlingCharge(BigDecimal actualRepaymentHandlingCharge) {
        this.actualRepaymentHandlingCharge = actualRepaymentHandlingCharge;
    }

    /**
     * 实还利息
     * @return actual_repayment_interest 实还利息
     */
    public BigDecimal getActualRepaymentInterest() {
        return actualRepaymentInterest;
    }

    /**
     * 实还利息
     * @param actualRepaymentInterest 实还利息
     */
    public void setActualRepaymentInterest(BigDecimal actualRepaymentInterest) {
        this.actualRepaymentInterest = actualRepaymentInterest;
    }

    /**
     * 实还罚金
     * @return actual_repayment_penalty 实还罚金
     */
    public BigDecimal getActualRepaymentPenalty() {
        return actualRepaymentPenalty;
    }

    /**
     * 实还罚金
     * @param actualRepaymentPenalty 实还罚金
     */
    public void setActualRepaymentPenalty(BigDecimal actualRepaymentPenalty) {
        this.actualRepaymentPenalty = actualRepaymentPenalty;
    }

    /**
     * 实还提前还款违约金
     * @return actual_prepayment_penalty 实还提前还款违约金
     */
    public BigDecimal getActualPrepaymentPenalty() {
        return actualPrepaymentPenalty;
    }

    /**
     * 实还提前还款违约金
     * @param actualPrepaymentPenalty 实还提前还款违约金
     */
    public void setActualPrepaymentPenalty(BigDecimal actualPrepaymentPenalty) {
        this.actualPrepaymentPenalty = actualPrepaymentPenalty;
    }

    /**
     * 实还总合计
     * @return actual_repayment_total 实还总合计
     */
    public BigDecimal getActualRepaymentTotal() {
        return actualRepaymentTotal;
    }

    /**
     * 实还总合计
     * @param actualRepaymentTotal 实还总合计
     */
    public void setActualRepaymentTotal(BigDecimal actualRepaymentTotal) {
        this.actualRepaymentTotal = actualRepaymentTotal;
    }

    /**
     * 
     * @return version 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Integer version) {
        this.version = version;
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
     * 
     * @return rtime 
     */
    public Date getRtime() {
        return rtime;
    }

    /**
     * 
     * @param rtime 
     */
    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    /**
     * 
     * @return creater 
     */
    public Long getCreater() {
        return creater;
    }

    /**
     * 
     * @param creater 
     */
    public void setCreater(Long creater) {
        this.creater = creater;
    }

    /**
     * 
     * @return updater 
     */
    public Long getUpdater() {
        return updater;
    }

    /**
     * 
     * @param updater 
     */
    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    /**
     * 
     * @return isdel 
     */
    public Short getIsdel() {
        return isdel;
    }

    /**
     * 
     * @param isdel 
     */
    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }

    /**
     * 总期次
     * @return periods 总期次
     */
    public Short getPeriods() {
        return periods;
    }

    /**
     * 总期次
     * @param periods 总期次
     */
    public void setPeriods(Short periods) {
        this.periods = periods;
    }

    /**
     * 资金渠道类型(platform:平台;zongheng:纵横理财)
     * @return channel 资金渠道类型(platform:平台;zongheng:纵横理财)
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 资金渠道类型(platform:平台;zongheng:纵横理财)
     * @param channel 资金渠道类型(platform:平台;zongheng:纵横理财)
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 借款人第三方资金渠道账户id
     * @return third_account_id 借款人第三方资金渠道账户id
     */
    public String getThirdAccountId() {
        return thirdAccountId;
    }

    /**
     * 借款人第三方资金渠道账户id
     * @param thirdAccountId 借款人第三方资金渠道账户id
     */
    public void setThirdAccountId(String thirdAccountId) {
        this.thirdAccountId = thirdAccountId == null ? null : thirdAccountId.trim();
    }

    /**
     * 第三方资金渠道服务费
     * @return third_charge 第三方资金渠道服务费
     */
    public BigDecimal getThirdCharge() {
        return thirdCharge;
    }

    /**
     * 第三方资金渠道服务费
     * @param thirdCharge 第三方资金渠道服务费
     */
    public void setThirdCharge(BigDecimal thirdCharge) {
        this.thirdCharge = thirdCharge;
    }

    /**
     * 展业达人服务费
     * @return platform_charge 展业达人服务费
     */
    public BigDecimal getPlatformCharge() {
        return platformCharge;
    }

    /**
     * 展业达人服务费
     * @param platformCharge 展业达人服务费
     */
    public void setPlatformCharge(BigDecimal platformCharge) {
        this.platformCharge = platformCharge;
    }

    /**
     * 是否代偿(0:否;1:是)
     * @return is_compensatory 是否代偿(0:否;1:是)
     */
    public Integer getIsCompensatory() {
        return isCompensatory;
    }

    /**
     * 是否代偿(0:否;1:是)
     * @param isCompensatory 是否代偿(0:否;1:是)
     */
    public void setIsCompensatory(Integer isCompensatory) {
        this.isCompensatory = isCompensatory;
    }

    /**
     * 代偿时间
     * @return compensatory_time 代偿时间
     */
    public Date getCompensatoryTime() {
        return compensatoryTime;
    }

    /**
     * 代偿时间
     * @param compensatoryTime 代偿时间
     */
    public void setCompensatoryTime(Date compensatoryTime) {
        this.compensatoryTime = compensatoryTime;
    }

    /**
     * 综合息费
     * @return combination_fee 综合息费
     */
    public BigDecimal getCombinationFee() {
        return combinationFee;
    }

    /**
     * 综合息费
     * @param combinationFee 综合息费
     */
    public void setCombinationFee(BigDecimal combinationFee) {
        this.combinationFee = combinationFee;
    }
}