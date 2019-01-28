package com.practice.result;

import java.io.Serializable;

public class Result<T> implements Serializable {

	//返回码
	private int code = 0;
	//失败消息
	private String message;
	//时间戳
	private long time = System.currentTimeMillis();
	//结果
	private T result;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
}
