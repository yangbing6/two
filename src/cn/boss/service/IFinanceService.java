package cn.boss.service;

import java.util.List;

import cn.boss.pojo.Finance;
import cn.boss.pojo.FinanceAppendix;

public interface IFinanceService {
	/**
	 * ����finance����
	 * @param id
	 * @param income
	 * @param expend
	 * @param netincome
	 * @param direction
	 * @param startdate
	 * @param enddate
	 * @return �����ַ���������ɹ���ʧ��
	 */
	String insertFinance(String id ,String income , String expend , String netincome , String direction , String startdate,String enddate);
	/**
	 * ����activity����
	 * @param id
	 * @param name
	 * @param date
	 * @param type
	 * @param money
	 * @param number
	 * @return �����ַ���������ɹ���ʧ��
	 */
	String insertFinanceAppendix(String id,String name,String date,String type,String money,String number);
	/**
	 * ��ȡfinanceȫ������
	 * @return �������ݼ���
	 */
	List<Finance> listFinanceAll();
	/**
	 * ���ϼ�¼�������,���м���,��������
	 * @return �����ַ������ɹ���ʧ��
	 */
	String dataTotal(String date,String direction);
	/**
	 * ��ȡfinanceĳ������ĳʱ��ε�����
	 * @param department
	 * @param startdate
	 * @param enddate
	 * @return �������ݼ���
	 */
	List<FinanceAppendix> listFinanceDepartment(String department,String startdate,String enddate);
	/**
	 * ��ȡfinanceĳʱ��ε�����
	 * @param startdate
	 * @param enddate
	 * @return �������ݼ���
	 */
	List<FinanceAppendix> listFinanceDate(String startdate,String enddate);
}
