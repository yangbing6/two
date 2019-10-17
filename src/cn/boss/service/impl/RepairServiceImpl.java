package cn.boss.service.impl;

import java.util.List;

import cn.boss.dao.impl.RepairDaoImpl;
import cn.boss.pojo.Repair;
import cn.boss.service.IRepairService;

public class RepairServiceImpl implements IRepairService{

	@Override
	public List<Repair> listRepair() {
		RepairDaoImpl rdi = new RepairDaoImpl();
		List<Repair> rlist = rdi.listRepair();
		if (rlist != null) {
			return rlist;
		}
		return null;
	}

	@Override
	public int saveRepair(Repair r) {
		RepairDaoImpl rdi = new RepairDaoImpl();
		int count = rdi.saveRepair(r);
		if (count > 0) {
			return 1;
		}
		return 0;
	}

	@Override
	public int updateRepair(int id, String state) {
		RepairDaoImpl rdi = new RepairDaoImpl();
		int count = rdi.updateRepair(id, state);
		if (count > 0) {
			return 1;
		}
		return 0;
	}
	
}
