package cn.boss.service.impl;

import cn.boss.dao.impl.LoginDaoImpl;
import cn.boss.pojo.Code;
import cn.boss.service.ILoginService;

public class LoginServiceImpl implements ILoginService{

	@Override
	public String login(String username, String userpwd) {
		LoginDaoImpl ldi = new LoginDaoImpl();
		Code code = ldi.getLogin(username, userpwd);
		if(code != null){
			return code.getCo_number();
		}else {
			return null;
			
		}
	}

}
