package com.day.collections;

import java.util.AbstractList;

public class CountIntegerList extends AbstractList<Integer> {
	private int size;

	public CountIntegerList(int size) {
		this.size = size < 0 ? 0 : size;
	}

	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return Integer.valueOf(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean add(Integer e) {
		// TODO Auto-generated method stub
		return true;
	}

	public static void main(String[] args) {
		CountIntegerList s = new CountIntegerList(30);
		// List<Integer> arrList = new ArrayList(s);
		s.add(1);
		System.out.println();

	}
}
