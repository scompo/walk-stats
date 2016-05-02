package com.github.scompo.walkstats.services;

import java.math.BigDecimal;

public interface SpeedComputationStrategy {

	BigDecimal computeSpeed(BigDecimal timeDifference, BigDecimal distance);
}
