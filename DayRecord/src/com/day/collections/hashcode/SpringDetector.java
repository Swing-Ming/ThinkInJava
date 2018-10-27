package com.day.collections.hashcode;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {
	public static <T extends Groundhog> void detectorSpring(Class<T> type)
			throws Exception {
		Constructor<T> ghog = type.getConstructor(int.class);
		Map<Groundhog, Prediction> map = new HashMap<Groundhog, Prediction>();
		for (int i = 0; i < 10; i++) {
			map.put(ghog.newInstance(i), new Prediction());
		}
		System.out.println("map=" + map);
		Groundhog gh = ghog.newInstance(3);
		System.out.println("looking for :" + gh);
		if (map.containsKey(gh)) {
			System.out.println(map.get(gh));
		} else {
			System.out.println("not find " + gh);
		}
	}

	public static void main(String[] args) {
		try {
			// detectorSpring(Groundhog.class);
			detectorSpring(Groundhog2.class);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
