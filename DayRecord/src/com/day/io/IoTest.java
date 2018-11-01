package com.day.io;

import java.io.File;
import java.io.PrintStream;

public class IoTest {

	public static void main(String[] args) throws Exception {
		/*
		 * File file = new File("E:\\1.txt"); OutputStream o2 = new
		 * FileOutputStream(file);
		 */

		PrintStream o3 = new PrintStream(new File("E:\\1.txt"));
		o3.print(1);
	}
}
