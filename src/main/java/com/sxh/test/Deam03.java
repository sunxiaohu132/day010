package com.sxh.test;

import java.util.Date;

import org.junit.Test;

import com.bw.utils.DateUtil;

public class Deam03 {
	@Test
	public void test01(){
		int age = DateUtil.getAge(new Date(96, 4, 13));
		System.out.println("年龄是："+age);
	}
	
	
}
