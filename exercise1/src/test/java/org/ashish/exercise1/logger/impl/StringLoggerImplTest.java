package org.ashish.exercise1.logger.impl;

import static org.junit.Assert.assertEquals;

import org.ashish.exercise1.logger.StringLogger;
import org.junit.Before;
import org.junit.Test;

public class StringLoggerImplTest {

	private StringLogger stringLogger;
	
	@Before
	public void setUp() throws Exception {
		
		stringLogger = new StringLoggerImpl();
	}

	@Test
	public void testTruncate() {
		String result = stringLogger.truncate("123456789012345678901234567890", 25);
		assertEquals("12 ... (truncated) ... 90", result);
	}
	
	@Test
	public void testTruncateSmallLog() {
		String result = stringLogger.truncate("1234567890", 5);
		assertEquals("1234567890", result);
	}
	
	@Test
	public void testTruncateLargeLog() {
		String result = stringLogger.truncate("123456789012345678901234567890", 31);
		assertEquals("123456789012345678901234567890", result);
	}
	
	@Test
	public void testTruncateNullLog() {
		String result = stringLogger.truncate(null, 5);
		assertEquals(null, result);
	}
	
	@Test
	public void testTruncateEmptyLog() {
		String result = stringLogger.truncate("", 0);
		assertEquals("", result);
	}

}
