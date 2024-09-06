package jdbcOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.Operation;

public class Operations {

	public static void CreateDataBase() throws Exception
	{
		System.out.println(1);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(2);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		System.out.println(3);
		Statement stm=conn.createStatement();
		String Sql="create database TheKiranAcademy";
		System.out.println(4);
		stm.execute(Sql);
		System.out.println(5);
		conn.close();

	}
	
	public static void CreateTable() throws Exception
	{

		System.out.println(1);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(2);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/TheKiranAcademy","root","root");
		System.out.println(3);
		Statement stm=conn.createStatement();
		String Sql="create table classrooms(clsId int Primary key,clsName varchar(20),clsFloor varchar (20),clsLocation varchar(50),clsStudCount int, clsStudPlaced int)";
		System.out.println(4);
		stm.execute(Sql);
		System.out.println(5);
		conn.close();
	}
	
	public static void Insert()throws Exception
	{
		System.out.println(1);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(2);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/TheKiranAcademy","root","root");
		System.out.println(3);
		String Sql="insert into classrooms values(?,?,?,?,?,?)";
		PreparedStatement pstm=conn.prepareStatement(Sql);
		System.out.println(4);
		pstm.setInt(1, 1110);
		pstm.setString(2, "NagpurBatch 1");
		pstm.setString(3, "4thFloor");
		pstm.setString(4, "Nagpur");
		pstm.setInt(5, 47);
		pstm.setInt(6, 30);
		System.out.println(5);
		pstm.executeUpdate();
		System.out.println(6);
		conn.close();
	
	}
	
	public static void Update() throws Exception
	{

		System.out.println(1);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(2);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/185Sql","root","root");
		System.out.println(3);
		String Sql="update customer set custName=? where custId=?";
		PreparedStatement pstm=conn.prepareStatement(Sql);
		System.out.println(4);
		pstm.setString(1, "Dinesh");
		pstm.setInt(2, 2);
		System.out.println(5);
		pstm.executeUpdate();
		System.out.println(6);
		conn.close();
	}
	
	public static void Delete() throws Exception
	{
		System.out.println(1);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(2);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/185Sql","root","root");
		System.out.println(3);
		String Sql="delete from customer where custId=?";
		PreparedStatement pstm=conn.prepareStatement(Sql);
		System.out.println(4);
		pstm.setInt(1, 2);
		System.out.println(5);
		pstm.executeUpdate();
		System.out.println(6);
		conn.close();
	
	}
	
	public static void Select() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/185Sql","root","root");
		Statement stm=conn.createStatement();
		String sql="select * from customer";
		ResultSet rs=stm.executeQuery(sql);
	
		
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			System.out.println("custId: "+id);
			System.out.println("custName: "+name);
		}
		conn.close();
	}
	
	public static void main(String[] args)throws Exception
	{
		//Operations.CreateDataBase();
		//Operations.CreateTable();
		//Operations.Insert();
		//Operations.Update();
		//Operations.Delete();
		//Operations.Select();
		
		
	}

}
