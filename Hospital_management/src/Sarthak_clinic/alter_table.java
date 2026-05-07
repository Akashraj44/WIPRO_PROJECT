package Sarthak_clinic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class alter_table {

	

		public static void main(String[] args) {

			String url="jdbc:mysql://localhost:3306/mydata1";
			String user="root";
			String password="port";

			// update query
			String updateSQL="update students set per=95 where rollno=102";

			try
			{
				// driver connection
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con=DriverManager.getConnection(url,user,password);

				System.out.println("Connection created");

				Statement stmt=con.createStatement();

				// execute update query
				int rowUpdated=stmt.executeUpdate(updateSQL);

				if(rowUpdated>0)
				{
					System.out.println("Student record updated");
				}

				// print table after update
				ResultSet rs=stmt.executeQuery("select * from students");

				System.out.println("rollno\t name\t per\t email");

				while(rs.next())
				{
					int rollno=rs.getInt("rollno");
					String name=rs.getString("name");
					int per=rs.getInt("per");
					String email=rs.getString("email");

					System.out.println(rollno+" "+name+" "+per+" "+email);
				}

				stmt.close();
				con.close();
			}

			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}