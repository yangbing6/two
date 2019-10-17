package cn.boss.pojo;

import java.sql.Date;

public class Storage {
	private Integer es_id;
	private String es_name;
	private Integer es_number;
	private double es_price;
	private Integer es_department;
	private Date es_time;
	private Integer es_state;
	private Integer es_type;
	private String store_shop;
	private String st_state;
	private String sd_department;
	public Integer getEs_id() {
		return es_id;
	}
	public void setEs_id(Integer es_id) {
		this.es_id = es_id;
	}
	public String getEs_name() {
		return es_name;
	}
	public void setEs_name(String es_name) {
		this.es_name = es_name;
	}
	public Integer getEs_number() {
		return es_number;
	}
	public void setEs_number(Integer es_number) {
		this.es_number = es_number;
	}
	public double getEs_price() {
		return es_price;
	}
	public void setEs_price(double es_price) {
		this.es_price = es_price;
	}
	public Integer getEs_department() {
		return es_department;
	}
	public void setEs_department(Integer es_department) {
		this.es_department = es_department;
	}
	public Date getEs_time() {
		return es_time;
	}
	public void setEs_time(Date es_time) {
		this.es_time = es_time;
	}
	public Integer getEs_state() {
		return es_state;
	}
	public void setEs_state(Integer es_state) {
		this.es_state = es_state;
	}
	public Integer getEs_type() {
		return es_type;
	}
	public void setEs_type(Integer es_type) {
		this.es_type = es_type;
	}
	public String getSt_type() {
		return store_shop;
	}
	public void setSt_type(String st_type) {
		this.store_shop = st_type;
	}
	public String getSt_state() {
		return st_state;
	}
	public void setSt_state(String st_state) {
		this.st_state = st_state;
	}
	public String getSd_department() {
		return sd_department;
	}
	public void setSd_department(String sd_department) {
		this.sd_department = sd_department;
	}
	
}
