package com.day.collections;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoTtem> {
	static class ToDoTtem implements Comparable<ToDoTtem> {
		private int sec;
		private char ch;
		private String str;

		public ToDoTtem(int sec, char ch, String str) {
			this.sec = sec;
			this.ch = ch;
			this.str = str;
		}

		@Override
		public int compareTo(ToDoTtem o) {
			if (ch > o.ch) {
				return +1;
			}
			if (ch == o.ch && sec > o.sec) {
				return +1;
			} else if (ch == o.ch && sec == o.sec) {
				return 0;
			}
			// TO DO Auto-generated method stub
			return -1;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return Character.toString(ch) + sec + ":" + str;
		}
	}

	public void add(String str, char ch, int sec) {
		super.add(new ToDoTtem(sec, ch, str));
	}

	public static void main(String[] args) {
		ToDoList todoList = new ToDoList();
		todoList.add("str1", 'A', 5);
		todoList.add("str2", 'B', 3);
		todoList.add("str3", 'A', 6);
		todoList.add("str4", 'D', 2);
		todoList.add("str5", 'E', 9);
		while (!todoList.isEmpty()) {
			System.out.println(todoList.remove());

		}
	}
}
