package com.pcitc.info.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    @Column(name="user_name")
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

	/**
	 * @param userId
	 * @param userName
	 */
	public User(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	/**
	 * 
	 */
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
    
    
}