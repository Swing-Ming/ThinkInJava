package com.day.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		 * Integer[][][] a = { { { 1 }, { 2 }, { 3 } }, { { 4 }, { 5 }, { 6 } }
		 * };
		 * 
		 * System.out.println(a[1][1][0]);
		 * 
		 * int[] a1 = new int[3]; Integer[] a2 = new Integer[3]; Object[] obj =
		 * a2; Object s = a1;
		 * 
		 * Integer[][][] b = new Integer[1][2][3]; System.out.println(b);
		 */

		int[][][] s = new int[3][5][2];
		// System.out.println(Arrays.deepToString(s));
		int[][][] s1 = { { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } },
				{ { 11, 12 }, { 13, 14 }, { 15, 16 }, { 17, 18 }, { 19, 20 } } };
		System.out.println(Arrays.deepToString(s1));
		int[][][] s2 = new int[2][5][3];
		System.out.println(Arrays.deepToString(s2));
	}

}
