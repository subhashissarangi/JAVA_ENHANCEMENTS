package com.myapp.mains;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.myapp.beans.Dish;

public class StreamPractices {
	static List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("motton", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		
		numbers.stream().filter(i -> i % 2 == 1)
		.distinct()
		.forEach(System.out::println);
		
		Integer []arr= {1,3,3,4,5,6};
		List<Integer> aList=Arrays.asList(arr);
		
		 aList.stream()
		.filter(i->i%2==0)
		.distinct()
		.forEach(System.out::println);
		
		List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
		
		List<Integer> wordLengths = 
		 words.stream()
		.map(String::length)
		.collect(toList());
		System.out.println(wordLengths);
		
		List<Integer> dishNameLengths = 
				 menu.stream()
				.map(Dish::getName)
				.map(String::length)
				.collect(toList());
		
		String[] arrayOfWords = {"Goodbye", "World"};
		Stream<String> streamOfwords = Arrays.stream(arrayOfWords);
		
		List<Integer> numbersa = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares =
		numbersa.stream()
		.map(n -> n * n)
		.collect(toList());
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs =
		numbers1.stream()
		.flatMap(i -> numbers2.stream()
		.map(j -> new int[]{i, j}))
		.collect(toList());
		
		List<Integer> numbers11 = Arrays.asList(1, 2, 3);
		List<Integer> numbers21 = Arrays.asList(3, 4);
		
		List<int[]> pairs1=
		numbers11.stream()
		.flatMap(i ->numbers21.stream()
		.filter(j -> (i + j) % 3 == 0)
		.map(j -> new int[]{i, j}))
		.collect(toList());
	}

	public static List<Dish> getDishes() {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("motton", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

		return menu;

	}

}
