package cn.boss.service;

import java.util.List;

import cn.boss.pojo.Store;

public interface IStoreService {
	List<Store> listStore();
	int updateStore(int id,String name);
	int saveStore(Store s);
}
