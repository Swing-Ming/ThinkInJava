package com.day.collections.hashcode;

import java.util.Random;

public class Prediction {
	private static Random rand = new Random(47);

	private boolean shadow = rand.nextDouble() > 0.5;

	@Override
	public String toString() {
		if (shadow) {
			return "six weeks of Winter";
		} else {
			return "Early Spring";
		}
	}
}
