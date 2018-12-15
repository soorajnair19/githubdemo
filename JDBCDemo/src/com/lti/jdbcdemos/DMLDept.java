package com.lti.jdbcdemos;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lti.jdbc.model.*;
public class DMLDept {
	
	public static void acceptDetails() throws IOException
	{
		InputStreamReader irs1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(irs1);
		System.out.println("enter deptid");
		int id = br1.read();
		System.out.println("enter deptname");
		String dname = br1.readLine();
		System.out.println("enter managerid");
		int m_id = br1.read();
		System.out.println("enter locid");
		int l_id = br1.read();
		
	}
	

	public static void main(String[] args)  {
		Department department = new Department();
		int deptid=0;
		List <Department> listofdepts = new  ArrayList<>();
	
		Scanner sc= new Scanner(System.in);
		
		
		
		int choice=0;
		while(choice!=6)
		{
		System.out.println("Departments CRUD");
		System.out.println("1.Add Department");
		System.out.println("2. Update Department");
		System.out.println("3. Delete Department");
		System.out.println("4. List All Departments");
		System.out.println("5. List All Departments by ID");
		System.out.println("6. Exit");
		
		System.out.println("Choose  CRUD to be performed:");
		
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: addDepartment(department);
		System.out.println("Enter department to be added");
		department=sc.nextInt();
		
		
		break;
	
		case 2: updateDepartment();
		
		break;
		
		case 3: deleteDepartment(department_id);
		System.out.println("Enter departmentid to be deleted");
		que3="delete from departments where department_id=department_id";
		break;
		
		case 4: listofdepts = listAllDepartments();
		for(Department d:listofdepts)
		{
			System.out.println(d);
		}
		break;
		
		case 5: department= listDeptById(deptid);
		System.out.println("Enter department to view");
		deptid=new Scanner(System.in).nextInt();
		
		department = daoimpl.listDeptById(deptid);
		System.out.println(department);
		break;
		
		case 6: System.exit(0);
		break;
		
		
		
		}
		
		
		}
		
		
		}

	
	
	private static Department listDeptById(int deptid) {
		// TODO Auto-generated method stub
		return null;
	}



	private static List<Department> listAllDepartments() {
		return null;
		// TODO Auto-generated method stub
		
	}



	private static void deleteDepartment(deptid) {
		try
		{
			
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();;
		}
		catch(SQLException es)
		{
			es.printStackTrace();		
		}
	
		
	}

	private static void updateDepartment() {
		// TODO Auto-generated method stub
		
	}

	private static void addDepartment(Department department) {
		// TODO Auto-generated method stub
		
	}
		
	
}
