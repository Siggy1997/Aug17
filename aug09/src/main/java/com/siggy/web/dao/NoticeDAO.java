package com.siggy.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeDAO {



	List<Map<String, Object>> list();
 
	
}
