package com.github.scompo.walkstats.matchers;

import static com.github.scompo.utils.assertions.NullChecker.*;

import java.math.BigDecimal;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/**
 * {@link Matcher} for {@link BigDecimal} based on the
 * {@link BigDecimal#compareTo(BigDecimal)} method. As by the API documentation
 * {@link BigDecimal#compareTo(BigDecimal)} compares two {@link BigDecimal}
 * ignoring the scale. For my purposes this is the correct behavior. This class
 * is <code>null</code> safe
 */
public class CompareToBigDecimalMatcher extends BaseMatcher<BigDecimal>
		implements
			Matcher<BigDecimal> {

	private final BigDecimal expected;

	/**
	 * Creates a new {@link CompareToBigDecimalMatcher} with the expected
	 * result. It will make sure that <code>expected.compareTo(item) == 0</code>
	 * .
	 * 
	 * @param expected
	 *            the expected result.
	 * 
	 * @return a new {@link CompareToBigDecimalMatcher} that expects the passed
	 *         result.
	 */
	public static CompareToBigDecimalMatcher compareToExpected(
			BigDecimal expected) {

		return new CompareToBigDecimalMatcher(expected);
	}

	private CompareToBigDecimalMatcher(BigDecimal expected) {

		this.expected = expected;
	}

	@Override
	public void describeTo(Description description) {

		description.appendValue(getExpected());
	}

	@Override
	public boolean matches(Object item) {

		boolean result = false;

		if (isNull(getExpected()) && isNull(item)) {

			result = true;

		}

		if (isNotNull(getExpected()) && isNotNull(item)) {

			result = getExpected().compareTo((BigDecimal) item) == 0;
		}

		return result;
	}

	public BigDecimal getExpected() {

		return expected;
	}

}
