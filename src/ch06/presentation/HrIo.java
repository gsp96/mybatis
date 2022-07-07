package ch06.presentation;

import java.util.List;

import ch06.domain.Employee;
import ch06.service.HrService;

public class HrIo {
	private HrService hrService;
	
	public HrIo(HrService hrService) {
		this.hrService = hrService;
	}
	
	public void play() {
		List<Employee> employees = hrService.getEmployees();
		
		for(Employee employee: employees)
			System.out.println(employee);
	}
}
