package com.lti.jdbcdemos;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

	public static void main(String[] args) {
		try
		{
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uname="hr";
			String pwd="hr";
			JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();
			rowset.setUrl(url);
			rowset.setUsername(uname);
			rowset.setPassword(pwd);
			
			rowset.setCommand("select first_name," + "hire_date,salary from employees");
			rowset.execute();
			
			while(rowset.next())
			{
				System.out.println(rowset.getString(1));
				System.out.println(rowset.getDate(2));
				System.out.println(rowset.getFloat(3));
				
			}
			
			
			
			
		}
		catch(SQLException es)
		{
			es.printStackTrace();		
		}
		
		
	}

}
