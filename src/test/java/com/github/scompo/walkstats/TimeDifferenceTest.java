package com.github.scompo.walkstats;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static java.math.BigDecimal.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

import static com.github.scompo.walkstats.matchers.CompareToBigDecimalMatcher.*;

public class TimeDifferenceTest {

	private static final BigDecimal ONE_MILLISECOND_IN_SECONDS = new BigDecimal(
			"0.001");

	private static final BigDecimal TEN_MILLIS_IN_SECONDS = new BigDecimal(
			"0.01");

	private static final BigDecimal TEN_MINUTES_IN_SECOND = valueOf(600);

	private static final Instant TEST_INSTANT = Instant.now();

	private static final Instant TEST_INSTANT_AFTER_10_MINUTES = TEST_INSTANT
			.plus(10, ChronoUnit.MINUTES);

	private static final Instant TEST_INSTANT_AFTER_10_MILLIS = TEST_INSTANT
			.plus(10, ChronoUnit.MILLIS);

	private static final Instant TEST_INSTANT_AFTER_1_MILLI = TEST_INSTANT
			.plus(1, ChronoUnit.MILLIS);

	@Test
	public void testGetValueSameInstantShouldBeZero() {

		assertThat(new TimeDifference(TEST_INSTANT, TEST_INSTANT).getValue(),
				compareToExpected(ZERO));
	}

	@Test
	public void testGetValueTenMinutes() {

		assertThat(
				new TimeDifference(TEST_INSTANT, TEST_INSTANT_AFTER_10_MINUTES)
						.getValue(),
				compareToExpected(TEN_MINUTES_IN_SECOND));
	}

	@Test
	public void testGetValueTenMillis() {

		assertThat(
				new TimeDifference(TEST_INSTANT, TEST_INSTANT_AFTER_10_MILLIS)
						.getValue(),
				compareToExpected(TEN_MILLIS_IN_SECONDS));
	}

	@Test
	public void testGetValueOneMillis() {

		assertThat(
				new TimeDifference(TEST_INSTANT, TEST_INSTANT_AFTER_1_MILLI)
						.getValue(),
				compareToExpected(ONE_MILLISECOND_IN_SECONDS));
	}

	@Test
	public void testGetUnit() {

		assertEquals("s",
				new TimeDifference(TEST_INSTANT, TEST_INSTANT).getUnit());
	}

}
