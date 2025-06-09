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


import com.dao.ZaixiandayiDao;
import com.entity.ZaixiandayiEntity;
import com.service.ZaixiandayiService;
import com.entity.vo.ZaixiandayiVO;
import com.entity.view.ZaixiandayiView;

@Service("zaixiandayiService")
public class ZaixiandayiServiceImpl extends ServiceImpl<ZaixiandayiDao, ZaixiandayiEntity> implements ZaixiandayiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixiandayiEntity> page = this.selectPage(
                new Query<ZaixiandayiEntity>(params).getPage(),
                new EntityWrapper<ZaixiandayiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixiandayiEntity> wrapper) {
		  Page<ZaixiandayiView> page =new Query<ZaixiandayiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixiandayiVO> selectListVO(Wrapper<ZaixiandayiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixiandayiVO selectVO(Wrapper<ZaixiandayiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixiandayiView> selectListView(Wrapper<ZaixiandayiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixiandayiView selectView(Wrapper<ZaixiandayiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
