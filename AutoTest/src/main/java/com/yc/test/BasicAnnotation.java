package com.yc.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
		
	//�������ע�⣬�ѷ�����ǳɲ��Ե�һ����
	@Test
	public void test1() {
		System.out.println("���ǲ�������һ");
	}
	
	
	@Test
	public void test2() {
		System.out.println("���ǲ���������");
	}
	
	@Test
	public void test3() {
		System.out.println("���ǲ���������");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("�����ڷ���֮ǰ����");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("�����ڷ���֮������");
	}
	
	
	@BeforeSuite
	public void  beforsuit() {
		
	}
	
	@AfterSuite
	public void  aftersuit() {
		
	}

}
