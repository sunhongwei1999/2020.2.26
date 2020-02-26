package com.sunhongwei.vo;

import com.sunhongwei.domain.Brand;
import com.sunhongwei.domain.Goods;
import com.sunhongwei.domain.Type;

/** 
 * @author by WangMaoLin
 * @version 2020�?2�?24�? 下午2:10:30 
 * 
 */

public class GoodsVO extends Goods{
	private Integer pageNum;
	private Integer tid;
	private Integer bid;
	private Double p1;
	private Double p2;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	
	
}
