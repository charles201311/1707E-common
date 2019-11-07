package com.bobo.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期的工具类
 * @author: charles
 * @date: 2019年11月7日 上午11:07:38
 */
public class DateUtil {
	
	//生成指定范围内随机日期.如 2010年1月1日至今任意随机时间
	public static Date randomDate(Date d1,Date d2) {
		
		//开始的毫秒数
		long l1 = d1.getTime();
		//结束的毫秒数
		long l2 = d2.getTime();
		
		
		
		long l3= (long) ((Math.random() * (l2-l1 +1)) +l1);
		
		return new Date(l3);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date date1 = new  Date("2010/01/01");
		
		Date date = DateUtil.randomDate(date1, new Date());
		

		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	

}
