package com.yc.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
		
	//最基本的注解，把方法标记成测试的一部分
	@Test
	public void test1() {
		System.out.println("这是测试用例一");
	}
	
	
	@Test
	public void test2() {
		System.out.println("这是测试用例二");
	}
	
	@Test
	public void test3() {
		System.out.println("这是测试用例三");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("这是在方法之前运行");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("这是在方法之后运行");
	}
	
	
	@BeforeSuite
	public void  beforsuit() {
		
	}
	
	@AfterSuite
	public void  aftersuit() {
		
	}

}
