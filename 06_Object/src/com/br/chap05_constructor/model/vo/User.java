package com.br.chap05_constructor.model.vo;

public class User {
	
	// 필드부
	// 멤버변수들 작성
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	// 생성자부
	
	// 메소드부
	// setter, getter, information 
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String inforamtion() {
		return "userId: " + userId + ", userPwd: " + userPwd
			+ ", userName: " + userName + ", age: " + age
			+ ", gender: " + gender;
	}

}
