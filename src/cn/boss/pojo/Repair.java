package cn.boss.pojo;

import java.sql.Date;

public class Repair {
	private Integer ri_id;
	private Integer ri_store;
	private String ri_describe;
	private Date ri_time;
	private Integer ri_state;
	private Integer ri_floor;
	private Integer ri_type;
	private String ri_name;
	private String repair_type;
	private String repair_state;
	private String location;
	private String si_name;
	public Integer getRi_id() {
		return ri_id;
	}
	public void setRi_id(Integer ri_id) {
		this.ri_id = ri_id;
	}
	public Integer getRi_store() {
		return ri_store;
	}
	public void setRi_store(Integer ri_store) {
		this.ri_store = ri_store;
	}
	public String getRi_describe() {
		return ri_describe;
	}
	public void setRi_describe(String ri_describe) {
		this.ri_describe = ri_describe;
	}
	public Date getRi_time() {
		return ri_time;
	}
	public void setRi_time(Date ri_time) {
		this.ri_time = ri_time;
	}
	public Integer getRi_state() {
		return ri_state;
	}
	public void setRi_state(Integer ri_state) {
		this.ri_state = ri_state;
	}
	public Integer getRi_floor() {
		return ri_floor;
	}
	public void setRi_floor(Integer ri_floor) {
		this.ri_floor = ri_floor;
	}
	public Integer getRi_type() {
		return ri_type;
	}
	public void setRi_type(Integer ri_type) {
		this.ri_type = ri_type;
	}
	public String getRi_name() {
		return ri_name;
	}
	public void setRi_name(String ri_name) {
		this.ri_name = ri_name;
	}
	public String getRepair_type() {
		return repair_type;
	}
	public void setRepair_type(String repair_type) {
		this.repair_type = repair_type;
	}
	public String getRepair_state() {
		return repair_state;
	}
	public void setRepair_state(String repair_state) {
		this.repair_state = repair_state;
	}
	public String getRepair_floor() {
		return location;
	}
	public void setRepair_floor(String repair_floor) {
		this.location = repair_floor;
	}
	public String getSi_name() {
		return si_name;
	}
	public void setSi_name(String si_name) {
		this.si_name = si_name;
	}
	
}
