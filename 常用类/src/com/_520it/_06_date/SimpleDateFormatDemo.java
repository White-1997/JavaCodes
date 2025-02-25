package com._520it._06_date;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat是DateFormat的子类 支持自定义日期格式
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		String pattern = "YYYY/MM/dd HH:mm E";//自定义的日期时间模式
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);//应用该模式
		Date date = new Date();
		String time = sdf.format(date);
		System.out.println(time);
		
	}
}
