package com.github.scompo.walkstats;

import java.math.BigDecimal;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class CompareToBigDecimalMatcher extends BaseMatcher<BigDecimal>
		implements
			Matcher<BigDecimal> {

	private final BigDecimal expected;

	private CompareToBigDecimalMatcher(BigDecimal expected) {

		this.expected = expected;
	}

	@Override
	public void describeTo(Description description) {
		
		description.appendValue(expected);
	}

	@Override
	public boolean matches(Object item) {

		return expected.compareTo((BigDecimal) item) == 0;
	}

	public static Matcher<BigDecimal> with(BigDecimal expected) {

		return new CompareToBigDecimalMatcher(expected);
	}

}
