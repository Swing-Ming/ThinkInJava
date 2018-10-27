package com.day.test;

import java.util.ArrayList;
import java.util.List;

public class MyLink {
	
	Node head = null;
	
	public void addNode(Entity data ){
		
		Node node = new Node(data);
		if(head == null){
			head = node;
			return;
		}
		
		Node temp = head;
		Entity  t1 = new Entity();
		t1.setName("t1");
		Node s = new Node(t1);
		while(temp.next != null){
			temp = temp.next;
			Node s1 = s;
			s1 =temp;
			System.out.println("===>s:"+s.data.getName());
			System.out.println("===>temp:"+temp.data.getName());
			System.out.println("===>head:"+head.data.getName());
		}
		temp.next = node;
	}
	
	public static void main(String[] args) {
		List<Entity> list = new ArrayList();
		Entity  Entity1 = new Entity();
		Entity1.setName("001");
		list.add(Entity1);
		Entity  Entity2 = new Entity();
		Entity2.setName("002");
		list.add(Entity2);
		Entity  Entity3 = new Entity();
		Entity3.setName("003");
		list.add(Entity3);
		Entity  Entity4 = new Entity();
		Entity4.setName("004");
		list.add(Entity4);
		Entity  Entity5 = new Entity();
		Entity5.setName("005");
		list.add(Entity5);
		MyLink myLink = new MyLink();
		for (Entity i : list) {
			myLink.addNode(i);
		}
		
	}
	
	

}
