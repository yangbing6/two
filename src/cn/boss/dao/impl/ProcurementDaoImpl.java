package cn.boss.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.boss.dao.BaseDao;
import cn.boss.dao.IProcurementDao;
import cn.boss.pojo.Storage;

public class ProcurementDaoImpl implements IProcurementDao {

	@Override
	public int saveBuy(List<Storage> info) {
		String lb = "select es_type from storage LEFT JOIN store_shop on sp_id = es_type";
		String bm = "select es_department from storage LEFT JOIN storage_department on sd_id = es_department";
		String sql = "indes into storage values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstat = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		PreparedStatement sta = null;
		ResultSet er = null;
		int conn = -1;
		try {
			sta = BaseDao.getConn().prepareStatement(lb);
			er = sta.executeQuery();
			int b = er.getInt("sp_id");
			stat = BaseDao.getConn().prepareStatement(bm);
			rs = stat.executeQuery();
			int a = rs.getInt("sd_id");
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, 0);
			pstat.setString(2, info.get(0).getEs_name());
			pstat.setInt(3, info.get(1).getEs_number());
			pstat.setDouble(4, info.get(2).getEs_price());
			pstat.setInt(5, a);
			pstat.setDate(6, info.get(4).getEs_time());
			pstat.setInt(7, 1);
			pstat.setInt(8, b);
			conn = pstat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(null, pstat);
			BaseDao.closeAll(rs, stat);
			BaseDao.closeAll(er, sta);
		}
		return conn;
	}

	@Override
	public List<Storage> listBuyAll() {
		String sql = "select * from storage LEFT JOIN storage_department on sd_id = es_department LEFT JOIN store_shop on sp_id = es_type LEFT JOIN storage_state on ss_id = es_state";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		Storage sa = null;
		List<Storage> l = new ArrayList<Storage>();
		try {
			pstat = BaseDao.getConn().prepareStatement(sql);
			rs = pstat.executeQuery();
			if(rs.next()){
				sa = new Storage();
				sa.setEs_name(rs.getString("es_name"));
				sa.setEs_number(rs.getInt("es_number"));
				sa.setEs_price(rs.getDouble("es_price"));
				sa.setEs_department(rs.getInt("es_department"));
				sa.setEs_time(rs.getDate("es_time"));
				sa.setEs_state(rs.getInt("es_state"));
				sa.setEs_type(rs.getInt("es_type"));
				l.add(sa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Storage> listBuyDays(Date time) {
		String sql = "select * from storage LEFT JOIN storage_department on sd_id = es_department LEFT JOIN store_shop on sp_id = es_type LEFT JOIN storage_state on ss_id = es_state where es_time = ?";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		Storage s = null;
		List<Storage> i = new ArrayList<Storage>();
		try {
			pstat = BaseDao.getConn().prepareStatement(sql);
			rs = pstat.executeQuery();
			if(rs.next()){
				s = new Storage();
				s.setEs_name(rs.getString("es_name"));
				s.setEs_number(rs.getInt("es_number"));
				s.setEs_price(rs.getDouble("es_price"));
				s.setEs_department(rs.getInt("es_department"));
				s.setEs_time(rs.getDate("es_time"));
				s.setEs_state(rs.getInt("es_state"));
				s.setEs_type(rs.getInt("es_type"));
				i.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

}
