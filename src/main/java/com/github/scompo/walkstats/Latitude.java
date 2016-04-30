package com.github.scompo.walkstats;

import java.math.BigDecimal;

public class Latitude implements Measurement<BigDecimal>{

	private final BigDecimal value;

	public Latitude(BigDecimal value) {
		
		this.value = value;
	}

	@Override
	public BigDecimal getValue() {
		
		return value;
	}

	@Override
	public String getUnit() {
		
		return "�";
	}

}
