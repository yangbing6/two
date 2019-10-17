package cn.boss.dao;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Finance;
import cn.boss.pojo.FinanceAppendix;

public interface IFinanceDao {
	/**
	 * �������������Ϣ 
	 * @param id ���
	 * @param income ����
	 * @param expend ֧��
	 * @param netincome ������
	 * @param direction	��ϸ
	 * @param startdate ��ʼʱ��
	 * @param enddate ����ʱ��
	 * @return ��Ӱ������
	 */
	int insertFinanceAll(int id ,double income , double expend , double netincome , String direction , Date startdate,Date enddate);
	/**
	 * ��������Ÿ�¼��Ϣ
	 * @param id ���
	 * @param name ����
	 * @param date ����
	 * @param type ��Ʒ����
	 * @param money ���
	 * @param number ���
	 * @return ��Ӱ������
	 */
	int saveFinanceAppendix(int id,int name, Date time,int type,double money,String number);
	
	int getNameId(String name);
	
	int getTypeId(String type);
	/**
	 * ��ѯ������Ϣ��ȫ������
	 * @return list����,����˳��Ϊ ���|����|֧��|������|����|��ʼʱ���|����ʱ���
	 */
	List<Finance> listFinanceAll();
	
	int dataTotal(int id,int income,int expend,int netincome,String direction,Date date);
	/**
	 * ��Ѱactivity��ĳʱ��������,����ͳ��,��дfinance��
	 * @param date
	 * @return list����,����˳��Ϊ ���׽��|ʱ��
	 */
	List<FinanceAppendix> listActivityF(Date date);
	 
	/**
	 * ��ѯĳ��������ĳ��ʱ��ε�����
	 * @param department ����
	 * @param startdate ��ʼʱ��
	 * @param enddate ����ʱ��
	 * @return list����,����˳��Ϊ ���׽��|ʱ��|����
	 */
	List<FinanceAppendix> listFinanceDepartment(String department,Date startdate,Date enddate);
	/**
	 * ��Ѱactivity��ĳʱ��ε�����
	 * @param date
	 * @return list����,����˳��Ϊ ����|���׽��|ʱ��|��Ʒ����|����
	 */
	List<FinanceAppendix> listFinanceAppendix(Date startdate,Date enddate);
}
