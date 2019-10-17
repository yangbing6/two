package cn.boss.dao;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Storage;

public interface IProcurementDao {
	
	/**
	 * 杨冰
	 * @param info 
	 * @return 受影响行数
	 */
	int saveBuy(List<Storage> info);
	
	/**
	 * 杨冰
	 * @return 返回所有信息
	 */
	List<Storage> listBuyAll();
	
	/**
	 * 杨冰
	 * @return 返回查看的信息
	 */
	List<Storage> listBuyDays(Date time);
}
