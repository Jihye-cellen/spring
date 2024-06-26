package com.example.domain;

import java.util.Date;

public class GoodsVO {
	private String gid;
	private String title;
	private String brand;
	private String maker;
	private int price;
	private Date regDate;
	private String image;
	private String contents;
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "GoodsVO [gid=" + gid + ", title=" + title + ", brand=" + brand + ", maker=" + maker + ", price=" + price
				+ ", regDate=" + regDate + ", image=" + image + ", contents=" + contents + "]";
	}
	
}
