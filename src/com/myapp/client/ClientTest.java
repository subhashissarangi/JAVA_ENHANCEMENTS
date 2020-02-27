package com.myapp.client;

import java.util.ArrayList;
import java.util.List;

import com.myapp.beans.Student;
import com.myapp.functional.interfaces.MyFunctionalInterface;
import com.myapp.impl.MyFunctionalInterfaceImpl;

public class ClientTest {

	public static void main(String[] args) {
		MyFunctionalInterface functionalInterface = new MyFunctionalInterfaceImpl();
		List<Student> stuList = new ArrayList<Student>();
		functionalInterface.sortStudents(stuList);
	}

}
