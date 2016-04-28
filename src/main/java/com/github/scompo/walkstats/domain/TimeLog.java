package com.github.scompo.walkstats.domain;

import static com.github.scompo.utils.assertions.Validation.*;
import java.time.ZonedDateTime;

/**
 * {@link Timed} base implementation.
 */
public class TimeLog implements Timed {

	private final ZonedDateTime time;

	/**
	 * Creates a {@link TimeLog} from a {@link ZonedDateTime}.
	 * 
	 * @param time
	 *            the {@link ZonedDateTime} with the {@link TimeLog} to create.
	 * 
	 * @return a {@link TimeLog} from a {@link ZonedDateTime}.
	 */
	public static TimeLog from(final ZonedDateTime time) {

		validateNotNull(time, "time is null");

		return new TimeLog(time);
	}

	/**
	 * This class should be instantiated with the
	 * {@link TimeLog#from(ZonedDateTime)} static method.
	 * 
	 * @param time
	 *            the time of this {@link TimeLog}.
	 */
	private TimeLog(final ZonedDateTime time) {

		this.time = time;
	}

	@Override
	public ZonedDateTime getTime() {

		return time;
	}

}
