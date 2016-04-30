package com.github.scompo.walkstats;

public interface SpeedComputationStrategy {

	Speed computeSpeed(TimeDifference timeDifference, Distance distance);
}
