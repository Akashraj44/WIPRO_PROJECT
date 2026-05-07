package Sarthak_clinic;

	 
	//import java.sql.Connection;
	//import java.sql.DriverManager;
	//import java.sql.ResultSet;
	//import java.sql.SQLException;
	//import java.sql.Statement;
	import java.sql.*;
	//import packages
	//load & register driver
	// establish connection
	//create statements
	//execute query
	//process result
	// close connection
	public class Jdbc_conn {
	 
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			String url="jdbc:mysql://localhost:3306/mydata1";
			String user="root";
			String password="port";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
			//create statement
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from student");
			System.out.println("rollno\t name\t per\t age");
			while(rs.next())
			{
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				int age=rs.getInt("age");
				
				
				System.out.println(rollno+" "+ name+" "+ per+" "+ age);
				//System.out.println("ID:"+id+"\tName:"+ name+"Salary:"+ salary);
			}
			rs.close();
			stmt.close();
			con.close();
			
			
	 
		}
	 
	
	 
	 

}
