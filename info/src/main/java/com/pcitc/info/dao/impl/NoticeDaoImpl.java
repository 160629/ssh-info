package com.pcitc.info.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pcitc.info.dao.NoticeDao;
import com.pcitc.info.model.Notice;

/**
*
* @author 作者 E-mail: t-yong.wang
* @date 创建时间：2018年7月3日 下午4:04:38 
*
*/

@Repository
public class NoticeDaoImpl implements NoticeDao{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	public void save(Notice n) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(n);
	}
}
