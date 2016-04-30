package com.github.scompo.walkstats;

import java.time.Instant;

public class GeographicPosition implements Position, Timed {

	private final Latitude latitude;

	private final Longitude longitude;

	private final Altitude altitude;

	private final Instant time;
	
	public static Position createPosition(Latitude latitude,
			Longitude longitude, Altitude altitude, Instant time) {
		
		return new GeographicPosition(latitude, longitude, altitude, time);
	}

	private GeographicPosition(Latitude latitude, Longitude longitude, Altitude altitude,
			Instant time) {

		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.time = time;
	}

	@Override
	public Latitude getLatitude() {
		return latitude;
	}

	@Override
	public Longitude getLongitude() {
		return longitude;
	}

	@Override
	public Altitude getAltitude() {
		return altitude;
	}

	@Override
	public Instant getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "GeographicPosition [latitude=" + latitude + ", longitude=" + longitude
				+ ", altitude=" + altitude + ", time=" + time + "]";
	}
}
