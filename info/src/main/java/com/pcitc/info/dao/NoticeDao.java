package com.pcitc.info.dao;


import java.util.List;
import java.util.Map;

import com.pcitc.info.model.Notice;

/**
*
* @author 作者 E-mail: t-yong.wang
* @date 创建时间：2018年7月3日 下午4:02:56 
*
*/

public interface NoticeDao {
	
	void save(Notice n);
	
	List<Map<String, Object>> getNotices();

}
