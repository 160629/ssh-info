package com.pcitc.info.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="notice")
public class Notice {
	
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="notice_id")
    private Integer noticeId;
    @Column(name="notice_message")
    private String noticeMessage;
    @ManyToMany
    @JoinTable(                                
            name="notice_user",                    //中间表的名字
            joinColumns= {@JoinColumn(name="notice_id")},        //外键的字段
            inverseJoinColumns= {@JoinColumn(name="user_id")})    //反转控制字段的名字
    private Set<User> users;
    

    public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

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