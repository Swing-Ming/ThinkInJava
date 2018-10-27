package com.day.collections.hashcode;

public class Groundhog2 extends Groundhog {

	public Groundhog2(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj instanceof Groundhog && (((Groundhog2) obj).num == num);
	}

}
