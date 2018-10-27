package com.day.test;

public class Reference {
	
	public static void main(String[] args) {
		Entity entity  = new Entity();
		entity.setName("张三");
		entity.setIdCard("11111222");
		entity.setSex("男");
		entity.setPhone(1780101111L);
		
		Entity entity1 = new Entity();
		
		entity1 = entity;
		Entity entity2 = new Entity();
		entity2.setName("王五");
		entity1=entity2;
		System.out.println(entity); 
		System.out.println(entity1); 
		
	}
	
	
	

}
