package com.myapp.utils;

import java.util.ArrayList;
import java.util.List;

import com.myapp.beans.Apple;

public class AppleStaticFactory {

	@SuppressWarnings("unchecked")
	public static List<Apple> filterAppleByColor(List<Apple> inventory, String color) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getColor().equals(color))
				result.add(apple);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public static List<Apple> filterAppleByWeight(List<Apple> inventory, int weight) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight)
				result.add(apple);
		}
		return result;
	}

}
