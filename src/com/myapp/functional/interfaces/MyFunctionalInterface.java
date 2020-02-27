package com.myapp.functional.interfaces;

import java.util.Collections;
import java.util.List;

import com.myapp.beans.Student;

public interface MyFunctionalInterface {

	default public List<Student> sortStudents(List<Student> stuList) {
		Collections.sort(stuList);
		return stuList;
	}

	public static void greet(String name) {
		System.out.println("Hello"+ name);
	}
	
	public abstract Integer getMaxNum(List<Integer> intList);
}
