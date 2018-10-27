package com.day.collections;

public class SetType {
	public int i;

	public SetType(int n) {
		i = n;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof SetType && (i == ((SetType) obj).i);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.valueOf(i).toString();
	}
}
