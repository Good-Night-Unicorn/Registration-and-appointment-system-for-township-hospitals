package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenzhenyishengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenzhenyishengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenzhenyishengView;


/**
 * 门诊医生
 *
 * @author 
 * @email 
 * @date 2025-04-18 11:30:22
 */
public interface MenzhenyishengService extends IService<MenzhenyishengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenzhenyishengVO> selectListVO(Wrapper<MenzhenyishengEntity> wrapper);
   	
   	MenzhenyishengVO selectVO(@Param("ew") Wrapper<MenzhenyishengEntity> wrapper);
   	
   	List<MenzhenyishengView> selectListView(Wrapper<MenzhenyishengEntity> wrapper);
   	
   	MenzhenyishengView selectView(@Param("ew") Wrapper<MenzhenyishengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenzhenyishengEntity> wrapper);

   	

}

