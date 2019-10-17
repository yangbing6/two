package cn.boss.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.boss.dao.BaseDao;
import cn.boss.dao.IEmployeeDao;
import cn.boss.pojo.Employee_Info;
/**
 * 
 * @author lxy
 *
 */
public class EmployeeDaoImpl implements IEmployeeDao{

	@Override
	public List<Employee_Info> listSomeEmployee(String state) {
		PreparedStatement pstat = null;
		ResultSet rs = null;
		List<Employee_Info> infos = new ArrayList<Employee_Info>();
		try {
			String sql = "select ey_id,ey_name,ey_age,ea_sex,ey_tel,ey_idcard,sd_department,ey_address,c_compile from employee_info,employee_sex,storage_department ,compile where c_compile=? AND ea_id=ey_sex and sd_id=ey_department and c_id=ey_compile;";
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setString(1, state);
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
				infos.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(rs, pstat);
		}
		return infos;
	}

	@Override
	public int saveEmployee(Employee_Info ei) {
		PreparedStatement pstat = null;
		int count = -1;
		try {
			String sql = "insert into employee_info(ey_id,ey_name,ey_age,ey_sex,ey_tel,ey_idcard,ey_department,ey_address,ey_compile) values(?,?,?,?,?,?,?,?,?);";
			pstat = BaseDao.getConn().prepareStatement(sql);
			pstat.setInt(1, ei.getEy_id());
			pstat.setString(2, ei.getEy_name());
			pstat.setInt(3, ei.getEy_age());
			pstat.setInt(4, ei.getEy_sex());
			pstat.setString(5, ei.getEy_tel());
			pstat.setString(6, ei.getEy_idcard());
			pstat.setInt(7, ei.getEy_department());
			pstat.setString(8, ei.getEy_address());
			pstat.setInt(9, ei.getEy_compile());
			count = pstat.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(null, pstat);
		}
		return count;
	}

	public int updateEmployee(int id, String state) {
		PreparedStatement pstat = null;
		int count = -1;
		try {
			String sql = "UPDATE employee_info,compile set ey_compile=c_id where ey_id=? and c_compile=?;";
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

	@Override
	public int removeEmployee(int id) {
		PreparedStatement pstat = null;
		int count = -1;
		try {
			String sql = "delete from employee_info  where ey_id=?;";
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
	
}
