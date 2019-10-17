package cn.boss.service.impl;

import java.sql.Date;
import java.util.List;

import cn.boss.dao.impl.ProcurementDaoImpl;
import cn.boss.pojo.Storage;
import cn.boss.service.IProcurementService;

public class ProcurementServiceImpl implements IProcurementService {

	ProcurementDaoImpl pdi = new ProcurementDaoImpl();
	@Override
	public String saveBuy(List<Storage> info) {
		int i = pdi.saveBuy(info);
		if(i > 0){
			return "�ύ�ɹ���";
		}
		return "�ύʧ�ܣ�";
	}

	@Override
	public List<Storage> listBuyAll() {
		List<Storage> list = pdi.listBuyAll();
		if(list != null){
			return list;
		}
		return null;
	}

	@Override
	public List<Storage> listBuyDays(Date time) {
		List<Storage> t = pdi.listBuyDays(time);
		if(t != null){
			return t;
		}
		return null;
	}

}
