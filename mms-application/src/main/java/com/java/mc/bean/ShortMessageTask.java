package com.java.mc.bean;

public class ShortMessageTask {

	private long messageId;
	private String staffNo;
	private String staffName;
	private String toMobileNo;
	private String subject;
	private String content;
	private String attach;
	private Short isSend;
	private Float errorCode;
	private Short code;
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getToMobileNo() {
		return toMobileNo;
	}
	public void setToMobileNo(String toMobileNo) {
		this.toMobileNo = toMobileNo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public Short getIsSend() {
		return isSend;
	}
	public void setIsSend(Short isSend) {
		this.isSend = isSend;
	}
	public Float getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Float errorCode) {
		this.errorCode = errorCode;
	}
	public Short getCode() {
		return code;
	}
	public void setCode(Short code) {
		this.code = code;
	}
	
}
