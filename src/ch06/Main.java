package ch06;

import ch06.dao.EmployeeDao;
import ch06.dao.EmployeeDaoImpl;
import ch06.presentation.HrIo;
import ch06.service.HrService;
import ch06.service.HrServiceImpl;

public class Main {
	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		HrService hrService = new HrServiceImpl(employeeDao);
		HrIo hrIo = new HrIo(hrService);
		
		hrIo.play();
	}
}