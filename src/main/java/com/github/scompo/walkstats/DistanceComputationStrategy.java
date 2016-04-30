package com.github.scompo.walkstats;

public interface DistanceComputationStrategy {

	public Distance computeDistanceBetween(Position start, Position end);
}
