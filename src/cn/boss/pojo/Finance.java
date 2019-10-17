package cn.boss.pojo;

import java.sql.Date;

public class Finance {
	private Integer fa_id;
	private double fa_income;
	private double fa_expend;
	private double fa_netincome;
	private String fa_direction;
	private Date fa_hour;
	private Date fa_endhour;
	public Date getFa_endhour() {
		return fa_endhour;
	}
	public void setFa_endhour(Date fa_endhour) {
		this.fa_endhour = fa_endhour;
	}
	public void setFa_hour(Date fa_hour) {
		this.fa_hour = fa_hour;
	}
	public Integer getFa_id() {
		return fa_id;
	}
	public void setFa_id(Integer fa_id) {
		this.fa_id = fa_id;
	}
	public double getFa_income() {
		return fa_income;
	}
	public void setFa_income(double fa_income) {
		this.fa_income = fa_income;
	}
	public double getFa_expend() {
		return fa_expend;
	}
	public void setFa_expend(double fa_expend) {
		this.fa_expend = fa_expend;
	}
	public double getFa_netincome() {
		return fa_netincome;
	}
	public void setFa_netincome(double fa_netincome) {
		this.fa_netincome = fa_netincome;
	}
	public String getFa_direction() {
		return fa_direction;
	}
	public void setFa_direction(String fa_direction) {
		this.fa_direction = fa_direction;
	}
	public Date getFa_hour() {
		return fa_hour;
	}	
	
}
