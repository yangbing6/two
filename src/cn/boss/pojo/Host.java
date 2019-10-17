package cn.boss.pojo;

import java.sql.Date;

public class Host {
	private Integer h_id;
	private String h_name;
	private Date h_time;
	private Integer h_type;
	private Integer h_state;
	private String as_state;
	private String g_genre;
	public Date getH_time() {
		return h_time;
	}
	public void setH_time(Date h_end) {
		this.h_time = h_end;
	}

	public Integer getH_id() {
		return h_id;
	}
	public void setH_id(Integer h_id) {
		this.h_id = h_id;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public Integer getH_type() {
		return h_type;
	}
	public void setH_type(Integer h_type) {
		this.h_type = h_type;
	}
	public Integer getH_state() {
		return h_state;
	}
	public void setH_state(Integer h_state) {
		this.h_state = h_state;
	}
	public String getAs_state() {
		return as_state;
	}
	public void setAs_state(String as_state) {
		this.as_state = as_state;
	}
	public String getG_genre() {
		return g_genre;
	}
	public void setG_genre(String g_genre) {
		this.g_genre = g_genre;
	}
	
	
}
