package com.bobo.common.utils;

import java.util.Collection;

public class CollectionUtil {
	
	public static boolean isEmpty(Collection<?> src) {
		
		if(null==src || src.size()==0) {
		    return true;
		}
		return false;
		
	}

}
