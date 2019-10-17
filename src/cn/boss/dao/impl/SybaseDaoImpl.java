package cn.boss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.boss.dao.BaseDao;
import cn.boss.dao.ISybaseDao;
import cn.boss.pojo.Employee_Info;


public class SybaseDaoImpl implements ISybaseDao{

	@Override
	public int getTotalCount(int state) {
		PreparedStatement pstat = null;
		ResultSet rs = null;
		int count = -1;
		try {
			String sql = "select count(1) from employee_info,employee_sex where ey_compile=?";
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, state);
			rs = pstat.executeQuery();
			rs.next();
			count = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, null);
		}
		return count;
	}

	@Override
	public List<Employee_Info> getPageInfo(int index, int pageSize, int state) {
		Connection conn = BaseDao.getConn();
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<Employee_Info> list = new ArrayList<Employee_Info>();
		try {
			String sql = "select ey_id,ey_name,ey_age,ea_sex,ey_tel,ey_idcard,sd_department,ey_address,c_compile from employee_info,employee_sex,storage_department ,compile where ey_compile=? AND ea_id=ey_sex and sd_id=ey_department and c_id=ey_compile limit ?,?";
			pstat = conn.prepareStatement(sql);
			pstat.setInt(1, state);
			pstat.setInt(2, (index-1) * pageSize);
			pstat.setInt(3, pageSize);
			rs = pstat.executeQuery();
			while (rs.next()) {
				Employee_Info e = new Employee_Info();
				e.setEy_id(rs.getInt("ey_id"));
				e.setEy_name(rs.getString("ey_name"));
				e.setEy_age(rs.getInt("ey_age"));
				e.setEa_sex(rs.getString("ea_sex"));
				e.setEy_tel(rs.getString("ey_tel"));
				e.setEy_idcard(rs.getString("ey_idcard"));
				e.setSd_department(rs.getString("sd_department"));
				e.setEy_address(rs.getString("ey_address"));
				e.setC_compile(rs.getString("c_compile"));
				list.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, pstat);
		}
		return list;
	}

}
