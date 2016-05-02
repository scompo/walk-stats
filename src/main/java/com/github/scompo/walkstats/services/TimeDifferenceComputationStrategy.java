package com.github.scompo.walkstats.services;

import java.math.BigDecimal;
import java.time.Instant;

public interface TimeDifferenceComputationStrategy {

	BigDecimal computeDifferenceInSeconds(Instant start, Instant end);
}
