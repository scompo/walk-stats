package com.github.scompo.walkstats.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.scompo.walkstats.validation.NotNullConstraint;

public class NotNullConstraintTest {

	private NotNullConstraint<Integer> constraint;
	
	@Before
	public void setUp() throws Exception {
		
		constraint = new NotNullConstraint<>();
	}

	@After
	public void tearDown() throws Exception {
		
		constraint = null;
	}

	@Test
	public void testValidWithNull() {

		assertFalse(constraint.valid(null));
	}

	@Test
	public void testValidWithNotNull() {

		assertTrue(constraint.valid(1));
	}

	@Test
	public void testGetMessage() {

		assertEquals(NotNullConstraint.VALUE_SHOULD_NOT_BE_NULL,
				constraint.getMessage(null));
	}

}
