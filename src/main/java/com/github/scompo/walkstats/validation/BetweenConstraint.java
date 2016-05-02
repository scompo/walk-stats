package com.github.scompo.walkstats.validation;

public class BetweenConstraint<T extends Comparable<T>> extends Constraint<T> {

	private final Comparable<T> minValue;
	private final Comparable<T> maxValue;

	public BetweenConstraint(Comparable<T> minValue, Comparable<T> maxValue) {

		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	@Override
	public boolean valid(final T obj) {
		
		return minValue.compareTo(obj) <= 0 && maxValue.compareTo(obj) >= 0;
	}

	@Override
	public String getMessage(T value) {

		StringBuilder builder = new StringBuilder();

		builder.append("Expected value between ");
		builder.append(minValue);
		builder.append(" and ");
		builder.append(maxValue);
		builder.append(": found ");
		builder.append(value);

		return builder.toString();
	}
}
