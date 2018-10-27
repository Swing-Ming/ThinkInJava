package com.day.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillList {

	public static void main(String[] args) {
		List<StringAddress> stringList = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello!")));

		System.out.println(stringList);
		Collections.fill(stringList, new StringAddress("World!"));// �滻list��ֵ����list����û�У����滻
		System.out.println(stringList);
		System.out.println(.75);
	}

}
