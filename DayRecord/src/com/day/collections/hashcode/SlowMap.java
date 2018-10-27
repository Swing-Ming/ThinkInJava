package com.day.collections.hashcode;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SlowMap<K, V> extends AbstractMap<K, V> {
	private List<K> kList = new ArrayList<K>();
	private List<V> vList = new ArrayList<V>();

	public V get(Object k) {
		if (!kList.contains(k)) {
			return null;
		}
		return vList.get(kList.indexOf(k));
	}

	public V put(K k, V v) {
		V oldValue = get(k);
		if (!kList.contains(k)) {
			kList.add(k);
			vList.add(v);
		} else {
			vList.set(kList.indexOf(k), v);
		}
		return oldValue;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		Iterator<K> ki = kList.iterator();
		Iterator<V> vi = vList.iterator();
		while (ki.hasNext()) {
			set.add(new MapEntry(ki.next(), vi.next()));
		}
		// TODO Auto-generated method stub
		return set;
	}

	public static void main(String[] args) {

	}
}
