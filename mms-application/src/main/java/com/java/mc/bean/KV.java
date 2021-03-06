package com.java.mc.bean;

import java.io.Serializable;

public class KV implements Serializable {

	private static final long serialVersionUID = 6010190257748724594L;
	private String key;
	private Integer val;
	private String value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getVal() {
		return val;
	}
	public void setVal(Integer val) {
		this.val = val;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
