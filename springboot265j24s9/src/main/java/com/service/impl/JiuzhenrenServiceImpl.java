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


import com.dao.JiuzhenrenDao;
import com.entity.JiuzhenrenEntity;
import com.service.JiuzhenrenService;
import com.entity.vo.JiuzhenrenVO;
import com.entity.view.JiuzhenrenView;

@Service("jiuzhenrenService")
public class JiuzhenrenServiceImpl extends ServiceImpl<JiuzhenrenDao, JiuzhenrenEntity> implements JiuzhenrenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuzhenrenEntity> page = this.selectPage(
                new Query<JiuzhenrenEntity>(params).getPage(),
                new EntityWrapper<JiuzhenrenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuzhenrenEntity> wrapper) {
		  Page<JiuzhenrenView> page =new Query<JiuzhenrenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiuzhenrenVO> selectListVO(Wrapper<JiuzhenrenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuzhenrenVO selectVO(Wrapper<JiuzhenrenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuzhenrenView> selectListView(Wrapper<JiuzhenrenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuzhenrenView selectView(Wrapper<JiuzhenrenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
