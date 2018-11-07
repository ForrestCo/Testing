package com.yc.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteTest {
	
	
	@AfterSuite
	public void afterTest() {
		System.out.println("AfterSuit执行成功");
	}
	
	@BeforeSuite
	public void beforTest() {
		System.out.println("BeforeSuit执行成功");
	}

}
