package com.github.scompo.walkstats;

public interface ValidationStrategy<T> {
	
	void validate(T toValidate) throws ValidationException;
}
