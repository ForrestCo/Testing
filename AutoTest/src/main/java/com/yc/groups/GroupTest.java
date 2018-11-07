package com.yc.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Administrator
 * �����
 *
 */
public class GroupTest {
	
	@Test(groups="service")
	public void service1() {
		System.out.println("**********serviceִ�гɹ�1111111111*********");
	}
	
	@Test(groups="service")
	public void service2() {
		System.out.println("**********serviceִ�гɹ�2222222222*********");
	}
	
	@Test(groups="client")
	public void client1() {
		System.out.println("**********clientִ�гɹ�333333333333*********");
	}
	
	@Test(groups="client")
	public void client2() {
		System.out.println("**********clientִ�гɹ�4444444*********");
	}
	
	
	@BeforeGroups("service")
	public void BeforeGroupOnService() {
		System.out.println("���Ƿ������ִ��ǰִ��");
	}
	
	@AfterGroups("service")
	public void AfterGroupOnService() {
		System.out.println("���Ƿ������ִ�к�ִ��");
	}
}
