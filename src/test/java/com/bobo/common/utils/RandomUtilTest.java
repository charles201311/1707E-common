package com.bobo.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 100; i++) {
			RandomUtil.random(10, 20);
		}
		
		
	}

	@Test
	public void testSubRandom() {
		for (int i = 0; i < 10; i++) {
			RandomUtil.subRandom(1, 10, 3);
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 100; i++) {
		char c = RandomUtil.randomCharacter();
		
		System.out.println(c);
		}
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
		
		
	}

}
