package com.github.scompo.walkstats.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TimeDifferenceService implements TimeDifferenceComputationStrategy {

	@Override
	public BigDecimal computeDifferenceInSeconds(Instant start, Instant end) {
		
		return new BigDecimal(
				BigInteger.valueOf(ChronoUnit.MILLIS.between(start, end)), 3);
	}

	
}
