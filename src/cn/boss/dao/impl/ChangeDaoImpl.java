package cn.boss.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.boss.dao.BaseDao;
import cn.boss.dao.IChangeDao;

public class ChangeDaoImpl implements IChangeDao {

	@Override
	public int changPwd(String password, String username) {
		String sql = "update code set co_pwd = ? where co_number = ? ";
		PreparedStatement pstat = null;
		int count = -1;
		try {
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setString(1,password);
			pstat.setString(2, username);
			count = pstat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(null, pstat);
		}
		return count;
	}

}
