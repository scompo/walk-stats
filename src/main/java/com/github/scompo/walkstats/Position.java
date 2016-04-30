package com.github.scompo.walkstats;

/**
 * Position API definition.
 */
public interface Position {

	/**
	 * Returns the {@link Longitude} of a position.
	 * 
	 * @return the {@link Longitude} of a position.
	 */
	Longitude getLongitude();

	/**
	 * Returns the {@link Latitude} of a position.
	 * 
	 * @return the {@link Latitude} of a position.
	 */
	Latitude getLatitude();

	/**
	 * Returns the {@link Altitude} of a position.
	 * 
	 * @return the {@link Altitude} of a position.
	 */
	Altitude getAltitude();
}
