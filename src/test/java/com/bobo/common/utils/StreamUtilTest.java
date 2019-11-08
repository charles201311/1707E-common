package com.bobo.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String file = StreamUtil.readTextFile(new FileInputStream("E:/data.txt"));
		System.out.println(file);
		
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException {
		String file = StreamUtil.readTextFile(new File("e:/data.txt"));
		System.out.println(file);
	}

	@Test
	public void testReadLine() {
		List<String> list = StreamUtil.readLineTextFile(new File("e:/data.txt"));
		System.out.println(list);
		
	}
}
