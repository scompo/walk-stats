package com.github.scompo.walkstats.services;

import static com.github.scompo.walkstats.matchers.CompareToBigDecimalMatcher.compareToExpected;
import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

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

	private TimeDifferenceService timeDifferenceService = new TimeDifferenceService();

	@Test
	public void testGetValueSameInstantShouldBeZero() {

		assertThat(timeDifferenceService.computeDifferenceInSeconds(
				TEST_INSTANT, TEST_INSTANT), compareToExpected(ZERO));
	}

	@Test
	public void testGetValueTenMinutes() {

		assertThat(
				timeDifferenceService.computeDifferenceInSeconds(TEST_INSTANT,
						TEST_INSTANT_AFTER_10_MINUTES),
				compareToExpected(TEN_MINUTES_IN_SECOND));
	}

	@Test
	public void testGetValueTenMillis() {

		assertThat(
				timeDifferenceService.computeDifferenceInSeconds(TEST_INSTANT,
						TEST_INSTANT_AFTER_10_MILLIS),
				compareToExpected(TEN_MILLIS_IN_SECONDS));
	}

	@Test
	public void testGetValueOneMillis() {

		assertThat(
				timeDifferenceService.computeDifferenceInSeconds(TEST_INSTANT,
						TEST_INSTANT_AFTER_1_MILLI),
				compareToExpected(ONE_MILLISECOND_IN_SECONDS));
	}

}
