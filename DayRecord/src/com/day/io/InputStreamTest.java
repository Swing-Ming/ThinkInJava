package com.day.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringBufferInputStream;

public class InputStreamTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		InputStream i1 = new FileInputStream(new File(""));
		InputStream i2 = new StringBufferInputStream(new String("0000000"));
		InputStream i3 = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
		InputStream i4 = new PipedInputStream();
		// InputStream i5 = new SequenceInputStream(e);

		OutputStream o1 = new ByteArrayOutputStream(2);
		OutputStream o2 = new FileOutputStream(new File(""));
		OutputStream o3 = new PrintStream(new File("E:\t1"));
		FilterInputStream f1 = new DataInputStream(i1);
		// BufferedReader br = new BufferedReader();
		// FilterReader fr = new BufferedReader(new FileReader(new File(""))));

		BufferedInputStream bi = new BufferedInputStream(i1);
		DataInputStream di = new DataInputStream(i1);
		di.readLine();

	}

	public static void fileSend() throws Exception {
		/*
		 * InputStream i1 = new FileInputStream(new File("E:\t1")); i1.read();
		 * OutputStream o1 = new FileOutputStream(new File("E:\t2"));
		 * o1.write(1024);
		 */

		/*
		 * PrintStream o3 = new PrintStream(new File("E:\1.txt")); o3.print(1);
		 */
		File file = new File("E:\1.txt");
		OutputStream o2 = new FileOutputStream(file);

		Reader reader = new InputStreamReader(new FileInputStream(new File("")));
	}
}
