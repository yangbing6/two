package cn.boss.service;

import java.util.List;

import cn.boss.pojo.Message;

public interface IMemberService {
	/**
	 * �ж��Ƿ��������
	 * @param info
	 * @return �ַ���
	 */
	String saveVip(Message info);
	
	/**
	 * ���յ������ݣ����ϲ�չʾ
	 * @return
	 */
	List<Message> listVip();
	
	/**
	 * �ж��Ƿ��޸�����
	 * @param num
	 * @return �ַ���
	 */
	String updateVip (int num);
}
