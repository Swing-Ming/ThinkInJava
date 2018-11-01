package com.day.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringReader;

public class BufferedInputFile {
	public static void main(String[] args) throws Exception {

		/*
		 * StringReader stringReader = new StringReader(read("E:\\1.txt")); int
		 * c; while ((c = stringReader.read()) != -1) { System.out.print((char)
		 * c); }
		 */

		/*
		 * DataInputStream dataInputStream = new DataInputStream( new
		 * ByteArrayInputStream(read("E:\\1.txt").getBytes())); while (true) {
		 * System.out.println((char) dataInputStream.readByte()); }
		 */
		String inFilePath = "E:\\1.txt";
		String outFilePath = "E:\\2.txt";
		BufferedReader br = new BufferedReader(new StringReader(
				read(inFilePath)));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				outFilePath)));
		String s;
		while ((s = br.readLine()) != null) {
			out.println(s);
		}
		out.close();

	}

	public static String read(String fileName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(
				new File(fileName)));

		StringBuilder sb = new StringBuilder();
		String s;
		while ((s = br.readLine()) != null) {
			sb.append(s + "\n");
		}
		br.close();
		return sb.toString();
	}

	public static void write(String outFileName) {

	}

}
