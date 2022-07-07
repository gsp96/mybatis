package ch06.service;

import java.util.List;

import ch06.dao.EmployeeDao;
import ch06.domain.Employee;

public class HrServiceImpl implements HrService{
	private EmployeeDao employeeDao;
		
	public HrServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	@Override
	public List<Employee> getEmployees() {
		return employeeDao.selectEmployees();
	}
}
