package com.WeiMin.ReflectionPractice;

import java.lang.reflect.Constructor;

public class EatFruit {
	public static Farmer wannaToEat(String type) {
		try {
			// reflection,return an instance based on class name,respectively
			Class<?> className = Class.forName("com.WeiMin.ReflectionPractice." + type);
			Constructor constr = className.getConstructor();
			Object obj = className.newInstance();
			return (Farmer) obj;
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
				| IllegalAccessException except) {
			except.getMessage();
			return null;
		}
	}
}
