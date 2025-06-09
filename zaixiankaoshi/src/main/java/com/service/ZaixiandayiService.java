package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixiandayiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixiandayiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixiandayiView;


/**
 * 在线答疑
 *
 * @author 
 * @email 
 * @date 2021-02-08 16:04:07
 */
public interface ZaixiandayiService extends IService<ZaixiandayiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixiandayiVO> selectListVO(Wrapper<ZaixiandayiEntity> wrapper);
   	
   	ZaixiandayiVO selectVO(@Param("ew") Wrapper<ZaixiandayiEntity> wrapper);
   	
   	List<ZaixiandayiView> selectListView(Wrapper<ZaixiandayiEntity> wrapper);
   	
   	ZaixiandayiView selectView(@Param("ew") Wrapper<ZaixiandayiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixiandayiEntity> wrapper);
   	
}

