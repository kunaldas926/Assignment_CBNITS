package repo;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import model.Employee;
@Repository
public class EmployeeRepoImpl implements EmployeeRepo{
	
	HashMap<Long, Employee> db = new HashMap<Long, Employee>();
	
	@Override
	public Employee storeEmployee(Employee employee) {
		db.put(employee.getEmpid(), employee);
		return db.get(employee.getEmpid(), employee);
	}

}
