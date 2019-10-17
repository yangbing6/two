package cn.boss.service;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Storage;

public interface IProcurementService {
	
	/**
	 * ���
	 * @param info
	 * @return
	 */
	String saveBuy(List<Storage> info);
	
	/**
	 * ���
	 * @return
	 */
	List<Storage> listBuyAll();
	
	/**
	 * ���
	 * @return
	 */
	List<Storage> listBuyDays(Date time);
}
