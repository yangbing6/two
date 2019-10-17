package cn.boss.dao;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Host;

public interface IActivityDao {
	/**
	 * 杨冰
	 * @return 数据集合
	 */
	List<Host> listActivity();
	
	/**
	 * 杨冰
	 * @param type 活动类型
	 * @param starttime 活动日期
	 * @return 数据集合
	 */
	List<Host> listActivityNow(String type, Date starttime);
	
	/**
	 * 杨冰
	 * @param activitInfo 要插入的活信息
	 * @return 受影响行数
	 */
	int saveActivit(List<Host> activitInfo);
}
