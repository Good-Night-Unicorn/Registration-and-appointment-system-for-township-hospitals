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

import com.entity.ShijianduanEntity;
import com.entity.view.ShijianduanView;

import com.service.ShijianduanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 时间段
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-18 11:30:22
 */
@RestController
@RequestMapping("/shijianduan")
public class ShijianduanController {
    @Autowired
    private ShijianduanService shijianduanService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShijianduanEntity shijianduan,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ShijianduanEntity> ew = new EntityWrapper<ShijianduanEntity>();


        //查询结果
		PageUtils page = shijianduanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shijianduan), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShijianduanEntity shijianduan, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ShijianduanEntity> ew = new EntityWrapper<ShijianduanEntity>();

        //查询结果
		PageUtils page = shijianduanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shijianduan), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShijianduanEntity shijianduan){
       	EntityWrapper<ShijianduanEntity> ew = new EntityWrapper<ShijianduanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shijianduan, "shijianduan")); 
        return R.ok().put("data", shijianduanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShijianduanEntity shijianduan){
        EntityWrapper< ShijianduanEntity> ew = new EntityWrapper< ShijianduanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shijianduan, "shijianduan")); 
		ShijianduanView shijianduanView =  shijianduanService.selectView(ew);
		return R.ok("查询时间段成功").put("data", shijianduanView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShijianduanEntity shijianduan = shijianduanService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shijianduan,deSens);
        return R.ok().put("data", shijianduan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShijianduanEntity shijianduan = shijianduanService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(shijianduan,deSens);
        return R.ok().put("data", shijianduan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShijianduanEntity shijianduan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shijianduan);
        shijianduanService.insert(shijianduan);
        return R.ok().put("data",shijianduan.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShijianduanEntity shijianduan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shijianduan);
        shijianduanService.insert(shijianduan);
        return R.ok().put("data",shijianduan.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShijianduanEntity shijianduan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shijianduan);
        //全部更新
        shijianduanService.updateById(shijianduan);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shijianduanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
