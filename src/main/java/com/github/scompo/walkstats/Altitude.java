package com.github.scompo.walkstats;

import java.math.BigDecimal;

public class Altitude implements Measurement<BigDecimal> {

	private final BigDecimal value;

	public Altitude(BigDecimal value) {
		
		this.value = value;
	}

	@Override
	public BigDecimal getValue() {
		return value;
	}

	@Override
	public String getUnit() {
		return "m";
	}

}
