package com.day.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillList {

	public static void main(String[] args) {
		List<StringAddress> stringList = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello!")));

		System.out.println(stringList);
		Collections.fill(stringList, new StringAddress("World!"));// 替换list的值，若list本身没有，则不替换
		System.out.println(stringList);
		System.out.println(.75);
	}

}
