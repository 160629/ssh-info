package com.pcitc.info.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
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

	public List<Map<String, Object>> getNotices() {
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery(" SELECT n.*, nn.user_name,nn.user_id "
				+ "FROM notice n LEFT JOIN (SELECT u.*,nu.notice_id FROM  "
				+ "USER u LEFT JOIN notice_user nu ON u.user_id=nu.user_id) nn "
				+ "ON n.notice_id=nn.notice_id");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map<String, Object>> list = query.list();
		return list;
	}
}
