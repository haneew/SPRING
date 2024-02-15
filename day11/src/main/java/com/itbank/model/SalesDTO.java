package com.itbank.model;

import java.util.Date;

// IDX         NOT NULL NUMBER 
// SDATE       NOT NULL DATE   
// PRODUCT_IDX          NUMBER 
// SVLO        NOT NULL NUMBER 

public class SalesDTO {
	private int idx;
	private Date sdate;
	private int product_idx;
	private int svol;
	
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public int getProduct_idx() {
		return product_idx;
	}
	public void setProduct_idx(int product_idx) {
		this.product_idx = product_idx;
	}
	public int getSvol() {
		return svol;
	}
	public void setSvol(int svol) {
		this.svol = svol;
	}
	
	
	
}
