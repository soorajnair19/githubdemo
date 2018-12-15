package com.lti.jdbcdemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lti.jdbc.model.Department;
import com.test.utils.ConnectionManager;

public class DepartmentDaoImpl implements DepartmentDAO {

Connection connection = ConnectionManager.getConnection();
PreparedStatement ps = null;

public Department addDepartment (Department department)
{
String query = "insert in to departments values(?,?,?,?)";

try
{
	ps.getConnection().prepareStatement(query);
	ps.setInt(1, department.getDepartment_id());
	ps.setString(2, department.getDepartment_name());
	ps.setInt(3, department.getLocation_id());
	ps.setInt(4, department.getManager_id());
	
	
}



catch(ClassNotFoundException e)
{
	e.printStackTrace();;
}
catch(SQLException es)
{
	es.printStackTrace();		
}
int retval = ps.executeUpdate();
if(retval ==1)
{
System.out.println("department updated");	
}
}

public Department updateDepartment(Department department)
{
String query = "update departments set department_name=?,"+"location_id=?,"+"manager_id= ? where department_id=?";
ps.setString(1, department.getDepartment_name());
ps.setInt(2, department.getLocation_id());
ps.setInt(3, department.getManager_id());
ps.setInt(4, department.getDepartment_id());

}

}
	
	while(rs.next())
	{
		int id = rs.getInt(1);
		String name = rs.getLine(2);
		int m_id = rs.getId(3);
		int l_id = rs.getId(4);
		
		
		
		
	}
	
	
}
