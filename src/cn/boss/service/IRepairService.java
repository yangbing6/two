package cn.boss.service;

import java.util.List;

import cn.boss.pojo.Repair;

public interface IRepairService {
	
	 List<Repair> listRepair();
	 
	 int saveRepair(Repair r);
	 
	 int updateRepair(int id, String state);
}