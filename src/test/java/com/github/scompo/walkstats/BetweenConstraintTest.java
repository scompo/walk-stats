package com.github.scompo.walkstats;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BetweenConstraintTest {

	private static final Integer INVALID_INT = 3;
	private static final Integer VALID_INT = 12;
	private static final Integer MAX_INTERVAL = 20;
	private static final Integer MIN_INTERVAL = 10;

	private BetweenConstraint<Integer> constraint;

	@Before
	public void setUp() throws Exception {

		constraint = new BetweenConstraint<>(MIN_INTERVAL, MAX_INTERVAL);
	}

	@After
	public void tearDown() throws Exception {

		constraint = null;
	}

	@Test
	public void testValidWithValidObject() {

		System.err.println(constraint.getMessage(VALID_INT));

		assertTrue(constraint.valid(VALID_INT));
	}

	@Test
	public void testValidWithInvalidObject() {

		assertFalse(constraint.valid(INVALID_INT));
	}

	@Test
	public void testGetMessage() {

		String message = constraint.getMessage(INVALID_INT);
		assertTrue(message.contains("" + MIN_INTERVAL));
		assertTrue(message.contains("" + MAX_INTERVAL));
		assertTrue(message.contains("" + INVALID_INT));
	}
}
