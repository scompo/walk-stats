package com.github.scompo.walkstats;

import static com.github.scompo.walkstats.DegreesConstants.DEGREES_SYMBOL;

import java.math.BigDecimal;

public class Longitude implements Measurement<BigDecimal> {

	private final BigDecimal value;

	public Longitude(BigDecimal value) {

		this.value = value;
	}

	@Override
	public BigDecimal getValue() {

		return value;
	}

	@Override
	public String getUnit() {

		return DEGREES_SYMBOL;
	}

}
