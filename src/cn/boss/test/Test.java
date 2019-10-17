package cn.boss.test;

import cn.boss.service.impl.ActivityServiceImpl;

public class Test {
	public static void main(String[] args) {
		ActivityServiceImpl adi = new ActivityServiceImpl();
		System.out.println(adi.saveActivit(null));
	}
}
