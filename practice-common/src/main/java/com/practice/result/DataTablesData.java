package com.practice.result;

import java.io.Serializable;
import java.util.List;

public class DataTablesData implements Serializable{

	private int recordsTotal;
	
	private List<?> data;

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}
}
