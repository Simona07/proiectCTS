package com.proiect.tests;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.proiect.classes.ParcAuto;

public class TestCaseSingleton extends TestCase {
	
	ParcAuto singletonParc;
	
	@Before
	public void setUp() {
		singletonParc = ParcAuto.getInstance();
	}

	@Test
	public void test() {
		ParcAuto testParc = ParcAuto.getInstance();
		assertEquals(singletonParc, testParc);
	}

}
