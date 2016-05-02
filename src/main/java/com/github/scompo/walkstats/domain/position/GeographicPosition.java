package com.github.scompo.walkstats.domain.position;

import java.math.BigDecimal;
import java.time.Instant;

public class GeographicPosition implements Position {

	private final BigDecimal latitude;

	private final BigDecimal longitude;

	private final BigDecimal altitude;

	private final Instant time;
	
	public static Position createPosition(BigDecimal latitude,
			BigDecimal longitude, BigDecimal altitude, Instant time) {
		
		return new GeographicPosition(latitude, longitude, altitude, time);
	}

	private GeographicPosition(BigDecimal latitude, BigDecimal longitude, BigDecimal altitude,
			Instant time) {

		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.time = time;
	}

	@Override
	public BigDecimal getLatitude() {
		return latitude;
	}

	@Override
	public BigDecimal getLongitude() {
		return longitude;
	}

	@Override
	public BigDecimal getAltitude() {
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
