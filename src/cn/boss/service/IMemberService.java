package cn.boss.service;

import java.util.List;

import cn.boss.pojo.Message;

public interface IMemberService {
	/**
	 * 判断是否插入数据
	 * @param info
	 * @return 字符串
	 */
	String saveVip(Message info);
	
	/**
	 * 接收到层数据，向上层展示
	 * @return
	 */
	List<Message> listVip();
	
	/**
	 * 判断是否修改数据
	 * @param num
	 * @return 字符串
	 */
	String updateVip (int num);
}
