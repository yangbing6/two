package cn.boss.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.boss.dao.BaseDao;
import cn.boss.dao.ILoginDao;
import cn.boss.pojo.Code;

public class LoginDaoImpl implements ILoginDao{

	@Override
	public Code getLogin(String username, String userpwd) {
		String sql = "select co_id,co_number,co_pwd from code where co_number=? and co_pwd=?";
		PreparedStatement pstat = null;
		ResultSet rs= null;
		Code code = null;
		try {
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setString(1, username);
			pstat.setString(2, userpwd);
			rs = pstat.executeQuery();
			if(rs.next()){
				code = new Code();
				code.setCo_id(rs.getInt("co_id"));
				code.setCo_number(rs.getString("co_number"));
				code.setCo_pwd(rs.getString("co_pwd"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, pstat);
		}
		
		return code;
	}

}
