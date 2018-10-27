package com.day.collections;

public class AssocationArray<K, V> {
	private Object[][] pair;
	private int index;

	public AssocationArray(int length) {
		pair = new Object[length][2];
	}

	public void put(K k, V v) {
		if (index > pair.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		pair[index++] = new Object[] { k, v };

	}

	public V get(K k) {
		for (int i = 0; i < pair.length; i++) {
			if (k.equals(pair[i][0])) {
				return (V) pair[i][1];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < pair.length; i++) {
			str.append(pair[i][0].toString());
			str.append(":");
			str.append(pair[i][1].toString());
			if (i < index - 1) {
				str.append("\n");
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		AssocationArray<String, String> map = new AssocationArray<String, String>(
				6);
		map.put("a1", "A");
		map.put("a2", "B");
		map.put("a3", "C");
		map.put("a4", "D");
		map.put("a5", "E");
		map.put("a6", "F");
		try {
			map.put("o", "o1");
		} catch (Exception e) {
			System.out.println("too many");
		}
		System.out.println(map);
		System.out.println(map.get("a3"));

	}
}
