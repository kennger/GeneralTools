package com.cx.pojo;

import java.util.Date;

public class SMSRecord {
    /**
     * 唯一ID
     */
    private String id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 发送类型
     */
    private Short sendType;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 发送号码
     */
    private String otherNum;

    /**
     * 名称
     */
    private String otherName;

    /**
     * 短信内容
     */
    private String content;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 修改时间
     */
    private Date mtime;

    /**
     * 创建人
     */
    private Integer creater;

    /**
     * 是否删除
     */
    private Integer isdel;

    /**
     * 内容标题
     */
    private String contentTitle;

    /**
     * 唯一ID
     * @return _id 唯一ID
     */
    public String getId() {
        return id;
    }

    /**
     * 唯一ID
     * @param id 唯一ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 发送类型
     * @return send_type 发送类型
     */
    public Short getSendType() {
        return sendType;
    }

    /**
     * 发送类型
     * @param sendType 发送类型
     */
    public void setSendType(Short sendType) {
        this.sendType = sendType;
    }

    /**
     * 发送时间
     * @return send_time 发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 发送时间
     * @param sendTime 发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 发送号码
     * @return other_num 发送号码
     */
    public String getOtherNum() {
        return otherNum;
    }

    /**
     * 发送号码
     * @param otherNum 发送号码
     */
    public void setOtherNum(String otherNum) {
        this.otherNum = otherNum == null ? null : otherNum.trim();
    }

    /**
     * 名称
     * @return other_name 名称
     */
    public String getOtherName() {
        return otherName;
    }

    /**
     * 名称
     * @param otherName 名称
     */
    public void setOtherName(String otherName) {
        this.otherName = otherName == null ? null : otherName.trim();
    }

    /**
     * 短信内容
     * @return content 短信内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 短信内容
     * @param content 短信内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 版本号
     * @return version 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本号
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 创建时间
     * @return ctime 创建时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 创建时间
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 修改时间
     * @return mtime 修改时间
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * 修改时间
     * @param mtime 修改时间
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * 创建人
     * @return creater 创建人
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * 创建人
     * @param creater 创建人
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * 是否删除
     * @return isdel 是否删除
     */
    public Integer getIsdel() {
        return isdel;
    }

    /**
     * 是否删除
     * @param isdel 是否删除
     */
    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    /**
     * 内容标题
     * @return content_title 内容标题
     */
    public String getContentTitle() {
        return contentTitle;
    }

    /**
     * 内容标题
     * @param contentTitle 内容标题
     */
    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle == null ? null : contentTitle.trim();
    }
}