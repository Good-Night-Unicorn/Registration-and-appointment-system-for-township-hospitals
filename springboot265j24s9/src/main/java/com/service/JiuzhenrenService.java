package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuzhenrenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuzhenrenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuzhenrenView;


/**
 * 就诊人
 *
 * @author 
 * @email 
 * @date 2025-04-18 11:30:22
 */
public interface JiuzhenrenService extends IService<JiuzhenrenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuzhenrenVO> selectListVO(Wrapper<JiuzhenrenEntity> wrapper);
   	
   	JiuzhenrenVO selectVO(@Param("ew") Wrapper<JiuzhenrenEntity> wrapper);
   	
   	List<JiuzhenrenView> selectListView(Wrapper<JiuzhenrenEntity> wrapper);
   	
   	JiuzhenrenView selectView(@Param("ew") Wrapper<JiuzhenrenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuzhenrenEntity> wrapper);

   	

}

