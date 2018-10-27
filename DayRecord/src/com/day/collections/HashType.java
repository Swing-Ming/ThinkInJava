package com.day.collections;

public class HashType extends SetType {

	public HashType(int n) {
		super(n);
	}

	@Override
	public int hashCode() {
		// System.out.println("==>" + i);
		return i;
	}

}
