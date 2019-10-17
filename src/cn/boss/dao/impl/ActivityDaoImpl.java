package cn.boss.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.boss.dao.BaseDao;
import cn.boss.dao.IActivityDao;
import cn.boss.pojo.Host;

public class ActivityDaoImpl implements IActivityDao {

	@Override
	public List<Host> listActivity() {
		String sql = "select * from host left join activity_state on h_type = as_id left join genre on h_state = g_id";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		Host host = null;
		List<Host> h = new ArrayList<Host>();
		try {
			 pstat = BaseDao.getConn().prepareStatement(sql);
			 rs = pstat.executeQuery();
			 System.out.println(rs);
			 if(rs.next()){
				host = new Host();
				host.setH_name(rs.getString("h_name"));
				host.setH_time(rs.getDate("h_time"));
				host.setH_type(rs.getInt("h_type"));
				host.setH_state(rs.getInt("h_state"));
				h.add(host);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return h;
	}

	@Override
	public List<Host> listActivityNow(String type, Date starttime) {
		String sql = "select * from host left join activity_state on as_id = h_state where h_time = ? and h_type = ?";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		Host host = null;
		List<Host> list = new ArrayList<Host>();
		try {
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setDate(1, starttime);
			pstat.setString(2, type);
			rs = pstat.executeQuery();
			if(rs.next()){
				host = new Host();
				host.setH_name(rs.getString("h_name"));
				host.setH_time(rs.getDate("h_time"));
				host.setH_type(rs.getInt("h_type"));
				host.setH_state(rs.getInt("h_state"));
				list.add(host);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int saveActivit(List<Host> activitInfo) {
		PreparedStatement pstat = null;
		PreparedStatement sta = null;
		ResultSet rs = null;
		PreparedStatement st = null;
		ResultSet set = null;
		/*Date date = new Date(System.currentTimeMillis());*/
		int count = -1;
		String fi = "select g_id from genre where g_genre = ? ";
		String di = "select as_id from activity_state where as_state = ? ";	
		String sql = "insert into host values(?,?,?,?,?)";
		try {
			sta = BaseDao.getConn().prepareStatement(fi);
			sta.setInt(1, activitInfo.get(3).getH_type());
			rs = sta.executeQuery();
			rs.next();
			st = BaseDao.getConn().prepareStatement(di);
			st.setInt(1, activitInfo.get(4).getH_state());
			set = st.executeQuery();
			set.next();
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, 0);
			pstat.setString(2, activitInfo.get(1).getH_name());
			pstat.setDate(3,activitInfo.get(2).getH_time());
			pstat.setInt(4, rs.getInt("g_id"));
			pstat.setInt(5, set.getInt("as_id"));
			count = pstat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(null, pstat);
			BaseDao.closeAll(set, st);
			BaseDao.closeAll(rs, sta);
		}
		return count;
	}


}
