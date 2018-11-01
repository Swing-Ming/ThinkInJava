package com.day.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringReader;

public class Test1 {

	static String file = "E:\\2.txt";

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new StringReader(
				BufferedInputFile.read("E:\\1.txt")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				file)));
		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null) {
			out.write(s);
		}
		/*
		 * out.println(lineCount++ + ": " + s); out.close();
		 */
		// Show the stored file:
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}

}
