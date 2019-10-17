package cn.boss.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.boss.dao.BaseDao;
import cn.boss.dao.IRepairDao;
import cn.boss.pojo.Repair;

public class RepairDaoImpl implements IRepairDao{

	@Override
	public List<Repair> listRepair() {
		String sql = "select ri_id,ri_name,ri_floor,ri_state,ri_store,ri_time,ri_type,ri_describe from repair;";
		ResultSet rs= null;
		List<Repair> rlist = new ArrayList<Repair>();
		try {
			rs = BaseDao.getConn().prepareStatement(sql).executeQuery();
			while(rs.next()){
				Repair r = new Repair();
				r.setRi_id(rs.getInt("ri_id"));
				r.setRi_name(rs.getString("ri_name"));
				r.setRi_state(rs.getInt("ri_state"));
				r.setRi_store(rs.getInt("ri_store"));
				r.setRi_time(rs.getDate("ri_time"));
				r.setRi_type(rs.getInt("ri_type"));
				r.setRi_floor(rs.getInt("ri_floor"));
				r.setRi_describe(rs.getString("ri_describe"));
				rlist.add(r);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, null);
		}
		return rlist;
	}

	@Override
	public int saveRepair(Repair r) {
		PreparedStatement pstat = null;
		int count = -1;
		try {
			String sql = "insert into repair(ri_id,ri_name,ri_floor,ri_state,ri_store,ri_time,ri_type,ri_describe) values(?,?,?,?,?,?,?,?);";
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, r.getRi_id());
			pstat.setString(2, r.getRi_name());
			pstat.setInt(3, r.getRi_floor());
			pstat.setInt(4, r.getRi_state());
			pstat.setInt(5, r.getRi_store());
			pstat.setDate(6, r.getRi_time());
			pstat.setInt(7, r.getRi_type());
			pstat.setString(8, r.getRi_describe());
			count = pstat.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(null, pstat);
		}
		return count;
	}

	@Override
	public int updateRepair(int id, String state) {
		PreparedStatement pstat = null;
		int count = -1;
		try {
			String sql = "UPDATE repair,repair_state set ri_state=rs_id where ri_id=? and rs_state=?;";
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, id);
			pstat.setString(2, state);
			count = pstat.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(null, pstat);
		}
		return count;
	}
}
