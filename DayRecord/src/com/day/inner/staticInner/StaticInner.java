package com.day.inner.staticInner;

import com.day.inner.inter.InterfaceDemo;
import com.day.test.Entity;

public class StaticInner   {
	
	private String s = "";
	private int i = 1;
	
	
	
	static class Inner extends Entity  implements InterfaceDemo{
		public static void main(String[] args) {
			System.out.println();
		}
	}
	
	class Demo{
		
	}
	
	public Demo test(){
		return new Demo(){
			
		};
	}
	
	
	
	

}
