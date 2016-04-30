package com.github.scompo.walkstats;

import static com.github.scompo.walkstats.LongitudeConstants.MAX_LONG;
import static com.github.scompo.walkstats.LongitudeConstants.MIN_LONG;
import static java.util.Arrays.asList;

import java.math.BigDecimal;
import java.util.List;

public class LongitudeValidationStrategy
		implements
			ValidationStrategy<BigDecimal> {

	private static final ConstraintsValidationStrategy<BigDecimal> CONSTRAINTS = new ConstraintsValidationStrategy<>(constraints());

	private static LongitudeValidationStrategy instance;

	private LongitudeValidationStrategy() {

	}

	public static LongitudeValidationStrategy getInstance() {

		if (instance == null) {

			instance = new LongitudeValidationStrategy();
		}

		return instance;
	}

	private static List<Constraint<BigDecimal>> constraints() {

		return asList(new NotNullConstraint<>(),
				new BetweenConstraint<>(MIN_LONG, MAX_LONG));
	}

	@Override
	public void validate(BigDecimal toValidate) throws ValidationException {

		CONSTRAINTS.validate(toValidate);
	}
}
