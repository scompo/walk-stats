package com.github.scompo.walkstats;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TimeDifference implements Measurement<BigDecimal> {

	private final Instant start;
	
	private final Instant end;

	public TimeDifference(Instant start, Instant end) {

		this.start = start;
		this.end = end;
	}

	@Override
	public BigDecimal getValue() {

		return new BigDecimal(
				BigInteger.valueOf(ChronoUnit.MILLIS.between(start, end)), 3);
	}

	@Override
	public String getUnit() {

		return "s";
	}
}
