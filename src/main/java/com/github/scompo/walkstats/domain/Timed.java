package com.github.scompo.walkstats.domain;

import java.time.ZonedDateTime;

/**
 * Timed API definition. This can be used to keep track of when an event
 * occurred.
 */
public interface Timed {

	/**
	 * Returns a {@link ZonedDateTime} representing the time this {@link Timed}
	 * was taken.
	 * 
	 * @return a {@link ZonedDateTime} representing time of this {@link Timed}
	 *         was taken.
	 */
	ZonedDateTime getTime();
}
