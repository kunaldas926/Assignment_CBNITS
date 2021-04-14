package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.EmployeeDto;
import model.Employee;
import repo.EmployeeRepo;
import repo.EmployeeRepoImpl;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepoImpl employeeRepo;
	public Employee saveEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee(employeeDto.getEmpid(), employeeDto.getEmpname(), employeeDto.getDesignation());
		return EmployeeRepo.storeEmployee(employee);
	}
}
