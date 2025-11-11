package com.dao;

import com.entity.JiuzhenrenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuzhenrenVO;
import com.entity.view.JiuzhenrenView;


/**
 * 就诊人
 * 
 * @author 
 * @email 
 * @date 2025-04-18 11:30:22
 */
public interface JiuzhenrenDao extends BaseMapper<JiuzhenrenEntity> {
	
	List<JiuzhenrenVO> selectListVO(@Param("ew") Wrapper<JiuzhenrenEntity> wrapper);
	
	JiuzhenrenVO selectVO(@Param("ew") Wrapper<JiuzhenrenEntity> wrapper);
	
	List<JiuzhenrenView> selectListView(@Param("ew") Wrapper<JiuzhenrenEntity> wrapper);

	List<JiuzhenrenView> selectListView(Pagination page,@Param("ew") Wrapper<JiuzhenrenEntity> wrapper);

	
	JiuzhenrenView selectView(@Param("ew") Wrapper<JiuzhenrenEntity> wrapper);
	

}
