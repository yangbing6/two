package cn.boss.pojo;

import java.sql.Date;

public class Activity {
	private Integer ac_id;
	private String ac_name;
	private Date ac_time;
	private Integer ac_type;
	private double ac_money;
	private String ac_number;
	private String sp_name;
	private Integer ac_department;
	private String sd_department;
	public Integer getAc_department() {
		return ac_department;
	}
	public void setAc_department(Integer ac_department) {
		this.ac_department = ac_department;
	}
	public String getSd_department() {
		return sd_department;
	}
	public void setSd_department(String sd_department) {
		this.sd_department = sd_department;
	}
	public Integer getAc_id() {
		return ac_id;
	}
	public void setAc_id(Integer ac_id) {
		this.ac_id = ac_id;
	}
	public String getAc_name() {
		return ac_name;
	}
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	public Date getAc_time() {
		return ac_time;
	}
	public void setAc_time(Date ac_time) {
		this.ac_time = ac_time;
	}
	public Integer getAc_type() {
		return ac_type;
	}
	public void setAc_type(Integer ac_type) {
		this.ac_type = ac_type;
	}
	public double getAc_money() {
		return ac_money;
	}
	public void setAc_money(double ac_money) {
		this.ac_money = ac_money;
	}
	public String getAc_number() {
		return ac_number;
	}
	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
	}
	public String getSp_name() {
		return sp_name;
	}
	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}
}
