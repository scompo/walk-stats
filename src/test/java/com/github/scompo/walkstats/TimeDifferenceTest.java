package com.github.scompo.walkstats;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeDifferenceTest {

	private static final Instant TEST_INSTANT = Instant.now();
	private static final Instant TEST_INSTANT_AFTER_10_MINUTES = TEST_INSTANT
			.plus(10, ChronoUnit.MINUTES);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetValueSameInstantShouldBeZero() {

		assertThat(new TimeDifference(TEST_INSTANT, TEST_INSTANT).getValue(),
				CompareToBigDecimalMatcher.with(BigDecimal.ZERO));
	}

	@Test
	public void testGetValueTenMinutes() {

		assertThat(
				new TimeDifference(TEST_INSTANT, TEST_INSTANT_AFTER_10_MINUTES)
						.getValue(),
				CompareToBigDecimalMatcher.with(new BigDecimal("600")));
	}

	@Test
	public void testGetUnit() {

		assertEquals("s",
				new TimeDifference(TEST_INSTANT, TEST_INSTANT).getUnit());
	}

}
