package cn.boss.service;

import java.util.List;

import cn.boss.pojo.Finance;
import cn.boss.pojo.FinanceAppendix;

public interface IFinanceService {
	/**
	 * 保存finance数据
	 * @param id
	 * @param income
	 * @param expend
	 * @param netincome
	 * @param direction
	 * @param startdate
	 * @param enddate
	 * @return 返回字符串，保存成功或失败
	 */
	String insertFinance(String id ,String income , String expend , String netincome , String direction , String startdate,String enddate);
	/**
	 * 保存activity数据
	 * @param id
	 * @param name
	 * @param date
	 * @param type
	 * @param money
	 * @param number
	 * @return 返回字符串，保存成功或失败
	 */
	String insertFinanceAppendix(String id,String name,String date,String type,String money,String number);
	/**
	 * 获取finance全部数据
	 * @return 返回数据集合
	 */
	List<Finance> listFinanceAll();
	/**
	 * 整合记录表的数据,进行计算,存入主表
	 * @return 返回字符串，成功或失败
	 */
	String dataTotal(String date,String direction);
	/**
	 * 获取finance某部门在某时间段的数据
	 * @param department
	 * @param startdate
	 * @param enddate
	 * @return 返回数据集合
	 */
	List<FinanceAppendix> listFinanceDepartment(String department,String startdate,String enddate);
	/**
	 * 获取finance某时间段的数据
	 * @param startdate
	 * @param enddate
	 * @return 返回数据集合
	 */
	List<FinanceAppendix> listFinanceDate(String startdate,String enddate);
}
