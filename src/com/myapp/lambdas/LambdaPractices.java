package com.myapp.lambdas;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.myapp.beans.Apple;
import com.myapp.functional.interfaces.BufferedReaderProcessor;

import java.util.function.Function;
import java.util.function.IntPredicate;

public class LambdaPractices {
	static List<Apple> inventory;
	public static void main(String[] args) {

		forEach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
		forEach(Arrays.asList(1, 2, 3, 4, 5),  i -> System.out.println(i));

		IntPredicate evenNumbers = (int i) -> i % 2 == 0;
		System.out.println(evenNumbers.test(1000));
		IntPredicate oddNumbers = (int i) -> i % 2 == 1;
		System.out.println(oddNumbers.test(11));
		BufferedReaderProcessor p = (BufferedReader br) -> br.readLine();

		Function<BufferedReader, String> f = (BufferedReader b) -> {
			try {
				return b.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		};
		try {
			List<Apple> heavierThan150g =filter(inventory, (Apple a) -> a.getWeight() > 150);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Predicate example
	public static <T> List<T> filter(List<T> list, Predicate<T> p) throws Exception {
		List<T> results = new ArrayList<>();
		for (T s : list) {
			if (p.test(s)) {
				results.add(s);
			}
		}
		return results;
	}
	
	

	// Consumer example
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T l : list) {
			consumer.accept(l);
		}
	}

	public static <T, R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> result = new ArrayList<R>();
		for (T s : list) {
			result.add(func.apply(s));
		}
		return result;
	}
}
