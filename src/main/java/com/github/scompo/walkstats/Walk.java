package com.github.scompo.walkstats;

import java.time.Instant;
import java.util.Collection;

import com.github.scompo.utils.names.Named;

public class Walk implements Timed, Named {

	private final Collection<GeographicPosition> positions;

	private final Instant time;

	private final String name;
	
	public static Walk createWalk(Collection<GeographicPosition> positions, Instant time,
			String name) {

		return new Walk(positions, time, name);
	}

	private Walk(Collection<GeographicPosition> positions, Instant time, String name) {

		this.positions = positions;
		this.time = time;
		this.name = name;
	}

	public Collection<GeographicPosition> getPositions() {
		return positions;
	}

	@Override
	public Instant getTime() {
		return time;
	}

	@Override
	public String getName() {
		return name;
	}
}
