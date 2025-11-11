package com.dao;

import com.entity.MenzhenyishengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenzhenyishengVO;
import com.entity.view.MenzhenyishengView;


/**
 * 门诊医生
 * 
 * @author 
 * @email 
 * @date 2025-04-18 11:30:22
 */
public interface MenzhenyishengDao extends BaseMapper<MenzhenyishengEntity> {
	
	List<MenzhenyishengVO> selectListVO(@Param("ew") Wrapper<MenzhenyishengEntity> wrapper);
	
	MenzhenyishengVO selectVO(@Param("ew") Wrapper<MenzhenyishengEntity> wrapper);
	
	List<MenzhenyishengView> selectListView(@Param("ew") Wrapper<MenzhenyishengEntity> wrapper);

	List<MenzhenyishengView> selectListView(Pagination page,@Param("ew") Wrapper<MenzhenyishengEntity> wrapper);

	
	MenzhenyishengView selectView(@Param("ew") Wrapper<MenzhenyishengEntity> wrapper);
	

}
