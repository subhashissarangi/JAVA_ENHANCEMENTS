package com.myapp.mains;

import static com.myapp.helpers.FruitHelper.map;

import java.util.Arrays;
import java.util.List;

import com.myapp.beans.Apple;

public class TestApple2 {

	public static void main(String[] args) {

		List<Integer> weights = Arrays.asList(2, 4, 7, 10);
		List<Apple> apples = map(weights, Apple::new);
	}
}
