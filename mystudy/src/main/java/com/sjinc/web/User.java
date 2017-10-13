package com.sjinc.web;

public class User {
	private String UserId;
	private String UserPass;
	
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserPass() {
		return UserPass;
	}
	public void setUserPass(String userPass) {
		UserPass = userPass;
	}
	
	
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserPass=" + UserPass + "]";
	}
	
	
	
	
}
