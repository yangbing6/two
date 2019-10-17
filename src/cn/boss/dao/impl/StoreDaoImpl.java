package cn.boss.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.boss.dao.BaseDao;
import cn.boss.dao.IStoreDao;
import cn.boss.pojo.Store;

public class StoreDaoImpl implements IStoreDao {

	@Override
	public List<Store> listStore() {
		String sql = "select si_id,si_name,l_floor,sn_state,sp_name,ai_name from store,location,store_info,store_shop,adminstrator_info where si_principal=ai_id and si_location=l_id and si_state=sn_id and si_shop=sp_id;";
		ResultSet rs= null;
		List<Store> rlist = new ArrayList<Store>();
		try {
			rs = BaseDao.getConn().prepareStatement(sql).executeQuery();
			while(rs.next()){
				Store s = new Store();
				s.setSi_id(rs.getInt("si_id"));
				s.setSi_name(rs.getString("si_name"));
				s.setL_location(rs.getString("l_floor"));
				s.setSn_state(rs.getString("sn_state"));
				s.setSp_name(rs.getString("sp_name"));
				s.setAi_name(rs.getString("ai_name"));
				rlist.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, null);
		}
		return rlist;
	}

	@Override
	public int updateStore(int id, String name) {
		PreparedStatement pstat = null;
		int count = -1;
		try {
			String sql = "UPDATE store set si_name=? where si_id=?;";
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setString(1, name);
			pstat.setInt(2, id);
			count = pstat.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(null, pstat);
		}
		return count;
	}
/*
	@Override
	public int removeStore(int id) {
		PreparedStatement pstat = null;
		int count = -1;
		try {
			String sql = "delete from store where si_id=?;";
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, id);
			count = pstat.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(null, pstat);
		}
		return count;
	}
*/
	@Override
	public int saveStore(Store s) {
		PreparedStatement pstat = null;
		int count = -1;
		try {
			String sql = "insert into store(si_id,si_name,si_location,si_state,si_shop,si_principal) values(?,?,?,?,?,?);";
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, s.getSi_id());
			pstat.setString(2, s.getSi_name());
			pstat.setInt(3, s.getSi_location());
			pstat.setInt(4, s.getSi_state());
			pstat.setInt(5, s.getSi_shop());
			pstat.setInt(6, s.getSi_principal());
			count = pstat.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(null, pstat);
		}
		return count;
	}

}
