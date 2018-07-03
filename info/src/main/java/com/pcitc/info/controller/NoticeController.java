package com.pcitc.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcitc.info.model.Notice;
import com.pcitc.info.service.NoticeService;

/**
*
* @author 作者 E-mail: t-yong.wang
* @date 创建时间：2018年7月3日 下午4:10:43 
*
*/
@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("saveNotice")
	@ResponseBody
	public void save(Notice n){
		noticeService.save(n);		
	}
}
