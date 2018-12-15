package com.lti.jdbcdemos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class ProductCRUD {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uname="hr";
		String pwd="hr";
		//String query = "select * from departments";
		String query= "select first_name,salary,hire_date from employees where employee_id=101";

		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;


		//1.register driver class
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//2.connnection obk			
			connection = DriverManager.getConnection(url,uname,pwd);
			System.out.println(connection.toString());

			//3.creating statement obj
			stmt = connection.createStatement();

			//4.executing statements;
			rs=stmt.executeQuery(query);

			//5.Fetching records from Resultset;
			/*while(rs.next())
{
	int department_id = rs.getInt(1);
	String department_name=rs.getString(2);
	int manager_id=rs.getInt(3);
	int location_id=rs.getInt(4);

	System.out.println(department_id+"   "+department_name+"    "+manager_id+"    "+location_id);

}*/

			while(rs.next())
			{
				String first_name=rs.getString(1);
				double salary = rs.getDouble(2);
				Date hire_date=rs.getDate(3);

				System.out.println(first_name+"   "+salary+"    "+hire_date);

			}


		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver class not found");
		}
		catch(SQLException e)
		{
			System.out.println("SQL Exception");			
		}


	}



}
