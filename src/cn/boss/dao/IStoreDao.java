package cn.boss.dao;

import java.util.List;

import cn.boss.pojo.Store;



public interface IStoreDao {
	List<Store> listStore();
	int updateStore(int id,String name);
	int saveStore(Store s);
}
