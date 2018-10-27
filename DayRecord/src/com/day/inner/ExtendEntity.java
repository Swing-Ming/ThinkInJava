package com.day.inner;

import com.day.test.ParentClass;

public class ExtendEntity extends ParentClass {
	
	
	
	
	@Override
	public void p1() {
		String s  = super.s1;
		super.p1();
	} 
	@Override
	protected void p2() {
		
		super.p2();
	}
	
	
	
	
	
	

}
