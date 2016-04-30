package com.github.scompo.walkstats;

public interface Measurement<T> {

	T getValue();
	
	String getUnit();
}
