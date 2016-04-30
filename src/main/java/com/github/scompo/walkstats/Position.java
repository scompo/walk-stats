package com.github.scompo.walkstats;

import java.time.Instant;

public class Position implements Timed {

	private final Latitude latitude;

	private final Longitude longitude;

	private final Altitude altitude;

	private final Instant time;
	
	public static Position createPosition(Latitude latitude,
			Longitude longitude, Altitude altitude, Instant time) {
		
		return new Position(latitude, longitude, altitude, time);
	}

	private Position(Latitude latitude, Longitude longitude, Altitude altitude,
			Instant time) {

		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.time = time;
	}

	public Latitude getLatitude() {
		return latitude;
	}

	public Longitude getLongitude() {
		return longitude;
	}

	public Altitude getAltitude() {
		return altitude;
	}

	@Override
	public Instant getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Position [latitude=" + latitude + ", longitude=" + longitude
				+ ", altitude=" + altitude + ", time=" + time + "]";
	}
}
