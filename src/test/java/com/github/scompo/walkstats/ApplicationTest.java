package com.github.scompo.walkstats;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void passingTest() {

		assertNotNull("application is null", new Application());
	}
}
