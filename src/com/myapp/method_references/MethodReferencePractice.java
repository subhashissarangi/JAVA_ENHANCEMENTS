package com.myapp.method_references;

import java.util.Arrays;
import java.util.List;

public class MethodReferencePractice {
	int i;

	public MethodReferencePractice() {

	}

	public MethodReferencePractice(int i) {
		this.i = i;
	}

	public static void main(String[] args) {

		String s="abc";
		List<String> str = Arrays.asList("a","b","A","B");
		//str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		str.sort(String::compareToIgnoreCase);
		System.out.println(str);
	}

}
