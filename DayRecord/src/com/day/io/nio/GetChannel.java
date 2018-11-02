package com.day.io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
	public static void main(String[] args) throws Exception {
		String outFilePath = "E:\\2.txt";
		FileChannel fc = new FileOutputStream(new File("")).getChannel();
		fc.write(ByteBuffer.wrap("1231".getBytes()));
		fc.close();

		fc = new RandomAccessFile(new File(""), "rw").getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap("".getBytes()));
		fc.close();

		fc = new FileInputStream(new File("")).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		fc.read(buffer);
		buffer.flip();
		while (buffer.hasRemaining()) {
			System.out.println((char) buffer.get());
		}

	}
}
