package cn.boss.dao;

import java.util.List;

import cn.boss.pojo.Employee_Info;

public interface ISybaseDao {
	/**
	 * ����Ϣ��
	 * @return �ܼ�¼��
	 */
	int getTotalCount(int state);
	
	/**
	 * ��ȡÿҳ��Ϣ�ļ���
	 * @param index ��ǰҳ
	 * @param pageSize ÿҳ����Ϣ��
	 * @return ÿҳ��Ϣ�ļ���
	 */
	List<Employee_Info> getPageInfo(int index, int pageSize, int state);
}
