package com.github.scompo.walkstats.domain.position;

import static com.github.scompo.walkstats.domain.GeographicConstants.MAX_LATITUDE;
import static com.github.scompo.walkstats.domain.GeographicConstants.MIN_LATITUDE;
import static java.util.Arrays.asList;

import java.math.BigDecimal;
import java.util.List;

import com.github.scompo.walkstats.validation.BetweenConstraint;
import com.github.scompo.walkstats.validation.Constraint;
import com.github.scompo.walkstats.validation.ConstraintsValidationStrategy;
import com.github.scompo.walkstats.validation.NotNullConstraint;
import com.github.scompo.walkstats.validation.ValidationException;
import com.github.scompo.walkstats.validation.ValidationStrategy;

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
				new BetweenConstraint<>(MIN_LATITUDE, MAX_LATITUDE));
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
