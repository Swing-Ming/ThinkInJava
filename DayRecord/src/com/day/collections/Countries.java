package com.day.collections;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Countries {
	public static final String[][] DATA = { { "China", "BeiJing" },
			{ "America", "Washington" } };

	private static class FlyWeightMap extends AbstractMap<String, String> {
		private static class Entry implements Map.Entry<String, String> {
			int index;

			public Entry(int index) {
				this.index = index;
			}

			@Override
			public boolean equals(Object obj) {

				return DATA[index][0].equals(obj);
			}

			@Override
			public String getKey() {
				return DATA[index][0];
			}

			@Override
			public String getValue() {
				return DATA[index][1];
			}

			@Override
			public String setValue(String value) {
				throw new UnsupportedOperationException();
			}

			@Override
			public int hashCode() {
				return DATA[index][0].hashCode();
			}

		}

		static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
			private int size;

			public EntrySet(int size) {
				if (size < 0) {
					this.size = 0;
				} else if (size > DATA.length) {
					this.size = DATA.length;
				} else {
					this.size = size;
				}
			}

			@Override
			public Iterator<java.util.Map.Entry<String, String>> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				return size;
			}

			private class Iter implements Iterator<Map.Entry<String, String>> {
				private Entry entry = new Entry(-1);

				@Override
				public boolean hasNext() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public java.util.Map.Entry<String, String> next() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public void remove() {
					// TODO Auto-generated method stub

				}

			}

		}

		@Override
		public Set<java.util.Map.Entry<String, String>> entrySet() {
			// TODO Auto-generated method stub
			return null;
		}

	}
}
