package com.sunhongwei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunhongwei.dao.GoodsDao;
import com.sunhongwei.domain.Brand;
import com.sunhongwei.domain.Goods;
import com.sunhongwei.domain.Type;
import com.sunhongwei.service.GoodsService;
import com.sunhongwei.vo.GoodsVO;

/** 
 * @author by WangMaoLin
 * @version 2020�?2�?24�? 下午2:15:15 
 * 
 */
@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsDao gd;

	@Override
	public List<Goods> list(GoodsVO gv) {
		// TODO Auto-generated method stub
		return gd.list(gv);
	}

	@Override
	public List<Type> selectType() {
		// TODO Auto-generated method stub
		return gd.selectType();
	}

	@Override
	public List<Brand> selectBrand() {
		// TODO Auto-generated method stub
		return gd.selectBrand();
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		gd.addGoods(goods);
		gd.addGb(goods.getId(),goods.getBid());
		gd.addGt(goods.getId(),goods.getTid());
	}
}
