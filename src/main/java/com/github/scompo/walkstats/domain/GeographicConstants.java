package com.github.scompo.walkstats.domain;

import java.math.BigDecimal;

public class GeographicConstants {

	/**
	 * Minimum value for longitude.
	 */
	public static final BigDecimal MIN_LONGITUDE = BigDecimal.valueOf(-180);

	/**
	 * Maximum value for longitude.
	 */
	public static final BigDecimal MAX_LONGITUDE = BigDecimal.valueOf(180);

	/**
	 * Minimum value for latitude.
	 */
	public static final BigDecimal MIN_LATITUDE = BigDecimal.valueOf(-90);

	/**
	 * Maximum value for latitude.
	 */
	public static final BigDecimal MAX_LATITUDE = BigDecimal.valueOf(90);

	private GeographicConstants() {

	}

}
