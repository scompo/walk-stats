package com.github.scompo.walkstats;

import static com.github.scompo.walkstats.LatitudeConstants.MAX_LAT;
import static com.github.scompo.walkstats.LatitudeConstants.MIN_LAT;
import static java.util.Arrays.asList;

import java.math.BigDecimal;
import java.util.List;

/**
 * Strategy to validate a latitude.
 */
public class LatitudeValidationStrategy
		implements
			ValidationStrategy<BigDecimal> {

	private static LatitudeValidationStrategy instance;

	private static final ConstraintsValidationStrategy<BigDecimal> CONSTRAINTS = new ConstraintsValidationStrategy<>(
			constraints());

	/**
	 * This strategy is singleton, call
	 * {@link LatitudeValidationStrategy#getInstance()} to get the only instance
	 * of this class.
	 */
	private LatitudeValidationStrategy() {

	}

	private static List<Constraint<BigDecimal>> constraints() {

		return asList(new NotNullConstraint<>(),
				new BetweenConstraint<>(MIN_LAT, MAX_LAT));
	}

	@Override
	public void validate(BigDecimal value) throws ValidationException {

		CONSTRAINTS.validate(value);
	}

	/**
	 * Returns the only instance of this class.
	 * 
	 * @return the only instance of this class.
	 */
	public static LatitudeValidationStrategy getInstance() {

		if (instance == null) {

			instance = new LatitudeValidationStrategy();
		}

		return instance;
	}

}
