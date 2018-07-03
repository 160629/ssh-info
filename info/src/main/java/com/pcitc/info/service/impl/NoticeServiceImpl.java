package com.pcitc.info.service.impl;

import org.aspectj.internal.lang.annotation.ajcDeclareEoW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pcitc.info.dao.NoticeDao;
import com.pcitc.info.model.Notice;
import com.pcitc.info.service.NoticeService;

/**
*
* @author 作者 E-mail: t-yong.wang
* @date 创建时间：2018年7月3日 下午4:08:38 
*
*/
@Transactional
@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private NoticeDao noticeDao;

	public void save(Notice n) {
		// TODO Auto-generated method stub
		noticeDao.save(n);
	}

}
