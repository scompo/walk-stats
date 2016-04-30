package com.github.scompo.walkstats;

/**
 * This exception should be thrown if an object is not valid.
 */
public class ValidationException extends Exception {

	private static final long serialVersionUID = -8928040567856360591L;

	public ValidationException() {
		super();
	}

	public ValidationException(String message) {
		super(message);
	}

	public ValidationException(Throwable cause) {
		super(cause);
	}

	public ValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	@Override
	public String toString() {
		return "ValidationException [toString()=" + super.toString() + "]";
	}

}
