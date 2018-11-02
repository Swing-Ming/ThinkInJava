package com.day.io;

import java.io.File;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {

	public static void main(String[] args) {

	}

	public static void dispaly() throws Exception {
		String inFileName = "E:\\1.txt";
		RandomAccessFile rf = new RandomAccessFile(new File(inFileName), "r");
		for (int i = 0; i < 7; i++) {
			System.out.println("value:" + i + ":" + rf.readDouble());
			System.out.println(rf.readUTF());
			rf.close();
		}

	}
}
