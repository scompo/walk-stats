package com.github.scompo.walkstats.domain;

import static com.github.scompo.utils.assertions.Validation.*;
import java.time.ZonedDateTime;

/**
 * {@link Timed} base implementation.
 */
public class TimeLog implements Timed, Comparable<TimeLog> {

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

	@Override
	public int compareTo(TimeLog o) {

		return this.time.compareTo(o.time);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeLog other = (TimeLog) obj;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TimeLog [time=" + time + "]";
	}
}
