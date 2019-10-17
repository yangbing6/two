package cn.boss.dao;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Host;

public interface IActivityDao {
	/**
	 * ���
	 * @return ���ݼ���
	 */
	List<Host> listActivity();
	
	/**
	 * ���
	 * @param type �����
	 * @param starttime �����
	 * @return ���ݼ���
	 */
	List<Host> listActivityNow(String type, Date starttime);
	
	/**
	 * ���
	 * @param activitInfo Ҫ����Ļ���Ϣ
	 * @return ��Ӱ������
	 */
	int saveActivit(List<Host> activitInfo);
}
