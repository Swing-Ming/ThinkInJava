package com.day.collections;

public class TreeType extends SetType implements Comparable<TreeType> {

	public TreeType(int n) {
		super(n);
	}

	public void test() {
		System.out.println(i);
	}

	@Override
	public int compareTo(TreeType o) {
		// System.out.println(i);
		// System.out.println("o.i" + o.i);
		// int s = o.i < i ? -1 : (o.i == i ? 0 : 1);
		// System.out.println("s:=" + s);
		return o.i - i;

	}
}
