package cn.boss.dao;

import cn.boss.pojo.Code;

/**
 * 
 * @author lxy
 *
 */
public interface ILoginDao {
	Code getLogin(String username,String userpwd);
}
