package com.github.scompo.walkstats.validation;

public interface ValidationStrategy<T> {
	
	void validate(T toValidate) throws ValidationException;
}
