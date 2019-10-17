package cn.boss.util;

import java.util.Date;  

import java.text.ParseException;
import java.text.SimpleDateFormat; 

public class GetDateUtil{ 
	public Date get(){ 
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式	
		String hehe = dateFormat.format( now ); 
		System.out.println(hehe); 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date time=null;
		try {
		   time= sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
		   e.printStackTrace();
		}
		System.out.println(time);
		return time; 
	} 
}


