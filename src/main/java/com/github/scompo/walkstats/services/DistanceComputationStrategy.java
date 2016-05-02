package com.github.scompo.walkstats.services;

import java.math.BigDecimal;

import com.github.scompo.walkstats.domain.position.Position;

public interface DistanceComputationStrategy {

	public BigDecimal computeDistanceBetween(Position start, Position end);
}
