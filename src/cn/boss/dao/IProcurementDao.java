package cn.boss.dao;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Storage;

public interface IProcurementDao {
	
	/**
	 * ���
	 * @param info 
	 * @return ��Ӱ������
	 */
	int saveBuy(List<Storage> info);
	
	/**
	 * ���
	 * @return ����������Ϣ
	 */
	List<Storage> listBuyAll();
	
	/**
	 * ���
	 * @return ���ز鿴����Ϣ
	 */
	List<Storage> listBuyDays(Date time);
}
