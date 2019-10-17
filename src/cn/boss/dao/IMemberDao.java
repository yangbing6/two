package cn.boss.dao;

import java.util.List;

import cn.boss.pojo.Message;

public interface IMemberDao {
	/**
	 * 杨冰
	 * 查询会员数据
	 * @param info
	 * @return 受影响行数
	 */
	int saveVip(Message info);
	
	/**
	 * 杨冰
	 * 拿去会员数据
	 * @return 返回数据库集合
	 */
	List<Message> listVip();
	
	/**
	 * 杨冰
	 * 修改用户信息
	 * @param num  
	 * @return  返回查受影响行数
	 */
	int updateVip(int num, String iphone);
}
