package com.day.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
	private static String s;
	private static boolean b;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> list;

	public static void iterMotion(List<String> a) {
		ListIterator<String> lit = a.listIterator();
		lit.next();
		lit.hasPrevious();
		lit.hasNext();
		lit.previous();
		lit.previousIndex();
		lit.nextIndex();
		lit.add("1");
		lit.next();
		lit.remove();
		lit.set("2");
	}
}
