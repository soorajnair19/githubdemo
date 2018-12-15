package com.lti.jdbcdemos;
import com.lti.jdbc.model.*;

import java.util.List;

public interface DepartmentDAO {

public void addDepartment(Department department);



public void updateDepartment(Department department);

public void deleteDepartment (int depid);

public List <Department > listAllDepartments();
	
public Department listDeptById(int deptid);	
}
