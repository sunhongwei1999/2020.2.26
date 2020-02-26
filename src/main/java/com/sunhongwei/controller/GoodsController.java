package com.sunhongwei.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunhongwei.domain.Brand;
import com.sunhongwei.domain.Goods;
import com.sunhongwei.domain.Type;
import com.sunhongwei.service.GoodsService;
import com.sunhongwei.vo.GoodsVO;

/** 
 * @author by WangMaoLin
 * @version 2020�?2�?24�? 下午2:15:42 
 * 
 */
@Controller
public class GoodsController {
	@Autowired
	private GoodsService gs;
	@RequestMapping("list")
	public String list(Model m,GoodsVO gv){
		if (gv.getPageNum()==null) {
			gv.setPageNum(1);
		}
		PageHelper.startPage(gv.getPageNum(), 3);
		List<Goods> list = gs.list(gv);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		
		m.addAttribute("page", page);
		m.addAttribute("gv", gv);
		
		return "list";
	}
	@ResponseBody
	@RequestMapping("selectType")
	public Object selectType(){
		List<Type> list = gs.selectType();
		return list;
	}
	@ResponseBody
	@RequestMapping("selectBrand")
	public Object selectBrand(){
		List<Brand> list = gs.selectBrand();
		return list;
	}
	@RequestMapping("toAdd")
	public String toAdd(Model m,Goods goods){
		List<Type> ts = gs.selectType();
		List<Brand> bs = gs.selectBrand();
		m.addAttribute("ts", ts);
		m.addAttribute("bs", bs);
		m.addAttribute("goods", goods);
		return "add";
	}
	@RequestMapping("add")
	public String add(Model m, @ModelAttribute Goods goods, MultipartFile myFile,HttpServletRequest request) throws IllegalStateException, IOException{
		if (!myFile.isEmpty()) {
			String realPath = request.getServletContext().getRealPath("/file/");
			String end = myFile.getOriginalFilename().substring(myFile.getOriginalFilename().lastIndexOf("."));
			String start = UUID.randomUUID().toString();
			File file = new File(realPath+"/"+start+end);
			myFile.transferTo(file);
			goods.setImgurl(start+end);
		}
		gs.add(goods);
		return "redirect:list";
		
	}
}
