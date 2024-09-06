package hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Task {
	
	static Classroom fetchClassroomDetail(int id)
	{
		Classroom cls= new Classroom();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/185Sql","root","root");
			Statement stm=conn.createStatement();
			String sql="select * from classroom1 where id="+id;
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next())
			{
				int clsId=rs.getInt(1);
				String clsName=rs.getString(2);
				cls.id=clsId;
				cls.name=clsName;
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cls;
		
	}
	
	static void InsertClassroomDetails(ArrayList<Classroom> cls)
	{
		for (Classroom classroom : cls) 
		{
			System.out.println(classroom.id);
			System.out.println(classroom.name);
			
			try {

				System.out.println(1);
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println(2);
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/185Sql","root","root");
				System.out.println(3);
				Statement stm=conn.createStatement();
				String Sql="insert into classroom1 values('"+classroom.id+"','"+classroom.name+"')";
				stm.executeUpdate(Sql);
				System.out.println(6);
				conn.close();
		
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
		}
	}

}
