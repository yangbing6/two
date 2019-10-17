package cn.boss.util;

import java.util.ArrayList;
import java.util.List;

import cn.boss.pojo.Employee_Info;

public class Page {
	private Integer totalCount; 
	private Integer pageCount;
	private Integer pageSize;
	private Integer index;
	private List<Employee_Info> list = new ArrayList<Employee_Info>();
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getPageCount() {
		return totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public List<Employee_Info> getList() {
		return list;
	}
	public void setList(List<Employee_Info> list) {
		this.list = list;
	}	
}
