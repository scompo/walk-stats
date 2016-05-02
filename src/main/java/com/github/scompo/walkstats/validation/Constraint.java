package com.github.scompo.walkstats.validation;

public abstract class Constraint<T> {

	public abstract boolean valid(T obj);

	public abstract String getMessage(T value);
}
