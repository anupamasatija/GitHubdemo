package com.anu.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion {

	String className = "HardAssertion";

	@Test
	public void test_UsingHardAssertionPass() {
		Assert.assertTrue(true == true);
		Assert.assertEquals("HardAssertion", "HardAssertion");
		Assert.assertEquals(className, "HardAssertion");
		System.out.println("Successfully passed!");
	}

	@Test
	public void test_UsingHardAssertionFail() {
		Assert.assertTrue(true == true);
		Assert.assertEquals("HardAssert", "HardAssertion");
		Assert.assertEquals(className, "HardAssertion");
		System.out.println("Successfully passed!");
	}
	
    @Test
    public void test_UsingSoftAssertion() {
   	  SoftAssert softAssert = new SoftAssert();
  	    className = "SoftAssertion";
    	softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssert", "SoftAssertion");
        softAssert.assertEquals(className, "SoftAssertion");
        System.out.println("Last statement gets executed!");
        softAssert.assertAll();
    }

    
    @Test
    public void test_UsingSoftAssertion2() {
   	  SoftAssert softAssert = new SoftAssert();
  	    className = "SoftAssertion";
    	softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssert", "SoftAssertion");
        softAssert.assertEquals(className, "SoftAssertion");
        System.out.println("Last statement 2 gets executed!");
        softAssert.assertAll();
    }

}