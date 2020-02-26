package com.sunhongwei.domain;
/** 
 * @author by WangMaoLin
 * @version 2020�?2�?24�? 下午2:05:31 
 * 
 */

public class Goods {
	private Integer id;
	private String name;
	private String ename;
	private Integer size;
	private Double price;
	private Integer num;
	private String biao;
	private String imgurl;
	private Type type;
	private Brand brand;
	private Integer bid;
	private Integer tid;
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBiao() {
		return biao;
	}
	public void setBiao(String biao) {
		this.biao = biao;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public Goods() {
		super();
	}
	public Goods(Integer id, String name, String ename, Integer size,
			Double price, Integer num, String biao, String imgurl, Type type,
			Brand brand, Integer bid, Integer tid) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.size = size;
		this.price = price;
		this.num = num;
		this.biao = biao;
		this.imgurl = imgurl;
		this.type = type;
		this.brand = brand;
		this.bid = bid;
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", ename=" + ename
				+ ", size=" + size + ", price=" + price + ", num=" + num
				+ ", biao=" + biao + ", imgurl=" + imgurl + ", type=" + type
				+ ", brand=" + brand + ", bid=" + bid + ", tid=" + tid + "]";
	}
	
	
}
