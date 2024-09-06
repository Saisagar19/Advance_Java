package com.jdbc;

import java.util.ArrayList;

public class OperationTest {
	public static void main(String[] args) {

//		ArrayList<Classroom> cls=new ArrayList<Classroom>();
//		cls.add(new Classroom(58, "4thFloor"));
//		cls.add(new Classroom(59, "5thFloor"));
//		cls.add(new Classroom(60, "6thFloor"));
//
//		Operation.insertClassroom(cls);

		Classroom classroom=Operation.FetchDetails(58);
		System.out.println(classroom);
	}

}
