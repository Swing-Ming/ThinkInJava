package com.day.test;

public class ExtendClass extends BaseClass {

	public void test(ExtendClass extendClass) {
		System.out.println(i);
		System.out.println(extendClass.i);
	}

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		/*
		 * ExtendClass ex = new ExtendClass(); ex.c(); System.out.println(ex.i);
		 * Class cc = BaseClass.class;
		 */
		// System.out.println( T1.s);
		/*
		 * System.out.println(T1.s); Class<ExtendClass> cl = ExtendClass.class;
		 * ExtendClass ec = cl.newInstance();
		 */

		ExtendClass b1 = new ExtendClass();
		b1.test(b1);
		/*
		 * Class<ExtendClass> e1 = ExtendClass.class; Class<? super ExtendClass>
		 * u1 = e1.getSuperclass(); Class<BaseClass> up = (Class<BaseClass>)
		 * cl.getSuperclass(); Object obj = u1.newInstance();
		 */

	}

}

class T1 {
	public static final boolean s = true;
	public static int s1 = 1;

	static {
		System.out.println("test!!");
	}

}
