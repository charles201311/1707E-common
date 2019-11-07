package com.bobo.common.utils;

import java.util.Date;

import org.junit.Test;

public class PersonTest {
	
	@Test
	public void createPerson() {
		
		for (int i = 0; i < 1000; i++) {
			
		
		
		Person p = new Person();
		p.setName(StringUtil.generateChineseName());
		p.setAge(RandomUtil.random(1, 120));
		p.setAbout(StringUtil.randomChineseString(140));
		
		p.setCreated(DateUtil.randomDate(new  Date("2010/01/01"), new Date()));
		
		System.out.println(p);
		}
		
	}

}
