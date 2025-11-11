package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MenzhenyishengDao;
import com.entity.MenzhenyishengEntity;
import com.service.MenzhenyishengService;
import com.entity.vo.MenzhenyishengVO;
import com.entity.view.MenzhenyishengView;

@Service("menzhenyishengService")
public class MenzhenyishengServiceImpl extends ServiceImpl<MenzhenyishengDao, MenzhenyishengEntity> implements MenzhenyishengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenzhenyishengEntity> page = this.selectPage(
                new Query<MenzhenyishengEntity>(params).getPage(),
                new EntityWrapper<MenzhenyishengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenzhenyishengEntity> wrapper) {
		  Page<MenzhenyishengView> page =new Query<MenzhenyishengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<MenzhenyishengVO> selectListVO(Wrapper<MenzhenyishengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenzhenyishengVO selectVO(Wrapper<MenzhenyishengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenzhenyishengView> selectListView(Wrapper<MenzhenyishengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenzhenyishengView selectView(Wrapper<MenzhenyishengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
