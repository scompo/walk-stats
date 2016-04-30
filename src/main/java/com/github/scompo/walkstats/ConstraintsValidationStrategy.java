package com.github.scompo.walkstats;

import java.util.ArrayList;
import java.util.List;

public class ConstraintsValidationStrategy<T> implements ValidationStrategy<T> {

	private List<Constraint<T>> constraints = new ArrayList<>();

	public ConstraintsValidationStrategy(List<Constraint<T>> constraints) {

		if (constraints != null && !constraints.isEmpty()) {

			this.constraints.addAll(constraints);
		}
	}

	public List<Constraint<T>> getConstraints() {

		return constraints;
	}

	@Override
	public void validate(T toValidate) throws ValidationException {

		for (Constraint<T> constraint : getConstraints()) {

			if (!constraint.valid(toValidate)) {

				throw new ValidationException(
						constraint.getMessage(toValidate));
			}
		}
	}

}
