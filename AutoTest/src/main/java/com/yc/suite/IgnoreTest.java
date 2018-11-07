package com.yc.suite;

import org.testng.annotations.Test;

/**
 * @author Administrator
 * ºöÂÔ²âÊÔ
 *
 */
public class IgnoreTest {
	
	@Test
	public void ignoreTest1() {
		System.out.println("----------ignoreTest1__Ö´ĞĞ-----------");
	}
	
	
	@Test(enabled=false)
	public void ignoreTest2() {
		System.out.println("----------ignoreTest2__Ö´ĞĞ-----------");
	}
}
