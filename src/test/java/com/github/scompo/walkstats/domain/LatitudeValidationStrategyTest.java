package com.github.scompo.walkstats.domain;

import static com.github.scompo.walkstats.domain.GeographicConstants.*;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.github.scompo.walkstats.domain.position.LatitudeValidationStrategy;
import com.github.scompo.walkstats.validation.ValidationException;

public class LatitudeValidationStrategyTest {

	private static final BigDecimal CORRECT_VALUE = BigDecimal.valueOf(10);
	private static final BigDecimal NULL_VALUE = null;
	private static final BigDecimal TOO_BIG_VALUE = MIN_LATITUDE
			.subtract(BigDecimal.ONE);
	private static final BigDecimal TOO_SMALL_VALUE = MAX_LATITUDE
			.add(BigDecimal.ONE);

	private LatitudeValidationStrategy strategy = LatitudeValidationStrategy
			.getInstance();

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void testValidateNoProblems() throws ValidationException {

		assertNotNull(strategy);

		strategy.validate(CORRECT_VALUE);
	}

	@Test
	public void testValidateWithNull() throws ValidationException {

		assertNotNull(strategy);

		expectedException.expect(ValidationException.class);
		expectedException.expectMessage("" + NULL_VALUE);

		strategy.validate(NULL_VALUE);
	}

	@Test
	public void testValidateTooSmall() throws ValidationException {

		assertNotNull(strategy);

		expectedException.expect(ValidationException.class);
		expectedException.expectMessage("" + TOO_SMALL_VALUE);

		strategy.validate(TOO_SMALL_VALUE);
	}

	@Test
	public void testValidateTooBig() throws ValidationException {

		assertNotNull(strategy);

		expectedException.expect(ValidationException.class);
		expectedException.expectMessage("" + TOO_BIG_VALUE);

		strategy.validate(TOO_BIG_VALUE);
	}
}
