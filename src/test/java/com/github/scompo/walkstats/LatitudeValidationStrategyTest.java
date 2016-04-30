package com.github.scompo.walkstats;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LatitudeValidationStrategyTest {

	private static final BigDecimal CORRECT_VALUE = BigDecimal.valueOf(10);
	private static final BigDecimal NULL_VALUE = null;
	private static final BigDecimal TOO_BIG_VALUE = LatitudeConstants.MIN_LAT
			.subtract(BigDecimal.ONE);
	private static final BigDecimal TOO_SMALL_VALUE = LatitudeConstants.MAX_LAT
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
