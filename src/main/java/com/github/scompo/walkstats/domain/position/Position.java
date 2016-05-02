package com.github.scompo.walkstats.domain.position;

import java.math.BigDecimal;

import com.github.scompo.walkstats.domain.Timed;

/**
 * Position API definition.
 */
public interface Position extends Timed{

	/**
	 * Returns the {@link Longitude} of a position.
	 * 
	 * @return the {@link Longitude} of a position.
	 */
	BigDecimal getLongitude();

	/**
	 * Returns the {@link Latitude} of a position.
	 * 
	 * @return the {@link Latitude} of a position.
	 */
	BigDecimal getLatitude();

	/**
	 * Returns the {@link Altitude} of a position.
	 * 
	 * @return the {@link Altitude} of a position.
	 */
	BigDecimal getAltitude();
}
