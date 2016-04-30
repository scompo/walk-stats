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
 * ignoring the scale. For my purposes this is the correct behavior.
 */
public class CompareToBigDecimalMatcher extends BaseMatcher<BigDecimal>
		implements
			Matcher<BigDecimal> {

	private final BigDecimal expected;

	/**
	 * Creates a new {@link CompareToBigDecimalMatcher} with the expected
	 * result. It will make sure that <code>expected.compareTo(item) == 0</code>
	 * . It's <code>null</code> safe.
	 * 
	 * @param expected
	 *            the expected result.
	 * 
	 * @return a new {@link CompareToBigDecimalMatcher} that expects the passed
	 *         result.
	 */
	public static CompareToBigDecimalMatcher compareToExpected(BigDecimal expected) {

		return new CompareToBigDecimalMatcher(expected);
	}

	private CompareToBigDecimalMatcher(BigDecimal expected) {

		this.expected = expected;
	}

	@Override
	public void describeTo(Description description) {

		description.appendValue(expected);
	}

	@Override
	public boolean matches(Object item) {

		if (isNull(expected)) {

			if (isNull(item)) {

				return true;

			} else {

				return false;
			}

		} else {

			if (isNull(item)) {

				return false;
			} else {

				return expected.compareTo((BigDecimal) item) == 0;
			}
		}

	}

	public BigDecimal getExpected() {

		return expected;
	}

}
