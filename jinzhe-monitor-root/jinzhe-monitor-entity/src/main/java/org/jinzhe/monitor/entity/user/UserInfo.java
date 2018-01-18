package org.jinzhe.monitor.entity.user;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
* @ClassName: UserInfo 
* @Description: userinfo po
* @author GWJ
* @date 2017年10月31日 下午1:42:52 
*
 */
public class UserInfo {

	private Long userInfoId;
	
	private String userName;

	@JSONField(format="yyyy-MM-dd")
	private Date userBrithday;
	
	private Integer userSex;
	
	private String userNation;
	
	private String userEducation;
	
	private String userCollege;
	
	private String userTitle;
	
	private Long loginId;

	public Long getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Long userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserBrithday() {
		return userBrithday;
	}

	public void setUserBrithday(Date userBrithday) {
		this.userBrithday = userBrithday;
	}

	public String getUserSex() {
		return userSex==0? "男":"女";
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public String getUserNation() {
		return userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}

	public String getUserEducation() {
		return userEducation;
	}

	public void setUserEducation(String userEducation) {
		this.userEducation = userEducation;
	}

	public String getUserCollege() {
		return userCollege;
	}

	public void setUserCollege(String userCollege) {
		this.userCollege = userCollege;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	@Override
	public String toString() {
		return "UserInfo [userInfoId=" + userInfoId + ", userName=" + userName
				+ ", userBrithday=" + userBrithday + ", userSex=" + userSex
				+ ", userNation=" + userNation + ", userEducation="
				+ userEducation + ", userCollege=" + userCollege
				+ ", userTitle=" + userTitle + ", loginId=" + loginId + "]";
	}
	
}
