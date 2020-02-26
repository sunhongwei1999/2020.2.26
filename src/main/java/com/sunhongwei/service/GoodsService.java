package com.sunhongwei.service;

import java.util.List;

import com.sunhongwei.domain.Brand;
import com.sunhongwei.domain.Goods;
import com.sunhongwei.domain.Type;
import com.sunhongwei.vo.GoodsVO;

/** 
 * @author by WangMaoLin
 * @version 2020�?2�?24�? 下午2:14:55 
 * 
 */

public interface GoodsService {

	List<Goods> list(GoodsVO gv);

	List<Type> selectType();

	List<Brand> selectBrand();

	void add(Goods goods);

}
