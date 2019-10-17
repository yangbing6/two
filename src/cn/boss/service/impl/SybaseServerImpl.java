package cn.boss.service.impl;

import cn.boss.dao.impl.SybaseDaoImpl;
import cn.boss.service.ISybaseServer;
import cn.boss.util.Page;


public class SybaseServerImpl implements ISybaseServer {

	@Override
	public Page getPage(int index, int pageSize,int state) {
		Page p = new Page();
		p.setPageSize(pageSize);
		SybaseDaoImpl sdi = new SybaseDaoImpl();
		p.setTotalCount(sdi.getTotalCount(state));
		if (index > p.getPageCount()) {
			p.setIndex(p.getPageCount());
		}else if (index < 1) {
			p.setIndex(1);
		}else {
			p.setIndex(index);
		}
		p.setList(sdi.getPageInfo(p.getIndex(), p.getPageSize(),state));
		return p;
	}

}
