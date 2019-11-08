package com.bobo.common.utils;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		System.out.println(FileUtil.getExtendName("1707E.doc"));
	}

	@Test
	public void testGetTempDirectory() {
		
		System.out.println(FileUtil.getTempDirectory());
	}

	@Test
	public void testGetUserDirectory() {
		System.out.println(FileUtil.getUserDirectory());
	}

}
