package cn.boss.service;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Host;

public interface IActivityService {
	/**
	 * 
	 * @return
	 */
	List<Host> listActivity();
	
	/**
	 * 
	 * @param type
	 * @param starttime
	 * @return
	 */
	List<Host> listActivityNow(String type, Date starttime);
	
	/**
	 * 
	 * @param activitInfo
	 * @return
	 */
	String saveActivit(List<Host> activitInfo);
}
