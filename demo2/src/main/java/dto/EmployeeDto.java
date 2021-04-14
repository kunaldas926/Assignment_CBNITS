package dto;

import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
public class EmployeeDto {
	@Id
	private Long empid;
	private String empname;
	private String designation;
}
