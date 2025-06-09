package com.entity.view;

import com.entity.FabuwentiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发布问题
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-08 16:04:07
 */
@TableName("fabuwenti")
public class FabuwentiView  extends FabuwentiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FabuwentiView(){
	}
 
 	public FabuwentiView(FabuwentiEntity fabuwentiEntity){
 	try {
			BeanUtils.copyProperties(this, fabuwentiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
