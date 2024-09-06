package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Operation {


	public static Classroom FetchDetails(int clsId) 
	{
		Classroom cls= new Classroom();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/185Sql","root","root");
			Statement stm=conn.createStatement();
			String Query="select * from classroom where clsId="+clsId;
			ResultSet s=stm.executeQuery(Query);

			while(s.next())
			{
				int id=s.getInt(1);
				String name=s.getString(2);
				cls.clsId=id;
				cls.clsName=name;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return cls;

	}

	public static void insertClassroom(ArrayList<Classroom> clsList)
	{
		for (Classroom classroom : clsList) {

			System.out.println(classroom.clsId);
			System.out.println(classroom.clsName);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/185Sql","root","root");
				Statement stm=conn.createStatement();
				String Query="insert into classroom values('"+classroom.clsId+"','"+classroom.clsName+"')";
				System.out.println("Sql-->"+Query);
				stm.executeUpdate(Query);
				conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}


}
