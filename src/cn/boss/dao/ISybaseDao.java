package cn.boss.dao;

import java.util.List;

import cn.boss.pojo.Employee_Info;

public interface ISybaseDao {
	/**
	 * 总信息数
	 * @return 总记录数
	 */
	int getTotalCount(int state);
	
	/**
	 * 获取每页信息的集合
	 * @param index 当前页
	 * @param pageSize 每页的信息数
	 * @return 每页信息的集合
	 */
	List<Employee_Info> getPageInfo(int index, int pageSize, int state);
}
