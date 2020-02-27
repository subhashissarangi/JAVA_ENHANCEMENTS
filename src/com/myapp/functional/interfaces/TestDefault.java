package com.myapp.functional.interfaces;

import java.util.Collections;
import java.util.List;

import com.myapp.beans.Student;

public interface TestDefault extends MyFunctionalInterface{

	@Override
	default public List<Student> sortStudents(List<Student> stuList) {
		Collections.sort(stuList);
		return stuList;
	}
}
