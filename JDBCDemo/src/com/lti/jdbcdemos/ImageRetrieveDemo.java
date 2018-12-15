package com.lti.jdbcdemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Blob;
import java.util.Scanner;

import com.test.utils.ConnectionManager;

public class ImageRetrieveDemo {
	static Connection con;
//	static PreparedStatement ps;
	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String query= "select * from profile";
			con=ConnectionManager.getConnection();
			stmt = con.createStatement();
			rs= stmt.executeQuery(query);
			FileOutputStream fos=new FileOutputStream("D:\\GGLTi\\ggwp2.jpg");
			
			while(rs.next())
			{
				Blob img = rs.getBlob(3);
				byte [] b = img.getBytes(1, (int) img.length());
				fos.write(b);
				
				
			}
			System.out.println("Image retrieved");
			
	}
		catch (FileNotFoundException iae) {
			iae.printStackTrace();
}
		catch (SQLException e) {
						e.printStackTrace();
		}
		catch (IOException ie) {
			ie.printStackTrace();
}
}
}
