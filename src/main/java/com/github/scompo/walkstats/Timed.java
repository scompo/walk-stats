package com.github.scompo.walkstats;

import java.time.Instant;

/**
 * A {@link Timed} object contains an {@link Instant} that can be retrieved with
 * {@link Timed#getTime()}.
 */
public interface Timed {

	/**
	 * Returns the {@link Instant} of this {@link Timed} object.
	 * 
	 * @return the {@link Instant} of this {@link Timed} object.
	 */
	Instant getTime();
}
