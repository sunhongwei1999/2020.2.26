package com.sunhongwei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunhongwei.domain.Brand;
import com.sunhongwei.domain.Goods;
import com.sunhongwei.domain.Type;
import com.sunhongwei.vo.GoodsVO;

/** 
 * @author by WangMaoLin
 * @version 2020�?2�?24�? 下午2:14:45 
 * 
 */

public interface GoodsDao {

	List<Goods> list(GoodsVO gv);
	
	List<Type> findType(Integer id);
	
	List<Brand> findBrand(Integer id);

	List<Type> selectType();

	List<Brand> selectBrand();

	void addGoods(Goods goods);

	void addGb(@Param("id")Integer id,@Param("bid") Integer bid);

	void addGt(@Param("id")Integer id,@Param("tid") Integer tid);

}
