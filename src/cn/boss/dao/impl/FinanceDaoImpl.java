package cn.boss.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.boss.dao.BaseDao;
import cn.boss.dao.IFinanceDao;
import cn.boss.pojo.Finance;
import cn.boss.pojo.FinanceAppendix;

public class FinanceDaoImpl implements IFinanceDao{
	@Override
	public int insertFinanceAll(int id ,double income , double expend , double netincome , String direction , Date startdate,Date enddate) {
		int count = -1;
		PreparedStatement psta = null;
		try {
			String sql = "insert into finance value(?,?,?,?,?,?,?)";
			psta = BaseDao.getConn().prepareStatement(sql);
			psta.setInt(1, 0);
			psta.setDouble(2, income);
			psta.setDouble(3, expend);
			psta.setDouble(4, netincome);
			psta.setString(5, direction);
			psta.setDate(6, startdate);
			psta.setDate(7, enddate);
			count = psta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(null, psta);
		}

		return count;
	}
	@Override
	public List<Finance> listFinanceAll() {
		PreparedStatement psta = null;
		ResultSet rs = null;
		List<Finance> list = new ArrayList<Finance>();
		try {
			String sql = "select * from finance";
			psta = BaseDao.getConn().prepareStatement(sql);
			rs = psta.executeQuery();
			if(rs.next()){
				Finance f = new Finance();
				f.setFa_id(rs.getInt("fa_id"));
				f.setFa_income(rs.getDouble("fa_income"));
				f.setFa_expend(rs.getDouble("fa_expend"));
				f.setFa_direction(rs.getString("fa_direction"));
				f.setFa_hour(rs.getDate("fa_hour"));
				f.setFa_endhour(rs.getDate("fa_endhour"));
				list.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, psta);
		}	
		return list;
	}
	@Override
	public List<FinanceAppendix> listActivityF(Date date) {
		PreparedStatement psta = null;
		ResultSet rs = null;
		FinanceAppendix f = null;
		List<FinanceAppendix> l = new ArrayList<FinanceAppendix>();
		String sql = "select ac_money from activity where ac_time = ?";
		try {
			psta = BaseDao.getConn().prepareStatement(sql);
			psta.setDate(1, date);
			rs = psta.executeQuery();
			while(rs.next()){
				f= new FinanceAppendix();
				f.setAc_money(rs.getDouble("ac_money"));
				f.setAc_time(date);
				l.add(f);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, psta);
		}
		return l;
	}
	public int dataTotal(int id,int income,int expend,int netincome,String direction,Date date){
		PreparedStatement psta = null;
		int count = -1;
		try {
			String sql = "insert into finance value(?,?,?,?,?,?)";
			psta = BaseDao.getConn().prepareStatement(sql);
			psta.setInt(1, 0);
			psta.setInt(2, income);
			psta.setInt(3, expend);
			psta.setInt(4, netincome);
			psta.setString(5, direction);
			psta.setDate(6, date);
			count = psta.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(null, psta);
		}
		return count;
	}
	@Override
	public List<FinanceAppendix> listFinanceDepartment(String department,Date startdate,Date enddate) {
		PreparedStatement psta = null;
		ResultSet rs = null;
		List<FinanceAppendix> list = new ArrayList<FinanceAppendix>();
		try {
			String sql = "select sd_id from storage_department where sd_department=?";
			psta = BaseDao.getConn().prepareStatement(sql);
			psta.setString(1, department);
			rs = psta.executeQuery();
			int did = rs.getInt("sd_id");
			sql = "select ac_money,ac_time,ac_number from activity where ac_name=? and ac_time>? and ac_time<? order by ac_time desc";
			psta.setInt(1, did);
			psta.setDate(2, startdate);
			psta.setDate(3, enddate);
			rs = psta.executeQuery();
			while(rs.next()){
				FinanceAppendix f = new FinanceAppendix();
				f.setAc_money(rs.getDouble("ac_money"));
				f.setAc_time(rs.getDate("ac_time"));
				f.setAc_number(rs.getString("ac_number"));
				list.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, psta);
		}
		return list;
	}
	@Override
	public List<FinanceAppendix> listFinanceAppendix(Date startdate,Date enddate) {
		PreparedStatement psta = null;
		ResultSet rs = null;
		List<FinanceAppendix> list = new ArrayList<FinanceAppendix>();
		try {
			String sql = "select ac_money,ac_time,si_name,sp_name,ac_number from activity left join store_shop on sp_id=ac_type inner join store on si_id=ac_name  where ac_time>? and ac_time<? order by ac_time desc";
			psta = BaseDao.getConn().prepareStatement(sql);
			psta.setDate(1, startdate);
			psta.setDate(2, enddate);
			rs = psta.executeQuery();
			while(rs.next()){
				FinanceAppendix f = new FinanceAppendix();
				f.setSi_name(rs.getString("si_name"));
				f.setAc_money(rs.getDouble("ac_money"));
				f.setAc_time(rs.getDate("ac_time"));			
				f.setSp_name(rs.getString("sp_name"));
				f.setAc_number(rs.getString("ac_number"));
				list.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, psta);
		}
		return list;
	}
	@Override
	public int saveFinanceAppendix(int id,int name, Date time,int type,double money,String number){
		PreparedStatement psta = null;
		ResultSet rs = null;
		int count = -1;
		String sql = "insert into activity value(?,?,?,?,?,?)";
		try {
			psta = BaseDao.getConn().prepareStatement(sql);
			psta.setInt(1, 0);
			psta.setInt(2, name);
			psta.setDate(3, time);
			psta.setInt(4, type);
			psta.setDouble(5, money);
			psta.setString(6, number);
			count = psta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			BaseDao.closeAll(rs, psta);
		}
		return count;
	}
	@Override
	public int getNameId(String name) {
		PreparedStatement psta = null;
		ResultSet rs = null;
		String sql = "select si_id from store where si_name =?";
		int id = -1;
		try {
			psta = BaseDao.getConn().prepareStatement(sql);
			psta.setString(1, name);
			rs = psta.executeQuery();
			id = rs.getInt("si_id");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(rs, psta);
		}
		return id;
	}
	@Override
	public int getTypeId(String type) {
		PreparedStatement psta = null;
		ResultSet rs = null;
		String sql = "select sp_id from store_shop where sp_name =?";
		int id = -1;
		try {
			psta = BaseDao.getConn().prepareStatement(sql);
			psta.setString(1, type);
			rs = psta.executeQuery();
			id = rs.getInt("sp_id");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeAll(rs, psta);
		}
		return id;
	}
}
