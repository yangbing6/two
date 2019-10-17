package cn.boss.service.impl;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import cn.boss.dao.impl.FinanceDaoImpl;
import cn.boss.pojo.Finance;
import cn.boss.pojo.FinanceAppendix;
import cn.boss.service.IFinanceService;

public class FinanceServiceImpl implements IFinanceService{
	FinanceDaoImpl fd = new FinanceDaoImpl();
	@Override
	public String insertFinance(String nid, String nincome, String nexpend,
			String nnetincome, String direction, String nstartdate, String nenddate) {
		int id = Integer.parseInt(nid);
		double income=Double.parseDouble(nincome);
		double expend=Double.parseDouble(nexpend);
		double netincome=Double.parseDouble(nnetincome);
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy");
		Date startdate = null; 
		Date enddate = null;
		try {
			startdate = (Date)sdf.parse(nstartdate);
			enddate = (Date)sdf.parse(nenddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int ifcount = fd.insertFinanceAll(id, income, expend, netincome, direction, startdate, enddate);
		if(ifcount>0){
			return "�����������������";
		}else{
			return "���������������ʧ��";
		}
	}	
	@Override
	public List<Finance> listFinanceAll() {
		List<Finance> lfa = fd.listFinanceAll();
		if(lfa == null){
			try {
				throw new Exception("listFinanceAll���ؼ���Ϊ��");
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		return lfa;	
	}
	@Override
	public String dataTotal(String ndate,String direction) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy");
		Date date = null; 
		try {
			date = (Date)sdf.parse(ndate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		FinanceDaoImpl fdi = new FinanceDaoImpl();
		List<FinanceAppendix> l = fdi.listActivityF(date);
		int income= 0;
		int expend= 0;
		for (FinanceAppendix fi : l) {
			if(fi.getAc_money()>0){
				income += fi.getAc_money();
			}else{
				expend += fi.getAc_money();
			}
		}
		int netincome = income - expend;
		int count = fdi.dataTotal(0, income, expend, netincome, direction, date);
		if(count>0){
			return "������ͳ��,�����ܱ�";
		}else{
			return "����ͳ�ƴ���";
		}
	}
	@Override
	public List<FinanceAppendix> listFinanceDepartment(String department,
			String nstartdate, String nenddate) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy");
		Date startdate = null;
		Date enddate = null;
		try {
			startdate = (Date)sdf.parse(nstartdate);
			enddate = (Date)sdf.parse(nenddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<FinanceAppendix> lf = fd.listFinanceDepartment(department, startdate, enddate);
		if(lf == null){
			try {
				throw new Exception("listFinanceDepartment���ؼ���Ϊ��");
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}	
		return lf;
	}
	@Override
	public List<FinanceAppendix> listFinanceDate(String nstartdate, String nenddate) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy");
		Date startdate = null;
		Date enddate = null;
		try {
			startdate = (Date)sdf.parse(nstartdate);
			enddate = (Date)sdf.parse(nenddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<FinanceAppendix> lfd = fd.listFinanceAppendix(startdate, enddate);
		if(lfd == null){
			try {
				throw new Exception("listFinanceDate���ؼ���Ϊ��");
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		return lfd;
	}
	@Override
	public String insertFinanceAppendix(String nid, String name, String ntime,
			String type, String nmoney, String number) {
		int id = Integer.parseInt(nid);
		double money=Double.parseDouble(nmoney);
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy");
		Date time = null; 
		try {
			time = (Date)sdf.parse(ntime);
		} catch (ParseException e) {
			e.printStackTrace();
		}			
		int nameid = fd.getNameId(name);
		int typeid = fd.getTypeId(type);
		int count = fd.saveFinanceAppendix(id, nameid, time, typeid, money, number);
		if(count>0){
			return "���׼�¼�ѱ���";
		}else{
			return "���׼�¼�������";
		}
	}
}
