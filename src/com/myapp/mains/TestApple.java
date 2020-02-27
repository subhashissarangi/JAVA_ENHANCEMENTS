package com.myapp.mains;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.myapp.beans.Apple;

public class TestApple {
	static List<Apple> inventory;

	public static void main(String[] args) {

		Comparator<Apple> byWeight = (Apple a1, Apple a2) -> Integer.valueOf(a1.getWeight()).compareTo(a2.getWeight());
		Apple a1 = new Apple();
		a1.setWeight(20);
		Apple a2 = new Apple();
		a2.setWeight(30);
		// System.out.println(a1.compareTo(a1,byWeight));
		String s = "abc";
		//List<Apple> greenApples = filter(inventory, (Apple a) ->"green".equals(a.getColor()));
		process(() -> System.out.println("This is awesome!!"));
		execute(() -> {	});
		fetch();
		
		Supplier<Apple> c1=Apple::new;
		Apple app1=c1.get();
		Supplier<Apple> c2= ()-> new Apple();
		Apple app2=c2.get();

	}

	public static void process(Runnable r) {
		r.run();
	}

	public static Callable<String> fetch() {
		return () -> "Tricky example ;-)";
	}

	public static void execute(Runnable r) {
		r.run();
	}
}
