package hw;

import java.util.ArrayList;

public class OperationTest {
	public static void main(String[] args) 
	{
//		ArrayList<Classroom> cl=new ArrayList<Classroom>();
//		cl.add(new Classroom(22,"A"));
//		cl.add(new Classroom(23,"B"));
//		cl.add(new Classroom(24,"C"));
//		cl.add(new Classroom(25,"D"));
//		
		//Task.InsertClassroomDetails(cl);
		Classroom classroom=Task.fetchClassroomDetail(22);
		System.out.println(classroom);
	}

}
