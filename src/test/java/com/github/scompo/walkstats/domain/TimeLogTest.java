package com.github.scompo.walkstats.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.ZonedDateTime;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TimeLogTest {

	private static final ZonedDateTime NULL_TIME = null;

	private static final ZonedDateTime TEST_TIME = ZonedDateTime.now();

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testFromWithNullShouldThrowAnIllegalArgumentException() {

		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("time is null");

		assertNull(TimeLog.from(NULL_TIME));
	}

	@Test
	public void testFromShouldConstructATimeLog() {

		assertNotNull(TimeLog.from(TEST_TIME));
	}

	@Test
	public void testGetTime() {

		assertEquals(TEST_TIME, TimeLog.from(TEST_TIME).getTime());
	}

}
