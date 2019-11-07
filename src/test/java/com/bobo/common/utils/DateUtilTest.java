package com.bobo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2008, 7, 8);//2008-08-08
		
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		
		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println(df.format(date)); 
	}

	@Test
	public void testGetDateByFullMonth() {
      Calendar c = Calendar.getInstance();
		
		c.set(2019, 10, 8);//2008-08-08
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println(df.format(date)); 
		
	}

	@Test
	public void testRandomDate() {
	}

}
