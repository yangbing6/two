package cn.boss.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.boss.dao.BaseDao;
import cn.boss.dao.IMemberDao;
import cn.boss.pojo.Message;

public class MemberDaoImpl implements IMemberDao {

	public int saveVip(Message info) {
		String sql = "insert into message values(?,?,?,?,?,?)";
		PreparedStatement sta = null;
		int count = -1;
		try {
			sta = BaseDao.getConn().prepareStatement(sql);
			sta.setString(1, info.getM_name());
			sta.setInt(2, info.getM_sex());
			sta.setInt(3, info.getM_grade());
			sta.setInt(4, info.getM_discounts());
			sta.setInt(5, info.getM_number());
			sta.setString(6, info.getM_tel());
			count = sta.executeUpdate();
		} catch (SQLException e) {
			
		} finally{
			BaseDao.closeAll(null, sta);
		}
		return count;
	}

	public List<Message> listVip() {
		String sql = "select * from message left join grade on m_grade = gr_id LEFT join employee_sex on ea_id = m_sex";
		PreparedStatement pstat = null;
		ResultSet rs = null;
		Message m = null;
		List<Message> ak = new ArrayList<Message>();
		try {
			pstat = BaseDao.getConn().prepareStatement(sql);
			rs = pstat.executeQuery();
			if(rs.next()){
				m = new Message();
				m.setM_name(rs.getString("m_name"));
				m.setM_sex(rs.getInt("m_sex"));
				m.setM_grade(rs.getInt("m_grade"));
				m.setM_discounts(rs.getInt("m_discounts"));
				m.setM_number(rs.getInt("m_number"));
				m.setM_tel(rs.getString("m_tel"));
				ak.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ak;
	}

	public int updateVip(int num, String iphone) {
		String sql = "update message set m_tel = ? where m_number = ?";
		PreparedStatement pstat = null;
		int conn = -1;
		try {
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setString(1, iphone);
			pstat.setInt(2, num);
			conn = pstat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(null, pstat);
		}
		return conn;
		
	}

}
