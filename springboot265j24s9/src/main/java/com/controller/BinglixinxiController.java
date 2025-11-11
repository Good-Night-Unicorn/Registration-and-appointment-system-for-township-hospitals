package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import com.utils.ValidatorUtils;
import com.utils.DeSensUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BinglixinxiEntity;
import com.entity.view.BinglixinxiView;

import com.service.BinglixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 病历信息
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-18 11:30:22
 */
@RestController
@RequestMapping("/binglixinxi")
public class BinglixinxiController {
    @Autowired
    private BinglixinxiService binglixinxiService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BinglixinxiEntity binglixinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			binglixinxi.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			binglixinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        EntityWrapper<BinglixinxiEntity> ew = new EntityWrapper<BinglixinxiEntity>();


        //查询结果
		PageUtils page = binglixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, binglixinxi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BinglixinxiEntity binglixinxi, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			binglixinxi.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			binglixinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        //设置查询条件
        EntityWrapper<BinglixinxiEntity> ew = new EntityWrapper<BinglixinxiEntity>();

        //查询结果
		PageUtils page = binglixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, binglixinxi), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BinglixinxiEntity binglixinxi){
       	EntityWrapper<BinglixinxiEntity> ew = new EntityWrapper<BinglixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( binglixinxi, "binglixinxi")); 
        return R.ok().put("data", binglixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BinglixinxiEntity binglixinxi){
        EntityWrapper< BinglixinxiEntity> ew = new EntityWrapper< BinglixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( binglixinxi, "binglixinxi")); 
		BinglixinxiView binglixinxiView =  binglixinxiService.selectView(ew);
		return R.ok("查询病历信息成功").put("data", binglixinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BinglixinxiEntity binglixinxi = binglixinxiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(binglixinxi,deSens);
        return R.ok().put("data", binglixinxi);
    }

    /**
     * 前台详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BinglixinxiEntity binglixinxi = binglixinxiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(binglixinxi,deSens);
        return R.ok().put("data", binglixinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BinglixinxiEntity binglixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(binglixinxi);
        binglixinxiService.insert(binglixinxi);
        return R.ok().put("data",binglixinxi.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BinglixinxiEntity binglixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(binglixinxi);
    	binglixinxi.setUserid((Long)request.getSession().getAttribute("userId"));
        binglixinxiService.insert(binglixinxi);
        return R.ok().put("data",binglixinxi.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BinglixinxiEntity binglixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(binglixinxi);
        //全部更新
        binglixinxiService.updateById(binglixinxi);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        binglixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
