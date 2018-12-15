package com.test.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection connection = null;
	private ConnectionManager()
	{


	}

	public static Connection getConnection()
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uname="hr";
		String pwd="hr";
		String query = "select * from departments";
		String query1= "select first_name,salary,hire_date from employees where employee_id=101";
		String query3 = "select * from employees";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url,uname,pwd);
			return connection;
		}
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();;
		}
		catch(SQLException es)
		{
			es.printStackTrace();		
		}
		return connection;
		
		
	}

}
