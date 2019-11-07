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
	
	//思考:返回年龄在 [20--60] 岁之间的随机日期
	
	/*
	* 方法1：(5分) 返回指定日期的月初
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//获取当前系统时间的日历类
		Calendar c = Calendar.getInstance();
		c.setTime(src);//用传入的日期构建日历类
		c.set(Calendar.DAY_OF_MONTH, 1);//月的第一天
		c.set(Calendar.HOUR_OF_DAY, 0);////天的0小时
		c.set(Calendar.MINUTE, 0);/////小时的0分
		c.set(Calendar.SECOND, 0);/////分的0秒
		return c.getTime();//从日历获取日期
	}
	
	/*
	* 方法2：(5分) 返回指定日期的月末
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//思路:让传入的日期的月加1 ,再获取月的月初的日期.最后让日期减去 1秒
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		
		c.add(Calendar.MONTH, 1);//让月份加1
		Date date = getDateByInitMonth(c.getTime());//获取月份加1 后月初的日期
		c.setTime(date);//用月初的日期的初始化日历类
		c.add(Calendar.SECOND, -1);//让日期减去1秒
		return c.getTime();
	}
	
	
	
	//生成指定范围内随机日期.如 2010年1月1日至今任意随机时间
	public static Date randomDate(Date d1,Date d2) {
		
		//开始的毫秒数
		long l1 = d1.getTime();
		//结束的毫秒数
		long l2 = d2.getTime();
		
		
		
		long l3= (long) ((Math.random() * (l2-l1 +1)) +l1);
		
		return new Date(l3);
		
	}
	
	/*
	 * @SuppressWarnings("deprecation") public static void main(String[] args) {
	 * 
	 * Date date1 = new Date("2010/01/01");
	 * 
	 * Date date = DateUtil.randomDate(date1, new Date());
	 * 
	 * 
	 * SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * System.out.println(df.format(date)); }
	 */
	

}
