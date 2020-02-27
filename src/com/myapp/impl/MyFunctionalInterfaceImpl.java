package com.myapp.impl;

import java.util.Collections;
import java.util.List;

import com.myapp.beans.Student;
import com.myapp.functional.interfaces.MyFunctionalInterface;

public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer min = Collections.min(intList);
		return min;
	}
	


}
