package com.proiect.tests;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.proiect.classes.ProprietatiVehicul;

public class TestCaseProprietatiVehicul extends TestCase {
	
	ProprietatiVehicul proprietati;
	
	@Before
	protected void setUp() throws Exception {
		proprietati = new ProprietatiVehicul();
	}
	
	@Test
	public void testAnFabricatieValoriNegative() {
		try {
			proprietati.setAnulFabricatiei(-123454);
			fail("Nu arunca exceptie valori negative");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void testAnFabricatieValoriAberante() {
		try {
			proprietati.setAnulFabricatiei(20153);
			fail("Nu arunca exceptie valori aberante");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
