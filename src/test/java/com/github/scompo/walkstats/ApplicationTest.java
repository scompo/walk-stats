package com.github.scompo.walkstats;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void failingTest() {

		fail("this fails!");
	}

	@Test
	public void passingTest() {

		assertNotNull("application is null", new Application());
	}
}
