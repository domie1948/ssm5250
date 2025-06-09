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


import com.dao.FabuwentiDao;
import com.entity.FabuwentiEntity;
import com.service.FabuwentiService;
import com.entity.vo.FabuwentiVO;
import com.entity.view.FabuwentiView;

@Service("fabuwentiService")
public class FabuwentiServiceImpl extends ServiceImpl<FabuwentiDao, FabuwentiEntity> implements FabuwentiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FabuwentiEntity> page = this.selectPage(
                new Query<FabuwentiEntity>(params).getPage(),
                new EntityWrapper<FabuwentiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FabuwentiEntity> wrapper) {
		  Page<FabuwentiView> page =new Query<FabuwentiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FabuwentiVO> selectListVO(Wrapper<FabuwentiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FabuwentiVO selectVO(Wrapper<FabuwentiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FabuwentiView> selectListView(Wrapper<FabuwentiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FabuwentiView selectView(Wrapper<FabuwentiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
