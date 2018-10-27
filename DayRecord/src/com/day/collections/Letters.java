package com.day.collections;

import java.util.Iterator;

public class Letters implements Generator<Pair<Integer, String>>,
		Iterable<Integer> {
	private Integer size = 11;
	private Integer number = 1;
	private char letter = 'A';

	@Override
	public Iterator<Integer> iterator() {

		return new Iterator<Integer>() {
			public Integer next() {
				return number++;
			}

			@Override
			public boolean hasNext() {
				return number < size;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public Pair<Integer, String> next() {

		return new Pair(number++, letter++ + "");
	}
}
