package com.day.collections;

import java.util.List;

public class TestGen <T> {
	
	
	
	 public static <T> List<T> nCopies(int n, T o) {
	        if (n < 0)
	            throw new IllegalArgumentException("List length = " + n);
	        return (List<T>) new TestGen();
	    }

}
