package com.entity.view;

import com.entity.MenzhenyishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 门诊医生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-04-18 11:30:22
 */
@TableName("menzhenyisheng")
public class MenzhenyishengView  extends MenzhenyishengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MenzhenyishengView(){
	}
 
 	public MenzhenyishengView(MenzhenyishengEntity menzhenyishengEntity){
 	try {
			BeanUtils.copyProperties(this, menzhenyishengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
