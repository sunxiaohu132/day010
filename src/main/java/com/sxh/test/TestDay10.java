package com.sxh.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDay10 {
	public static void main(String[] args) {
		System.out.println("年龄是："+getAge(new Date(100,3, 5)));
	}
	
	
	//方法1：根据传入的日期获取年龄
	//示例:
	public static int getAge (Date src) {
	//TODO
		return (int) (new Date().getTime()-src.getTime() / 1000 / 60 / 60 / 24 / 365);
	}
	
	
	
//	方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	//示例:
	public static Date getDateByMonthInit (Date src) throws Exception {
	//TODO
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ss = sdf.format(src);
		String s = ss.substring(0, 7) + "-01 00:00:00";
		System.out.println("s1 is [" + s+ "]");
		Date date = sdf.parse(s);
		return date;
	}
	
	
	//方法4：求未来日期离今天还剩的天数
	//示例:
	public static int getDaysByFuture (Date future) {
	//TODO
		return  (int) (new Date().getTime()-future.getTime()/1000/60/60/24);
	}
	
	
	

	//方法5：求过去日期离今天过去的天数
	//示例:
	public static int getDaysByDeparted (Date departed) {
	//TODO
		return  (int) (new Date().getTime()-departed.getTime()/1000/60/60/24);

	}
	
}
