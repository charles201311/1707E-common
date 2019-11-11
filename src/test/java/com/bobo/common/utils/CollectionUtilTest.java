package com.bobo.common.utils;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testIsEmpty() {
		
		List list =new ArrayList<String>();
		list.add("");
		list.add(null);
		System.out.println(list.size());
		
		boolean b = CollectionUtil.isEmpty(list);
		System.out.println(b);
	}

}
