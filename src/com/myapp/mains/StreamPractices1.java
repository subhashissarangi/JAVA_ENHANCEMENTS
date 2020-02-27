package com.myapp.mains;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamPractices1 {
	public static void main(String[] args) {
		List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream()
				.map(x -> x * x)
				.filter(x -> x % 3 == 0)
				.findFirst(); // 9
		
		/*
		 * List<Integer> one = Arrays.asList(1, 2, 3, 4, 5); List<Integer> two =
		 * Arrays.asList(1, 2, 3, 4, 5); Optional<Integer> multiplyTwoList =
		 * one.stream() .flatMap(x -> x.stream() .filter(x -> x % 3 == 0)) .findFirst();
		 */
		int sum = someNumbers.stream().reduce(0, (a, b) -> a + b);
		int sum1 = someNumbers.stream().reduce(0, Integer::sum);
		Optional<Integer> sum2 = someNumbers.stream().reduce((a, b) -> (a + b));
		
		int product = someNumbers.stream().reduce(1, (a, b) -> a * b);
		
		Optional<Integer> max = someNumbers.stream().reduce(Integer::max);
		Optional<Integer> min = someNumbers.stream().reduce(Integer::min);
		
		
	}

}
