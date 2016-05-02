package com.github.scompo.walkstats.domain.walk;

import java.time.Instant;

public class WalkRecord implements Walk {

	private final Instant time;

	private final String name;

	public static Walk createWalk(Instant time, String name) {

		return new WalkRecord(time, name);
	}

	private WalkRecord(Instant time, String name) {

		this.time = time;
		this.name = name;
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
