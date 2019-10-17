package cn.boss.service;

import cn.boss.util.Page;

public interface ISybaseServer {
	Page getPage(int index, int pageSize,int state);
}
