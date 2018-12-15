package com.lti.jdbcdemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.test.utils.ConnectionManager;

public class ImageSaveDemo {
	static Connection con;
	static PreparedStatement ps;

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		String query= "insert into profile values(?,?,?)";
		con=ConnectionManager.getConnection();
		System.out.println("Enter id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter path of the image");
		String filename = sc.nextLine();

		
			FileInputStream fis=new FileInputStream(filename);
			
			ps=con.prepareStatement(query);
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setBinaryStream(3,fis,fis.available());
			
			int retval = ps.executeUpdate();
			if(retval == 1)
			{
				System.out.println("Profile added");
			}
				
				
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
