package com.yc.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteTest {
	
	
	@AfterSuite
	public void afterTest() {
		System.out.println("AfterSuitִ�гɹ�");
	}
	
	@BeforeSuite
	public void beforTest() {
		System.out.println("BeforeSuitִ�гɹ�");
	}

}
