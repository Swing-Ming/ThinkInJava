package com.day.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList1 {
	public static FilenameFilter flite(final String args) {

		return new FilenameFilter() {
			private Pattern pattern = Pattern.compile(args);

			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		};

	}

	public static void main(String[] args) {
		File file = new File(".");
		String[] list;
		if (args.length == 0) {
			list = file.list();
		} else {
			list = file.list(flite(args[0]));
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
