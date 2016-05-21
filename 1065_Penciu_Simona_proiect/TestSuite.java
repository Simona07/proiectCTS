package com.proiect.tests;

import junit.framework.Test;

public class TestSuite extends junit.framework.TestSuite {
	
	public static Test suite() {
		TestSuite colectie = new TestSuite();
		
		colectie.addTestSuite(TestCaseSingleton.class);
		
	
		colectie.addTest(new TestCaseVehicul("testConstructorNULL"));
		colectie.addTest(new TestCaseVehicul("testSetPretValoriNegative"));
		
		return colectie;
	}


}
