package cn.boss.dao;

import java.sql.Date;
import java.util.List;

import cn.boss.pojo.Finance;
import cn.boss.pojo.FinanceAppendix;

public interface IFinanceDao {
	/**
	 * 保存财务主表信息 
	 * @param id 序号
	 * @param income 收入
	 * @param expend 支出
	 * @param netincome 净收入
	 * @param direction	明细
	 * @param startdate 起始时间
	 * @param enddate 结束时间
	 * @return 受影响行数
	 */
	int insertFinanceAll(int id ,double income , double expend , double netincome , String direction , Date startdate,Date enddate);
	/**
	 * 保存财务部门附录信息
	 * @param id 序号
	 * @param name 店铺
	 * @param date 日期
	 * @param type 商品类型
	 * @param money 金额
	 * @param number 编号
	 * @return 受影响行数
	 */
	int saveFinanceAppendix(int id,int name, Date time,int type,double money,String number);
	
	int getNameId(String name);
	
	int getTypeId(String type);
	/**
	 * 查询财务信息的全部数据
	 * @return list集合,数据顺序为 序号|收入|支出|净收入|详情|开始时间段|结束时间段
	 */
	List<Finance> listFinanceAll();
	
	int dataTotal(int id,int income,int expend,int netincome,String direction,Date date);
	/**
	 * 查寻activity中某时间点的数据,进行统计,填写finance表
	 * @param date
	 * @return list集合,数据顺序为 交易金额|时间
	 */
	List<FinanceAppendix> listActivityF(Date date);
	 
	/**
	 * 查询某个部门在某个时间段的数据
	 * @param department 部门
	 * @param startdate 开始时间
	 * @param enddate 结束时间
	 * @return list集合,数据顺序为 交易金额|时间|编码
	 */
	List<FinanceAppendix> listFinanceDepartment(String department,Date startdate,Date enddate);
	/**
	 * 查寻activity中某时间段的数据
	 * @param date
	 * @return list集合,数据顺序为 店铺|交易金额|时间|商品类型|编码
	 */
	List<FinanceAppendix> listFinanceAppendix(Date startdate,Date enddate);
}
