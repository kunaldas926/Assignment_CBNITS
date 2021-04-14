package ctrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.EmployeeDto;
import service.EmployeeService;
@RestController
public class employeeCtrlr {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public void saveEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.saveEmployee(employeeDto);
	}
}
