package com.myapp.helpers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;

import com.myapp.beans.Apple;
import com.myapp.beans.Orange;
import com.myapp.factories.Fruit;

public class FruitHelper {
	static List<Apple> inventory;
	static Comparator<Apple> c1 = Comparator.comparing(Apple::getWeight);
	static Comparator<Apple> c2 = (Comparator.comparing(Apple::getWeight)).reversed().thenComparing(Apple::getColor);
	static Comparator<Apple> c3 = (Comparator.comparing(Apple::getWeight)).reversed().thenComparing(Apple::getColor);
	//Predicate<Apple> notRedApple=redApple.negate();

	public static List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
		List<Apple> result = new ArrayList<Apple>();
		for (Integer e : list) {
			result.add(f.apply(e));
		}
		return result;
	}

	public static Fruit giveMeFruit(String fruit, Integer weight) {
		return map.get(fruit.toLowerCase()).apply(weight);
	}

	public static Map<String, Function<Integer, Fruit>> map = new HashMap<String, Function<Integer, Fruit>>();
	static {
		map.put("Apple", Apple::new);
		map.put("Orange", Orange::new);
	}

	public static void getSortedApple(List<Apple> inventory) {
		inventory.sort(comparing((a) -> a.getWeight()));
		inventory.sort(c2);
		inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
	}

}
