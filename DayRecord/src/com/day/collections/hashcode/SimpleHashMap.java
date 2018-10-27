package com.day.collections.hashcode;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

	static final int SIZE = 997;
	LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

	public V put(K k, V v) {
		V oldValue = null;
		int index = Math.abs(k.hashCode()) % SIZE;
		if (buckets[index] == null) {
			buckets[index] = new LinkedList<MapEntry<K, V>>();
		}
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
		MapEntry<K, V> pair = new MapEntry<K, V>(k, v);
		boolean found = false;
		ListIterator<MapEntry<K, V>> itor = bucket.listIterator();
		while (itor.hasNext()) {
			MapEntry<K, V> ipair = itor.next();
			if (ipair.getKey().equals(k)) {
				oldValue = ipair.getValue();
				itor.set(pair);
				found = true;
				break;
			}
		}
		if (!found) {
			buckets[index].add(pair);
		}

		return oldValue;
	}

	public V get(Object obj) {
		int index = Math.abs(obj.hashCode()) % SIZE;
		if (buckets[index] == null) {
			return null;
		}
		for (MapEntry<K, V> pair : buckets[index]) {
			if (pair.getKey().equals(obj)) {
				return pair.getValue();
			}
		}
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		for (LinkedList<MapEntry<K, V>> bucket : buckets) {
			if (bucket == null) {
				continue;
			}
			for (MapEntry<K, V> pair : bucket) {
				set.add(pair);
			}
		}
		return set;
	}
}
