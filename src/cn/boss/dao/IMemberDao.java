package cn.boss.dao;

import java.util.List;

import cn.boss.pojo.Message;

public interface IMemberDao {
	/**
	 * ���
	 * ��ѯ��Ա����
	 * @param info
	 * @return ��Ӱ������
	 */
	int saveVip(Message info);
	
	/**
	 * ���
	 * ��ȥ��Ա����
	 * @return �������ݿ⼯��
	 */
	List<Message> listVip();
	
	/**
	 * ���
	 * �޸��û���Ϣ
	 * @param num  
	 * @return  ���ز���Ӱ������
	 */
	int updateVip(int num, String iphone);
}
