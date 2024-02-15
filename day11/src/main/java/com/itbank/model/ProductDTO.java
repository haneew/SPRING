package com.itbank.model;

import org.springframework.web.multipart.MultipartFile;

//IDX   NOT NULL NUMBER        
//PNAME NOT NULL VARCHAR2(200) 
//PRICE NOT NULL NUMBER        
//PIMG  NOT NULL VARCHAR2(500) 
//PVOL  NOT NULL NUMBER        

public class ProductDTO {

	private int idx;
	private String pname;
	private int price;
	private String pimg;
	private int pvol;
	
	private MultipartFile upload;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPimg() {
		return pimg;
	}

	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	public int getPvol() {
		return pvol;
	}

	public void setPvol(int pvol) {
		this.pvol = pvol;
	}

	public MultipartFile getUpload() {
		return upload;
	}

	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}

	
	
	
	
}
