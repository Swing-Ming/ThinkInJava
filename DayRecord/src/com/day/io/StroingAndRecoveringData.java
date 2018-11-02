package com.day.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StroingAndRecoveringData {

	public static void main(String[] args) throws Exception {
		String outFileName = "E:\\2.txt";
		String inFileName = "E:\\1.txt";
		DataOutputStream out = new DataOutputStream(new FileOutputStream(
				new File(outFileName)));
		out.writeDouble(3.1415);
		out.writeUTF("≤‚ ‘÷–Œƒ");
		out.writeFloat(111L);
		out.writeUTF("≤‚ ‘”¢Œƒ");
		out.writeInt(100);
		out.close();
		DataInputStream in = new DataInputStream(new FileInputStream(new File(
				outFileName)));
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readFloat());
		System.out.println(in.readUTF());
		System.out.println(in.readInt());

	}
}
