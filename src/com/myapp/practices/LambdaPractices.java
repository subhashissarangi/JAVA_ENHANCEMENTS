package com.myapp.practices;

import java.util.function.DoubleFunction;
import java.util.function.Function;

public class LambdaPractices {

	// f(g(x))
	public void andThenDemo() {
		Function<Integer, Integer> f = i -> i + 1;
		Function<Integer, Integer> g = i -> i * 2;
		Function<Integer, Integer> h = f.andThen(g);
		int result = h.apply(1); //here the output is 4

	}

	// g(f(x))
	public void composeDemo() {
		Function<Integer, Integer> f = i -> i + 1;
		Function<Integer, Integer> g = i -> i * 2;
		Function<Integer, Integer> h = f.compose(g);
		int result = h.apply(1); //here the output is 3
	}
	
	public double integrate(DoubleFunction<Double> f, double a, double b) {
		return (f.apply(a) + f.apply(b)) * (b-a) / 2.0;
		}

}
