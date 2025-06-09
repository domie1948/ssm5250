package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FabuwentiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FabuwentiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FabuwentiView;


/**
 * 发布问题
 *
 * @author 
 * @email 
 * @date 2021-02-08 16:04:07
 */
public interface FabuwentiService extends IService<FabuwentiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FabuwentiVO> selectListVO(Wrapper<FabuwentiEntity> wrapper);
   	
   	FabuwentiVO selectVO(@Param("ew") Wrapper<FabuwentiEntity> wrapper);
   	
   	List<FabuwentiView> selectListView(Wrapper<FabuwentiEntity> wrapper);
   	
   	FabuwentiView selectView(@Param("ew") Wrapper<FabuwentiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FabuwentiEntity> wrapper);
   	
}

