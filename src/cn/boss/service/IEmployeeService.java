package cn.boss.service;

import java.util.List;

import cn.boss.pojo.Employee_Info;
import cn.boss.util.Page;

public interface IEmployeeService {
	Page getPage(String state,int index, int pageSize);
	int saveEmployee(Employee_Info ei);
	int updateEmployee(int id,String state);
	int removeEmployee(int id);
	Employee_Info listSomeEmployee(int id);
}
