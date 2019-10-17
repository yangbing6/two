package cn.boss.service.impl;

import java.sql.Date;
import java.util.List;

import cn.boss.dao.impl.ActivityDaoImpl;
import cn.boss.pojo.Host;
import cn.boss.service.IActivityService;

public class ActivityServiceImpl implements IActivityService {
	ActivityDaoImpl adi = new ActivityDaoImpl();
	public List<Host> listActivity() {
		List<Host> list = adi.listActivity();
		if(list != null){
			return list;
		}
		return null;
	}

	public List<Host> listActivityNow(String type, Date starttime) {
		List<Host> now = adi.listActivityNow(type, starttime);
		if(now != null){
			return now;
		}
		return null;
	}

	public String saveActivit(List<Host> activitInfo) {
		int i = adi.saveActivit(activitInfo);
		if(i > 0){
			return "设置成功！";
		}
		return "设置失败！";
	}

}
