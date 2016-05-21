package com.proiect.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestMockito.class, TestSuite.class, TestCaseVehicul.class,})
public class AllTests {

}
