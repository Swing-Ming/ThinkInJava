package com.day.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class TypesForSets {
	static <T> Set<T> fill(Set<T> set, Class<T> type) {
		for (int i = 0; i < 10; i++) {
			try {
				set.add(type.getConstructor(int.class).newInstance(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return set;
	}

	public static <T> void test(Set<T> set, Class<T> type) {
		fill(set, type);
		fill(set, type);
		fill(set, type);
		System.out.println(set);
	}

	public static void main(String[] args) throws Exception {

		test(new HashSet<HashType>(), HashType.class);
		test(new LinkedHashSet<HashType>(), HashType.class);

		test(new TreeSet<TreeType>(), TreeType.class);

		test(new HashSet<SetType>(), SetType.class);
		test(new HashSet<TreeType>(), TreeType.class);
		test(new LinkedHashSet<SetType>(), SetType.class);
		test(new LinkedHashSet<TreeType>(), TreeType.class);
		Map<String, String> map = new HashMap<String, String>();
		Set<Entry<String, String>> entrySet = map.entrySet();

		/*
		 * test(new LinkedHashSet<HashType>(), HashType.class); test(new
		 * TreeSet<TreeType>(), TreeType.class);
		 * 
		 * test(new HashSet<SetType>(), SetType.class); test(new
		 * HashSet<TreeType>(), TreeType.class);
		 * 
		 * test(new LinkedHashSet<SetType>(), SetType.class); test(new
		 * LinkedHashSet<TreeType>(), TreeType.class);
		 * 
		 * try { test(new TreeSet<SetType>(), SetType.class); } catch (Exception
		 * e) { System.out.println(e.getMessage()); }
		 * 
		 * try { test(new TreeSet<HashType>(), HashType.class); } catch
		 * (Exception e) { System.out.println(e.getMessage()); }
		 */

	}
}
