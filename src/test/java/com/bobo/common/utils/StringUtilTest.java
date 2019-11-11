package com.bobo.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {
	
	
	@Test
	public void testIsNumber() {
		String num ="-01288";
		boolean b = StringUtil.isNumber(num);
		System.out.println(b);
	}

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength(" ");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str="ab c ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		/*
		 * for (int i = 0; i < 100; i++) { String name =
		 * StringUtil.randomChineseString(); System.out.print(name+"  " ); }
		 */
		
			String name = StringUtil.randomChineseString(10);
			System.out.print(name );
		
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.print(name +"   " );
			
		}
	}

}
