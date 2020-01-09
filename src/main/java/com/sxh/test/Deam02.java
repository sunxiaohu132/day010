package com.sxh.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Deam02 {
	public static void main(String[] args) {
		System.out.println("年龄是："+getAge(new Date(100, 3, 5)));
	//	System.out.println("月初是："+getDateByMonthInit(new Date(118, 2, 8)));
		System.out.println("2018 3 8 距离今天"+getDaysByDeparted(new Date(118, 2, 8)));
	}
	/*	方法1：根据传入的日期获取年龄*/
		public static int getAge (Date src) {
		//TODO
			return (int) (new Date().getTime()-src.getTime()/1000/60/60/24/365);
		}

		//方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
		public static Date getDateByMonthInit (Date src) throws Exception {
		//TODO
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String format = sdf.format(src);
			String s = format.substring(0, 7)+"-01 00:00:00";
			System.out.println("s is["+s+"]");
			Date bom = sdf.parse(s);
			return bom;
		}

//		方法4：求未来日期离今天还剩的天数
		public static int getDaysByFuture (Date future) {
		//TODO
			return (int) ((new Date().getTime()-future.getTime())/1000/60/60/24);
		}

//		方法5：求过去日期离今天过去的天数
		public static int getDaysByDeparted (Date departed) {
		//TODO
			return -(int) ((new Date().getTime()-departed.getTime())/1000/60/60/24);
		}


}
