package com.yc.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Administrator
 * 组测试
 *
 */
public class GroupTest {
	
	@Test(groups="service")
	public void service1() {
		System.out.println("**********service执行成功1111111111*********");
	}
	
	@Test(groups="service")
	public void service2() {
		System.out.println("**********service执行成功2222222222*********");
	}
	
	@Test(groups="client")
	public void client1() {
		System.out.println("**********client执行成功333333333333*********");
	}
	
	@Test(groups="client")
	public void client2() {
		System.out.println("**********client执行成功4444444*********");
	}
	
	
	@BeforeGroups("service")
	public void BeforeGroupOnService() {
		System.out.println("这是服务端组执行前执行");
	}
	
	@AfterGroups("service")
	public void AfterGroupOnService() {
		System.out.println("这是服务端组执行后执行");
	}
}
