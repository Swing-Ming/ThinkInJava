package com.day.collections;

import java.util.LinkedHashMap;

public class MapData<K, V> extends LinkedHashMap<K, V> {

	public MapData(Generator<Pair<K, V>> gen, int quantity) {
		for (int i = 0; i < quantity; i++) {
			Pair<K, V> p = gen.next();
			put(p.key, p.value);
		}
	}

	public MapData(Generator<K> genK, Generator<V> genV, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(genK.next(), genV.next());
		}
	}

	public MapData(Generator<K> genK, V v, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(genK.next(), v);
		}
	}

	public MapData(Iterable<K> genK, Generator<V> genV) {
		for (K k : genK) {
			put(k, genV.next());
		}
	}

	public MapData(Iterable<K> genK, V v) {
		for (K k : genK) {
			put(k, v);
		}
	}

	public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen,
			int quantity) {
		return new MapData<K, V>(gen, quantity);
	}

	public static <K, V> MapData<K, V> map(Generator<K> genK,
			Generator<V> genV, int quantity) {
		return new MapData<K, V>(genK, genV, quantity);
	}

	public static <K, V> MapData<K, V> map(Generator<K> genK, V v, int quantity) {
		return new MapData<K, V>(genK, v, quantity);

	}

	public static <K, V> MapData<K, V> map(Iterable<K> genK, Generator<V> genV) {
		return new MapData<K, V>(genK, genV);
	}

	public static <K, V> MapData<K, V> map(Iterable<K> genK, V v) {
		return new MapData<K, V>(genK, v);
	}
}
