package com.github.scompo.walkstats;

import static com.github.scompo.utils.assertions.NullChecker.isNotNull;

public class NotNullConstraint<T> extends Constraint<T> {

	protected static final String VALUE_SHOULD_NOT_BE_NULL = "value should not be null!";

	@Override
	public boolean valid(T obj) {

		return isNotNull(obj);
	}

	@Override
	public String getMessage(T value) {
		
		return VALUE_SHOULD_NOT_BE_NULL;
	}
}