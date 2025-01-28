package com.wipro.testing.services;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CheckEvenTest.class, LargestTest.class })
public class AllTests {

}
