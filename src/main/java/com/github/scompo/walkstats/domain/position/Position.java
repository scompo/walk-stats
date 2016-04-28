package com.github.scompo.walkstats.domain.position;

import java.math.BigDecimal;

import com.github.scompo.walkstats.domain.Timed;

/**
 * Position API definition.
 */
public interface Position extends Timed {

	/**
	 * Returns a {@link BigDecimal} representing the latitude of this
	 * {@link Position}.
	 * 
	 * @return a {@link BigDecimal} representing the latitude of this
	 *         {@link Position}.
	 */
	BigDecimal getLatitude();

	/**
	 * Returns a {@link BigDecimal} representing the longitude of this
	 * {@link Position}.
	 * 
	 * @return a {@link BigDecimal} representing the longitude of this
	 *         {@link Position}.
	 */
	BigDecimal getLongitude();

	/**
	 * Returns a {@link BigDecimal} representing the altitude of this
	 * {@link Position}.
	 * 
	 * @return a {@link BigDecimal} representing the altitude of this
	 *         {@link Position}.
	 */
	BigDecimal getAltitude();
}
