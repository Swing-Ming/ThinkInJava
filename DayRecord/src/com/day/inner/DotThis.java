package com.day.inner;

public class DotThis {
	void f(){}
	  class Inner{
		public DotThis outer(){
			return DotThis.this;
		}
	}
	

}
