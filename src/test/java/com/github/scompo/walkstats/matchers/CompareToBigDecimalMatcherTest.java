package com.github.scompo.walkstats.matchers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.math.BigDecimal.*;

import java.math.BigDecimal;
import static com.github.scompo.walkstats.matchers.CompareToBigDecimalMatcher.*;

import org.hamcrest.Description;
import org.hamcrest.StringDescription;
import org.junit.Test;

public class CompareToBigDecimalMatcherTest {

	@Test
	public void testCompareToExpectedZero() {

		assertEquals(ZERO, compareToExpected(ZERO).getExpected());
	}

	@Test
	public void testCompareToExpectedNull() {

		assertEquals(null, compareToExpected(null).getExpected());
	}

	@Test
	public void testDescribeTo() {

		Description description = new StringDescription();
		compareToExpected(ZERO).describeTo(description);

		assertTrue(description.toString().contains("0"));
	}

	@Test
	public void testMatchesDifferentScale() {

		assertTrue(compareToExpected(new BigDecimal("10.00"))
				.matches(new BigDecimal(10)));
	}

	@Test
	public void testMatchesSameScale() {

		assertTrue(compareToExpected(new BigDecimal(10))
				.matches(new BigDecimal(10)));
	}

	@Test
	public void testMatchesNull() {

		assertTrue(compareToExpected(null).matches(null));
	}

	@Test
	public void testMatchesWithExpectedNullAndItemNotNull() {

		assertFalse(compareToExpected(null).matches(ZERO));
	}

	@Test
	public void testMatchesWithExpectedNotNullAndItemNull() {

		assertFalse(compareToExpected(ZERO).matches(null));
	}
}
