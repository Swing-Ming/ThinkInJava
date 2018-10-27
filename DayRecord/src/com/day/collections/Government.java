package com.day.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Government implements Generator<String> {

	String[] str = "this is a test".split(" ");
	private int index;

	@Override
	public String next() {
		return str[index++];
	}

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(
				new Government(), 4));

		set.addAll(CollectionData.list(new Government(), 4));
		System.out.println(set);
	}
}