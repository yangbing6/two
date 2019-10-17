package cn.boss.dao;

import java.util.List;

import cn.boss.pojo.Repair;
/**
 * 
 * @author lxy
 *
 */
public interface IRepairDao {
	List<Repair> listRepair();
	int saveRepair(Repair r);
	int updateRepair(int id, String state);
}
