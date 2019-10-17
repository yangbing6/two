package cn.boss.service;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Storage;

public interface IProcurementService {
	
	/**
	 * Со±щ
	 * @param info
	 * @return
	 */
	String saveBuy(List<Storage> info);
	
	/**
	 * Со±щ
	 * @return
	 */
	List<Storage> listBuyAll();
	
	/**
	 * Со±щ
	 * @return
	 */
	List<Storage> listBuyDays(Date time);
}
