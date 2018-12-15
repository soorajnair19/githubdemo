package com.lti.jdbcdemos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import com.test.utils.ConnectionManager;

public class RetrieveEmp {
	static CallableStatement stmt1=null;
	static Connection con;

	public static void main(String[] args) {
		
		try
		{
		/*	int id = 0;
			String name = null;
			float sal = 0.0f;*/
			int no=0;
			Connection con = null;
			Scanner sc = new Scanner(System.in);
			
			//System.out.println("enter employee id");
			//id = sc.nextInt();
			
			System.out.println("enter number");
			
			no = sc.nextInt();
			con=ConnectionManager.getConnection();
			
			stmt1=con.prepareCall("{?=call b1(?)   }");
			
			stmt1.setInt(2,no);
			stmt1.registerOutParameter(1,Types.INTEGER);
			//stmt.registerOutParameter(2,Types.FLOAT);
			/*name =stmt.getString(1);
			sal=stmt.getFloat(2);*/
			/*System.out.println("name:" +name);
			System.out.println("sal:"+sal);*/
			
			stmt1.execute();
			int sqr = stmt1.getInt(1);
			System.out.println("square of"+no+"is"+sqr);
			
					
					
					
		}
		
		
		catch (NullPointerException e) {
						e.printStackTrace();
		}
		
		catch (SQLException ae) {
			ae.printStackTrace();
}

		
		
		
	}

}
