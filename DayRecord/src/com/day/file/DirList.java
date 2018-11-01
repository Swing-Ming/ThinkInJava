package com.day.file;

import java.io.File;
import java.util.Arrays;

public class DirList {
	public static void main(String[] args) {
		File file = new File(".");
		String[] list;
		if (args.length == 0) {
			list = file.list();
		} else {
			list = file.list(new DirFilter(args[0]));
		}
		if (args.length != 0) {
			System.out.println("=========>");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}

		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String string : list) {
			System.out.println(string);
		}

	}
}
