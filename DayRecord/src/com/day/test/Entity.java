package com.day.test;

public class Entity {
	
	private String name;
	private String sex;
	private String idCard;
	private Long phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Entity [name=" + name + ", sex=" + sex + ", idCard=" + idCard
				+ ", phone=" + phone + "]";
	}
	
	
	

}
