package cn.boss.service.impl;

import java.util.List;

import cn.boss.dao.impl.EmployeeDaoImpl;
import cn.boss.pojo.Employee_Info;
import cn.boss.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {

	public List<Employee_Info> listSomeEmployee(String state) {
		EmployeeDaoImpl rdi = new EmployeeDaoImpl();
		List<Employee_Info> list = rdi.listSomeEmployee(state);
		if (list != null) {
			return list;
		}
		return null;
	}

	@Override
	public int saveEmployee(Employee_Info ei) {
		EmployeeDaoImpl rdi = new EmployeeDaoImpl();
		int count = rdi.saveEmployee(ei);
		if (count > 0) {
			return 1;
		}
		return 0;
	}

	@Override
	public int updateEmployee(int id, String state) {
		EmployeeDaoImpl rdi = new EmployeeDaoImpl();
		int count = rdi.updateEmployee(id, state);
		if (count > 0) {
			return 1;
		}
		return 0;
	}

	@Override
	public int removeEmployee(int id) {
		EmployeeDaoImpl rdi = new EmployeeDaoImpl();
		int count = rdi.removeEmployee(id);
		if (count > 0) {
			return 1;
		}
		return 0;
	}

}
