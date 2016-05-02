package com.github.scompo.walkstats.domain.position;

import static com.github.scompo.walkstats.domain.GeographicConstants.MAX_LONGITUDE;
import static com.github.scompo.walkstats.domain.GeographicConstants.MIN_LONGITUDE;
import static java.util.Arrays.asList;

import java.math.BigDecimal;
import java.util.List;

import com.github.scompo.walkstats.validation.BetweenConstraint;
import com.github.scompo.walkstats.validation.Constraint;
import com.github.scompo.walkstats.validation.ConstraintsValidationStrategy;
import com.github.scompo.walkstats.validation.NotNullConstraint;
import com.github.scompo.walkstats.validation.ValidationException;
import com.github.scompo.walkstats.validation.ValidationStrategy;

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
				new BetweenConstraint<>(MIN_LONGITUDE, MAX_LONGITUDE));
	}

	@Override
	public void validate(BigDecimal toValidate) throws ValidationException {

		CONSTRAINTS.validate(toValidate);
	}
}
