package com.pcitc.info.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class Notice {
	
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="notice_id")
    private Integer noticeId;
    @Column(name="notice_message")
    private String noticeMessage;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeMessage() {
        return noticeMessage;
    }

    public void setNoticeMessage(String noticeMessage) {
        this.noticeMessage = noticeMessage == null ? null : noticeMessage.trim();
    }
}