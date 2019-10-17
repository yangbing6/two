package cn.boss.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private String url ="jdbc:mysql://47.105.201.227:3306/mallsystem";//jdbc:mysql://47.105.201.227:3306/mallsystem
	private String dbName = "root";
	private String dbPwd = "1qaz!QAZ";
	private static Connection conn = null;
	private BaseDao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbName, dbPwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn(){
		if(conn == null)
			new BaseDao();
		return conn;
	}
	
	public static void closeAll(ResultSet rs, Statement stat){
		try {
			if(rs != null)
				rs.close();
			if(stat != null)
				stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
