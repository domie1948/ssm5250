package com.dao;

import com.entity.FabuwentiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FabuwentiVO;
import com.entity.view.FabuwentiView;


/**
 * 发布问题
 * 
 * @author 
 * @email 
 * @date 2021-02-08 16:04:07
 */
public interface FabuwentiDao extends BaseMapper<FabuwentiEntity> {
	
	List<FabuwentiVO> selectListVO(@Param("ew") Wrapper<FabuwentiEntity> wrapper);
	
	FabuwentiVO selectVO(@Param("ew") Wrapper<FabuwentiEntity> wrapper);
	
	List<FabuwentiView> selectListView(@Param("ew") Wrapper<FabuwentiEntity> wrapper);

	List<FabuwentiView> selectListView(Pagination page,@Param("ew") Wrapper<FabuwentiEntity> wrapper);
	
	FabuwentiView selectView(@Param("ew") Wrapper<FabuwentiEntity> wrapper);
	
}
