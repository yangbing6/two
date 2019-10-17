package cn.boss.pojo;

import java.sql.Date;

public class FinanceAppendix {
	private String si_name;
	private Date ac_time;
	private String sp_name;
	private Double ac_money;
	private String ac_number;
	public String getSi_name() {
		return si_name;
	}
	public void setSi_name(String si_name) {
		this.si_name = si_name;
	}
	public Date getAc_time() {
		return ac_time;
	}
	public void setAc_time(Date ac_time) {
		this.ac_time = ac_time;
	}
	public String getSp_name() {
		return sp_name;
	}
	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}
	public Double getAc_money() {
		return ac_money;
	}
	public void setAc_money(Double ac_money) {
		this.ac_money = ac_money;
	}
	public String getAc_number() {
		return ac_number;
	}
	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
	}
}
