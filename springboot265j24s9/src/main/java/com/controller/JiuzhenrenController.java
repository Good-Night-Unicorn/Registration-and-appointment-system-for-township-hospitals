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

import com.entity.JiuzhenrenEntity;
import com.entity.view.JiuzhenrenView;

import com.service.JiuzhenrenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 就诊人
 * 后端接口
 * @author 
 * @email 
 * @date 2025-04-18 11:30:22
 */
@RestController
@RequestMapping("/jiuzhenren")
public class JiuzhenrenController {
    @Autowired
    private JiuzhenrenService jiuzhenrenService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiuzhenrenEntity jiuzhenren,
		HttpServletRequest request){
        if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
            jiuzhenren.setUserid((Long)request.getSession().getAttribute("userId"));
        }
        //设置查询条件
        EntityWrapper<JiuzhenrenEntity> ew = new EntityWrapper<JiuzhenrenEntity>();


        //查询结果
		PageUtils page = jiuzhenrenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuzhenren), params), params));
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
    public R list(@RequestParam Map<String, Object> params,JiuzhenrenEntity jiuzhenren, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<JiuzhenrenEntity> ew = new EntityWrapper<JiuzhenrenEntity>();

        //查询结果
		PageUtils page = jiuzhenrenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuzhenren), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiuzhenrenEntity jiuzhenren){
       	EntityWrapper<JiuzhenrenEntity> ew = new EntityWrapper<JiuzhenrenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiuzhenren, "jiuzhenren")); 
        return R.ok().put("data", jiuzhenrenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiuzhenrenEntity jiuzhenren){
        EntityWrapper< JiuzhenrenEntity> ew = new EntityWrapper< JiuzhenrenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiuzhenren, "jiuzhenren")); 
		JiuzhenrenView jiuzhenrenView =  jiuzhenrenService.selectView(ew);
		return R.ok("查询就诊人成功").put("data", jiuzhenrenView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiuzhenrenEntity jiuzhenren = jiuzhenrenService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(jiuzhenren,deSens);
        return R.ok().put("data", jiuzhenren);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiuzhenrenEntity jiuzhenren = jiuzhenrenService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(jiuzhenren,deSens);
        return R.ok().put("data", jiuzhenren);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiuzhenrenEntity jiuzhenren, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiuzhenren);
    	jiuzhenren.setUserid((Long)request.getSession().getAttribute("userId"));
        jiuzhenrenService.insert(jiuzhenren);
        return R.ok().put("data",jiuzhenren.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiuzhenrenEntity jiuzhenren, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiuzhenren);
        jiuzhenrenService.insert(jiuzhenren);
        return R.ok().put("data",jiuzhenren.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiuzhenrenEntity jiuzhenren, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiuzhenren);
        //全部更新
        jiuzhenrenService.updateById(jiuzhenren);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiuzhenrenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
