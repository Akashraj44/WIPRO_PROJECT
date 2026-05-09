package Sarthak_clinic;
import java.sql.*;
import java.util.Scanner;

public class Insert1_data {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {

			
			String url = "jdbc:mysql://localhost:3306/mydata1";
			String user = "root";
			String password = "port";

			
			Class.forName("com.mysql.cj.jdbc.Driver");

			
			Connection con = DriverManager.getConnection(url, user, password);

			System.out.println("Connection created");

			
			Scanner sc = new Scanner(System.in);

			
			System.out.print("Enter roll no: ");
			int rollno = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter name: ");
			String name = sc.nextLine();

			System.out.print("Enter percentage: ");
			int per = sc.nextInt();

			System.out.print("Enter age: ");
			int age = sc.nextInt();

			// sql query
			String q = "insert into student values(?,?,?,?)";

			
			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setInt(1, rollno);
			pstmt.setString(2, name);
			pstmt.setInt(3, per);
			pstmt.setInt(4, age);

			int i = pstmt.executeUpdate();

			if (i > 0) {
				System.out.println("Data inserted successfully");
			} else {
				System.out.println("Data not inserted");
			}

			
			pstmt.close();
			con.close();
			sc.close();
		}
	}
