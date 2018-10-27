package com.day.inner;

public class InnerClass extends P4 {
	private String inn1;

	 

	class P1 extends P2.P3 {
		private String s1;
		private String s2;

		native void nat();

		public void demo1() {
		}

		public void demo2() {
		}
		
		public P1(P2 p2){
			p2.super();
		}
		

	}

	public class P2 {
		public void run() {
			 
		}
		class P3 {
			public P3() {

			}

			public void r1() {

			}
		}

	}
}

class P4 {
	private String s1;
	private String s2;

	native void nat();

	public void demo1() {
	}

	public void demo2() {
	}

}
