package cn.boss.service.impl;

import java.util.List;

import cn.boss.dao.impl.StoreDaoImpl;
import cn.boss.pojo.Store;
import cn.boss.service.IStoreService;

public class StoreServiceImpl implements IStoreService {

	@Override
	public List<Store> listStore() {
		StoreDaoImpl sdi = new StoreDaoImpl();
		List<Store> slist = sdi.listStore();
		if (slist != null) {
			return slist;
		}
		return null;
	}

	@Override
	public int updateStore(int id, String name) {
		StoreDaoImpl sdi = new StoreDaoImpl();
		int count = sdi.updateStore(id, name);
		if (count > 0) {
			return 1;
		}
		return 0;
	}

	@Override
	public int saveStore(Store s) {
		StoreDaoImpl sdi = new StoreDaoImpl();
		int count = sdi.saveStore(s);
		if (count > 0) {
			return 1;
		}
		return 0;
	}

}
