package cn.boss.service.impl;

import java.util.List;

import cn.boss.dao.impl.MemberDaoImpl;
import cn.boss.pojo.Message;
import cn.boss.service.IMemberService;

public class MemberServiceImpl implements IMemberService {
	
	MemberDaoImpl mdi = new MemberDaoImpl();
	
	public String saveVip(Message info) {
		int reg = mdi.saveVip(info);
		if(reg > 0){
			return "添加成功！";
		}else{
			return "添加失败！";
		}
	}

	
	public List<Message> listVip() {
		List<Message> list = mdi.listVip();
		for (int i = 0; list != null ; i++) {
			System.out.println(list.get(i));
		} 
		return list;
	}

	
	public String updateVip(int num) {
		int i = mdi.updateVip(num, null);
		if(i > 0){
			return "修改成功！";
		}else{
			return "修改失败！";
		}
		
	}

}
